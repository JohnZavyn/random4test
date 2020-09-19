package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestString.SPACE;
import static com.threeleaf.test.random.util.TestStringUtil.isBlank;
import static com.threeleaf.test.random.util.TestStringUtil.isNotBlank;
import static java.util.Locale.US;
import static java.util.Optional.ofNullable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;

/**
 * <p><b>Version</b> validation.</p>
 *
 * <p>This class provides methods to validate a candidate version number against various versioning
 * rules.</p>
 *
 * <p>This class is a Singleton; you can retrieve the instance via the {@link #getInstance()}
 * method.</p>
 */
public class VersionValidator implements Serializable {

    /**
     * Character used as a placeholder when a version part is empty. In version comparisons, an
     * empty slot has higher value than a non-empty slot, so a higher-ascii character is assigned to
     * assure proper sorting.
     */
    public static final String EMPTY_VERSION_PLACEHOLDER = "~";

    /** Special version indicating a work in progress version. */
    public static final String SNAPSHOT_VERSION = "SNAPSHOT";

    /**
     * The regular expression to validate the format of a maven version number.
     * <p>The general format is {@code MAJOR[.MINOR[.INCREMENTAL]][-BUILD|-QUALIFIER]}</p>
     * <p>where:</p>
     * <ul>
     *     <li>MAJOR = required positive numeric number</li>
     *     <li>MINOR = optional positive numeric number</li>
     *     <li>INCREMENTAL = optional positive numeric number</li>
     *     <li>BUILD = optional positive numeric number</li>
     *     <li>QUALIFIER = optional string</li>
     * </ul>
     *
     * @see <a href="https://www.mojohaus.org/versions-maven-plugin/version-rules.html">Maven
     *     Version Number Rules</a>
     */
    private static final Pattern MAVEN_VERSION_REGEX = Pattern.compile(
        "^(?<MAJOR>0|[1-9]\\d*)(?:\\.(?<MINOR>0|[1-9]\\d*))?(?:\\.(?<INCREMENTAL>0|[1-9]\\d*))?"
            + "(?:-(?<BUILD>[0-9]+))?(?:-(?<QUALIFIER>[0-9a-zA-Z-.]+))?$"
    );

    /**
     * The regular expression to validate the format of a semantic version number.
     * <p>The general format is {@code MAJOR.MINOR.PATCH[-PRE_RELEASE][+BUILD]}</p>
     * <p>where:</p>
     * <ul>
     *     <li>MAJOR = required positive numeric number</li>
     *     <li>MINOR = required positive numeric number</li>
     *     <li>PATCH = required positive numeric number</li>
     *     <li>PRE_RELEASE = optional string (see reference)</li>
     *     <li>BUILD = optional string (see reference)</li>
     * </ul>
     *
     * @see <a href="https://semver.org/">Semantic Versioning 2.0.0</a>
     */
    private static final Pattern SEMANTIC_VERSION_REGEX = Pattern.compile(
        "^(?<MAJOR>0|[1-9]\\d*)\\.(?<MINOR>0|[1-9]\\d*)\\.(?<INCREMENTAL>0|[1-9]\\d*)"
            + "(?:-(?<QUALIFIER>(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)"
            + "(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?"
            + "(?:\\+(?<BUILD>[0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$"
    );

    /**
     * The regular expression to validate the format of a Spring version number.
     * <p>The general format is {@code MAJOR.MINOR.MICRO.TYPE}</p>
     * <p>where:</p>
     * <ul>
     *     <li>MAJOR = required positive numeric number</li>
     *     <li>MINOR = required positive numeric number</li>
     *     <li>MICRO = required positive numeric number</li>
     *     <li>TYPE = required string (see reference)</li>
     * </ul>
     *
     * @see
     * <a href="https://github.com/spring-projects/spring-build-gradle/wiki/Spring-project-versioning">Spring
     *     Project Versioning</a>
     */
    private static final Pattern SPRING_VERSION_REGEX = Pattern.compile(
        "^(?<MAJOR>0|[1-9]\\d*)\\.(?<MINOR>0|[1-9]\\d*)\\.(?<INCREMENTAL>0|[1-9]\\d*)"
            + "\\.(?<QUALIFIER>BUILD-SNAPSHOT|M[0-9]+|RC[0-9]+|RELEASE)(?<BUILD>\\x00{0})$"
        /* There is no BUILD equivalent in Spring version, so use dummy search */
    );

    /** Singleton instance of this class. */
    private static final VersionValidator VALIDATOR = new VersionValidator();

    private static final long serialVersionUID = 4167769278655824601L;

    /**
     * Returns the singleton instance of this validator.
     *
     * @return the singleton instance of this validator
     */
    public static VersionValidator getInstance() {
        return VALIDATOR;
    }

    /**
     * Compare two versions.
     * <p>NOTES:</p>
     * <ul>
     *     <li>This comparison does not make any attempt to verify you are comparing the same two
     *      systems. You can compare a Maven version {@code 1.0} against a semantic version {@code
     *      1.0.0}, even though you would not want to do this in real life.</li>
     *      <li>This comparison is more precise than the classic Apache version comparison used by
     *      Maven
     *      <ul>
     *          <li>Maven uses
     *          <a href="https://github.com/apache/maven/blob/maven-3.3.9/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/1.java">DefaultArtifactVersion</a></li>
     *          <li>Which does not recognize Spring versions (for example, it will say
     *          {@code 10.0.0.RELEASE} &lt; {@code 2.0.0.RELEASE)}</li>
     *          <li>Will not accurately handle semantic versions with build numbers (for
     *          example, it will say {@code 1.0.0-A+10} &lt; {@code 1.0.0-A+2)}</li>
     *          <li>Apache's standard of using the SNAPSHOT qualifier to indicate a work in
     *          progress does not sort well alphabetically. </li>
     *      </ul></li>
     *      <li>Text parts of a version are compared in a case-insensitive manner.</li>
     * </ul>
     *
     * @param version1 the first version
     * @param version2 the second version
     *
     * @return 1 if first &gt; second; 0 if equal; -1 if first &lt; second;
     */
    public int compare(@Nonnull final String version1, @Nonnull final String version2) {

        if (version1.equals(version2)) {
            return 0;
        }

        int comparison = 0;
        final List<String> version1Parts = parseVersion(version1);
        final List<String> version2Parts = parseVersion(version2);

        for (int i = 0; i < version1Parts.size(); i++) {
            final String version1part = version1Parts.get(i);
            final String version2part = version2Parts.get(i);
            final Long version1num = parseLong(version1part);
            final Long version2num = parseLong(version2part);

            if (version1num == null || version2num == null) {
                comparison = version1part.compareTo(version2part);
            } else {
                comparison = Long.compare(version1num, version2num);
            }

            if (comparison != 0) {
                break;
            }
        }

        return Integer.compare(comparison, 0);
    }

    /**
     * Check if the value is within a specified range.
     *
     * @param version The {@code version} value to check.
     * @param min     The minimum value of the range.
     * @param max     The maximum value of the range.
     *
     * @return {@code TRUE} if the value is within the specified range.
     */
    public boolean isInRange(final String version, final String min, final String max) {
        return maxValue(version, max) && minValue(version, min);
    }

    /**
     * Checks if the specified string is a valid semantic or Spring version number.
     *
     * @param version the string to validate
     *
     * @return {@code TRUE} if the string validates as a version number
     */
    public boolean isValid(final String version) {
        return isValidMavenVersion(version)
            || isValidSemanticVersion(version)
            || isValidSpringVersion(version);
    }

    /**
     * Checks if the specified string is a valid Maven version number.
     *
     * @param version the string to validate
     *
     * @return {@code TRUE} if the string validates as a version number
     */
    public boolean isValidMavenVersion(final String version) {
        return isNotBlank(version) && MAVEN_VERSION_REGEX.matcher(version).matches();
    }

    /**
     * Checks if the specified string is a valid semantic version number.
     *
     * @param version the string to validate
     *
     * @return {@code TRUE} if the string validates as a version number
     */
    public boolean isValidSemanticVersion(final String version) {
        return isNotBlank(version) && SEMANTIC_VERSION_REGEX.matcher(version).matches();
    }

    /**
     * Checks if the specified string is a valid Spring version number.
     *
     * @param version the string to validate
     *
     * @return {@code TRUE} if the string validates as a version number
     */
    public boolean isValidSpringVersion(final String version) {
        return isNotBlank(version) && SPRING_VERSION_REGEX.matcher(version).matches();
    }

    /**
     * Check if the value is less than or equal to a maximum.
     *
     * @param version The {@code version} value to check.
     * @param max     The maximum value.
     *
     * @return {@code TRUE} if the value is less than
     *     or equal to the maximum.
     */
    public boolean maxValue(final String version, final String max) {
        return compare(version, max) <= 0;
    }

    /**
     * Check if the value is greater than or equal to a minimum.
     *
     * @param version The {@code version} value to check.
     * @param min     The minimum value.
     *
     * @return {@code TRUE} if the value is greater than
     *     or equal to the minimum.
     */
    public boolean minValue(final String version, final String min) {
        return compare(version, min) >= 0;
    }

    /**
     * Convert the build string to upper  for case-insensitive comparisons.
     * <p>If blank, convert to "~" to rank higher.</p>
     *
     * @param build the build string
     *
     * @return the parsed build number
     */
    private String parseBuild(final String build) {
        return isBlank(build) ? EMPTY_VERSION_PLACEHOLDER : build.toUpperCase(US);
    }

    /**
     * Parse a long value from a string.
     *
     * @param string the numeric string
     *
     * @return the number or null if not a long value
     */
    private Long parseLong(final String string) {
        Long value;
        try {
            value = Long.parseLong(string);
        } catch (final NumberFormatException e) {
            value = null;
        }

        return value;
    }

    /**
     * Convert the qualifier to upper case for case-insensitive comparisons.
     * <p>If blank, convert to "~" to rank higher.</p>
     * <p>Replace "SNAPSHOT" string with a space for low ranking.</p>
     *
     * @param qualifier the qualifier string
     *
     * @return the parsed qualifier
     */
    private String parseQualifier(final String qualifier) {
        return isBlank(qualifier) ? EMPTY_VERSION_PLACEHOLDER
            : qualifier.toUpperCase(US).replace(SNAPSHOT_VERSION, SPACE);
    }

    /**
     * Parse version number parts from a string using the provided validator.
     *
     * @param version the version string
     * @param pattern the version regex pattern
     *
     * @return the version parts
     */
    private List<String> parseVersion(final String version, final Pattern pattern) {
        final List<String> parsedVersion = new ArrayList<>();
        final Matcher matcher = pattern.matcher(version.trim());
        if (matcher.find()) {
            /* Essentially, cast all version styles to a Maven style equivalent. */
            parsedVersion.add(matcher.group("MAJOR"));
            parsedVersion.add(ofNullable(matcher.group("MINOR")).orElse(EMPTY_VERSION_PLACEHOLDER));
            parsedVersion.add(ofNullable(matcher.group("INCREMENTAL")).orElse(
                EMPTY_VERSION_PLACEHOLDER));
            parsedVersion.add(parseQualifier(matcher.group("QUALIFIER")));
            parsedVersion.add(parseBuild(matcher.group("BUILD")));
        }

        return parsedVersion;
    }

    /**
     * Parse a version string into its parts with all known version formats.
     * <p>Order of precedence:</p>
     * <ol>
     *     <li>Maven</li>
     *     <li>Semantic</li>
     *     <li>Spring</li>
     * </ol>
     *
     * @param version the version string
     *
     * @return the version parts
     */
    private List<String> parseVersion(final String version) {
        List<String> versionParts = parseVersion(version, MAVEN_VERSION_REGEX);
        if (versionParts.isEmpty()) {
            versionParts = parseVersion(version, SEMANTIC_VERSION_REGEX);
            if (versionParts.isEmpty()) {
                versionParts = parseVersion(version, SPRING_VERSION_REGEX);
                if (versionParts.isEmpty()) {
                    /* This is the Maven fallback condition. If a version cannot be parsed from
                    the known patterns, then treat the whole string as a qualifier UNLESS it
                    contains illegal characters. */
                    versionParts = parseVersion("0.0.0-" + version, MAVEN_VERSION_REGEX);
                }
            }
        }

        return versionParts;
    }
}

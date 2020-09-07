package com.threeleaf.test.random.util;

import java.io.Serializable;
import javax.annotation.Nonnull;

import org.apache.commons.validator.routines.RegexValidator;

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
    private static final String MAVEN_VERSION_REGEX =
        "^(?<MAJOR>0|[1-9]\\d*)(?:\\.(?<MINOR>0|[1-9]\\d*))?(?:\\.(?<INCREMENTAL>0|[1-9]\\d*))?"
            + "(?:-(?<BUILD>[0-9]+))?(?:-(?<QUALIFIER>[0-9a-zA-Z].*))?$";

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
     * @see <a href="https://semver.org/">Semantic Versioning 2.0.0</a>.
     */
    private static final String SEMANTIC_VERSION_REGEX =
        "^(?<MAJOR>0|[1-9]\\d*)\\.(?<MINOR>0|[1-9]\\d*)\\.(?<INCREMENTAL>0|[1-9]\\d*)"
            + "(?:-(?<QUALIFIER>(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)"
            + "(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?"
            + "(?:\\+(?<BUILD>[0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$";

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
     *     Project Versioning</a>.
     */
    private static final String SPRING_VERSION_REGEX =
        "^(?<MAJOR>0|[1-9]\\d*)\\.(?<MINOR>0|[1-9]\\d*)\\.(?<INCREMENTAL>0|[1-9]\\d*)"
            + "\\.(?<QUALIFIER>BUILD-SNAPSHOT|M[0-9]+|RC[0-9]+|RELEASE)$";

    /** Singleton instance of this class. */
    private static final VersionValidator VALIDATOR = new VersionValidator();

    private static final long serialVersionUID = -7993917438980742972L;

    /** The semantic version  {@link RegexValidator}. */
    private final RegexValidator
        mavenVersionValidator = new RegexValidator(MAVEN_VERSION_REGEX);

    /** The semantic version  {@link RegexValidator}. */
    private final RegexValidator
        semanticVersionValidator = new RegexValidator(SEMANTIC_VERSION_REGEX);

    /** The Spring version  {@link RegexValidator}. */
    private final RegexValidator
        springVersionValidator = new RegexValidator(SPRING_VERSION_REGEX);

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
     *
     *          <a href="https://github.com/apache/maven/blob/maven-3.3.9/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/1.java">DefaultArtifactVersion</a></li>
     *          <li>Which does not recognize Spring versions (for example, it will say
     *          {@code 10.0.0.RELEASE} < {@code 2.0.0.RELEASE)}</li>
     *          <li>Will not accurately handle semantic versions with build numbers (for
     *          example, it will say {@code 1.0.0-A+10} < {@code 1.0.0-A+2)}</li>
     *      </ul></li>
     *      <li>Note that like Maven, qualifiers, pre-release text, and types are sorted
     *      alphabetically (for example, {@code SNAPSHOT} > {@code RELEASE} alphabetically, even
     *      though our
     *      understanding is that {@code SNAPSHOT} should be < {@code RELEASE})</li>
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
        final String[] version1Parts = parseVersion(version1);
        final String[] version2Parts = parseVersion(version2);

        for (int i = 0; i < version1Parts.length; i++) {
            final String version1part = version1Parts[i];
            final String version2part = version2Parts[i];
            final Long version1num = parseLong(version1part);
            final Long version2num = parseLong(version2part);

            if (version1num == null || version2num == null) {
                comparison = compareNullableStrings(version1part, version2part);
            } else {
                comparison = Long.compare(version1num, version2num);
            }

            if (comparison != 0) {
                break;
            }
        }

        if (comparison == 0) {
            comparison = Integer.compare(version1Parts.length, version2Parts.length);
        }

        return Integer.compare(comparison, 0);
    }

    /**
     * Compare two strings.
     *
     * @param string1 string 1
     * @param string2 string 2
     *
     * @return 1 if string 1 &gt; string 2; 0 if equal or both null; -1 if string 1 &lt; string 2
     */
    public int compareNullableStrings(final String string1, final String string2) {
        final int comparison;
        if (string1 == null || string2 == null) {
            if (string1 == null && string2 == null) {
                /* Both null, therefore equal */
                comparison = 0;
            } else if (string1 == null) {
                /* string 2 must != null, therefore string 1 < string 2 */
                comparison = -1;
            } else {
                /* string 1 must != null, therefore string 1 > string 2 */
                comparison = 1;
            }
        } else {
            /* Compare two strings normally */
            comparison = string1.compareTo(string2);
        }

        return comparison;
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
        return isValidMavenVersion(version) || isValidSemanticVersion(version)
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
        return parseVersion(version, mavenVersionValidator) != null;
    }

    /**
     * Checks if the specified string is a valid semantic version number.
     *
     * @param version the string to validate
     *
     * @return {@code TRUE} if the string validates as a version number
     */
    public boolean isValidSemanticVersion(final String version) {
        return parseVersion(version, semanticVersionValidator) != null;
    }

    /**
     * Checks if the specified string is a valid Spring version number.
     *
     * @param version the string to validate
     *
     * @return {@code TRUE} if the string validates as a version number
     */
    public boolean isValidSpringVersion(final String version) {
        return parseVersion(version, springVersionValidator) != null;
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
     * Parse version number parts from a string using the provided validator.
     *
     * @param version          the version string
     * @param versionValidator the version validator
     *
     * @return the version parts
     */
    private String[] parseVersion(
        final String version, final RegexValidator versionValidator
    ) {

        return version == null ? null : versionValidator.match(version.trim());
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
    private String[] parseVersion(final String version) {
        String[] versionParts = parseVersion(version, mavenVersionValidator);
        versionParts =
            versionParts == null ? parseVersion(version, semanticVersionValidator) : versionParts;

        return versionParts == null ? parseVersion(version, springVersionValidator) : versionParts;
    }
}

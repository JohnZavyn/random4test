package com.threeleaf.test.random.util;

import java.io.Serializable;
import javax.annotation.Nonnull;

import org.apache.commons.validator.routines.RegexValidator;

/**
 * <p><b>Version</b> validation.</p>
 *
 * <p>This class provides methods to validate a candidate version number against semantic versioning
 * rules (see https://semver.org/).</p>
 *
 * <p>This class is a Singleton; you can retrieve the instance via the {@link #getInstance()}
 * method.</p>
 */
public class VersionValidator implements Serializable {

    /** See https://semver.org/ . */
    private static final String SEMANTIC_VERSION_REGEX =
        "^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-("
            + "(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\."
            + "(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\"
            + ".[0-9a-zA-Z-]+)*))?$";

    /** Regular expression to detect a Spring version number. */
    private static final String SPRING_VERSION_REGEX =
        "^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\."
            + "(M[0-9]+|RC[0-9]+|RELEASE|BUILD-SNAPSHOT)$";

    /** Singleton instance of this class. */
    private static final VersionValidator VALIDATOR = new VersionValidator();

    private static final long serialVersionUID = -7993917438980742972L;

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
     *
     * @param version1 the first version
     * @param version2 the second version
     *
     * @return 1 if first &gt; second; 0 if equal; -1 if first &lt; second;
     */
    public int compare(@Nonnull final String version1, @Nonnull final String version2) {
        final String[] version1Parts = parseVersion(version1);
        final String[] version2Parts = parseVersion(version2);

        if (version1.equals(version2)) {
            return 0;
        }

        int comparison = 0;

        for (int i = 0; i < version1Parts.length; i++) {
            final String version1part = version1Parts[i];
            final String version2part = version2Parts[i];
            final long version1num = parseLong(version1part);
            final long version2num = parseLong(version2part);

            if (version1num > -1 && version2num > -1) {
                comparison = Long.compare(version1num, version2num);
            } else {
                comparison = version1part == null ? -1 : version1part.compareTo(version2part);
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
     * Checks if the specified string is a valid semantic or Spring version number.
     *
     * @param version the string to validate
     *
     * @return true if the string validates as a version number
     */
    public boolean isValid(final String version) {
        return isValidSemanticVersion(version) || isValidSpringVersion(version);
    }

    /**
     * Checks if the specified string is a valid semantic version number.
     *
     * @param version the string to validate
     *
     * @return true if the string validates as a version number
     */
    public boolean isValidSemanticVersion(final String version) {
        return parseVersion(version, semanticVersionValidator) != null;
    }

    /**
     * Checks if the specified string is a valid Spring version number.
     *
     * @param version the string to validate
     *
     * @return true if the string validates as a version number
     */
    public boolean isValidSpringVersion(final String version) {
        return parseVersion(version, springVersionValidator) != null;
    }

    /**
     * Parse a positive long value from a string.
     *
     * @param string the numeric string
     *
     * @return -1 if not a positive long
     */
    private long parseLong(final String string) {
        long value = -1;
        try {
            value = Long.parseLong(string);
        } catch (final NumberFormatException e) {
            /* ignore. */
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
     *
     * @param version the version string
     *
     * @return the version parts
     */
    private String[] parseVersion(final String version) {
        final String[] versionParts = parseVersion(version, semanticVersionValidator);

        return versionParts == null ? parseVersion(version, springVersionValidator) : versionParts;
    }
}

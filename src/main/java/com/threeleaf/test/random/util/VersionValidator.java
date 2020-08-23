package com.threeleaf.test.random.util;

import java.io.Serializable;

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

    private static final long serialVersionUID = -4111408868821263765L;

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
     * Checks if the specified string is a valid semantic or Spring version number.
     *
     * @param version the string to validate
     *
     * @return true if the string validates as a version number
     */
    public boolean isValid(String version) {
        return isValidSemanticVersion(version) || isValidSpringVersion(version);
    }

    /**
     * Checks if the specified string is a valid semantic version number.
     *
     * @param version the string to validate
     *
     * @return true if the string validates as a version number
     */
    public boolean isValidSemanticVersion(String version) {
        return semanticVersionValidator.match(version) != null;
    }

    /**
     * Checks if the specified string is a valid Spring version number.
     *
     * @param version the string to validate
     *
     * @return true if the string validates as a version number
     */
    public boolean isValidSpringVersion(String version) {
        return springVersionValidator.match(version) != null;
    }
}

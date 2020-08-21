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

    /** Singleton instance of this class. */
    private static final VersionValidator VALIDATOR = new VersionValidator();

    /** See https://semver.org/ */
    private static final String VERSION_REGEX =
        "^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-("
            + "(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\."
            + "(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\"
            + ".[0-9a-zA-Z-]+)*))?$";

    private static final long serialVersionUID = -4111408868821263765L;

    /** The version  {@link }RegexValidator}. */
    private final RegexValidator versionRegexValidator = new RegexValidator(VERSION_REGEX);

    /**
     * Returns the singleton instance of this validator.
     *
     * @return the singleton instance of this validator
     */
    public static VersionValidator getInstance() {
        return VALIDATOR;
    }

    /**
     * Checks if the specified string is a valid semantic version number.
     *
     * @param version the string to validate
     *
     * @return true if the string validates as a version number
     */
    public boolean isValid(String version) {
        /* verify that address conforms to generic semantic version number format */
        String[] groups = versionRegexValidator.match(version);

        return groups != null;
    }
}

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestString.SPACE;
import static com.threeleaf.test.random.TestString.WHITESPACE;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

/** Test {@link VersionValidator}. */
class VersionValidatorTest {

    /** The test {@link VersionValidator}. */
    private VersionValidator versionValidator;

    /** Test {@link VersionValidator#isValid(String)}. */
    @ParameterizedTest
    @ValueSource(
        strings = {
            "1.2.3",
            "1.0.0-alpha",
            "1.0.0-alpha+001",
            "4.5.6-beta+exp.sha.5114f85",
            "0.0.1",
            "2.3.4-SNAPSHOT",
            "3.4.5-rc+build.345",
            "1.0.0-beta.2",
            "1.0.0-RC-01",
            "1.0.0-SNAPSHOT",
            "1.0.0.RELEASE"
        })
    void isValid(String version) {
        assertTrue(versionValidator.isValid(version));
    }

    /** Test {@link VersionValidator#isValid(String)} when invalid version passed in. */
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {
        SPACE,
        "  ",
        "\t",
        "\n",
        WHITESPACE,
        "1",
        "2.2",
        "v1.2.3",
        "1.2.3-",
        "1.2.3+",
        "1.2.3-+"
    })
    void isValidNot(String version) {
        assertFalse(versionValidator.isValid(version));
    }

    /** Test {@link VersionValidator#isValidSemanticVersion(String)}. */
    @ParameterizedTest
    @ValueSource(
        strings = {
            "1.2.3",
            "1.0.0-alpha",
            "1.0.0-alpha+001",
            "4.5.6-beta+exp.sha.5114f85",
            "0.0.1",
            "2.3.4-SNAPSHOT",
            "3.4.5-rc+build.345",
            "1.0.0-beta.2",
            "1.0.0-RC-01",
            "1.0.0-SNAPSHOT"
        })
    void isValidSemanticVersion(String version) {
        assertTrue(versionValidator.isValidSemanticVersion(version));
    }

    /**
     * Test {@link VersionValidator#isValidSemanticVersion(String)} when invalid version passed
     * in.
     */
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {
        SPACE,
        "  ",
        "\t",
        "\n",
        WHITESPACE,
        "1",
        "2.2",
        "v1.2.3",
        "1.2.3-",
        "1.2.3+",
        "1.2.3-+",
        "1.0.0.BUILD-SNAPSHOT",
        "1.0.0.M0",
        "1.0.0.RC1",
        "1.0.0.RELEASE"
    })
    void isValidSemanticVersionNot(String version) {
        assertFalse(versionValidator.isValidSemanticVersion(version));
    }

    /** Test {@link VersionValidator#isValidSpringVersion(String)}. */
    @ParameterizedTest
    @ValueSource(
        strings = {
            "1.0.0.BUILD-SNAPSHOT",
            "1.0.0.M0",
            "1.0.0.RC1",
            "1.0.0.RELEASE"
        })
    void isValidSpringVersion(String version) {
        assertTrue(versionValidator.isValidSpringVersion(version));
    }

    /** Test {@link VersionValidator#isValidSpringVersion(String)}. */
    @ParameterizedTest
    @ValueSource(
        strings = {
            "1.0.1",
            "1.0.0-BUILD-SNAPSHOT",
            "1.0.0.M",
            "1.0.a.RC1",
            "1.0.0.RELEASE!"
        })
    void isValidSpringVersionNot(String version) {
        assertFalse(versionValidator.isValidSpringVersion(version));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        versionValidator = VersionValidator.getInstance();
    }
}

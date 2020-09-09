package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestString.SPACE;
import static com.threeleaf.test.random.TestString.WHITESPACE;
import static com.threeleaf.test.random.TestVersion.VERSION;
import static com.threeleaf.test.random.util.TestStringUtil.STRING_NULL;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

/** Test {@link VersionValidator}. */
class VersionValidatorTest {

    /** The test {@link VersionValidator}. */
    private VersionValidator versionValidator;

    /** Test {@link VersionValidator#compare(String, String)}. */
    @ParameterizedTest
    @CsvSource(value = {
        /* Maven-only versions */
        "1             |1.0                  |1", /* Empty placeholder has higher value */
        "1.0           |1.0.0                |1",
        "0             |A                    |1", /* Version # > Qualifier only */
        "0.0.0         |A                    |1",
        "0.0.0-A       |A                    |1",
        /* Maven & semantic versions */
        "2.0.0         |1.0.0                |1",
        "1.0.0         |1.0.0-1              |1",
        "1.0.0-1       |1.0.0-A              |1",
        "1.0.0-A       |1.0.0-a              |0", /* Case insensitive */
        "1.0.0-a       |1.0.0                |-1",
        "1.2.3         |1.2.3                |0",
        "5.4.3-M1      |5.4.3-SNAPSHOT       |1", /* Snapshots have lower value */
        "5.4.3         |5.4.3-SNAPSHOT       |1",
        /* Semantic-only versions */
        "5.4.3-a+2     |5.4.3-b+2            |-1",
        "5.4.3-1+2     |5.4.3-1+1            |1",
        "5.4.3-a+2     |5.4.3-1+2            |1",
        "5.4.3-2+2     |5.4.3-c+2            |-1",
        /* Spring-only versions */
        "1.2.3.M1      |1.2.3.BUILD-SNAPSHOT |1",
        "1.2.3.M2      |1.2.3.M1             |1",
        "1.2.3.RC1     |1.2.3.M2             |1",
        "1.2.3.RC2     |1.2.3.RC1            |1",
        "1.2.3.RELEASE |1.2.3.RC2            |1",
        /* Compare mixed versions (even though this shouldn't happen in the real world) */
        "1.2.3.RELEASE |1.2.3-RELEASE        |0",
        "1.0.0-a       |1.0.0-a+0            |1"
    }, delimiter = '|')
    void compare(final String version1, final String version2, final int comparisonResult) {
        assertEquals(comparisonResult, versionValidator.compare(version1, version2));
    }

    /** Test {@link VersionValidator#compare(String, String)} when nulls are passed in. */
    @SuppressWarnings("ConstantConditions" /* Passing nulls for testing purposes */)
    @Test
    void compareNull() {
        assertThrows(NullPointerException.class, () -> versionValidator.compare(
            STRING_NULL,
            STRING_NULL
        ));
        assertThrows(NullPointerException.class, () -> versionValidator.compare(
            VERSION,
            STRING_NULL
        ));
        assertThrows(NullPointerException.class, () -> versionValidator.compare(
            STRING_NULL,
            VERSION
        ));
    }

    /** Test {@link VersionValidator#isInRange(String, String, String)}. */
    @ParameterizedTest
    @CsvSource(value = {
        "0.9.9     |1.0.0                |2.0.0     |false", /* < range */
        "4.0.0     |4.0.0                |5.0.0     |true", /* lower bound */
        "1.0.0-1   |1.0.0-0              |1.0.0     |true", /* in range */
        "1.0.0-7+2 |1.0.0-7+1            |1.0.0-7+3 |true", /* in range */
        "1.0.0.M1  |1.0.0.BUILD-SNAPSHOT |1.0.0.RC1 |true", /* in range, Spring version */
        "5.0.0     |4.0.0                |5.0.0     |true", /* upper bound */
        "4.0.0     |2.0.0                |3.0.0     |false" /* > range */
    }, delimiter = '|')
    void isInRange(final String version, final String min, final String max, final boolean result) {
        assertEquals(result, versionValidator.isInRange(version, min, max));
    }

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
    void isValid(final String version) {
        assertTrue(versionValidator.isValid(version));
    }

    /** Test {@link VersionValidator#isValidMavenVersion(String)}. */
    @ParameterizedTest
    @ValueSource(
        strings = {
            "1",
            "1.2",
            "1.2.3",
            "1.2.3-4",
            "1.2.3-qualifier",
            "1.2.3-alpha-1",
            "1.2-alpha-1",
            "1.2-alpha-1-20050205.060708-1",
            "2.0-1"
        })
    void isValidMavenVersion(final String version) {
        assertTrue(versionValidator.isValidMavenVersion(version));
    }

    /** Test {@link VersionValidator#isValidMavenVersion(String)} for invalid Maven versions. */
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(
        strings = {
            "1.2.3.4",
            "4.5.6+7",
            "1.0.0.M",
            "1.0.a.RC1",
            "1.0.0.RELEASE!"
        })
    void isValidMavenVersionNot(final String version) {
        assertFalse(versionValidator.isValidMavenVersion(version));
    }

    /** Test {@link VersionValidator#isValid(String)} for invalid versions. */
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {
        SPACE,
        "  ",
        "\t",
        "\n",
        WHITESPACE,
        "v1.2.3",
        "1.2.3-",
        "1.2.3+",
        "1.2.3-+"
    })
    void isValidNot(final String version) {
        assertFalse(versionValidator.isValid(version));
    }

    /** Test {@link VersionValidator#isValidSemanticVersion(String)}. */
    @ParameterizedTest
    @ValueSource(
        strings = {
            "1.2.3",
            "1.2.3+0",
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
    void isValidSemanticVersion(final String version) {
        assertTrue(versionValidator.isValidSemanticVersion(version));
    }

    /**
     * Test {@link VersionValidator#isValidSemanticVersion(String)} for invalid semantic
     * versions.
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
    void isValidSemanticVersionNot(final String version) {
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
    void isValidSpringVersion(final String version) {
        assertTrue(versionValidator.isValidSpringVersion(version));
    }

    /** Test {@link VersionValidator#isValidSpringVersion(String)} for invalid Spring versions. */
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(
        strings = {
            "1.0.1",
            "1.0.0-BUILD-SNAPSHOT",
            "1.0.0.M",
            "1.0.a.RC1",
            "1.0.0.RELEASE!"
        })
    void isValidSpringVersionNot(final String version) {
        assertFalse(versionValidator.isValidSpringVersion(version));
    }

    /** Test {@link VersionValidator#maxValue(String, String)}. */
    @ParameterizedTest
    @CsvSource(value = {
        "1.0.0         |2.0.0                |true",
        "1.0.0         |1.0.0-1              |false",
        "2.0.0         |1.0.0                |false",
        "1.0.0-a       |1.0.0                |true",
        "5.4.3-1+2     |5.4.3-1+1            |false",
        "5.4.3-a+2     |5.4.3-1+2            |false",
        "5.4.3-2+2     |5.4.3-c+2            |true",
        "1.2.3.RELEASE |1.2.3.BUILD-SNAPSHOT |false",
        "1.2.3         |1.2.3                |true",
        "1.2.3+0       |1.2.3                |true",
        "1.2.3.RELEASE |1.2.3-RELEASE        |true",
        "5.4.3-a+2     |5.4.3-b+2            |true"
    }, delimiter = '|')
    void maxValue(final String version, final String max, final boolean isVersionLteMax) {
        assertEquals(isVersionLteMax, versionValidator.maxValue(version, max));
    }

    /** Test {@link VersionValidator#minValue(String, String)}. */
    @ParameterizedTest
    @CsvSource(value = {
        "1.0.0         |2.0.0                |false",
        "1.0.0         |1.0.0-1              |true",
        "2.0.0         |1.0.0                |true",
        "1.0.0-a       |1.0.0                |false",
        "5.4.3-1+2     |5.4.3-1+1            |true",
        "5.4.3-a+2     |5.4.3-1+2            |true",
        "5.4.3-2+2     |5.4.3-c+2            |false",
        "1.2.3.RELEASE |1.2.3.BUILD-SNAPSHOT |true",
        "1.2.3         |1.2.3                |true",
        "1.2.3+0       |1.2.3                |false",
        "1.2.3.RELEASE |1.2.3-RELEASE        |true",
        "5.4.3-a+2     |5.4.3-b+2            |false"
    }, delimiter = '|')
    void minValue(final String version, final String min, final boolean isVersionGteMin) {
        assertEquals(isVersionGteMin, versionValidator.minValue(version, min));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        versionValidator = VersionValidator.getInstance();
    }
}

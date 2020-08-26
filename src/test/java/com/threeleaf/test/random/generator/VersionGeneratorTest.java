package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestIntegerTest.LOOP_COUNT_MIN;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.threeleaf.test.random.util.VersionValidator;
import org.junit.jupiter.api.*;

/** Test {@link VersionGenerator}. */
class VersionGeneratorTest {

    private final VersionValidator versionValidator = new VersionValidator();

    /** The test {@link VersionGenerator}. */
    private VersionGenerator versionGenerator;

    /** Test {@link VersionGenerator#randomSemanticVersion()}. */
    @Test
    void randomSemanticVersion() {
        assertTrue(
            versionValidator.isValidSemanticVersion(versionGenerator.randomSemanticVersion()));
    }

    /** Test {@link VersionGenerator#randomSpringVersion()}. */
    @Test
    void randomSpringVersion() {
        assertTrue(versionValidator.isValidSpringVersion(versionGenerator.randomSpringVersion()));
    }

    /** Test {@link VersionGenerator#randomVersion()}. */
    @RepeatedTest(LOOP_COUNT_MIN)
    void randomVersion() {
        assertTrue(versionValidator.isValid(versionGenerator.randomVersion()));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        versionGenerator = new VersionGenerator();
    }
}

package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestIntegerTest.LOOP_COUNT_MAX;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.threeleaf.test.random.util.VersionValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

/** Test {@link VersionGenerator}. */
class VersionGeneratorTest {

    private final VersionValidator versionValidator = new VersionValidator();

    /** The test {@link VersionGenerator}. */
    private VersionGenerator versionGenerator;

    /** Test {@link VersionGenerator#randomVersion()}. */
    @RepeatedTest(LOOP_COUNT_MAX)
    void randomVersion() {
        assertTrue(versionValidator.isValid(versionGenerator.randomVersion()));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        versionGenerator = new VersionGenerator();
    }
}

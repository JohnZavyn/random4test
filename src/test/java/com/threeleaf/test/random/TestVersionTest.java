/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestString.STRING_ARRAY;
import static com.threeleaf.test.random.TestVersion.VERSION;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.threeleaf.test.random.util.VersionValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link TestVersion}. */
class TestVersionTest {

    /** The {@link VersionValidator}. */
    private final VersionValidator versionValidator = new VersionValidator();

    /** The test {@link TestVersion}. */
    private TestVersion testVersion;

    /** Test {@link TestVersion#random()}. */
    @Test
    void random() {
        assertTrue(versionValidator.isValid(VERSION));
        assertTrue(versionValidator.isValid(testVersion.random()));
    }

    /** Test {@link TestVersion#random(String...)}. */
    @Test
    void randomFieldsExcluded() {
        assertTrue(versionValidator.isValid(testVersion.random(STRING_ARRAY)));
    }

    /** Test {@link TestVersion#randomVersion()}. */
    @Test
    void randomVersion() {
        assertTrue(versionValidator.isValid(TestVersion.randomVersion()));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        testVersion = new TestVersion();
    }
}

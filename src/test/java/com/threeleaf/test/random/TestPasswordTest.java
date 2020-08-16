package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_08;
import static com.threeleaf.test.random.TestInteger.INT_17;
import static com.threeleaf.test.random.TestString.STRING;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link TestPassword}. */
class TestPasswordTest {

    /** The test {@link TestPassword}. */
    private TestPassword testPassword;

    /** Test {@link TestPassword#random()}. */
    @Test
    void random() {
        String result = testPassword.random();

        assertTrue(result.length() >= INT_08);
        assertTrue(result.length() < INT_17);
    }

    /** Test {@link TestPassword#random(String...)}. */
    @Test
    void randomFieldsExcluded() {
        String result = testPassword.random(STRING);

        assertTrue(result.length() >= INT_08);
        assertTrue(result.length() < INT_17);
    }

    /** Test {@link TestPassword#randomPassword()}. */
    @Test
    void randomPassword() {
        assertNotNull(TestPassword.randomPassword());
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        testPassword = new TestPassword();
    }
}

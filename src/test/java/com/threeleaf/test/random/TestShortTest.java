package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_16;
import static com.threeleaf.test.random.TestShort.SHORT_UNSIGNED_MAX;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** Test {@link TestShort}. */
class TestShortTest {

    /** Test {@link TestShort#randomHex()}. */
    @Test
    void randomHex() {
        int unsigned = Integer.parseInt(TestShort.randomHex(), INT_16);
        assertTrue(unsigned <= SHORT_UNSIGNED_MAX);
        assertTrue(unsigned >= INT_00);
    }

    /** Test {@link TestShort#randomShort()}. */
    @Test
    void randomShort() {
        assertDoesNotThrow(TestShort::randomShort);
    }
}

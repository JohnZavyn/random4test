package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

/** Test {@link TestBigInteger}. */
class TestBigIntegerTest {

    /** Test {@link TestBigInteger#random()}. */
    @Test
    void random() {
        assertNotNull(TestBigInteger.randomBigInteger());
    }

    /** Test {@link TestBigInteger#randomBetween(long, long)}. */
    @Test
    void randomBetween() {
        BigInteger result = TestBigInteger.randomBetween(BigInteger.ZERO, BigInteger.TEN);

        assertTrue(result.intValue() >= INT_00);
        assertTrue(result.intValue() <= INT_10);
    }

    /** Test {@link TestBigInteger#randomNegative()}. */
    @Test
    void randomNegative() {
        assertTrue(TestBigInteger.randomNegative().doubleValue() < 0);
    }

    /** Test {@link TestBigInteger#randomPercent()}. */
    @Test
    void randomPercent() {
        BigInteger result = TestBigInteger.randomPercent();

        assertTrue(result.intValue() >= INT_00);
        assertTrue(result.intValue() <= INT_100);
    }

    /** Test {@link TestBigInteger#randomPositive()}. */
    @Test
    void randomPositive() {
        assertTrue(TestBigInteger.randomPositive().doubleValue() > 0);
    }
}

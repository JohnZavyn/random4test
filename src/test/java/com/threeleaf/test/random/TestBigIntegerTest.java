/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestBigInteger.*;
import static com.threeleaf.test.random.TestDouble.D_00;
import static com.threeleaf.test.random.TestInteger.*;
import static java.math.BigInteger.TEN;
import static java.math.BigInteger.ZERO;
import static org.apache.commons.validator.routines.BigIntegerValidator.getInstance;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.apache.commons.validator.routines.BigIntegerValidator;
import org.junit.jupiter.api.Test;

/** Test {@link TestBigInteger}. */
class TestBigIntegerTest {

    /** The {@link BigIntegerValidator}. */
    private final BigIntegerValidator bigIntegerValidator = getInstance();

    /** Test {@link TestBigInteger#random()}. */
    @Test
    void random() {
        assertNotNull(TestBigInteger.randomBigInteger());
    }

    /** Test {@link TestBigInteger#randomBetween(long, long)}. */
    @Test
    void randomBetween() {
        final BigInteger result = TestBigInteger.randomBetween(ZERO, TEN);

        assertTrue(bigIntegerValidator.isInRange(result, INT_00, INT_10));
    }

    /** Test {@link TestBigInteger#randomBigInteger()}. */
    @Test
    void randomBigInteger() {
        assertNotNull(TestBigInteger.randomBigInteger());
        assertNotEquals(BIG_INTEGER, BIG_INTEGER_RANDOM);
    }

    /** Test {@link TestBigInteger#randomNegative()}. */
    @Test
    void randomNegative() {
        assertTrue(bigIntegerValidator.maxValue(TestBigInteger.randomNegative(), D_00));
    }

    /** Test {@link TestBigInteger#randomPercent()}. */
    @Test
    void randomPercent() {
        final BigInteger result = TestBigInteger.randomPercent();

        assertTrue(bigIntegerValidator.isInRange(result, INT_00, INT_100));
        assertTrue(bigIntegerValidator.isInRange(BIG_INTEGER_SMALL, INT_00, INT_100));
    }

    /** Test {@link TestBigInteger#randomPositive()}. */
    @Test
    void randomPositive() {
        assertTrue(bigIntegerValidator.minValue(TestBigInteger.randomPositive(), INT_00));
    }
}

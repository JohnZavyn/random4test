/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestBigDecimal.*;
import static com.threeleaf.test.random.TestDouble.*;
import static java.math.BigDecimal.TEN;
import static java.math.BigDecimal.ZERO;
import static org.apache.commons.validator.routines.BigDecimalValidator.getInstance;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.apache.commons.validator.routines.BigDecimalValidator;
import org.junit.jupiter.api.Test;

/** Test {@link TestBigDecimal}. */
class TestBigDecimalTest {

    /** The {@link BigDecimalValidator}. */
    private final BigDecimalValidator bigDecimalValidator = getInstance();

    /** Test {@link TestBigDecimal#randomBetween(BigDecimal, BigDecimal)}. */
    @Test
    void randomBetween() {
        final BigDecimal result = TestBigDecimal.randomBetween(ZERO, TEN);

        assertTrue(bigDecimalValidator.isInRange(result, D_00, D_10));
    }

    /** Test {@link TestBigDecimal#randomBigDecimal()}. */
    @Test
    void randomBigDecimal() {
        assertNotNull(TestBigDecimal.randomBigDecimal());
        assertNotEquals(BIG_DECIMAL, BIG_DECIMAL_RANDOM);
    }

    /** Test {@link TestBigDecimal#randomNegative()}. */
    @Test
    void randomNegative() {
        assertTrue(bigDecimalValidator.maxValue(TestBigDecimal.randomNegative(), D_00));
    }

    /** Test {@link TestBigDecimal#randomPercent()}. */
    @Test
    void randomPercent() {
        final BigDecimal result = TestBigDecimal.randomPercent();

        assertTrue(bigDecimalValidator.isInRange(result, D_00, D_100));
        assertTrue(bigDecimalValidator.isInRange(BIG_DECIMAL_SMALL, D_00, D_100));
    }

    /** Test {@link TestBigDecimal#randomPositive()}. */
    @Test
    void randomPositive() {
        assertTrue(bigDecimalValidator.minValue(TestBigDecimal.randomPositive(), D_00));
    }
}

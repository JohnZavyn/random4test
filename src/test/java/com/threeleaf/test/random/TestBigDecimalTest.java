package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.*;
import static java.math.BigDecimal.TEN;
import static java.math.BigDecimal.ZERO;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/** Test {@link TestBigDecimal}. */
class TestBigDecimalTest {

    /** Test {@link TestBigDecimal#randomBetween(BigDecimal, BigDecimal)}. */
    @Test
    void randomBetween() {
        BigDecimal result = TestBigDecimal.randomBetween(ZERO, TEN);

        assertTrue(result.intValue() >= INT_00);
        assertTrue(result.intValue() <= INT_10);
    }

    /** Test {@link TestBigDecimal#randomBigDecimal()}. */
    @Test
    void randomBigDecimal() {
        assertNotNull(TestBigDecimal.randomBigDecimal());
    }

    /** Test {@link TestBigDecimal#randomNegative()}. */
    @Test
    void randomNegative() {
        assertTrue(TestBigDecimal.randomNegative().doubleValue() < 0);
    }

    /** Test {@link TestBigDecimal#randomPercent()}. */
    @Test
    void randomPercent() {
        BigDecimal result = TestBigDecimal.randomPercent();

        assertTrue(result.intValue() >= INT_00);
        assertTrue(result.intValue() <= INT_100);
    }

    /** Test {@link TestBigDecimal#randomPositive()}. */
    @Test
    void randomPositive() {
        assertTrue(TestBigDecimal.randomPositive().doubleValue() > 0);
    }
}

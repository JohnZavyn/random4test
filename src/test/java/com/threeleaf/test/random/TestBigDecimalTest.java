package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.*;
import static java.math.BigDecimal.TEN;
import static java.math.BigDecimal.ZERO;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/** Test {@link TestBigDecimal}. */
public class TestBigDecimalTest {

    /** Test {@link TestBigDecimal#randomBetween(BigDecimal, BigDecimal)}. */
    @Test
    public void randomBetween() {
        final BigDecimal result = TestBigDecimal.randomBetween(ZERO, TEN);

        assertTrue(result.intValue() >= INT_00);
        assertTrue(result.intValue() <= INT_10);
    }

    /** Test {@link TestBigDecimal#randomBigDecimal()}. */
    @Test
    public void randomBigDecimal() {
        assertNotNull(TestBigDecimal.randomBigDecimal());
    }

    /** Test {@link TestBigDecimal#randomNegative()}. */
    @Test
    public void randomNegative() {
        assertTrue(TestBigDecimal.randomNegative().doubleValue() < 0);
    }

    /** Test {@link TestBigDecimal#randomPercent()}. */
    @Test
    public void randomPercent() {
        final BigDecimal result = TestBigDecimal.randomPercent();

        assertTrue(result.intValue() >= INT_00);
        assertTrue(result.intValue() <= INT_100);
    }

    /** Test {@link TestBigDecimal#randomPositive()}. */
    @Test
    public void randomPositive() {
        assertTrue(TestBigDecimal.randomPositive().doubleValue() > 0);
    }
}

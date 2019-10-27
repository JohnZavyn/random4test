package com.threeleaf.test.random;

import org.junit.Test;

import java.math.BigInteger;

import static com.threeleaf.test.random.TestInteger.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/** Test {@link TestBigInteger}. */
public class TestBigIntegerTest
{

    /** Test {@link TestBigInteger#random()}. */
    @Test
    public void random()
    {
        assertNotNull(TestBigInteger.randomBigInteger());
    }

    /** Test {@link TestBigInteger#randomBetween(long, long)}. */
    @Test
    public void randomBetween()
    {
        final BigInteger result = TestBigInteger.randomBetween(BigInteger.ZERO, BigInteger.TEN);

        assertTrue(result.intValue() >= INT_00);
        assertTrue(result.intValue() <= INT_10);
    }

    /** Test {@link TestBigInteger#randomNegative()}. */
    @Test
    public void randomNegative()
    {
        assertTrue(TestBigInteger.randomNegative().doubleValue() < 0);
    }

    /** Test {@link TestBigInteger#randomPercent()}. */
    @Test
    public void randomPercent()
    {
        final BigInteger result = TestBigInteger.randomPercent();

        assertTrue(result.intValue() >= INT_00);
        assertTrue(result.intValue() <= INT_100);
    }

    /** Test {@link TestBigInteger#randomPositive()}. */
    @Test
    public void randomPositive()
    {
        assertTrue(TestBigInteger.randomPositive().doubleValue() > 0);
    }
}

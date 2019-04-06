package com.threeleaf.test.random.util;

import org.junit.Test;

import static com.threeleaf.test.random.TestPrimitive.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/** Test {@link TestNumberUtil} */
public class TestNumberUtilTest
{

    /** Test {@link TestNumberUtil#random0to10()}. */
    @Test
    public void random0to10()
    {
        final int number = TestNumberUtil.random0to10();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_10);
    }

    /** Test {@link TestNumberUtil#random0to100()}. */
    @Test
    public void random0to100()
    {
        final int number = TestNumberUtil.random0to100();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_100);
    }

    /** Test {@link TestNumberUtil#random1to10()}. */
    @Test
    public void random1to10()
    {
        final int number = TestNumberUtil.random1to10();

        assertTrue(number >= INT_01);
        assertTrue(number <= INT_10);
    }

    /** Test {@link TestNumberUtil#random1to100()}. */
    @Test
    public void random1to100()
    {
        final int number = TestNumberUtil.random1to100();

        assertTrue(number >= INT_01);
        assertTrue(number <= INT_100);
    }

    /** Test {@link TestNumberUtil#randomBetween(int, int)}. */
    @Test
    public void randomBetween()
    {
        final int number = TestNumberUtil.randomBetween(INT_05, INT_10);

        assertTrue(number >= INT_05);
        assertTrue(number <= INT_10);
    }

    /** Test {@link TestNumberUtil#randomBigDecimal()}. */
    @Test
    public void randomBigDecimal()
    {
        assertNotNull(TestNumberUtil.randomBigDecimal());
    }

    /** Test {@link TestNumberUtil#randomDigit()}. */
    @Test
    public void randomDigit()
    {
        final int number = TestNumberUtil.randomDigit();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_09);
    }

    /** Test {@link TestNumberUtil#randomPercent()}. */
    @Test
    public void randomPercent()
    {
        final double percent = TestNumberUtil.randomPercent();

        assertTrue(percent >= INT_00);
        assertTrue(percent <= INT_100);
    }
}

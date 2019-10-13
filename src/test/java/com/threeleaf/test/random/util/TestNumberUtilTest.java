package com.threeleaf.test.random.util;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.util.RandomIntegerUtil.*;
import static com.threeleaf.test.random.util.RandomLongUtil.LONG_05;
import static com.threeleaf.test.random.util.RandomLongUtil.LONG_10;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/** Test {@link TestNumberUtil} */
public class TestNumberUtilTest
{

    /** Test {@link TestNumberUtil} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestNumberUtil> constructor = TestNumberUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try
        {
            constructor.newInstance();
        }
        catch (Exception e)
        {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link RandomIntegerUtil#random0to10()}. */
    @Test
    public void random0to10()
    {
        final int number = RandomIntegerUtil.random0to10();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_10);
    }

    /** Test {@link RandomIntegerUtil#random0to100()}. */
    @Test
    public void random0to100()
    {
        final int number = RandomIntegerUtil.random0to100();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_100);
    }

    /** Test {@link RandomIntegerUtil#random1to10()}. */
    @Test
    public void random1to10()
    {
        final int number = RandomIntegerUtil.random1to10();

        assertTrue(number >= INT_01);
        assertTrue(number <= INT_10);
    }

    /** Test {@link RandomIntegerUtil#random1to100()}. */
    @Test
    public void random1to100()
    {
        final int number = RandomIntegerUtil.random1to100();

        assertTrue(number >= INT_01);
        assertTrue(number <= INT_100);
    }

    /** Test {@link RandomIntegerUtil#randomBetween(int, int)}. */
    @Test
    public void randomBetween()
    {
        final int number = RandomIntegerUtil.randomBetween(INT_05, INT_10);

        assertTrue(number >= INT_05);
        assertTrue(number <= INT_10);
    }

    /** Test {@link RandomLongUtil#randomBetween(long, long)}. */
    @Test
    public void randomBetweenLong()
    {
        final long number = RandomLongUtil.randomBetween(LONG_10, LONG_05);

        assertTrue(number >= LONG_05);
        assertTrue(number <= LONG_10);
    }

    /** Test {@link TestNumberUtil#randomBigDecimal()}. */
    @Test
    public void randomBigDecimal()
    {
        assertNotNull(TestNumberUtil.randomBigDecimal());
    }

    /** Test {@link RandomIntegerUtil#randomDigit()}. */
    @Test
    public void randomDigit()
    {
        final int number = RandomIntegerUtil.randomDigit();

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

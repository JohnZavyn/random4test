package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestInteger.*;
import static org.junit.Assert.*;

/** Test {@link TestInteger}. */
public class TestIntegerTest
{

    /** Test {@link TestInteger} constants. */
    @Test
    public void constants()
    {
        assertNotEquals(INT_00, INTEGER_ARRAY.length);
        assertEquals(INT_01, INTEGER_ARRAY_SINGLE.length);
        assertNotEquals(INT_00, INTEGER_COLLECTION.size());
        assertEquals(INT_01, INTEGER_COLLECTION_SINGLE.size());
        assertFalse(INTEGER_LIST.isEmpty());
        assertEquals(INT_01, INTEGER_LIST_SINGLE.size());
        assertFalse(INTEGER_MAP.isEmpty());
        assertFalse(TestString.STRING_MAP_INTEGER.isEmpty());
        assertEquals(INT_01, INTEGER_MAP_SINGLE.size());
        assertEquals(INT_01, TestString.STRING_MAP_INTEGER_SINGLE.size());
        assertFalse(INTEGER_SET.isEmpty());
        assertEquals(INT_01, INTEGER_SET_SINGLE.size());
    }

    /** Test {@link TestInteger#random0to10()}. */
    @Test
    public void random0to10()
    {
        final int number = TestInteger.random0to10();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_10);
    }

    /** Test {@link TestInteger#randomPercent()}}. */
    @Test
    public void random0to100()
    {
        final int number = TestInteger.randomPercent();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_100);
    }

    /** Test {@link TestInteger#random1to10()}. */
    @Test
    public void random1to10()
    {
        final int number = TestInteger.random1to10();

        assertTrue(number >= INT_01);
        assertTrue(number <= INT_10);
    }

    /** Test {@link TestInteger#random1to100()}. */
    @Test
    public void random1to100()
    {
        final int number = TestInteger.random1to100();

        assertTrue(number >= INT_01);
        assertTrue(number <= INT_100);
    }

    /** Test {@link TestInteger#randomBetween(int, int)}. */
    @Test
    public void randomBetween()
    {
        final int number = TestInteger.randomBetween(INT_05, INT_10);

        assertTrue(number >= INT_05);
        assertTrue(number <= INT_10);
    }

    /** Test {@link TestInteger#randomDigit()}. */
    @Test
    public void randomDigit()
    {
        final int number = TestInteger.randomDigit();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_09);
    }

    /** Test {@link TestInteger#randomHex()}. */
    @Test
    public void randomHex()
    {
        final long unsigned = Long.parseLong(TestInteger.randomHex(), INT_16);
        assertTrue(unsigned <= INTEGER_UNSIGNED_MAX);
        assertTrue(unsigned >= INT_00);
    }

    /** Test constant unmodifiable. */
    @Test(expected = UnsupportedOperationException.class)
    public void unmodifiable()
    {
        INTEGER_SET.add(INTEGER);
    }
}

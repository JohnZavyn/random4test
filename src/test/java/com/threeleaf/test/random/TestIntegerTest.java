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
        assertNotEquals(INT_00, ARRAY_INTEGER.length);
        assertEquals(INT_01, ARRAY_INTEGER_SINGLE.length);
        assertNotEquals(INT_00, COLLECTION_INTEGER.size());
        assertEquals(INT_01, COLLECTION_INTEGER_SINGLE.size());
        assertFalse(LIST_INTEGER.isEmpty());
        assertEquals(INT_01, LIST_INTEGER_SINGLE.size());
        assertFalse(MAP_INTEGER.isEmpty());
        assertFalse(MAP_INTEGER_STRING.isEmpty());
        assertEquals(INT_01, MAP_INTEGER_SINGLE.size());
        assertEquals(INT_01, MAP_INTEGER_STRING_SINGLE.size());
        assertFalse(SET_INTEGER.isEmpty());
        assertEquals(INT_01, SET_INTEGER_SINGLE.size());
    }

    /** Test {@link TestInteger#random0to10()}. */
    @Test
    public void random0to10()
    {
        final int number = TestInteger.random0to10();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_10);
    }

    /** Test {@link TestInteger#random0to100()}. */
    @Test
    public void random0to100()
    {
        final int number = TestInteger.random0to100();

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

    /** Test constant unmodifiable. */
    @Test(expected = UnsupportedOperationException.class)
    public void unmodifiable()
    {
        SET_INTEGER.add(INTEGER);
    }
}

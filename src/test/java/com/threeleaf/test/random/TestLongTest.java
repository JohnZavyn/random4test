package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestLong.*;
import static org.junit.Assert.*;

/** Test {@link TestLong}. */
public class TestLongTest
{

    /** Test {@link TestLong} constants. */
    @Test
    public void constants()
    {
        assertNotEquals(INT_00, ARRAY_LONG.length);
        assertEquals(INT_01, ARRAY_LONG_SINGLE.length);
        assertNotEquals(INT_00, COLLECTION_LONG.size());
        assertEquals(INT_01, COLLECTION_LONG_SINGLE.size());
        assertFalse(LIST_LONG.isEmpty());
        assertEquals(INT_01, LIST_LONG_SINGLE.size());
        assertFalse(MAP_LONG.isEmpty());
        assertFalse(MAP_LONG_STRING.isEmpty());
        assertEquals(INT_01, MAP_LONG_SINGLE.size());
        assertEquals(INT_01, MAP_LONG_STRING_SINGLE.size());
        assertFalse(SET_LONG.isEmpty());
        assertEquals(INT_01, SET_LONG_SINGLE.size());
    }

    /** Test {@link TestLong#randomBetween(long, long)}. */
    @Test
    public void randomBetweenLong()
    {
        final long number = randomBetween(LONG_10, LONG_05);

        assertTrue(number >= LONG_05);
        assertTrue(number <= LONG_10);
    }
}

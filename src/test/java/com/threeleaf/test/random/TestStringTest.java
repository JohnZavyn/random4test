package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestString.*;
import static org.junit.Assert.*;

/** Test {@link TestString}. */
public class TestStringTest
{

    /** Test {@link TestString} constants. */
    @Test
    public void constants()
    {
        assertNotEquals(INT_00, ARRAY_STRING.length);
        assertEquals(INT_01, ARRAY_STRING_SINGLE.length);
        assertNotEquals(INT_00, COLLECTION_STRING.size());
        assertEquals(INT_01, COLLECTION_STRING_SINGLE.size());
        assertFalse(LIST_STRING.isEmpty());
        assertEquals(INT_01, LIST_STRING_SINGLE.size());
        assertFalse(MAP_STRING.isEmpty());
        assertEquals(INT_01, MAP_STRING_SINGLE.size());
        assertFalse(SET_STRING.isEmpty());
        assertEquals(INT_01, SET_STRING_SINGLE.size());
    }

}

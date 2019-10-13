package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestObject.*;
import static org.junit.Assert.*;

/** Test {@link TestObject}. */
public class TestObjectTest
{

    /** Test {@link TestObject} constants. */
    @Test
    public void constants()
    {
        assertNotEquals(INT_00, ARRAY_OBJECT.length);
        assertEquals(INT_01, ARRAY_OBJECT_SINGLE.length);
        assertNotEquals(INT_00, COLLECTION_OBJECT.size());
        assertEquals(INT_01, COLLECTION_OBJECT_SINGLE.size());
        assertFalse(LIST_OBJECT.isEmpty());
        assertEquals(INT_01, LIST_OBJECT_SINGLE.size());
        assertFalse(MAP_OBJECT.isEmpty());
        assertEquals(INT_01, MAP_OBJECT_SINGLE.size());
        assertFalse(SET_OBJECT.isEmpty());
        assertEquals(INT_01, SET_OBJECT_SINGLE.size());
    }
}

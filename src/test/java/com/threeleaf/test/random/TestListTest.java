package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestList.*;
import static com.threeleaf.test.random.TestPrimitive.INT_01;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/** Test {@link TestList}. */
public class TestListTest
{

    /** Test {@link TestList} constants. */
    @Test
    public void constants()
    {
        assertFalse(LIST_INTEGER.isEmpty());
        assertFalse(LIST_LONG.isEmpty());
        assertFalse(LIST_OBJECT.isEmpty());
        assertFalse(LIST_STRING.isEmpty());
        assertEquals(INT_01, LIST_SINGLE_INTEGER.size());
        assertEquals(INT_01, LIST_SINGLE_LONG.size());
        assertEquals(INT_01, LIST_SINGLE_OBJECT.size());
        assertEquals(INT_01, LIST_SINGLE_STRING.size());
    }
}

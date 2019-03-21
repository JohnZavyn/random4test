package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestArray.*;
import static org.junit.Assert.assertNotEquals;

/** Test {@link TestArray}. */
public class TestArrayTest
{

    /** Test {@link TestArray} constants. */
    @Test
    public void constants()
    {
        assertNotEquals(0, INTEGER_ARRAY.length);
        assertNotEquals(0, LONG_ARRAY.length);
        assertNotEquals(0, OBJECT_ARRAY.length);
        assertNotEquals(0, STRING_ARRAY.length);
    }
}

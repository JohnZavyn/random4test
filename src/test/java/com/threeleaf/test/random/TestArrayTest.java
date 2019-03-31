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
        assertNotEquals(0, ARRAY_INTEGER.length);
        assertNotEquals(0, ARRAY_LONG.length);
        assertNotEquals(0, ARRAY_OBJECT.length);
        assertNotEquals(0, ARRAY_STRING.length);
    }
}

package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestMap.*;
import static org.junit.Assert.assertFalse;

/** Test {@link TestMap}. */
public class TestMapTest
{

    /** Test {@link TestMap} constants. */
    @Test
    public void constants()
    {
        assertFalse(MAP_INTEGER.isEmpty());
        assertFalse(MAP_LONG.isEmpty());
        assertFalse(MAP_OBJECT.isEmpty());
        assertFalse(MAP_STRING.isEmpty());
    }
}

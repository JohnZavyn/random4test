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
        assertFalse(INTEGER_MAP.isEmpty());
        assertFalse(LONG_MAP.isEmpty());
        assertFalse(OBJECT_MAP.isEmpty());
        assertFalse(STRING_MAP.isEmpty());
    }
}

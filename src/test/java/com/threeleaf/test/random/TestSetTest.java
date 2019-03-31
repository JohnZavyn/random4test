package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestNumber.INTEGER;
import static com.threeleaf.test.random.TestSet.*;
import static org.junit.Assert.assertFalse;

/** Test {@link TestSet}. */
public class TestSetTest
{

    /** Test {@link TestSet} constants. */
    @Test
    public void constants()
    {
        assertFalse(SET_INTEGER.isEmpty());
        assertFalse(SET_LONG.isEmpty());
        assertFalse(SET_OBJECT.isEmpty());
        assertFalse(SET_STRING.isEmpty());
    }

    /** Test {@link TestSet} constant unmodifiable. */
    @Test(expected = UnsupportedOperationException.class)
    public void unmodifiable()
    {
        SET_INTEGER.add(INTEGER);
    }
}

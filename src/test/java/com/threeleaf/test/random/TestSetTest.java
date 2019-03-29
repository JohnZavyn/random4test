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
        assertFalse(INTEGER_SET.isEmpty());
        assertFalse(LONG_SET.isEmpty());
        assertFalse(OBJECT_SET.isEmpty());
        assertFalse(STRING_SET.isEmpty());
    }

    /** Test {@link TestSet} constant unmodifiable. */
    @Test(expected = UnsupportedOperationException.class)
    public void unmodifiable()
    {
        INTEGER_SET.add(INTEGER);
    }
}

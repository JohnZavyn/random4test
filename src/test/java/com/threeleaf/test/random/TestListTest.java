package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestList.*;
import static org.junit.Assert.assertFalse;

/** Test {@link TestList}. */
public class TestListTest
{

    /** Test {@link TestList} constants. */
    @Test
    public void constants()
    {
        assertFalse(INTEGER_LIST.isEmpty());
        assertFalse(LONG_LIST.isEmpty());
        assertFalse(OBJECT_LIST.isEmpty());
        assertFalse(STRING_LIST.isEmpty());
    }
}

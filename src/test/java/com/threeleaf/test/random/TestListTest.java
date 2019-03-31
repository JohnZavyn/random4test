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
        assertFalse(LIST_INTEGER.isEmpty());
        assertFalse(LIST_LONG.isEmpty());
        assertFalse(LIST_OBJECT.isEmpty());
        assertFalse(LIST_STRING.isEmpty());
    }
}

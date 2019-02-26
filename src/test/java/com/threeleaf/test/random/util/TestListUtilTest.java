package com.threeleaf.test.random.util;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/** Test {@link TestListUtil} */
public class TestListUtilTest
{

    /** Test {@link TestListUtil#randomListOf(Class)}. */
    @Test
    public void randomListOf()
    {
        assertFalse(TestListUtil.randomListOf(Byte.class).isEmpty());
    }
}

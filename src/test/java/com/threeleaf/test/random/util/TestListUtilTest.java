package com.threeleaf.test.random.util;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/** Test {@link TestListUtil} */
public class TestListUtilTest
{

    /** Test {@link TestListUtil#randomArrayListOf(Class)}. */
    @Test
    public void randomArrayListOf()
    {
        assertFalse(TestListUtil.randomArrayListOf(Byte.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomLinkedListOf(Class)}. */
    @Test
    public void randomLinkedListOf()
    {
        assertFalse(TestListUtil.randomLinkedListOf(Character.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomListOf(Class)}. */
    @Test
    public void randomListOf()
    {
        assertFalse(TestListUtil.randomListOf(Boolean.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomVectorOf(Class)}. */
    @Test
    public void randomVectorOf()
    {
        assertFalse(TestListUtil.randomVectorOf(Short.class).isEmpty());
    }
}

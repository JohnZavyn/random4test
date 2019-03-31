package com.threeleaf.test.random.util;

import org.junit.Test;

import static com.threeleaf.test.random.TestNumber.INTEGER_SMALL;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/** Test {@link TestSetUtil}. */
public class TestSetUtilTest
{

    /** Test {@link TestSetUtil#randomHashSetOf(Class, String...)}. */
    @Test
    public void randomHashSetOf()
    {
        assertFalse(TestSetUtil.randomHashSetOf(Byte.class).isEmpty());
    }

    /** Test {@link TestSetUtil#randomLinkedHashSetOf(Class, String...)}. */
    @Test
    public void randomLinkedHashSetOf()
    {
        assertFalse(TestSetUtil.randomLinkedHashSetOf(Character.class).isEmpty());
    }

    /** Test {@link TestSetUtil#randomSetOf(Class, String...)}. */
    @Test
    public void randomSetOf()
    {
        assertFalse(TestSetUtil.randomSetOf(Boolean.class).isEmpty());
    }

    /** Test {@link TestSetUtil#randomSortedSetOf(Class, String...)}. */
    @Test
    public void randomSortedSetOf()
    {
        assertFalse(TestSetUtil.randomSortedSetOf(Short.class).isEmpty());
    }

    /** Test {@link TestSetUtil}. */
    @Test
    public void randomTreeSetOf()
    {
        assertFalse(TestSetUtil.randomTreeSetOf(Object.class).isEmpty());
        assertEquals((int) INTEGER_SMALL, TestSetUtil.randomTreeSetOf(INTEGER_SMALL, Object.class).size());
    }
}

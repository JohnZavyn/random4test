package com.threeleaf.test.random.util;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestNumber.INTEGER_SMALL;
import static com.threeleaf.test.random.TestPrimitive.INT_01;
import static org.junit.Assert.*;

/** Test {@link TestSetUtil}. */
public class TestSetUtilTest
{

    /** Test {@link TestSetUtil} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestSetUtil> constructor = TestSetUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try
        {
            constructor.newInstance();
        }
        catch (Exception e)
        {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestSetUtil#randomHashSetOf(Class, String...)}. */
    @Test
    public void randomHashSetOf()
    {
        assertFalse(TestSetUtil.randomHashSetOf(Byte.class).isEmpty());
    }

    /** Test {@link TestSetUtil#randomHashSetSingle(Class, String...)}. */
    @Test
    public void randomHashSetSingle()
    {
        assertEquals(INT_01, TestSetUtil.randomHashSetSingle(Byte.class).size());
    }

    /** Test {@link TestSetUtil#randomLinkedHashSetOf(Class, String...)}. */
    @Test
    public void randomLinkedHashSetOf()
    {
        assertFalse(TestSetUtil.randomLinkedHashSetOf(Character.class).isEmpty());
    }

    /** Test {@link TestSetUtil#randomLinkedHashSetSingle(Class, String...)}. */
    @Test
    public void randomLinkedHashSetSingle()
    {
        assertEquals(INT_01, TestSetUtil.randomLinkedHashSetSingle(Character.class).size());
    }

    /** Test {@link TestSetUtil#randomSetOf(Class, String...)}. */
    @Test
    public void randomSetOf()
    {
        assertFalse(TestSetUtil.randomSetOf(Boolean.class).isEmpty());
    }

    /** Test {@link TestSetUtil#randomSetSingle(Class, String...)}. */
    @Test
    public void randomSetSingle()
    {
        assertEquals(INT_01, TestSetUtil.randomSetSingle(Boolean.class).size());
    }

    /** Test {@link TestSetUtil#randomSortedSetOf(Class, String...)}. */
    @Test
    public void randomSortedSetOf()
    {
        assertFalse(TestSetUtil.randomSortedSetOf(Short.class).isEmpty());
    }

    /** Test {@link TestSetUtil#randomSortedSetSingle(Class, String...)}. */
    @Test
    public void randomSortedSetSingle()
    {
        assertEquals(INT_01, TestSetUtil.randomSortedSetSingle(Short.class).size());
    }

    /** Test {@link TestSetUtil#randomTreeSetOf(int, Class, String...)}. */
    @Test
    public void randomTreeSetOf()
    {
        assertFalse(TestSetUtil.randomTreeSetOf(Object.class).isEmpty());
        assertEquals((int) INTEGER_SMALL, TestSetUtil.randomTreeSetOf(INTEGER_SMALL, Object.class).size());
    }

    /** Test {@link TestSetUtil#randomTreeSetSingle(Class, String...)}. */
    @Test
    public void randomTreeSetSingle()
    {
        assertEquals(INT_01, TestSetUtil.randomTreeSetSingle(Object.class).size());
    }
}

package com.threeleaf.test.random.util;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestPrimitive.INT_01;
import static org.junit.Assert.*;

/** Test {@link TestListUtil}. */
public class TestListUtilTest
{

    /** Test {@link TestListUtil} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestListUtil> constructor = TestListUtil.class.getDeclaredConstructor();
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

    /** Test {@link TestListUtil#randomArrayListOf(Class, String...)}. */
    @Test
    public void randomArrayListOf()
    {
        assertFalse(TestListUtil.randomArrayListOf(Byte.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomArrayListSingle(Class, String...)}. */
    @Test
    public void randomArrayListSingle()
    {
        assertEquals(INT_01, TestListUtil.randomArrayListSingle(Byte.class).size());
    }

    /** Test {@link TestListUtil#randomLinkedListOf(Class, String...)}. */
    @Test
    public void randomLinkedListOf()
    {
        assertFalse(TestListUtil.randomLinkedListOf(Character.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomLinkedListSingle(Class, String...)}. */
    @Test
    public void randomLinkedListSingle()
    {
        assertEquals(INT_01, TestListUtil.randomLinkedListSingle(Character.class).size());
    }

    /** Test {@link TestListUtil#randomListOf(Class, String...)}. */
    @Test
    public void randomListOf()
    {
        assertFalse(TestListUtil.randomListOf(Boolean.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomListSingle(Class, String...)}. */
    @Test
    public void randomListSingle()
    {
        assertEquals(INT_01, TestListUtil.randomListSingle(Boolean.class).size());
    }

    /** Test {@link TestListUtil#randomVectorOf(Class, String...)}. */
    @Test
    public void randomVectorOf()
    {
        assertFalse(TestListUtil.randomVectorOf(Short.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomVectorSingle(Class, String...)}. */
    @Test
    public void randomVectorSingle()
    {
        assertEquals(INT_01, TestListUtil.randomVectorSingle(Short.class).size());
    }
}

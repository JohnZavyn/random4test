package com.threeleaf.test.random.util;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.util.RandomIntegerUtil.INT_01;
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

    /** Test {@link TestListUtil#randomArrayListSingleOf(Class, String...)}. */
    @Test
    public void randomArrayListSingleOf()
    {
        assertEquals(INT_01, TestListUtil.randomArrayListSingleOf(Byte.class).size());
    }

    /** Test {@link TestListUtil#randomLinkedListOf(Class, String...)}. */
    @Test
    public void randomLinkedListOf()
    {
        assertFalse(TestListUtil.randomLinkedListOf(Character.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomLinkedListSingleOf(Class, String...)}. */
    @Test
    public void randomLinkedListSingleOf()
    {
        assertEquals(INT_01, TestListUtil.randomLinkedListSingleOf(Character.class).size());
    }

    /** Test {@link TestListUtil#randomListOf(Class, String...)}. */
    @Test
    public void randomListOf()
    {
        assertFalse(TestListUtil.randomListOf(Boolean.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomListSingleOf(Class, String...)}. */
    @Test
    public void randomListSingleOf()
    {
        assertEquals(INT_01, TestListUtil.randomListSingleOf(Boolean.class).size());
    }

    /** Test {@link TestListUtil#randomVectorOf(Class, String...)}. */
    @Test
    public void randomVectorOf()
    {
        assertFalse(TestListUtil.randomVectorOf(Short.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomVectorSingleOf(Class, String...)}. */
    @Test
    public void randomVectorSingleOf()
    {
        assertEquals(INT_01, TestListUtil.randomVectorSingleOf(Short.class).size());
    }
}

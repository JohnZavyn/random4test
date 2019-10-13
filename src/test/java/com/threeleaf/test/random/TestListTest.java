package com.threeleaf.test.random;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestList.*;
import static com.threeleaf.test.random.util.RandomIntegerUtil.INTEGER;
import static com.threeleaf.test.random.util.RandomIntegerUtil.INT_01;
import static org.junit.Assert.*;

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
        assertEquals(INT_01, LIST_INTEGER_SINGLE.size());
        assertEquals(INT_01, LIST_LONG_SINGLE.size());
        assertEquals(INT_01, LIST_OBJECT_SINGLE.size());
        assertEquals(INT_01, LIST_STRING_SINGLE.size());
    }

    /** Test {@link TestList} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestList> constructor = TestList.class.getDeclaredConstructor();
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

    /** Test constant unmodifiable. */
    @Test(expected = UnsupportedOperationException.class)
    public void unmodifiable()
    {
        LIST_INTEGER.add(INTEGER);
    }
}

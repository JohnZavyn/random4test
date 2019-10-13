package com.threeleaf.test.random;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestSet.*;
import static com.threeleaf.test.random.util.RandomIntegerUtil.INTEGER;
import static com.threeleaf.test.random.util.RandomIntegerUtil.INT_01;
import static org.junit.Assert.*;

/** Test {@link TestSet}. */
public class TestSetTest
{

    /** Test {@link TestSet} constants. */
    @Test
    public void constants()
    {
        assertFalse(SET_INTEGER.isEmpty());
        assertFalse(SET_LONG.isEmpty());
        assertFalse(SET_OBJECT.isEmpty());
        assertFalse(SET_STRING.isEmpty());
        assertEquals(INT_01, SET_INTEGER_SINGLE.size());
        assertEquals(INT_01, SET_LONG_SINGLE.size());
        assertEquals(INT_01, SET_OBJECT_SINGLE.size());
        assertEquals(INT_01, SET_STRING_SINGLE.size());
    }

    /** Test {@link TestSet} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestSet> constructor = TestSet.class.getDeclaredConstructor();
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
        SET_INTEGER.add(INTEGER);
    }
}

package com.threeleaf.test.random;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestArray.*;
import static com.threeleaf.test.random.util.RandomIntegerUtil.INT_00;
import static com.threeleaf.test.random.util.RandomIntegerUtil.INT_01;
import static org.junit.Assert.*;

/** Test {@link TestArray}. */
public class TestArrayTest
{

    /** Test {@link TestArray} constants. */
    @Test
    public void constants()
    {
        assertNotEquals(INT_00, ARRAY_INTEGER.length);
        assertNotEquals(INT_00, ARRAY_LONG.length);
        assertNotEquals(INT_00, ARRAY_OBJECT.length);
        assertNotEquals(INT_00, ARRAY_STRING.length);
        assertEquals(INT_01, ARRAY_INTEGER_SINGLE.length);
        assertEquals(INT_01, ARRAY_LONG_SINGLE.length);
        assertEquals(INT_01, ARRAY_OBJECT_SINGLE.length);
        assertEquals(INT_01, ARRAY_STRING_SINGLE.length);
    }

    /** Test {@link TestArray} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestArray> constructor = TestArray.class.getDeclaredConstructor();
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
}

package com.threeleaf.test.random;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestMap.*;
import static com.threeleaf.test.random.TestPrimitive.INT_01;
import static org.junit.Assert.*;

/** Test {@link TestMap}. */
public class TestMapTest
{

    /** Test {@link TestMap} constants. */
    @Test
    public void constants()
    {
        assertFalse(MAP_INTEGER.isEmpty());
        assertFalse(MAP_INTEGER_STRING.isEmpty());
        assertFalse(MAP_LONG.isEmpty());
        assertFalse(MAP_LONG_STRING.isEmpty());
        assertFalse(MAP_OBJECT.isEmpty());
        assertFalse(MAP_STRING.isEmpty());
        assertEquals(INT_01, MAP_INTEGER_SINGLE.size());
        assertEquals(INT_01, MAP_INTEGER_STRING_SINGLE.size());
        assertEquals(INT_01, MAP_LONG_SINGLE.size());
        assertEquals(INT_01, MAP_LONG_STRING_SINGLE.size());
        assertEquals(INT_01, MAP_OBJECT_SINGLE.size());
        assertEquals(INT_01, MAP_STRING_SINGLE.size());
    }

    /** Test {@link TestMap} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestMap> constructor = TestMap.class.getDeclaredConstructor();
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
        MAP_INTEGER.putAll(MAP_INTEGER_SINGLE);
    }
}

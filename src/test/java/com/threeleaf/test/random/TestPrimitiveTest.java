package com.threeleaf.test.random;

import org.junit.Test;

import java.lang.reflect.*;

import static org.junit.Assert.assertTrue;

/** Test {@link TestPrimitive}. */
public class TestPrimitiveTest
{

    /** Test {@link TestPrimitive} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestPrimitive> constructor = TestPrimitive.class.getDeclaredConstructor();
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

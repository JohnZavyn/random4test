package com.threeleaf.test.random.util;

import org.junit.Test;

import java.lang.reflect.*;

import static org.junit.Assert.assertTrue;

/** Test {@link TestDateUtil} */
public class TestDateUtilTest
{

    /** Test {@link TestDateUtil} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestDateUtil> constructor = TestDateUtil.class.getDeclaredConstructor();
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

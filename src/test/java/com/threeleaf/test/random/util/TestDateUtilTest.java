package com.threeleaf.test.random.util;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestDate.TIMESTAMP_FORMAT;
import static org.junit.Assert.*;

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
    /** Test {@link TestDateUtil#getDateTime()}. */
    @Test
    public void getDateTime()
    {
        assertNotNull(TestDateUtil.getDateTime());
    }

    /** Test {@link TestDateUtil#getTimestamp()}. */
    @Test
    public void getTimestamp()
    {
        assertEquals(TIMESTAMP_FORMAT.length(), TestDateUtil.getTimestamp().length());
    }
}

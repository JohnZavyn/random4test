package com.threeleaf.test.random.util;

import org.junit.Test;

import static com.threeleaf.test.random.TestDate.TIMESTAMP_FORMAT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/** Test {@link TestDateUtil} */
public class TestDateUtilTest
{

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

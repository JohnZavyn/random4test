package com.threeleaf.test.random;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/** Test {@link TestInternet} */
public class TestInternetTest
{

    @Test
    public void urlValid()
    {
        assertTrue(TestInternet.URL.startsWith(TestInternet.HTTPS_PROTOCOL));
    }
}

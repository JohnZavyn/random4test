package com.threeleaf.test.random;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/** Test {@link TestInternet}. */
public class TestInternetTest
{

    /** Test {@link TestInternet} instantiation. */
    @Test
    public void urlValid()
    {
        assertTrue(TestInternet.URL_SSL.startsWith(TestInternet.HTTPS_PROTOCOL));
    }
}

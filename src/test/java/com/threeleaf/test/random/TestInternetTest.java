package com.threeleaf.test.random;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** Test {@link TestInternet}. */
class TestInternetTest {

    /** Test {@link TestInternet} instantiation. */
    @Test
    void urlValid() {
        assertTrue(TestInternet.URL_SSL.startsWith(TestInternet.HTTPS_PROTOCOL));
    }
}

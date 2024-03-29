/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestIntegerTest.LOOP_COUNT_MIN;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.threeleaf.test.random.TestUrl;
import org.apache.commons.validator.routines.UrlValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

/** Test {@link UrlGenerator}. */
class UrlGeneratorTest {

    /** The test {@link UrlGenerator}. */
    private UrlGenerator urlGenerator;

    /** Test {@link UrlGenerator#randomUrl()}. */
    @RepeatedTest(LOOP_COUNT_MIN)
    void randomUrl() {
        final String url = urlGenerator.randomUrl();

        assertTrue(url.startsWith(TestUrl.HTTP_PROTOCOL));
        assertTrue(UrlValidator.getInstance().isValid(url));
    }

    /** Test {@link UrlGenerator#randomUrlSecure()}. */
    @RepeatedTest(LOOP_COUNT_MIN)
    void randomUrlSecure() {
        final String url = urlGenerator.randomUrlSecure();

        assertTrue(url.startsWith(TestUrl.HTTPS_PROTOCOL));
        assertTrue(UrlValidator.getInstance().isValid(url));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        urlGenerator = new UrlGenerator();
    }
}

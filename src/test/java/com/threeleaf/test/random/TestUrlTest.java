package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestString.STRING_ARRAY;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.validator.routines.UrlValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link TestUrl}. */
class TestUrlTest {

    /** The test {@link TestUrl}. */
    private TestUrl testUrl;

    /** Test {@link TestUrl#random()}. */
    @Test
    void random() {
        assertTrue(UrlValidator.getInstance().isValid(testUrl.random()));
    }

    /** Test {@link TestUrl#random(String...)}. */
    @Test
    void randomFieldsExcluded() {
        assertTrue(UrlValidator.getInstance().isValid(testUrl.random(STRING_ARRAY)));
    }

    /** Test {@link TestUrl#randomUrl()}. */
    @Test
    void randomUrl() {
        String url = testUrl.random(STRING_ARRAY);

        assertTrue(UrlValidator.getInstance().isValid(url));

        assertTrue(UrlValidator.getInstance().isValid(TestUrl.URL));
    }

    /** Test {@link TestUrl#randomUrlSecure()}. */
    @Test
    void randomUrlSecure() {
        String url = TestUrl.randomUrlSecure();
        assertTrue(UrlValidator.getInstance().isValid(url));

        assertTrue(url.startsWith(TestUrl.HTTPS_PROTOCOL));
        assertTrue(UrlValidator.getInstance().isValid(url));

        assertTrue(UrlValidator.getInstance().isValid(TestUrl.URL_SSL));
        assertTrue(TestUrl.URL_SSL.startsWith(TestUrl.HTTPS_PROTOCOL));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        testUrl = new TestUrl();
    }
}

/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import com.threeleaf.test.random.generator.UrlGenerator;

/** Generates URLs for use in unit tests. */
public class TestUrl extends AbstractRandom<String> {

    /** The HTTPS protocol. */
    public static final String HTTPS_PROTOCOL = "https";

    /** The HTTP protocol. */
    public static final String HTTP_PROTOCOL = "http";

    /** The instance of {@link TestUrl}. */
    public static final TestUrl INSTANCE = new TestUrl();

    /** A standard URL generator. */
    public static final UrlGenerator URL_GENERATOR = new UrlGenerator();

    /** A random URL. */
    public static final String URL = randomUrl();

    /** A URL for a home page using HTTPS protocol. */
    public static final String URL_SSL = randomUrlSecure();

    /** Instantiate a test URL generator. */
    public TestUrl() {
        super(String.class);
    }

    /**
     * Generate a random URL.
     *
     * @return a URL
     */
    public static String randomUrl() {
        return INSTANCE.random();
    }

    /**
     * Generate a random secure URL.
     *
     * @return a secure URL
     */
    public static String randomUrlSecure() {
        return URL_GENERATOR.randomUrlSecure();
    }

    /**
     * Get a random URL.
     *
     * @return a URL
     */
    @Override
    public String random() {
        return URL_GENERATOR.randomUrl();
    }

    /**
     * Get a random URL.
     *
     * @return a secure URL
     */
    @Override
    public String random(final String... fieldsExcluded) {
        /* Since this is a String type, there are no fields to exclude. */
        return URL_GENERATOR.randomUrlSecure();
    }
}

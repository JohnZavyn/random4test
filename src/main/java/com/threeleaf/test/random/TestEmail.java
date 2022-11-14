/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import com.threeleaf.test.random.generator.EmailGenerator;

/** Test emails for use in unit tests. */
public class TestEmail extends AbstractRandom<String> {

    /** The at sign. */
    public static final String AT_SIGN = "@";

    /** A standard email generator. */
    public static final EmailGenerator EMAIL_GENERATOR = new EmailGenerator();

    /** The instance of {@link TestEmail}. */
    public static final TestEmail INSTANCE = new TestEmail();

    /** A random email. */
    public static final String EMAIL = randomEmail();

    /** Instantiate a test email generator. */
    public TestEmail() {
        super(String.class);
    }

    /**
     * Generate a random email.
     *
     * @return an email
     */
    public static String randomEmail() {
        return INSTANCE.random();
    }

    /**
     * Get a random email.
     *
     * @return an email
     */
    @Override
    public String random() {
        return EMAIL_GENERATOR.randomEmail();
    }

    /**
     * Get a random email.
     *
     * @return a friendly email
     */
    @Override
    public String random(final String... fieldsExcluded) {
        /* Since this is a String type, there are no fields to exclude. */
        return EMAIL_GENERATOR.randomEmail();
    }
}

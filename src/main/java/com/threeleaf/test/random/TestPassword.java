/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import com.threeleaf.test.random.generator.PasswordGenerator;

/** Test passwords for use in unit tests. */
public class TestPassword extends AbstractRandom<String> {

    /** The instance of {@link TestPassword}. */
    public static final TestPassword INSTANCE = new TestPassword();

    /** A standard password generator. */
    public static final PasswordGenerator PASSWORD_GENERATOR = new PasswordGenerator();

    /** A random password. */
    public static final String PASSWORD = randomPassword();

    /** A random "friendly" password. */
    public static final String PASSWORD_FRIENDLY = PASSWORD_GENERATOR.randomPasswordFriendly();

    /** Instantiate a utility to produce randomized objects of the given type. */
    public TestPassword() {
        super(String.class);
    }

    /**
     * Generate a random password.
     *
     * @return a password
     */
    public static String randomPassword() {
        return INSTANCE.random();
    }

    /**
     * Get a random password.
     *
     * @return a password
     */
    @Override
    public String random() {
        return PASSWORD_GENERATOR.randomPassword();
    }

    /**
     * Get a random password.
     *
     * @return a friendly password
     */
    @Override
    public String random(final String... fieldsExcluded) {
        /* Since this is a String type, there are no fields to exclude. */
        return PASSWORD_GENERATOR.randomPasswordFriendly();
    }
}

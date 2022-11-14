/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import com.threeleaf.test.random.generator.VersionGenerator;

/** Test versions for use in unit tests. */
public class TestVersion extends AbstractRandom<String> {

    /** The instance of {@link TestVersion}. */
    public static final TestVersion INSTANCE = new TestVersion();

    /** A standard version generator. */
    public static final VersionGenerator VERSION_GENERATOR = new VersionGenerator();

    /** A random version. */
    public static final String VERSION = randomVersion();

    /** Instantiate a test version generator. */
    public TestVersion() {
        super(String.class);
    }

    /**
     * Generate a random version.
     *
     * @return a version
     */
    public static String randomVersion() {
        return INSTANCE.random();
    }

    /**
     * Get a random version.
     *
     * @return a version
     */
    @Override
    public String random() {
        return VERSION_GENERATOR.randomVersion();
    }

    /**
     * Get a random version.
     *
     * @return a version
     */
    @Override
    public String random(final String... fieldsExcluded) {
        /* Since this is a String type, there are no fields to exclude. */
        return VERSION_GENERATOR.randomVersion();
    }
}

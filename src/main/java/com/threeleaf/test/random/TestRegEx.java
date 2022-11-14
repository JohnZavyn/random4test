/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import com.threeleaf.test.random.generator.RegExGenerator;
import lombok.Getter;

/** Generates strings valid for regular expressions, for use in unit tests. */
@Getter
public class TestRegEx extends AbstractRandom<String> {

    /** The regular expression generator used to generate random strings. */
    private final RegExGenerator regExGenerator;

    /**
     * Instantiate a test regular expression generator. Strings generated with this object will be
     * valid for the provided regular expression.
     *
     * @param regularExpression the regular expression
     */
    public TestRegEx(final String regularExpression) {
        super(String.class);
        regExGenerator = new RegExGenerator(regularExpression);
    }

    /**
     * Generate a random string based on a regular expression.
     *
     * <p>Note: This method is intended for one-time use cases. If you want to generate several values
     * based off the same regular expression, it is recommended to instantiate a TestRegEx object.</p>
     *
     * @param regularExpression the regular expression
     *
     * @return a randomized string that is valid for the regular expression
     */
    public static String random(final String regularExpression) {
        return new RegExGenerator(regularExpression).random();
    }

    /**
     * Get a random string based on the regular expression.
     *
     * @return a random string
     */
    @Override
    public String random() {
        return regExGenerator.random();
    }

    /**
     * Get a random string based on the regular expression.
     *
     * @return a random string
     */
    @Override
    public String random(final String... fieldsExcluded) {
        /* Since this is a String type, there are no fields to exclude. */
        return random();
    }
}

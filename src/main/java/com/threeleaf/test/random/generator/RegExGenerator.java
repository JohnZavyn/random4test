/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator;

import com.threeleaf.test.random.generator.regex.RegExRandomStringFactory;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/** Class used to generate randomized strings using regular expressions as templates. */
@Getter
@Slf4j
public final class RegExGenerator {

    /** The regular expression pattern. */
    private final RegExRandomStringFactory regExRandomStringFactory;

    /**
     * Instantiate a new regular expression random string generator.
     *
     * @param regularExpression the regular expression template
     */
    public RegExGenerator(final String regularExpression) {
        super();
        regExRandomStringFactory = new RegExRandomStringFactory(regularExpression);
    }

    /**
     * Return a randomized string based on a regular expression template.
     *
     * @return the generated string
     */
    public String random() {
        return regExRandomStringFactory.random();
    }
}

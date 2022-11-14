/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

/**
 * Node class that matches a Perl vertical whitespace.
 */
public class WhitespaceVertical extends CharBmp {

    private static final String CHARACTERS = "\n\u000B\f\r\u0085\u2028\u2029";

    /** {@inheritDoc} */
    @Override
    public String getCharacters() {
        return CHARACTERS;
    }
}

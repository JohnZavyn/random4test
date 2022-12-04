/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

/** Handles word boundaries (\b for whitespace, and \B for non-whitespace). */
@Data
@EqualsAndHashCode(callSuper = false)
public class WordBoundary extends Char {

    /** The Boundary characters to choose from. */
    private final String characters;

    /**
     * Instantiate a word boundary.
     *
     * @param isWhitespace the whitespace boundary flag
     */
    public WordBoundary(final boolean isWhitespace) {
        super();
        characters = isWhitespace ? WHITESPACE : ALPHANUMERIC + UNDERSCORE;
    }
}

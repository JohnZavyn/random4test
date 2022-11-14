/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

/**
 * Node to anchor at the end of a line or the end of input based on the
 * multiline mode when in unix lines mode.
 */
public class EndUnix extends End {

    EndUnix(final boolean isMultiline) {
        super(isMultiline);
    }
}

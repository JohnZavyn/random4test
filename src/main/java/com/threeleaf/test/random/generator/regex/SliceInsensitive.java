/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.util.TestStringUtil.randomizeCase;

/**
 * Node class for a case_insensitive/BMP-only sequence of literal
 * characters.
 */
class SliceInsensitive extends SliceNode {

    SliceInsensitive(final int[] characters) {
        super(randomizeCase(characters));
    }
}

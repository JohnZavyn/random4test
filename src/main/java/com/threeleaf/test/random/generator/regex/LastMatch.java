/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;

/**
 * Node to match the location where the last match ended.
 * This is used for the \G construct.
 */
final class LastMatch extends Node {

    @Override
    public String getValue(final Integer forBackreference) {
        return EMPTY;
    }

    @Override
    public int length() {
        return 1;
    }
}

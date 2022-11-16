/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Node to anchor at the beginning of input. This object implements the
 * match for a \A sequence, and the caret anchor will use this if not in
 * multiline mode.
 */
@Data
@EqualsAndHashCode(callSuper = false)
final class Begin extends Node {

    @Override
    public String getValue(final Integer forBackreference) {
        return EMPTY;
    }

    @Override
    public int length() {
        return 0;
    }
}

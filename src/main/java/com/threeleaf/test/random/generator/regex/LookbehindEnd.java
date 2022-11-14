/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;

import lombok.Data;
import lombok.EqualsAndHashCode;

/** For use with lookbehinds; marks the position where the lookbehind was encountered. */
@Data
@EqualsAndHashCode(callSuper = false)
class LookbehindEnd extends Node {

    @Override
    public String getValue(final Integer forBackreference) {
        return EMPTY;
    }
}

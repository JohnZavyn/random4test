/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Node to anchor at the end of input. This is the absolute end, so this
 * should not match at the last newline before the end as $ will.
 */
@Data
@EqualsAndHashCode(callSuper = false)
final class EndAbsolute extends Node {

    @Override
    public String getValue(final Integer forBackreference) {
        return EMPTY;
    }
}

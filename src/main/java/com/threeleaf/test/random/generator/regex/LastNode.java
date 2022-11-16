/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
class LastNode extends Node {

    @Override
    public String getValue(final Integer forBackreference) {
        return EMPTY;
    }

    @Override
    public int length() {
        return 0;
    }
}

/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * A Guard node at the end of each atom node in a Branch. It
 * serves the purpose of chaining to the next node.
 */
@Data
@EqualsAndHashCode(callSuper = false)
final class BranchConnector extends Node {

    @Override
    public String getValue(final Integer forBackreference) {
        return EMPTY;
    }

    @Override
    public int length() {
        return 0;
    }
}

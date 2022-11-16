/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.util.TestStringUtil.arrayToString;

import lombok.*;

/**
 * Base class for all Slice nodes
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
class SliceNode extends Node {

    private String string;

    SliceNode(final int[] characters) {
        super();
        string = arrayToString(characters);
    }

    @Override
    public String getValue(final Integer forBackreference) {
        return string;
    }

    @Override
    public int length() {
        return INT_01;
    }

    @Override
    void updateNodeInfo(final NodeInfo info) {
        info.setMinLength(info.getMinLength() + string.length());
        info.setMaxLength(info.getMaxLength() + string.length());

        super.updateNodeInfo(info);
    }
}

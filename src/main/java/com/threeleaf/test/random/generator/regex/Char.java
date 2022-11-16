/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestString.EMPTY;
import static com.threeleaf.test.random.util.TestStringUtil.chooseOneFrom;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

/**
 * Abstract node class to match one character satisfying some
 * boolean property.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Slf4j
abstract class Char extends Node {

    public Char complement() {
        return new CharCompliment(getCharacters());
    }

    public String getCharacters() {
        log.error("Implement {}.getCharacters()", getClass().getName());

        return EMPTY;
    }

    @Override
    public String getValue(final Integer forBackreference) {
        return chooseOneFrom(getCharacters());
    }

    @Override
    public int length() {
        return INT_01;
    }

    @Override
    void updateNodeInfo(final NodeInfo info) {
        /* This node returns exactly 1 character, so increase min and max by 1 */
        info.setMinLength(info.getMinLength() + 1);
        info.setMaxLength(info.getMaxLength() + 1);
        super.updateNodeInfo(info);
    }
}

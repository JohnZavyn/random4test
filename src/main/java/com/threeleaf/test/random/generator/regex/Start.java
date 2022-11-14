/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Used for REs that can start anywhere within the input string.
 * This basically tries to match repeatedly at each spot in the
 * input string, moving forward after each try. An anchored search
 * or a BnM will bypass this node completely.
 */
@Data
@EqualsAndHashCode(callSuper = false)
class Start extends Node {

    private int minLength;

    Start(final Node node) {
        setNext(node);
        final NodeInfo info = new NodeInfo();
        node.updateNodeInfo(info);
        minLength = info.getMinLength();
    }

    @Override
    public String getValue(final Integer forBackreference) {
        return EMPTY;
    }

    @Override
    void updateNodeInfo(final NodeInfo info) {
        getNext().updateNodeInfo(info);
        info.setMaxValid(false);
        info.setDeterministic(false);
    }
}

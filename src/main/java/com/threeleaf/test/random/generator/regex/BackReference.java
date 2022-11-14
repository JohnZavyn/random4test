/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Refers to a group in the regular expression. Attempts to match
 * whatever the group referred to last matched.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BackReference extends Node {

    private static final Map<Integer, String> BACK_REFERENCES = new HashMap<>();

    private int groupIndex;

    BackReference(final int groupCount) {
        super();
        groupIndex = groupCount * 2;
    }

    public static void clear() {
        BACK_REFERENCES.clear();
    }

    public static String get(final int key) {
        return BACK_REFERENCES.get(key);
    }

    public static void put(final int key, final String value) {
        BACK_REFERENCES.put(key, value);
    }

    @Override
    public String getValue(final Integer forBackreference) {
        final String value = BACK_REFERENCES.get(groupIndex);

        return value == null ? EMPTY : value;
    }

    @Override
    void updateNodeInfo(final NodeInfo info) {
        info.setMaxValid(false);
        super.updateNodeInfo(info);
    }
}

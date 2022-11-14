/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.randomBetween;
import static com.threeleaf.test.random.TestString.EMPTY;
import static com.threeleaf.test.random.generator.regex.Quantifier.POSSESSIVE;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The 0 or 1 (question mark) quantifier. This one class implements all three types.
 */
@Data
@EqualsAndHashCode(callSuper = false)
final class ZeroOrOne extends Node {

    private final Node atom;

    private final Quantifier quantifier;

    ZeroOrOne(final Node node, final Quantifier theQuantifier) {
        atom = node;
        quantifier = theQuantifier;
    }

    @Override
    public String getValue(final Integer forBackreference) {
        /* Even though the atom is marked as "optional", the possessive quantifier forces it
         to be required in order to match. */
        final int length = POSSESSIVE.equals(quantifier) ? 1 : randomBetween(0, 1);

        return length == 1 ? atom.random(forBackreference) : EMPTY;
    }

    @Override
    void updateNodeInfo(final NodeInfo info) {
                /* Max length can increase by the length of one atom. The min must be the same,
                since this node may add zero or one atom. */
        final int minOriginal = info.getMinLength();
        atom.updateNodeInfo(info);
        info.setMinLength(minOriginal);
        info.setDeterministic(false);

        super.updateNodeInfo(info);
    }

    @Override
    public int weight() {
        return atom.weight();
    }
}

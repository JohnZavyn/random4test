/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.INT_10;
import static com.threeleaf.test.random.TestInteger.randomBetween;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Math.min;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Handles the curly-brace style repetition with a specified minimum and
 * maximum occurrences. The * quantifier is handled as a special case.
 * This class handles the three types.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Curly extends Node {

    public static final int REPETITIONS_MAX = INT_10;

    /** The node to repeat. */
    private final Node atom;

    /** The maximum number of repetitions. */
    private final int max;

    /** The minimum number of repetitions. */
    private final int min;

    /** The type of matching (greedy, lazy, etc.). */
    private final Quantifier quantifier;

    /**
     * Instantiate a repeating {@link Node}.
     *
     * @param node           the {@link Node} to repeat
     * @param minRepetitions the minimum number of repetitions
     * @param maxRepetitions the maximum number of repetitions
     * @param theQuantifier  the {@link Quantifier}
     */
    public Curly(
        final Node node,
        final int minRepetitions,
        final int maxRepetitions,
        final Quantifier theQuantifier
    ) {
        atom = node;
        quantifier = theQuantifier;
        min = minRepetitions;
        max = maxRepetitions;
    }

    /**
     * Repeat the target pattern generation between the minimum number and minimum +10 times.
     *
     * @param forBackreference non-null if capturing for a backreference
     *
     * @return the generated repeated pattern
     */
    @Override
    public String getValue(final Integer forBackreference) {
        final int repetitions = randomBetween(min, min(min + REPETITIONS_MAX, max));
        final StringBuilder value = new StringBuilder();
        for (int i = 0; i < repetitions; i++) {
            value.append(atom.random(forBackreference));
        }

        return value.toString();
    }

    /** {@inheritDoc} */
    @Override
    void updateNodeInfo(final NodeInfo info) {
        /*  Save original info */
        final int minOriginal = info.getMinLength();
        final int maxOriginal = info.getMaxLength();
        final boolean maxValidOriginal = info.isMaxValid();
        final boolean deterministicOriginal = info.isDeterministic();
        info.reset();

        atom.updateNodeInfo(info);

        int minCurrent = info.getMinLength() * min + minOriginal;
        if (minCurrent < minOriginal) {
            /*  arbitrary large number */
            minCurrent = MAX_VALUE;
        }
        info.setMinLength(minCurrent);

        if (maxValidOriginal && info.isMaxValid()) {
            minCurrent = info.getMaxLength() * max + maxOriginal;
            info.setMaxLength(minCurrent);
            if (minCurrent < maxOriginal) {
                info.setMaxValid(false);
            }
        } else {
            info.setMaxValid(false);
        }

        if (info.isDeterministic() && min == max) {
            info.setDeterministic(deterministicOriginal);
        } else {
            info.setDeterministic(false);
        }

        super.updateNodeInfo(info);
    }

    /** {@inheritDoc} */
    @Override
    public int weight() {
        return atom.weight();
    }
}

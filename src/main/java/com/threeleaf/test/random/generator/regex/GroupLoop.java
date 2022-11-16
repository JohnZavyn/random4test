/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.randomBetween;
import static com.threeleaf.test.random.generator.regex.Curly.REPETITIONS_MAX;
import static java.lang.Math.min;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Handles the repetition count for a greedy Curly. The matchInit
 * is called from the Prolog to save the index of where the group
 * beginning is stored. A zero length group check occurs in the
 * normal match but is skipped in the matchInit.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GroupLoop extends Node {

    /** The node to repeat . */
    private final Node atom;

    /** group beginning index */
    private final int groupHeadIndex;

    /** local count index in matcher locals */
    private final int groupIndex;

    /** The maximum number of repetitions. */
    private final int max;

    /** The minimum number of repetitions. */
    private final int min;

    public GroupLoop(
        final Node node,
        final int minRepetitions,
        final int maxRepetitions,
        final int theGroupIndex,
        final int theGroupHeadIndex
    ) {
        atom = node;
        min = minRepetitions;
        max = maxRepetitions;
        groupIndex = theGroupIndex;
        groupHeadIndex = theGroupHeadIndex;
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
    public int length() {
        return atom.length();
    }

    /** {@inheritDoc} */
    @Override
    void updateNodeInfo(final NodeInfo info) {
        info.setMaxValid(false);
        info.setDeterministic(false);
        super.updateNodeInfo(info);
    }
}

/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.randomBetween;
import static com.threeleaf.test.random.generator.regex.GroupHead.cleanup;
import static java.lang.Math.min;

import lombok.*;

/**
 * Handles the curly-brace style repetition with a specified minimum and
 * maximum occurrences in deterministic cases. This is an iterative
 * optimization over the Prolog and Loop system which would handle this
 * in a recursive way. The * quantifier is handled as a special case.
 * If capture is true then this class saves group settings and ensures
 * that groups are unset when backing off of a group match.
 */
@Getter
@EqualsAndHashCode(callSuper = false)
@ToString(of = {"name", "capturingGroupReference", "groupIndex"})
public class GroupCurly extends Curly {

    private final boolean capturingGroup;

    private final int capturingGroupReference;

    private final int groupIndex;

    private final String name;

    @SuppressWarnings("squid:S107" /* All parameters required */)
    public GroupCurly(
        final Node node,
        final int minRepetitions,
        final int maxRepetitions,
        final Quantifier quantifier,
        final int theGroupIndex,
        final int theCapturingGroupReference,
        final String theName,
        final boolean isCapturingGroup
    ) {
        super(node, minRepetitions, maxRepetitions, quantifier);
        groupIndex = theGroupIndex;
        capturingGroupReference = theCapturingGroupReference;
        capturingGroup = isCapturingGroup;
        name = theName;
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
        final int repetitions = randomBetween(getMin(), min(getMin() + Curly.REPETITIONS_MAX, getMax()));
        /* Group curly loops over groups, but it only includes the tails in the atoms, so group
        headers need to be generated during each loop so that it matches with the tail. */
        final GroupHead groupHead = new GroupHead(groupIndex, capturingGroupReference / 2, name);
        final StringBuilder value = new StringBuilder();
        for (int i = 0; i < repetitions; i++) {
            if (capturingGroup) {
                value.append(groupHead.random(capturingGroupReference));
                value.append(cleanup(getAtom().random(capturingGroupReference)));
            }
            value.append(groupHead.random(forBackreference));
            value.append(getAtom().random(forBackreference));
        }

        return value.toString();
    }
}

/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

/**
 * Handles the repetition count for a reluctant Curly. The matchInit
 * is called from the Prolog to save the index of where the group
 * beginning is stored. A zero length group check occurs in the
 * normal match but is skipped in the matchInit.
 */
public class GroupLoopLazy extends GroupLoop {

    public GroupLoopLazy(
        final Node node,
        final int minRepetitions,
        final int maxRepetitions,
        final int groupIndex,
        final int groupHeadIndex
    ) {
        super(node, minRepetitions, maxRepetitions, groupIndex, groupHeadIndex);
    }

    /** {@inheritDoc} */
    @Override
    void updateNodeInfo(final NodeInfo info) {
        info.setMaxValid(false);
        info.setDeterministic(false);
    }
}

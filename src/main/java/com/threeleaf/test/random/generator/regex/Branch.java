/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestInteger.randomBetween;
import static java.util.Objects.requireNonNull;

import java.util.ArrayList;
import java.util.List;

import lombok.*;

/**
 * Handles the branching options. Note this is also used for the {@code ?} quantifier to branch
 * between the case where it matches once and where it does not occur.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Branch extends Node {

    /** The {@link Node} choices offered in this branch. */
    private final List<Node> atoms;

    /** Branch connector. */
    private final Node branchConnector;

    private int weightTotal;

    public Branch(final Node first, final Node second, @NonNull final Node theBranchConnector) {
        branchConnector = theBranchConnector;
        atoms = new ArrayList<>();
        if (first != null) {
            atoms.add(first);
            weightTotal += first.length();
        }
        if (second != null) {
            atoms.add(second);
            weightTotal += second.length();
        }
    }

    /**
     * Add a node.
     *
     * @param node the node.
     */
    void add(@NonNull final Node node) {
        atoms.add(node);
        weightTotal += node.length();
    }

    /** {@inheritDoc} */
    @Override
    public int length() {
        return weightTotal;
    }

    /** {@inheritDoc} */
    @Override
    public String random(final Integer forBackreference) {
        final int weightSelected = randomBetween(INT_01, weightTotal);
        Node atomSelected = null;
        int weightSum = 0;
        for (final Node atom : atoms) {
            weightSum += atom.length();
            if (weightSum >= weightSelected) {
                atomSelected = atom;
                break;
            }
        }

        return requireNonNull(atomSelected).random(forBackreference) + getNext().random(forBackreference);
    }

    /**
     * Calculates metadata for this branch.
     *
     * @param info the incoming statistics
     */
    @Override
    void updateNodeInfo(final NodeInfo info) {
        int minOriginal = info.getMinLength();
        int maxOriginal = info.getMaxLength();
        boolean maxValidOriginal = info.isMaxValid();
        /* arbitrarily large number */
        int minCurrent = Integer.MAX_VALUE;
        int maxCurrent = -1;
        for (final Node atom : atoms) {
            info.reset();
            atom.updateNodeInfo(info);
            minCurrent = Math.min(minCurrent, info.getMinLength());
            maxCurrent = Math.max(maxCurrent, info.getMaxLength());
            maxValidOriginal = (maxValidOriginal && info.isMaxValid());
        }
        minOriginal += minCurrent;
        maxOriginal += maxCurrent;
        info.reset();
        branchConnector.getNext().updateNodeInfo(info);
        info.setMinLength(info.getMinLength() + minOriginal);
        info.setMaxLength(info.getMaxLength() + maxOriginal);
        info.setMaxValid(info.isMaxValid() && maxValidOriginal);
        info.setDeterministic(false);
    }
}

/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This sets up a loop to handle a recursive quantifier structure.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GroupProlog extends Node {

    private final GroupLoop atom;

    public GroupProlog(final GroupLoop theGroupLoop) {
        atom = theGroupLoop;
    }

    /** {@inheritDoc} */
    @Override
    public int length() {
        return atom.length();
    }

    /** {@inheritDoc} */
    @Override
    public String random(final Integer forBackreference) {
        return atom.random(forBackreference);
        /* No next.random() here. Atom takes over the chain. */
    }

    /** {@inheritDoc} */
    @Override
    void updateNodeInfo(final NodeInfo info) {
        atom.updateNodeInfo(info);
    }
}

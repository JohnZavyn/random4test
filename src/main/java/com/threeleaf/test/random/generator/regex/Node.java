/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;
import static com.threeleaf.test.random.generator.regex.RegExRandomStringFactory.NODE_INITIALIZE;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Base class for all node classes. Subclasses should override the match()
 * method as appropriate. This class is an accepting node, so its match()
 * always returns true.
 */
@Data
@Slf4j
public class Node {

    /** The next node in the chain. */
    private Node next;

    /** Instantiate a new Node. */
    public Node() {
        next = NODE_INITIALIZE;
    }

    /**
     * Evaluate the node.
     *
     * @param forBackreference indicate a backreference depth
     *
     * @return the String evaluation of the node
     */
    public String getValue(final Integer forBackreference) {
        final String canonicalName = getClass().getCanonicalName();
        if (!Node.class.getCanonicalName().equals(canonicalName)) {
            log.error("Implement {}.getValue()", canonicalName);
        }

        return EMPTY;
    }

    /**
     * Generate a random String from this Node.
     *
     * @param forBackreference optional group number for when calculating the contents of a
     *                         specific group
     *
     * @return the random string
     */
    public String random(final Integer forBackreference) {
        return getValue(forBackreference) + (next == null ? EMPTY : next.random(forBackreference));
    }

    /**
     * Calculates various statistics for the rest of the Node chain.
     *
     * @param info the incoming statistics
     */
    void updateNodeInfo(final NodeInfo info) {
        if (next != null) {
            next.updateNodeInfo(info);
        }
    }

    /**
     * The weight of a node when branching. For example, if a Branch contains atoms CharRange
     * (0-9) and CharRange (a-z), we would end up with a disproportionate number of numbers if we
     * did a simple selection on each range. By weighting the first at 10 and the second at 26,
     * it is possible to get a proper proportion of each of the options available.
     *
     * @return the calculated weight of the node
     */
    public int weight() {
        final String canonicalName = getClass().getCanonicalName();
        if (!Node.class.getCanonicalName().equals(canonicalName)) {
            log.error("Implement {}.weight()", canonicalName);
        }

        return 0;
    }
}

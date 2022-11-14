/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import lombok.Data;

/**
 * Used to accumulate information about a subtree of the object graph
 * so that optimizations can be applied to the subtree.
 */
@Data
final class NodeInfo {

    /**
     * Indicates if the chain of nodes examined is deterministic. A deterministic result means
     * there is only one path forward from this point. A non-deterministic result means the path
     * forward has branches.
     * <p>Examples</p>
     * <ul>
     *     <li>Deterministic: (x,(y|z)) - when "x," is detected, (y|z) is the only path forward</li>
     *     <li>Non-deterministic: ((x,y)|(x,z)) - when "x," is detected, the next step is a
     *     branch between (x,y) and (x,z)</li>
     * </ul>
     */
    private boolean deterministic = true;

    /** The maximum length of the examined node chain. */
    private int maxLength;

    /** Flag to indicate that maxLength is valid. */
    private boolean maxValid;

    /** The minimum length of the examined node chain. */
    private int minLength;

    void reset() {
        minLength = 0;
        maxLength = 0;
        maxValid = true;
        deterministic = true;
    }
}

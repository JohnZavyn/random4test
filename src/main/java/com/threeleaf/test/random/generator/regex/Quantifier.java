/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

public enum Quantifier {
    /**
     * Makes the preceding item optional. Greedy, so the optional item is included in the match if
     * possible.
     */
    GREEDY,

    /**
     * Makes the preceding item optional. Lazy, so the optional item is excluded in the match if
     * possible.
     */
    LAZY,

    /**
     * Makes the preceding item optional. Possessive, so if the optional item can be matched, then
     * the quantifier won’t give up its match even if the remainder of the regex fails.
     */
    POSSESSIVE
}

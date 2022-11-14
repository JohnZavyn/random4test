/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

/**
 * Node class for a case-sensitive sequence of literal characters
 * including supplementary characters.
 */
final class SliceSupplementary extends SliceNode {

    SliceSupplementary(final int[] characters) {
        super(characters);
    }
}

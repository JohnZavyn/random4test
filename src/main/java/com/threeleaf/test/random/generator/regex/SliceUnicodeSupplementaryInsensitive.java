/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

/**
 * Node class for a case-insensitive sequence of literal characters.
 * Uses unicode case folding.
 */
final class SliceUnicodeSupplementaryInsensitive extends SliceInsensitive {

    SliceUnicodeSupplementaryInsensitive(final int[] characters) {
        super(characters);
    }
}

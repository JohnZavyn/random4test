/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

/**
 * Node class for a unicode_case_insensitive/BMP-only sequence of
 * literal characters. Uses unicode case folding.
 */
final class SliceUnicodeInsensitive extends SliceInsensitive {

    SliceUnicodeInsensitive(final int[] characters) {
        super(characters);
    }
}

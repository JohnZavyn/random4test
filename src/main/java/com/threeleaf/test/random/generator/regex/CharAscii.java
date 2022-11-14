/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.generator.regex.AsciiType.ASCII;
import static com.threeleaf.test.random.generator.regex.AsciiType.SPACE;
import static com.threeleaf.test.random.generator.regex.AsciiType.*;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.threeleaf.test.random.TestString;
import lombok.Data;
import lombok.EqualsAndHashCode;

/** Class to return ASCII characters  in a specified type. */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharAscii extends CharBmp {

    public static final Map<Integer, String> CHARACTER_TYPES = ImmutableMap.<Integer, String>builder()
        .put(ALNUM, ALPHANUMERIC)
        .put(ALPHA, ALPHABET + ALPHABET_CAPS)
        .put(ASCII, TestString.ASCII)
        .put(BLANK, WHITESPACE_BLANK)
        .put(CNTRL, ASCII_CONTROL)
        .put(DIGIT, NUMBERS)
        .put(GRAPH, ALPHABET + ALPHABET_CAPS + NUMBERS + PUNCTUATION)
        .put(HEX, NUMBERS_HEX)
        .put(LOWER, ALPHABET)
        .put(PRINT, ALPHABET + ALPHABET_CAPS + NUMBERS + PUNCTUATION + SPACE)
        .put(PUNCT, PUNCTUATION)
        .put(SPACE, WHITESPACE)
        .put(UNDER, UNDERSCORE)
        .put(UPPER, ALPHABET_CAPS)
        .put(WORD, ALPHABET + ALPHABET_CAPS + NUMBERS + UNDERSCORE)
        .build();

    /** The characters to choose from. */
    final String characters;

    public CharAscii(final int theCharacterType) {
        super();
        characters = CHARACTER_TYPES.get(theCharacterType);
    }
}

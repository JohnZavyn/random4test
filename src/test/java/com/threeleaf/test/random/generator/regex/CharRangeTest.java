/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestCharacter.CHARACTER_10;
import static com.threeleaf.test.random.TestCharacter.CHARACTER_126;
import static com.threeleaf.test.random.TestInteger.INTEGER;
import static com.threeleaf.test.random.TestInteger.INT_10;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

/** Test {@link CharRange}. */
class CharRangeTest {

    /** The test {@link CharRange}. */
    private CharRange charRange;

    /** Test {@link CharRange#complement()}. */
    @Test
    void complement() {
        final CharRangeCompliment result = (CharRangeCompliment) charRange.complement();

        assertEquals(CHARACTER_10, result.getFirstCharacter());
        assertEquals(CHARACTER_126, result.getLastCharacter());
    }

    /** Test {@link CharRange#getCharacters()}. */
    @Test
    void getCharacters() {
        assertEquals(117, charRange.getCharacters().length());
    }

    /** Test {@link CharRange#getValue(Integer)}. */
    @RepeatedTest(INT_10)
    void getValue() {
        final char result = charRange.getValue(INTEGER).charAt(0);

        assertTrue(result >= CHARACTER_10 && result <= CHARACTER_126);
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        charRange = new CharRange(CHARACTER_10, CHARACTER_126);
    }

    /** Test {@link CharRange#length()}. */
    @Test
    void weight() {
        assertEquals(CHARACTER_126 - CHARACTER_10, charRange.length());
    }
}

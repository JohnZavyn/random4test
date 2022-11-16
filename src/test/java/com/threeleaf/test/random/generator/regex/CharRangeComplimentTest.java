/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestCharacter.CHARACTER_56;
import static com.threeleaf.test.random.TestCharacter.CHARACTER_66;
import static com.threeleaf.test.random.TestInteger.INTEGER;
import static com.threeleaf.test.random.TestInteger.INT_10;
import static java.lang.Character.MAX_VALUE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

/** Test {@link CharRangeCompliment}. */
class CharRangeComplimentTest {

    /** The test {@link CharRangeCompliment}. */
    private CharRangeCompliment charRangeCompliment;

    /** Test {@link CharRangeCompliment#complement()}. */
    @Test
    void complement() {
        final CharRange result = (CharRange) charRangeCompliment.complement();

        assertEquals(CHARACTER_56, result.getFirstCharacter());
        assertEquals(CHARACTER_66, result.getLastCharacter());
    }

    /** Test {@link CharRangeCompliment#getCharacters()}. */
    @Test
    void getCharacters() {
        assertEquals(243, charRangeCompliment.getCharacters().length());
    }

    /** Test {@link CharRangeCompliment#getValue(Integer)}. */
    @RepeatedTest(INT_10)
    void getValue() {
        final char result = charRangeCompliment.getValue(INTEGER).charAt(0);

        assertTrue(result < CHARACTER_56 || result > CHARACTER_66);
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        charRangeCompliment = new CharRangeCompliment(CHARACTER_56, CHARACTER_66);
    }

    /** Test {@link CharRangeCompliment#length()}. */
    @Test
    void weight() {
        assertEquals(MAX_VALUE - CHARACTER_66 + CHARACTER_56, charRangeCompliment.length());
    }
}

/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestCharacter.CHARACTER_97;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link TestCharacter}. */
class TestCharacterTest {

    private TestCharacter testCharacterUnderTest;

    /** Test {@link TestCharacter#random()}. */
    @Test
    void random() {
        assertNotNull(testCharacterUnderTest.random());
    }

    /** Test {@link TestCharacter#randomBetween(char, char)}. */
    @Test
    void randomBetween() {
        final char expectedResult = 'a';

        final char result = TestCharacter.randomBetween(CHARACTER_97, CHARACTER_97);

        assertEquals(expectedResult, result);
    }

    /** Test {@link TestCharacter#randomCharacter()}. */
    @Test
    void randomCharacter() {
        assertTrue(TestCharacter.randomCharacter() > 0);
    }

    @BeforeEach
    void setUp() {
        testCharacterUnderTest = new TestCharacter();
    }
}

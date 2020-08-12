package com.threeleaf.test.random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.threeleaf.test.random.TestCharacter.CHARACTER_97;
import static org.junit.jupiter.api.Assertions.*;

/** Test {@link TestCharacter}. */
class TestCharacterTest
{

    private TestCharacter testCharacterUnderTest;

    /** Test {@link TestCharacter#random()}. */
    @Test
    void random()
    {
        assertNotNull(testCharacterUnderTest.random());
    }

    /** Test {@link TestCharacter#randomBetween(char, char)}. */
    @Test
    void randomBetween()
    {
        final char expectedResult = 'a';

        char result = TestCharacter.randomBetween(CHARACTER_97, CHARACTER_97);

        assertEquals(expectedResult, result);
    }

    /** Test {@link TestCharacter#randomCharacter()}. */
    @Test
    void randomCharacter()
    {
        assertTrue(TestCharacter.randomCharacter() > 0);
    }

    @BeforeEach
    void setUp()
    {
        testCharacterUnderTest = new TestCharacter();
    }
}

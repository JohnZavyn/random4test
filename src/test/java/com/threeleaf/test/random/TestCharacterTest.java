package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_97;
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

    /** Test {@link TestCharacter#randomBetween(int, int)}. */
    @Test
    void randomBetween() {
        final char expectedResult = 'a';

        char result = TestCharacter.randomBetween(INT_97, INT_97);

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

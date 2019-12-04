package com.threeleaf.test.random;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/** Test {@link TestCharacter} */
public class TestCharacterTest
{

    private TestCharacter testCharacterUnderTest;

    /** Test {@link TestCharacter#random()}. */
    @Test
    public void random()
    {
        assertNotNull(testCharacterUnderTest.random());
    }

    /** Test {@link TestCharacter#randomBetween(int, int)}. */
    @Test
    public void randomBetween()
    {
        final char expectedResult = 'a';

        final char result = TestCharacter.randomBetween(97, 97);

        assertEquals(expectedResult, result);
    }

    /** Test {@link TestCharacter#randomCharacter()}. */
    @Test
    public void randomCharacter()
    {
        assertTrue(TestCharacter.randomCharacter() > 0);
    }

    @Before
    public void setUp()
    {
        testCharacterUnderTest = new TestCharacter();
    }
}
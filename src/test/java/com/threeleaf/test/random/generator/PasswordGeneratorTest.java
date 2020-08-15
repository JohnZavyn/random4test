package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestStringUtil.STRING_NULL;
import static com.threeleaf.test.random.util.TestStringUtil.contains;
import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Test {@link PasswordGenerator}. */
class PasswordGeneratorTest {

    private PasswordGenerator passwordGenerator;

    /** Test {@link PasswordGenerator#randomPassword(int)}. */
    @Test
    void randomPassword() {
        passwordGenerator = new PasswordGenerator(EXAMPLE, PUNCTUATION);
        int length = randomBetween(INT_02, INT_50);

        String result = passwordGenerator.randomPassword(length);

        assertEquals(length, result.length());
    }

    /** Test {@link PasswordGenerator#randomPasswordFriendly(int)}. */
    @Test
    void randomPasswordFriendly() {
        passwordGenerator = new PasswordGenerator(NUMBERS, ALPHABET);
        int length = randomBetween(INT_02, INT_50);
        String result = passwordGenerator.randomPasswordFriendly(length);

        assertEquals(length, result.length());
    }

    /** Test {@link PasswordGenerator#randomPassword(int)} when length too short. */
    @Test
    void randomPasswordLengthCheck() {
        passwordGenerator = new PasswordGenerator();
        assertThrows(
            IllegalArgumentException.class,
            () -> passwordGenerator.randomPassword(INT_00)
        );
    }

    /** Test {@link PasswordGenerator#randomPassword(int, boolean)}. */
    @Test
    void randomPasswordNoShuffle2() {
        passwordGenerator = new PasswordGenerator(NUMBERS, ALPHABET, PUNCTUATION);

        String result = passwordGenerator.randomPassword(INT_03, TRUE);

        assertEquals(INT_03, result.length());
        assertTrue(contains(NUMBERS, result.charAt(INT_00)));
        assertTrue(contains(ALPHABET, result.charAt(INT_01)));
        assertTrue(contains(PUNCTUATION, result.charAt(INT_02)));
    }

    /** Test {@link PasswordGenerator#PasswordGenerator(String...)} when null is passed in. */
    @Test
    void randomPasswordNullCheck() {
        assertThrows(
            NullPointerException.class,
            () -> new PasswordGenerator(STRING_NULL)
        );
    }
}

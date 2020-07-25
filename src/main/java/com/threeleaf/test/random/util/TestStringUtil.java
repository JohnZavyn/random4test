package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.randomBetween;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static java.lang.Character.isWhitespace;
import static java.util.UUID.randomUUID;
import static lombok.AccessLevel.PRIVATE;

import java.util.*;
import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableList;
import lombok.NoArgsConstructor;

/** Test string utilities. */
@NoArgsConstructor(access = PRIVATE)
public class TestStringUtil {

    /** Punctuation marks to be used at the end of sentences. */
    public static final List<String> PUNCTUATION_TERMINAL =
            ImmutableList.<String>builder().add(".", ".", ".", "?", "?", "!").build();

    /** Maximum length for a string. */
    public static final int STRING_LENGTH_MAX = 100;

    /** Minimum length for a string. */
    public static final int STRING_LENGTH_MIN = 10;

    /** Maximum length for a name. */
    public static final int STRING_SHORT_LENGTH_MAX = 10;

    /** Minimum length for a name. */
    public static final int STRING_SHORT_LENGTH_MIN = 5;

    /**
     * Capitalize first letter of a string.
     *
     * @param string the String to capitalize
     *
     * @return the capitalized string
     */
    public static String capitalize(String string) {
        return isEmpty(string) ? string
                : string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    /**
     * Extract suffix from a test string.
     * Specifically, return the random string attached after the last underscore (_) or tilde (~).
     *
     * @param string the string
     *
     * @return the string
     */
    public static String extractSuffix(@Nonnull String string) {
        String[] stringParts = string.split("[_~]");

        return stringParts[stringParts.length - 1];
    }

    /**
     * Determine if a character sequence is null, empty, or contains only whitespace characters.
     *
     * @param chars the string
     *
     * @return true if blank
     */
    public static boolean isBlank(CharSequence chars) {
        boolean isBlank = true;
        if (!isEmpty(chars)) {
            for (int charIndex = 0; charIndex < chars.length(); charIndex++) {
                if (!isWhitespace(chars.charAt(charIndex))) {
                    isBlank = false;
                    break;
                }
            }
        }

        return isBlank;
    }

    /**
     * Determine if a character sequence is null or empty.
     *
     * @param chars the string
     *
     * @return true if empty
     */
    public static boolean isEmpty(CharSequence chars) {
        return chars == null || chars.length() == 0;
    }

    /**
     * Return a random letter.
     *
     * @return a char between a and z
     */
    public static String randomLetter() {
        return chooseOneFrom(ALPHABET_LIST);
    }

    /**
     * Return a random terminal (end of sentence) punctuation mark.
     *
     * @return the punctuation mark
     */
    public static String randomPunctuationTerminal() {
        return chooseOneFrom(PUNCTUATION_TERMINAL);
    }

    /**
     * Return a string of random characters between 10 and 100 characters in length.
     *
     * @return the string
     */
    public static String randomString() {
        return randomString(randomBetween(STRING_LENGTH_MIN, STRING_LENGTH_MAX));
    }

    /**
     * Generate a random string.
     *
     * @param length the desired length of the string
     *
     * @return the string
     */
    public static String randomString(int length) {
        StringBuilder randString = new StringBuilder(length);
        int maxChars = RANDOM_CHARS.length();

        Random randomNumberGenerator = new Random();
        for (int i = 0; i < length; ++i) {
            randString.append(RANDOM_CHARS.charAt(randomNumberGenerator.nextInt(maxChars)));
        }

        return randString.toString();
    }

    /**
     * Return a short string of random characters.
     *
     * @return a short string
     */
    public static String randomStringShort() {
        return randomString(randomBetween(STRING_SHORT_LENGTH_MIN, STRING_SHORT_LENGTH_MAX));
    }

    /**
     * Return a string of random characters with the "TEST~[entityName]" prefix.
     *
     * @param entityName the entity name
     *
     * @return the string
     */
    public static String randomTest(String entityName) {
        return isBlank(entityName) ? test(null)
                : test(entityName.toUpperCase(Locale.US) + "_" + randomStringShort());
    }

    /**
     * Generate a UUID.
     *
     * @return a UUID
     */
    public static String randomUuid() {
        return randomUUID().toString();
    }

    /**
     * Returns the string, converting a null value to an empty string.
     *
     * @param string the string
     *
     * @return the string
     */
    public static String safeString(String string) {
        return safeString(string, EMPTY);
    }

    /**
     * Returns the original string, or if it is null, returns the default string.
     *
     * @param originalString the original string
     * @param defaultString  the string to return if the original string is null or
     *                       &quot;&quot;
     *
     * @return the string
     */
    public static String safeString(String originalString, String defaultString) {
        return isEmpty(originalString) ? defaultString : originalString;
    }

    /**
     * Shuffle the letters in a string randomly.
     *
     * @param string the string
     *
     * @return the shuffled string
     */
    public static String shuffle(String string) {
        List<Character> characters = new ArrayList<>();
        for (char letter : string.toCharArray()) {
            characters.add(letter);
        }
        StringBuilder shuffledString = new StringBuilder(string.length());
        while (!characters.isEmpty()) {
            int randPicker = (int) (Math.random() * characters.size());
            shuffledString.append(characters.remove(randPicker));
        }

        return shuffledString.toString();
    }

    /**
     * Add a test prefix to the given string.
     *
     * @param suffix the string
     *
     * @return the test string
     */
    public static String test(String suffix) {
        return TEST_PREFIX + (isBlank(suffix) ? randomStringShort() : suffix);
    }
}

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.randomBetween;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static java.lang.Character.isWhitespace;
import static java.util.UUID.randomUUID;

import java.util.*;
import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableList;
import lombok.experimental.UtilityClass;

/** Test string utilities. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestStringUtil {

    /** Punctuation marks to be used at the end of sentences. */
    public final List<String> PUNCTUATION_TERMINAL =
            ImmutableList.<String>builder().add(".", ".", ".", "?", "?", "!").build();

    /** Maximum length for a string. */
    public final int STRING_LENGTH_MAX = 100;

    /** Minimum length for a string. */
    public final int STRING_LENGTH_MIN = 10;

    /** Maximum length for a name. */
    public final int STRING_SHORT_LENGTH_MAX = 10;

    /** Minimum length for a name. */
    public final int STRING_SHORT_LENGTH_MIN = 5;

    /**
     * Capitalize first letter of a string.
     *
     * @param string the String to capitalize
     *
     * @return the capitalized string
     */
    public String capitalize(String string) {
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
    public String extractSuffix(@Nonnull final String string) {
        final String[] stringParts = string.split("[_~]");

        return stringParts[stringParts.length - 1];
    }

    public boolean isBlank(final CharSequence chars) {
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

    public boolean isEmpty(final CharSequence chars) {
        return chars == null || chars.length() == 0;
    }

    /**
     * Return a random letter.
     *
     * @return a char between a and z
     */
    public String randomLetter() {
        return String.valueOf(ALPHABET_ARRAY[randomBetween(0, ALPHABET_ARRAY.length - 1)]);
    }

    public String randomPunctuationTerminal() {
        return chooseOneFrom(PUNCTUATION_TERMINAL);
    }

    /**
     * Return a string of random characters between 10 and 100 characters in length.
     *
     * @return the string
     */
    public String randomString() {
        return randomString(randomBetween(STRING_LENGTH_MIN, STRING_LENGTH_MAX));
    }

    /**
     * Generate a random string.
     *
     * @param length the desired length of the string
     *
     * @return the string
     */
    public String randomString(final int length) {
        final StringBuilder randString = new StringBuilder(length);
        final int maxChars = RANDOM_CHARS.length();

        final Random randomNumberGenerator = new Random();
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
    public String randomStringShort() {
        return randomString(randomBetween(STRING_SHORT_LENGTH_MIN, STRING_SHORT_LENGTH_MAX));
    }

    /**
     * Return a string of random characters with the "TEST~[entityName]" prefix.
     *
     * @param entityName the entity name
     *
     * @return the string
     */
    public String randomTest(final String entityName) {
        return isBlank(entityName) ? test(null)
                : test(entityName.toUpperCase(Locale.US) + "_" + randomStringShort());
    }

    /**
     * Generate a UUID.
     *
     * @return a UUID
     */
    public String randomUuid() {
        return randomUUID().toString();
    }

    /**
     * Returns the string, converting a null value to an empty string.
     *
     * @param string the string
     *
     * @return the string
     */
    public String safeString(final String string) {
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
    public String safeString(final String originalString, final String defaultString) {
        return isEmpty(originalString) ? defaultString : originalString;
    }

    /**
     * Shuffle the letters in a string randomly.
     *
     * @param string the string
     *
     * @return the shuffled string
     */
    public String shuffle(final String string) {
        final List<Character> characters = new ArrayList<>();
        for (final char letter : string.toCharArray()) {
            characters.add(letter);
        }
        final StringBuilder shuffledString = new StringBuilder(string.length());
        while (!characters.isEmpty()) {
            final int randPicker = (int) (Math.random() * characters.size());
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
    public String test(final String suffix) {
        return TEST_PREFIX + (isBlank(suffix) ? randomStringShort() : suffix);
    }
}

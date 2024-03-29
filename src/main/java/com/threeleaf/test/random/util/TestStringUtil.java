/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestBoolean.coinFlip;
import static com.threeleaf.test.random.TestInteger.randomBetween;
import static com.threeleaf.test.random.TestString.*;
import static java.lang.Character.*;
import static java.util.UUID.randomUUID;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static lombok.AccessLevel.PRIVATE;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.annotation.Nonnull;

import lombok.NoArgsConstructor;

/** Test string utilities. */
@NoArgsConstructor(access = PRIVATE)
public final class TestStringUtil {

    /** Maximum length for a string. */
    public static final int STRING_LENGTH_MAX = 100;

    /** Minimum length for a string. */
    public static final int STRING_LENGTH_MIN = 10;

    /** A null string. */
    public static final String STRING_NULL = null;

    /** Maximum length for a name. */
    public static final int STRING_SHORT_LENGTH_MAX = 10;

    /** Minimum length for a name. */
    public static final int STRING_SHORT_LENGTH_MIN = 5;

    /**
     * Convert an array of integers into a String.
     *
     * @param stringChars the ASCII integers
     *
     * @return the string
     */
    public static String arrayToString(final int[] stringChars) {
        final StringBuilder stringBuilder = new StringBuilder(stringChars.length);
        for (final int character : stringChars) {
            stringBuilder.append(toChars(character));
        }

        return stringBuilder.toString();
    }

    /**
     * Convert an array of characters into a String.
     *
     * @param stringChars the ASCII characters
     *
     * @return the string
     */
    public static String arrayToString(final char[] stringChars) {
        final StringBuilder stringBuilder = new StringBuilder(stringChars.length);
        for (final char character : stringChars) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }

    /**
     * Capitalize first letter of a string.
     *
     * @param string the String to capitalize
     *
     * @return the capitalized string
     */
    public static String capitalize(final String string) {
        return isEmpty(string)
            ? string
            : string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    public static String chooseOneFrom(final String string) {
        return string.isEmpty()
            ? EMPTY
            : Character.toString(TestCharacterUtil.chooseOneFrom(string));
    }

    /**
     * Tests if a {@link Character} is contained within the provided {@link String}. The built in
     * {@link String#contains(CharSequence)} does not apply for single {@link Character} input.
     *
     * @param string    the source to check against
     * @param character to character to look for
     *
     * @return true if the character is inside the string at least once.
     */
    public static boolean contains(final String string, final char character) {
        return string.indexOf(character) >= 0;
    }

    /**
     * Extract suffix from a test string.
     * Specifically, return the random string attached after the last underscore (_) or tilde (~).
     *
     * @param string the string
     *
     * @return the string
     */
    public static String extractSuffix(@Nonnull final String string) {
        final String[] stringParts = string.split("[_~]");

        return stringParts[stringParts.length - 1];
    }

    /**
     * Determine if a character sequence is null, empty, or contains only whitespace characters.
     *
     * @param chars the string
     *
     * @return true if blank
     */
    public static boolean isBlank(final CharSequence chars) {
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
    public static boolean isEmpty(final CharSequence chars) {
        return chars == null || chars.length() == 0;
    }

    /**
     * Determine if a character sequence contains non-whitespace characters.
     *
     * @param chars the string
     *
     * @return true if blank
     */
    public static boolean isNotBlank(final CharSequence chars) {
        return !isBlank(chars);
    }

    public static String join(final Collection<Character> characters) {
        return characters.stream().map(Object::toString).collect(joining());
    }

    /**
     * Return a random letter.
     *
     * @return a char between a and z
     */
    public static String randomLetter() {
        return chooseOneFrom(ALPHABET);
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
    public static String randomString(final int length) {
        return randomString(length, RANDOM_CHARS);
    }

    /**
     * Generate a random string from characters in the specified string.
     *
     * @param length the desired length of the string
     * @param string the source of random characters
     *
     * @return the string
     */
    public static String randomString(final int length, final String string) {
        final StringBuilder randString = new StringBuilder(length);

        for (int i = 0; i < length; ++i) {
            randString.append(TestCharacterUtil.chooseOneFrom(string));
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
    public static String randomTest(final String entityName) {
        return isBlank(entityName) ? test(EMPTY)
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
     * Convert string characters to random upper and lower case.
     *
     * @param string the original string
     *
     * @return the randomly capitalized string
     */
    public static String randomizeCase(final String string) {
        return arrayToString(randomizeCase(string.codePoints()));
    }

    /**
     * Randomly convert an integer array to upper and lower case characters.
     *
     * @param characters the input characters
     *
     * @return the characters randomly upper and lower cased
     */
    public static int[] randomizeCase(final int[] characters) {
        return randomizeCase(Arrays.stream(characters));
    }

    /**
     * Randomly convert an IntStream to upper and lower case character array.
     *
     * @param characters the input characters
     *
     * @return the characters randomly upper and lower cased
     */
    public static int[] randomizeCase(final IntStream characters) {
        return randomizeCase(characters.boxed());
    }

    /**
     * Randomly convert an Integer Stream to upper and lower case character array.
     *
     * @param characters the input characters
     *
     * @return the characters randomly upper and lower cased
     */
    public static int[] randomizeCase(final Stream<Integer> characters) {
        return characters
            .mapToInt(character -> coinFlip() ? toUpperCase(character) : toLowerCase(character))
            .toArray();
    }

    /**
     * Returns the string, converting a null value to an empty string.
     *
     * @param string the string
     *
     * @return the string
     */
    public static String safeString(final String string) {
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
    public static String safeString(final String originalString, final String defaultString) {
        return isEmpty(originalString) ? defaultString : originalString;
    }

    /**
     * Shuffle the letters in a string randomly.
     *
     * @param string the string
     *
     * @return the shuffled string
     */
    public static String shuffle(final String string) {
        final List<Character> characters = string.chars().mapToObj(e -> (char) e).collect(toList());
        Collections.shuffle(characters);

        return join(characters);
    }

    /**
     * Add a test prefix to the given string.
     *
     * @param suffix the string
     *
     * @return the test string
     */
    public static String test(final String suffix) {
        return TEST_PREFIX + (isBlank(suffix) ? randomStringShort() : suffix);
    }

    /**
     * Convert an array of characters into a String.
     *
     * @param stringChars the ASCII characters
     *
     * @return the string
     */
    public static String toString(final Collection<Character> stringChars) {
        final StringBuilder stringBuilder = new StringBuilder(stringChars.size());
        for (final char character : stringChars) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }
}

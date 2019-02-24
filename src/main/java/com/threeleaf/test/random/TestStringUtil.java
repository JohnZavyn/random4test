package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.*;

import static com.threeleaf.test.random.TestString.EMPTY;

/** Test string utilities. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public final class TestStringUtil
{

    /** Maximum length for a name. */
    public static final int NAME_LENGTH_MAX = 10;

    /** Minimum length for a name. */
    public static final int NAME_LENGTH_MIN = 5;

    /** Maximum length for a string. */
    public static final int STRING_LENGTH_MAX = 100;

    /** Minimum length for a string. */
    public static final int STRING_LENGTH_MIN = 10;

    /** Prefix used for test strings. */
    public static final String TEST_PREFIX = "TEST~";

    /** Alphabet, lower case, in an array. */
    private static final char[] ALPHABET_ARRAY = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /**
     * RANDOM_CHARS contains characters that are not easily visually confused with each other. For example, {O, 0}, {I, 1}, {D, O}, etc.
     */
    private static final String RANDOM_CHARS = "ABCEFGHJKMNPQRSTUVWXYZ23456789";

    /**
     * Extract suffix from a test string. Specifically, return the random string attached after the last underscore (_) or tilde (~).
     *
     * @param string the string
     *
     * @return the string
     */
    public static String extractSuffix(final String string)
    {
        final String[] stringParts = string.split("[_~]");

        return stringParts[stringParts.length - 1];
    }

    /**
     * Return a random e-mail address for testing. The the username prefixed with "TEST~" for easy identification in the database, and the domain complies with RFC 2606 (Reserved Top Level DNS Names).
     *
     * @return the string
     */
    public static String randomEmail()
    {
        return randomName("EMAIL").replace('~', '_') + "@example.com";
    }

    /**
     * Return a random letter.
     *
     * @return a char between a and z
     */
    public static String randomLetter()
    {
        return String.valueOf(ALPHABET_ARRAY[TestNumberUtil.randomBetween(0, ALPHABET_ARRAY.length - 1)]);
    }

    /**
     * Return a string of random characters with the "TEST~" prefix.
     *
     * @return the string
     */
    public static String randomName()
    {
        return TEST_PREFIX + TestStringUtil.randomString(TestNumberUtil.randomBetween(NAME_LENGTH_MIN, NAME_LENGTH_MAX));
    }

    /**
     * Return a string of random characters with the "TEST~[entityName]" prefix.
     *
     * @param entityName the entity name
     *
     * @return the string
     */
    public static String randomName(final String entityName)
    {
        return TEST_PREFIX + TestStringUtil.safeString(entityName).toUpperCase(Locale.US) + "_" + TestStringUtil.randomString(TestNumberUtil.randomBetween(NAME_LENGTH_MIN, NAME_LENGTH_MAX));
    }

    /**
     * Return a string of random characters between 10 and 100 characters in length.
     *
     * @return the string
     */
    public static String randomString()
    {
        return TestStringUtil.randomString(TestNumberUtil.randomBetween(STRING_LENGTH_MIN, STRING_LENGTH_MAX));
    }

    /**
     * Generate a random string.
     *
     * @param length the desired length of the string
     *
     * @return the string
     */
    public static String randomString(final int length)
    {
        final StringBuilder randString = new StringBuilder(length);
        final int           maxChars   = RANDOM_CHARS.length();

        final Random randomNumberGenerator = new Random();
        for (int i = 0; i < length; ++i)
        {
            randString.append(RANDOM_CHARS.charAt(randomNumberGenerator.nextInt(maxChars)));
        }

        return randString.toString();
    }

    /**
     * Returns the string, converting a null value to an empty string.
     *
     * @param string the string
     *
     * @return the string
     */
    public static String safeString(final String string)
    {
        return safeString(string, EMPTY);
    }

    /**
     * Returns the original string, or if it is null, returns the default string.
     *
     * @param originalString the original string
     * @param defaultString  the string to return if the original string is null or &quot;&quot;
     *
     * @return the string
     */
    public static String safeString(final String originalString, final String defaultString)
    {
        return isEmpty(originalString) ? defaultString : originalString;
    }

    /**
     * Shuffle the letters in a string randomly.
     *
     * @param string the string
     *
     * @return the shuffled string
     */
    public static String shuffle(final String string)
    {
        final List<Character> characters = new ArrayList<>();
        for (final char letter : string.toCharArray())
        {
            characters.add(letter);
        }
        final StringBuilder shuffledString = new StringBuilder(string.length());
        while (!characters.isEmpty())
        {
            final int randPicker = (int) (Math.random() * characters.size());
            shuffledString.append(characters.remove(randPicker));
        }

        return shuffledString.toString();
    }
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}

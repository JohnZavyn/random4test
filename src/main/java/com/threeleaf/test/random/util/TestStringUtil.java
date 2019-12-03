package com.threeleaf.test.random.util;

import com.google.common.collect.ImmutableList;
import lombok.experimental.UtilityClass;

import javax.annotation.Nonnull;
import java.util.*;

import static com.threeleaf.test.random.TestInteger.randomBetween;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestNameUtil.randomNameFirst;
import static com.threeleaf.test.random.util.TestNameUtil.randomNameLast;
import static java.lang.Character.isWhitespace;
import static java.util.UUID.randomUUID;

/** Test string utilities. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestStringUtil
{

    /** Punctuation marks to be used at the end of sentences. */
    public static final List<String> PUNCTUATION_TERMINAL = ImmutableList.<String>builder().add(".", ".", ".", "?", "?", "!").build();

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
    public static String capitalize(String string)
    {
        return isEmpty(string) ? string : string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    /**
     * Extract suffix from a test string.
     * Specifically, return the random string attached after the last underscore (_) or tilde (~).
     *
     * @param string the string
     *
     * @return the string
     */
    public static String extractSuffix(@Nonnull final String string)
    {
        final String[] stringParts = string.split("[_~]");

        return stringParts[stringParts.length - 1];
    }

    public static boolean isBlank(final CharSequence chars)
    {
        boolean isBlank = true;
        if (!isEmpty(chars))
        {
            for (int charIndex = 0; charIndex < chars.length(); charIndex++)
            {
                if (!isWhitespace(chars.charAt(charIndex)))
                {
                    isBlank = false;
                    break;
                }
            }
        }

        return isBlank;
    }

    public static boolean isEmpty(final CharSequence chars)
    {
        return chars == null || chars.length() == 0;
    }

    /**
     * A random domain name.
     *
     * @return a domain name
     */
    public static String randomDomain()
    {
        return "test." + randomUuid() + ".example.com";
    }

    /**
     * Return a random e-mail address for testing. The the username prefixed with "TEST~" for easy identification in the database,
     * and the domain complies with RFC 2606 (Reserved Top Level DNS Names).
     *
     * @return the string
     */
    public static String randomEmail()
    {
        return randomNameFirst() + '.' + randomNameLast() + '@' + randomDomain();
    }

    /**
     * Return a random letter.
     *
     * @return a char between a and z
     */
    public static String randomLetter()
    {
        return String.valueOf(ALPHABET_ARRAY[randomBetween(0, ALPHABET_ARRAY.length - 1)]);
    }

    public static String randomPunctuationTerminal()
    {
        return chooseOneFrom(PUNCTUATION_TERMINAL);
    }

    /**
     * Return a string of random characters between 10 and 100 characters in length.
     *
     * @return the string
     */
    public static String randomString()
    {
        return randomString(randomBetween(STRING_LENGTH_MIN, STRING_LENGTH_MAX));
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
     * Return a short string of random characters.
     *
     * @return a short string
     */
    public static String randomStringShort()
    {
        return randomString(randomBetween(STRING_SHORT_LENGTH_MIN, STRING_SHORT_LENGTH_MAX));
    }

    /**
     * Return a string of random characters with the "TEST~[entityName]" prefix.
     *
     * @param entityName the entity name
     *
     * @return the string
     */
    public static String randomTest(final String entityName)
    {
        return isBlank(entityName) ? test(null) : test(entityName.toUpperCase(Locale.US) + "_" + randomStringShort());
    }

    /**
     * A URL for a home page using HTTP protocol.
     *
     * @return a url
     */
    public static String randomUrl()
    {
        return HTTP_PROTOCOL + "://" + randomDomain();
    }

    /**
     * A URL for a home page using HTTP protocol.
     *
     * @return a secure url
     */
    public static String randomUrlSecure()
    {
        return HTTPS_PROTOCOL + "://" + randomDomain();
    }

    /**
     * Generate a UUID.
     *
     * @return a UUID
     */
    public static String randomUuid()
    {
        return randomUUID().toString();
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

    /**
     * Add a test prefix to the given string.
     *
     * @param suffix the string
     *
     * @return the test string
     */
    public static String test(final String suffix)
    {
        return TEST_PREFIX + (isBlank(suffix) ? randomStringShort() : suffix);
    }
}

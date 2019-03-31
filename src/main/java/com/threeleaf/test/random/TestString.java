package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import static com.threeleaf.test.random.util.TestStringUtil.randomString;
import static com.threeleaf.test.random.util.TestStringUtil.randomUuid;

/** String constants to be used in JUnit tests. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestString
{

    /** The letters "abc". */
    public static final String ABC = "abc";

    /** Alphabet, lower case. */
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    /** Alphabet, lower case, in an array. */
    public static final char[] ALPHABET_ARRAY = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /** Alphabet, upper case. */
    public static final String ALPHABET_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /** An empty string. */
    public static final String EMPTY = "";

    /** Numeric characters. */
    public static final String NUMBERS = "0123456789";

    /** Punctuation characters. */
    public static final String PUNCTUATION = "`~!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";

    /**
     * RANDOM_CHARS contains characters that are not easily visually confused with each other.
     * For example, {O, 0}, {I, 1}, {D, O}, etc.
     */
    public static final String RANDOM_CHARS = "ABCEFGHJKMNPQRSTUVWXYZ23456789";

    /** Test string consisting of 5 random characters. */
    public static final String CHAR_05 = randomString(5);

    /** Test string consisting of 8 random characters. */
    public static final String CHAR_08 = randomString(8);

    /** Test string consisting of 10 random characters. */
    public static final String CHAR_10 = randomString(10);

    /** Test string consisting of 16 random characters. */
    public static final String CHAR_16 = randomString(16);

    /** Test string consisting of 32 random characters. */
    public static final String CHAR_32 = randomString(32);

    /** Test string consisting of 99 random characters. */
    public static final String CHAR_99 = randomString(99);

    /* A bogus e-mail address. */
    public static final String EMAIL = randomString() + "@test." + randomString() + ".example.com";

    /** A space */
    public static final String SPACE = " ";

    /** A prefix that can be attached to strings to indicate it is from a testing context. */
    public static final String TEST_PREFIX = "TEST~";

    /** The string "test string". */
    public static final String TEST_STRING = "test string";

    /** A URL for a home page using HTTP protocol. */
    public static final String URL = "http://test." + randomString() + ".example.com";

    /** A URL for a home page using HTTPS protocol. */
    public static final String URL_SSL = "https://test." + randomString() + ".example.com";

    /** A UUID string. */
    public static final String UUID = randomUuid();

    /** Whitespace characters. */
    public static final String WHITESPACE = " \t\r\n";
}

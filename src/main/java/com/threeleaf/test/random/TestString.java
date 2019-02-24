package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

/** String constants to be used in JUnit tests. */
@UtilityClass
@SuppressWarnings("unused")
public final class TestString
{

    /** The letters "abc". */
    public static final String ABC = "abc";

    /** Alphabet, lower case. */
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    /** Alphabet, upper case. */
    public static final String ALPHABET_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /** Test string consisting of 5 random characters. */
    public static final String CHAR_05 = TestStringUtil.randomString(5);

    /** Test string consisting of 8 random characters. */
    public static final String CHAR_08 = TestStringUtil.randomString(8);

    /** Test string consisting of 10 random characters. */
    public static final String CHAR_10 = TestStringUtil.randomString(10);

    /** Test string consisting of 16 random characters. */
    public static final String CHAR_16 = TestStringUtil.randomString(16);

    /** Test string consisting of 32 random characters. */
    public static final String CHAR_32 = TestStringUtil.randomString(32);

    /** Test string consisting of 99 random characters. */
    public static final String CHAR_99 = TestStringUtil.randomString(99);

    /** Numeric characters. */
    public static final String NUMBERS = "0123456789";

    /** Punctuation characters. */
    public static final String PUNCTUATION = "`~!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";

    /** The string "test string". */
    public static final String TEST_STRING = "test string";

    /** Whitespace characters. */
    public static final String WHITESPACE = " \t\r\n";
    public static final String EMPTY = "";
    public static final String SPACE = " ";
}

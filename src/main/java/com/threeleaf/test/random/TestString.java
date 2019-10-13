package com.threeleaf.test.random;

import java.util.*;

import static com.threeleaf.test.random.util.TestArrayUtil.randomArrayOf;
import static com.threeleaf.test.random.util.TestArrayUtil.randomArraySingleOf;
import static com.threeleaf.test.random.util.TestCollectionUtil.randomCollectionOf;
import static com.threeleaf.test.random.util.TestListUtil.randomListOf;
import static com.threeleaf.test.random.util.TestMapUtil.randomMapOf;
import static com.threeleaf.test.random.util.TestMapUtil.randomMapSingleOf;
import static com.threeleaf.test.random.util.TestSetUtil.randomSetOf;
import static com.threeleaf.test.random.util.TestSetUtil.randomSetSingleOf;
import static com.threeleaf.test.random.util.TestStringUtil.*;
import static java.util.Collections.*;

/** String constants to be used in JUnit tests. */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestString extends AbstractTestUtil<String>
{

    /** The letters "abc". */
    public static final String ABC = "abc";

    /** Alphabet, lower case. */
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    /** Alphabet, lower case, in an array. */
    public static final char[] ALPHABET_ARRAY = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /** Alphabet, upper case. */
    public static final String ALPHABET_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /** An {@link String} array. */
    public static final String[] ARRAY_STRING = randomArrayOf(String.class);

    /** An {@link String} array with a single value. */
    public static final String[] ARRAY_STRING_SINGLE = randomArraySingleOf(String.class);

    /** An {@link String} collection. */
    public static final Collection<String> COLLECTION_STRING = unmodifiableCollection(randomCollectionOf(String.class));

    /** An single {@link Integer} collection. */
    public static final Collection<String> COLLECTION_STRING_SINGLE = singleton(TestRandom.random(String.class));

    /** An empty string. */
    public static final String EMPTY = "";

    /** The instance of {@link TestString}. */
    public static final TestString INSTANCE = new TestString();

    /** An {@link String} list. */
    public static final List<String> LIST_STRING = unmodifiableList(randomListOf(String.class));

    /** An single {@link Integer} list. */
    public static final List<String> LIST_STRING_SINGLE = singletonList(TestRandom.random(String.class));

    /** An {@link String} map. */
    public static final Map<String, String> MAP_STRING = unmodifiableMap(randomMapOf(String.class, String.class));

    /** An {@link String} map with a single key-value pair. */
    public static final Map<String, String> MAP_STRING_SINGLE = unmodifiableMap(randomMapSingleOf(String.class, String.class));

    /** Numeric characters. */
    public static final String NUMBERS = "0123456789";

    /** Punctuation characters. */
    public static final String PUNCTUATION = "`~!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";

    /**
     * RANDOM_CHARS contains characters that are not easily visually confused with each other.
     * For example, {O, 0}, {I, 1}, {D, O}, etc.
     */
    public static final String RANDOM_CHARS = "ABCEFGHJKMNPQRSTUVWXYZ23456789";

    /* A bogus e-mail address. */
    public static final String EMAIL = randomEmail();

    /** An {@link String} set. */
    public static final Set<String> SET_STRING = unmodifiableSet(randomSetOf(String.class));

    /** An {@link String} set with a single value. */
    public static final Set<String> SET_STRING_SINGLE = unmodifiableSet(randomSetSingleOf(String.class));

    /** A space */
    public static final String SPACE = " ";

    /** A random string. */
    public static final String STRING = "TEST~" + randomString();

    /** Test string consisting of 1 random characters. */
    public static final String STRING_01 = randomString(1);

    /** Test string consisting of 2 random characters. */
    public static final String STRING_02 = randomString(2);

    /** Test string consisting of 3 random characters. */
    public static final String STRING_03 = randomString(3);

    /** Test string consisting of 4 random characters. */
    public static final String STRING_04 = randomString(4);

    /** Test string consisting of 5 random characters. */
    public static final String STRING_05 = randomString(5);

    /** Test string consisting of 6 random characters. */
    public static final String STRING_06 = randomString(6);

    /** Test string consisting of 7 random characters. */
    public static final String STRING_07 = randomString(7);

    /** Test string consisting of 8 random characters. */
    public static final String STRING_08 = randomString(8);

    /** Test string consisting of 9 random characters. */
    public static final String STRING_09 = randomString(9);

    /** Test string consisting of 10 random characters. */
    public static final String STRING_10 = randomString(10);

    /** Test string consisting of 11 random characters. */
    public static final String STRING_11 = randomString(11);

    /** Test string consisting of 12 random characters. */
    public static final String STRING_12 = randomString(12);

    /** Test string consisting of 13 random characters. */
    public static final String STRING_13 = randomString(13);

    /** Test string consisting of 14 random characters. */
    public static final String STRING_14 = randomString(14);

    /** Test string consisting of 15 random characters. */
    public static final String STRING_15 = randomString(15);

    /** Test string consisting of 16 random characters. */
    public static final String STRING_16 = randomString(16);

    /** Test string consisting of 17 random characters. */
    public static final String STRING_17 = randomString(17);

    /** Test string consisting of 18 random characters. */
    public static final String STRING_18 = randomString(18);

    /** Test string consisting of 19 random characters. */
    public static final String STRING_19 = randomString(19);

    /** Test string consisting of 20 random characters. */
    public static final String STRING_20 = randomString(20);

    /** Test string consisting of 21 random characters. */
    public static final String STRING_21 = randomString(21);

    /** Test string consisting of 22 random characters. */
    public static final String STRING_22 = randomString(22);

    /** Test string consisting of 23 random characters. */
    public static final String STRING_23 = randomString(23);

    /** Test string consisting of 24 random characters. */
    public static final String STRING_24 = randomString(24);

    /** Test string consisting of 25 random characters. */
    public static final String STRING_25 = randomString(25);

    /** Test string consisting of 26 random characters. */
    public static final String STRING_26 = randomString(26);

    /** Test string consisting of 27 random characters. */
    public static final String STRING_27 = randomString(27);

    /** Test string consisting of 28 random characters. */
    public static final String STRING_28 = randomString(28);

    /** Test string consisting of 29 random characters. */
    public static final String STRING_29 = randomString(29);

    /** Test string consisting of 30 random characters. */
    public static final String STRING_30 = randomString(30);

    /** Test string consisting of 31 random characters. */
    public static final String STRING_31 = randomString(31);

    /** Test string consisting of 32 random characters. */
    public static final String STRING_32 = randomString(32);

    /** Test string consisting of 33 random characters. */
    public static final String STRING_33 = randomString(33);

    /** Test string consisting of 34 random characters. */
    public static final String STRING_34 = randomString(34);

    /** Test string consisting of 35 random characters. */
    public static final String STRING_35 = randomString(35);

    /** Test string consisting of 36 random characters. */
    public static final String STRING_36 = randomString(36);

    /** Test string consisting of 37 random characters. */
    public static final String STRING_37 = randomString(37);

    /** Test string consisting of 38 random characters. */
    public static final String STRING_38 = randomString(38);

    /** Test string consisting of 39 random characters. */
    public static final String STRING_39 = randomString(39);

    /** Test string consisting of 40 random characters. */
    public static final String STRING_40 = randomString(40);

    /** Test string consisting of 41 random characters. */
    public static final String STRING_41 = randomString(41);

    /** Test string consisting of 42 random characters. */
    public static final String STRING_42 = randomString(42);

    /** Test string consisting of 43 random characters. */
    public static final String STRING_43 = randomString(43);

    /** Test string consisting of 44 random characters. */
    public static final String STRING_44 = randomString(44);

    /** Test string consisting of 45 random characters. */
    public static final String STRING_45 = randomString(45);

    /** Test string consisting of 46 random characters. */
    public static final String STRING_46 = randomString(46);

    /** Test string consisting of 47 random characters. */
    public static final String STRING_47 = randomString(47);

    /** Test string consisting of 48 random characters. */
    public static final String STRING_48 = randomString(48);

    /** Test string consisting of 49 random characters. */
    public static final String STRING_49 = randomString(49);

    /** Test string consisting of 50 random characters. */
    public static final String STRING_50 = randomString(50);

    /** Test string consisting of 51 random characters. */
    public static final String STRING_51 = randomString(51);

    /** Test string consisting of 52 random characters. */
    public static final String STRING_52 = randomString(52);

    /** Test string consisting of 53 random characters. */
    public static final String STRING_53 = randomString(53);

    /** Test string consisting of 54 random characters. */
    public static final String STRING_54 = randomString(54);

    /** Test string consisting of 55 random characters. */
    public static final String STRING_55 = randomString(55);

    /** Test string consisting of 56 random characters. */
    public static final String STRING_56 = randomString(56);

    /** Test string consisting of 57 random characters. */
    public static final String STRING_57 = randomString(57);

    /** Test string consisting of 58 random characters. */
    public static final String STRING_58 = randomString(58);

    /** Test string consisting of 59 random characters. */
    public static final String STRING_59 = randomString(59);

    /** Test string consisting of 60 random characters. */
    public static final String STRING_60 = randomString(60);

    /** Test string consisting of 61 random characters. */
    public static final String STRING_61 = randomString(61);

    /** Test string consisting of 62 random characters. */
    public static final String STRING_62 = randomString(62);

    /** Test string consisting of 63 random characters. */
    public static final String STRING_63 = randomString(63);

    /** Test string consisting of 64 random characters. */
    public static final String STRING_64 = randomString(64);

    /** Test string consisting of 65 random characters. */
    public static final String STRING_65 = randomString(65);

    /** Test string consisting of 66 random characters. */
    public static final String STRING_66 = randomString(66);

    /** Test string consisting of 67 random characters. */
    public static final String STRING_67 = randomString(67);

    /** Test string consisting of 68 random characters. */
    public static final String STRING_68 = randomString(68);

    /** Test string consisting of 69 random characters. */
    public static final String STRING_69 = randomString(69);

    /** Test string consisting of 70 random characters. */
    public static final String STRING_70 = randomString(70);

    /** Test string consisting of 71 random characters. */
    public static final String STRING_71 = randomString(71);

    /** Test string consisting of 72 random characters. */
    public static final String STRING_72 = randomString(72);

    /** Test string consisting of 73 random characters. */
    public static final String STRING_73 = randomString(73);

    /** Test string consisting of 74 random characters. */
    public static final String STRING_74 = randomString(74);

    /** Test string consisting of 75 random characters. */
    public static final String STRING_75 = randomString(75);

    /** Test string consisting of 76 random characters. */
    public static final String STRING_76 = randomString(76);

    /** Test string consisting of 77 random characters. */
    public static final String STRING_77 = randomString(77);

    /** Test string consisting of 78 random characters. */
    public static final String STRING_78 = randomString(78);

    /** Test string consisting of 79 random characters. */
    public static final String STRING_79 = randomString(79);

    /** Test string consisting of 80 random characters. */
    public static final String STRING_80 = randomString(80);

    /** Test string consisting of 81 random characters. */
    public static final String STRING_81 = randomString(81);

    /** Test string consisting of 82 random characters. */
    public static final String STRING_82 = randomString(82);

    /** Test string consisting of 83 random characters. */
    public static final String STRING_83 = randomString(83);

    /** Test string consisting of 84 random characters. */
    public static final String STRING_84 = randomString(84);

    /** Test string consisting of 85 random characters. */
    public static final String STRING_85 = randomString(85);

    /** Test string consisting of 86 random characters. */
    public static final String STRING_86 = randomString(86);

    /** Test string consisting of 87 random characters. */
    public static final String STRING_87 = randomString(87);

    /** Test string consisting of 88 random characters. */
    public static final String STRING_88 = randomString(88);

    /** Test string consisting of 89 random characters. */
    public static final String STRING_89 = randomString(89);

    /** Test string consisting of 90 random characters. */
    public static final String STRING_90 = randomString(90);

    /** Test string consisting of 91 random characters. */
    public static final String STRING_91 = randomString(91);

    /** Test string consisting of 92 random characters. */
    public static final String STRING_92 = randomString(92);

    /** Test string consisting of 93 random characters. */
    public static final String STRING_93 = randomString(93);

    /** Test string consisting of 94 random characters. */
    public static final String STRING_94 = randomString(94);

    /** Test string consisting of 95 random characters. */
    public static final String STRING_95 = randomString(95);

    /** Test string consisting of 96 random characters. */
    public static final String STRING_96 = randomString(96);

    /** Test string consisting of 97 random characters. */
    public static final String STRING_97 = randomString(97);

    /** Test string consisting of 98 random characters. */
    public static final String STRING_98 = randomString(98);

    /** Test string consisting of 99 random characters. */
    public static final String STRING_99 = randomString(99);

    /** A prefix that can be attached to strings to indicate it is from a testing context. */
    public static final String TEST_PREFIX = "TEST~";

    /** A URL for a home page using HTTP protocol. */
    public static final String URL = "http://test." + randomString() + ".example.com";

    /** A URL for a home page using HTTPS protocol. */
    public static final String URL_SSL = "https://test." + randomString() + ".example.com";

    /** A UUID string. */
    public static final String UUID = randomUuid();

    /** Whitespace characters. */
    public static final String WHITESPACE = " \t\r\n";

    /** Instantiate a utility to produce randomized objects of the given type. */
    public TestString()
    {
        super(String.class);
    }
}

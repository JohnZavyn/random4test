package com.threeleaf.test.random;

import java.util.*;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.util.TestStringUtil.*;
import static java.util.Collections.*;

/** String constants to be used in JUnit tests. */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestString extends AbstractTest<String>
{

    /** The letters "abc". */
    public static final String ABC = "abc";

    /** Alphabet, lower case. */
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    /** Alphabet, lower case, in an array. */
    public static final String[] ALPHABET_ARRAY = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    /** Alphabet, upper case. */
    public static final String ALPHABET_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /** A colon string. */
    public static final String COLON = ":";

    /** An empty string. */
    public static final String EMPTY = "";

    /** The instance of {@link TestString}. */
    public static final TestString INSTANCE = new TestString();

    /** Numeric characters. */
    public static final String NUMBERS = "0123456789";

    /** Punctuation characters. */
    public static final String PUNCTUATION = "`~!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";

    /**
     * RANDOM_CHARS contains characters that are not easily visually confused with each other.
     * For example, {O, 0}, {I, 1}, {D, O}, etc.
     */
    public static final String RANDOM_CHARS = "ABCEFGHJKMNPQRSTUVWXYZ23456789";

    /** A space */
    public static final String SPACE = " ";

    /** Test string consisting of 1 random characters. */
    public static final String STRING_01 = randomString(INT_01);

    /** Test string consisting of 2 random characters. */
    public static final String STRING_02 = randomString(INT_02);

    /** Test string consisting of 3 random characters. */
    public static final String STRING_03 = randomString(INT_03);

    /** Test string consisting of 4 random characters. */
    public static final String STRING_04 = randomString(INT_04);

    /** Test string consisting of 5 random characters. */
    public static final String STRING_05 = randomString(INT_05);

    /** Test string consisting of 6 random characters. */
    public static final String STRING_06 = randomString(INT_06);

    /** Test string consisting of 7 random characters. */
    public static final String STRING_07 = randomString(INT_07);

    /** Test string consisting of 8 random characters. */
    public static final String STRING_08 = randomString(INT_08);

    /** Test string consisting of 9 random characters. */
    public static final String STRING_09 = randomString(INT_09);

    /** Test string consisting of 10 random characters. */
    public static final String STRING_10 = randomString(INT_10);

    /** Test string consisting of 11 random characters. */
    public static final String STRING_11 = randomString(INT_11);

    /** Test string consisting of 12 random characters. */
    public static final String STRING_12 = randomString(INT_12);

    /** Test string consisting of 13 random characters. */
    public static final String STRING_13 = randomString(INT_13);

    /** Test string consisting of 14 random characters. */
    public static final String STRING_14 = randomString(INT_14);

    /** Test string consisting of 15 random characters. */
    public static final String STRING_15 = randomString(INT_15);

    /** Test string consisting of 16 random characters. */
    public static final String STRING_16 = randomString(INT_16);

    /** Test string consisting of 17 random characters. */
    public static final String STRING_17 = randomString(INT_17);

    /** Test string consisting of 18 random characters. */
    public static final String STRING_18 = randomString(INT_18);

    /** Test string consisting of 19 random characters. */
    public static final String STRING_19 = randomString(INT_19);

    /** Test string consisting of 20 random characters. */
    public static final String STRING_20 = randomString(INT_20);

    /** Test string consisting of 21 random characters. */
    public static final String STRING_21 = randomString(INT_21);

    /** Test string consisting of 22 random characters. */
    public static final String STRING_22 = randomString(INT_22);

    /** Test string consisting of 23 random characters. */
    public static final String STRING_23 = randomString(INT_23);

    /** Test string consisting of 24 random characters. */
    public static final String STRING_24 = randomString(INT_24);

    /** Test string consisting of 25 random characters. */
    public static final String STRING_25 = randomString(INT_25);

    /** Test string consisting of 26 random characters. */
    public static final String STRING_26 = randomString(INT_26);

    /** Test string consisting of 27 random characters. */
    public static final String STRING_27 = randomString(INT_27);

    /** Test string consisting of 28 random characters. */
    public static final String STRING_28 = randomString(INT_28);

    /** Test string consisting of 29 random characters. */
    public static final String STRING_29 = randomString(INT_29);

    /** Test string consisting of 30 random characters. */
    public static final String STRING_30 = randomString(INT_30);

    /** Test string consisting of 31 random characters. */
    public static final String STRING_31 = randomString(INT_31);

    /** Test string consisting of 32 random characters. */
    public static final String STRING_32 = randomString(INT_32);

    /** Test string consisting of 33 random characters. */
    public static final String STRING_33 = randomString(INT_33);

    /** Test string consisting of 34 random characters. */
    public static final String STRING_34 = randomString(INT_34);

    /** Test string consisting of 35 random characters. */
    public static final String STRING_35 = randomString(INT_35);

    /** Test string consisting of 36 random characters. */
    public static final String STRING_36 = randomString(INT_36);

    /** Test string consisting of 37 random characters. */
    public static final String STRING_37 = randomString(INT_37);

    /** Test string consisting of 38 random characters. */
    public static final String STRING_38 = randomString(INT_38);

    /** Test string consisting of 39 random characters. */
    public static final String STRING_39 = randomString(INT_39);

    /** Test string consisting of 40 random characters. */
    public static final String STRING_40 = randomString(INT_40);

    /** Test string consisting of 41 random characters. */
    public static final String STRING_41 = randomString(INT_41);

    /** Test string consisting of 42 random characters. */
    public static final String STRING_42 = randomString(INT_42);

    /** Test string consisting of 43 random characters. */
    public static final String STRING_43 = randomString(INT_43);

    /** Test string consisting of 44 random characters. */
    public static final String STRING_44 = randomString(INT_44);

    /** Test string consisting of 45 random characters. */
    public static final String STRING_45 = randomString(INT_45);

    /** Test string consisting of 46 random characters. */
    public static final String STRING_46 = randomString(INT_46);

    /** Test string consisting of 47 random characters. */
    public static final String STRING_47 = randomString(INT_47);

    /** Test string consisting of 48 random characters. */
    public static final String STRING_48 = randomString(INT_48);

    /** Test string consisting of 49 random characters. */
    public static final String STRING_49 = randomString(INT_49);

    /** Test string consisting of 50 random characters. */
    public static final String STRING_50 = randomString(INT_50);

    /** Test string consisting of 51 random characters. */
    public static final String STRING_51 = randomString(INT_51);

    /** Test string consisting of 52 random characters. */
    public static final String STRING_52 = randomString(INT_52);

    /** Test string consisting of 53 random characters. */
    public static final String STRING_53 = randomString(INT_53);

    /** Test string consisting of 54 random characters. */
    public static final String STRING_54 = randomString(INT_54);

    /** Test string consisting of 55 random characters. */
    public static final String STRING_55 = randomString(INT_55);

    /** Test string consisting of 56 random characters. */
    public static final String STRING_56 = randomString(INT_56);

    /** Test string consisting of 57 random characters. */
    public static final String STRING_57 = randomString(INT_57);

    /** Test string consisting of 58 random characters. */
    public static final String STRING_58 = randomString(INT_58);

    /** Test string consisting of 59 random characters. */
    public static final String STRING_59 = randomString(INT_59);

    /** Test string consisting of 60 random characters. */
    public static final String STRING_60 = randomString(INT_60);

    /** Test string consisting of 61 random characters. */
    public static final String STRING_61 = randomString(INT_61);

    /** Test string consisting of 62 random characters. */
    public static final String STRING_62 = randomString(INT_62);

    /** Test string consisting of 63 random characters. */
    public static final String STRING_63 = randomString(INT_63);

    /** Test string consisting of 64 random characters. */
    public static final String STRING_64 = randomString(INT_64);

    /** Test string consisting of 65 random characters. */
    public static final String STRING_65 = randomString(INT_65);

    /** Test string consisting of 66 random characters. */
    public static final String STRING_66 = randomString(INT_66);

    /** Test string consisting of 67 random characters. */
    public static final String STRING_67 = randomString(INT_67);

    /** Test string consisting of 68 random characters. */
    public static final String STRING_68 = randomString(INT_68);

    /** Test string consisting of 69 random characters. */
    public static final String STRING_69 = randomString(INT_69);

    /** Test string consisting of 70 random characters. */
    public static final String STRING_70 = randomString(INT_70);

    /** Test string consisting of 71 random characters. */
    public static final String STRING_71 = randomString(INT_71);

    /** Test string consisting of 72 random characters. */
    public static final String STRING_72 = randomString(INT_72);

    /** Test string consisting of 73 random characters. */
    public static final String STRING_73 = randomString(INT_73);

    /** Test string consisting of 74 random characters. */
    public static final String STRING_74 = randomString(INT_74);

    /** Test string consisting of 75 random characters. */
    public static final String STRING_75 = randomString(INT_75);

    /** Test string consisting of 76 random characters. */
    public static final String STRING_76 = randomString(INT_76);

    /** Test string consisting of 77 random characters. */
    public static final String STRING_77 = randomString(INT_77);

    /** Test string consisting of 78 random characters. */
    public static final String STRING_78 = randomString(INT_78);

    /** Test string consisting of 79 random characters. */
    public static final String STRING_79 = randomString(INT_79);

    /** Test string consisting of 80 random characters. */
    public static final String STRING_80 = randomString(INT_80);

    /** Test string consisting of 81 random characters. */
    public static final String STRING_81 = randomString(INT_81);

    /** Test string consisting of 82 random characters. */
    public static final String STRING_82 = randomString(INT_82);

    /** Test string consisting of 83 random characters. */
    public static final String STRING_83 = randomString(INT_83);

    /** Test string consisting of 84 random characters. */
    public static final String STRING_84 = randomString(INT_84);

    /** Test string consisting of 85 random characters. */
    public static final String STRING_85 = randomString(INT_85);

    /** Test string consisting of 86 random characters. */
    public static final String STRING_86 = randomString(INT_86);

    /** Test string consisting of 87 random characters. */
    public static final String STRING_87 = randomString(INT_87);

    /** Test string consisting of 88 random characters. */
    public static final String STRING_88 = randomString(INT_88);

    /** Test string consisting of 89 random characters. */
    public static final String STRING_89 = randomString(INT_89);

    /** Test string consisting of 90 random characters. */
    public static final String STRING_90 = randomString(INT_90);

    /** Test string consisting of 91 random characters. */
    public static final String STRING_91 = randomString(INT_91);

    /** Test string consisting of 92 random characters. */
    public static final String STRING_92 = randomString(INT_92);

    /** Test string consisting of 93 random characters. */
    public static final String STRING_93 = randomString(INT_93);

    /** Test string consisting of 94 random characters. */
    public static final String STRING_94 = randomString(INT_94);

    /** Test string consisting of 95 random characters. */
    public static final String STRING_95 = randomString(INT_95);

    /** Test string consisting of 96 random characters. */
    public static final String STRING_96 = randomString(INT_96);

    /** Test string consisting of 97 random characters. */
    public static final String STRING_97 = randomString(INT_97);

    /** Test string consisting of 98 random characters. */
    public static final String STRING_98 = randomString(INT_98);

    /** A random string. */
    public static final String STRING = test(randomString());

    /** An {@link String} array. */
    public static final String[] STRING_ARRAY = INSTANCE.randomArray();

    /** An {@link String} array with a single value. */
    public static final String[] STRING_ARRAY_SINGLE = INSTANCE.randomArraySingle();

    /** An {@link String} collection. */
    public static final Collection<String> STRING_COLLECTION = unmodifiableCollection(INSTANCE.randomCollection());

    /** An single {@link Integer} collection. */
    public static final Collection<String> STRING_COLLECTION_SINGLE = singleton(randomString());

    /** An {@link String} list. */
    public static final List<String> STRING_LIST = unmodifiableList(INSTANCE.randomList());

    /** An single {@link Integer} list. */
    public static final List<String> STRING_LIST_SINGLE = singletonList(randomString());

    /** An {@link String} map. */
    public static final Map<String, String> STRING_MAP = unmodifiableMap(INSTANCE.randomMap(String.class));

    /** An {@link Integer} key and {@link String} value map. */
    public static final Map<Integer, String> STRING_MAP_INTEGER = unmodifiableMap(INSTANCE.randomMap(Integer.class));

    /** An {@link Integer} key and {@link String} value map with a single key-value pair. */
    public static final Map<Integer, String> STRING_MAP_INTEGER_SINGLE = unmodifiableMap(INSTANCE.randomMapSingle(Integer.class));

    /** An {@link Long} key and {@link String} value map. */
    public static final Map<Long, String> STRING_MAP_LONG = unmodifiableMap(INSTANCE.randomMap(Long.class));

    /** An {@link Long} key and {@link String} value map with a single key-value pair. */
    public static final Map<Long, String> STRING_MAP_LONG_SINGLE = unmodifiableMap(INSTANCE.randomMapSingle(Long.class));

    /** An {@link String} map with a single key-value pair. */
    public static final Map<String, String> STRING_MAP_SINGLE = unmodifiableMap(INSTANCE.randomMapSingle(String.class));

    /** An {@link String} set. */
    public static final Set<String> STRING_SET = unmodifiableSet(INSTANCE.randomSet());

    /** An {@link String} set with a single value. */
    public static final Set<String> STRING_SET_SINGLE = unmodifiableSet(INSTANCE.randomSetSingle());

    /** A prefix that can be attached to strings to indicate it is from a testing context. */
    public static final String TEST_PREFIX = "TEST~";

    /** Test string consisting of 99 random characters. */
    public static final String STRING_99 = randomString(INT_99);

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

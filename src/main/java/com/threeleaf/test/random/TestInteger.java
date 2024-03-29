/*
 * Copyright 2019-2022, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestLong.L_00;
import static com.threeleaf.test.random.TestRandom.RANDOM;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.util.Collections.*;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/** Utilities for random {@link Integer} creation. */
@SuppressWarnings(
    {"WeakerAccess", "unused", "squid:S2386" /* Arrays are mutable */, "RedundantSuppression"})
public class TestInteger extends AbstractRandom<Integer> {

    /** Maximum digit value. */
    public static final int DIGIT_MAX = 9;

    /** Minimum digit value. */
    public static final int DIGIT_MIN = 0;

    /** The instance of {@link TestInteger}. */
    public static final TestInteger INSTANCE = new TestInteger();

    /** A random Integer. */
    public static final Integer INTEGER = randomInteger();

    /** The Integer 00. */
    public static final Integer INTEGER_00 = 0;

    /** The Integer 01. */
    public static final Integer INTEGER_01 = 1;

    /** The Integer 02. */
    public static final Integer INTEGER_02 = 2;

    /** The Integer 03. */
    public static final Integer INTEGER_03 = 3;

    /** The Integer 04. */
    public static final Integer INTEGER_04 = 4;

    /** The Integer 05. */
    public static final Integer INTEGER_05 = 5;

    /** The Integer 06. */
    public static final Integer INTEGER_06 = 6;

    /** The Integer 07. */
    public static final Integer INTEGER_07 = 7;

    /** The Integer 08. */
    public static final Integer INTEGER_08 = 8;

    /** The Integer 09. */
    public static final Integer INTEGER_09 = 9;

    /** The Integer 10. */
    public static final Integer INTEGER_10 = 10;

    /** The Integer 100. */
    public static final Integer INTEGER_100 = 100;

    /** The Integer 1000. */
    public static final Integer INTEGER_1000 = 1000;

    /** The Integer 10000. */
    public static final Integer INTEGER_10000 = 10000;

    /** The Integer 10001. */
    public static final Integer INTEGER_10001 = 10001;

    /** The Integer 1001. */
    public static final Integer INTEGER_1001 = 1001;

    /** The Integer 101. */
    public static final Integer INTEGER_101 = 101;

    /** The Integer 11. */
    public static final Integer INTEGER_11 = 11;

    /** The Integer 12. */
    public static final Integer INTEGER_12 = 12;

    /** The Integer 13. */
    public static final Integer INTEGER_13 = 13;

    /** The Integer 14. */
    public static final Integer INTEGER_14 = 14;

    /** The Integer 15. */
    public static final Integer INTEGER_15 = 15;

    /** The Integer 16. */
    public static final Integer INTEGER_16 = 16;

    /** The Integer 17. */
    public static final Integer INTEGER_17 = 17;

    /** The Integer 18. */
    public static final Integer INTEGER_18 = 18;

    /** The Integer 19. */
    public static final Integer INTEGER_19 = 19;

    /** The Integer 20. */
    public static final Integer INTEGER_20 = 20;

    /** The Integer 21. */
    public static final Integer INTEGER_21 = 21;

    /** The Integer 22. */
    public static final Integer INTEGER_22 = 22;

    /** The Integer 23. */
    public static final Integer INTEGER_23 = 23;

    /** The Integer 24. */
    public static final Integer INTEGER_24 = 24;

    /** The Integer 25. */
    public static final Integer INTEGER_25 = 25;

    /** The Integer 26. */
    public static final Integer INTEGER_26 = 26;

    /** The Integer 27. */
    public static final Integer INTEGER_27 = 27;

    /** The Integer 28. */
    public static final Integer INTEGER_28 = 28;

    /** The Integer 29. */
    public static final Integer INTEGER_29 = 29;

    /** The Integer 30. */
    public static final Integer INTEGER_30 = 30;

    /** The Integer 31. */
    public static final Integer INTEGER_31 = 31;

    /** The Integer 32. */
    public static final Integer INTEGER_32 = 32;

    /** The Integer 33. */
    public static final Integer INTEGER_33 = 33;

    /** The Integer 34. */
    public static final Integer INTEGER_34 = 34;

    /** The Integer 35. */
    public static final Integer INTEGER_35 = 35;

    /** The Integer 36. */
    public static final Integer INTEGER_36 = 36;

    /** The Integer 37. */
    public static final Integer INTEGER_37 = 37;

    /** The Integer 38. */
    public static final Integer INTEGER_38 = 38;

    /** The Integer 39. */
    public static final Integer INTEGER_39 = 39;

    /** The Integer 40. */
    public static final Integer INTEGER_40 = 40;

    /** The Integer 41. */
    public static final Integer INTEGER_41 = 41;

    /** The Integer 42. */
    public static final Integer INTEGER_42 = 42;

    /** The Integer 43. */
    public static final Integer INTEGER_43 = 43;

    /** The Integer 44. */
    public static final Integer INTEGER_44 = 44;

    /** The Integer 45. */
    public static final Integer INTEGER_45 = 45;

    /** The Integer 46. */
    public static final Integer INTEGER_46 = 46;

    /** The Integer 47. */
    public static final Integer INTEGER_47 = 47;

    /** The Integer 48. */
    public static final Integer INTEGER_48 = 48;

    /** The Integer 49. */
    public static final Integer INTEGER_49 = 49;

    /** The Integer 50. */
    public static final Integer INTEGER_50 = 50;

    /** The Integer 51. */
    public static final Integer INTEGER_51 = 51;

    /** The Integer 52. */
    public static final Integer INTEGER_52 = 52;

    /** The Integer 53. */
    public static final Integer INTEGER_53 = 53;

    /** The Integer 54. */
    public static final Integer INTEGER_54 = 54;

    /** The Integer 55. */
    public static final Integer INTEGER_55 = 55;

    /** The Integer 56. */
    public static final Integer INTEGER_56 = 56;

    /** The Integer 57. */
    public static final Integer INTEGER_57 = 57;

    /** The Integer 58. */
    public static final Integer INTEGER_58 = 58;

    /** The Integer 59. */
    public static final Integer INTEGER_59 = 59;

    /** The Integer 60. */
    public static final Integer INTEGER_60 = 60;

    /** The Integer 61. */
    public static final Integer INTEGER_61 = 61;

    /** The Integer 62. */
    public static final Integer INTEGER_62 = 62;

    /** The Integer 63. */
    public static final Integer INTEGER_63 = 63;

    /** The Integer 64. */
    public static final Integer INTEGER_64 = 64;

    /** The Integer 65. */
    public static final Integer INTEGER_65 = 65;

    /** The Integer 66. */
    public static final Integer INTEGER_66 = 66;

    /** The Integer 67. */
    public static final Integer INTEGER_67 = 67;

    /** The Integer 68. */
    public static final Integer INTEGER_68 = 68;

    /** The Integer 69. */
    public static final Integer INTEGER_69 = 69;

    /** The Integer 70. */
    public static final Integer INTEGER_70 = 70;

    /** The Integer 71. */
    public static final Integer INTEGER_71 = 71;

    /** The Integer 72. */
    public static final Integer INTEGER_72 = 72;

    /** The Integer 73. */
    public static final Integer INTEGER_73 = 73;

    /** The Integer 74. */
    public static final Integer INTEGER_74 = 74;

    /** The Integer 75. */
    public static final Integer INTEGER_75 = 75;

    /** The Integer 76. */
    public static final Integer INTEGER_76 = 76;

    /** The Integer 77. */
    public static final Integer INTEGER_77 = 77;

    /** The Integer 78. */
    public static final Integer INTEGER_78 = 78;

    /** The Integer 79. */
    public static final Integer INTEGER_79 = 79;

    /** The Integer 80. */
    public static final Integer INTEGER_80 = 80;

    /** The Integer 81. */
    public static final Integer INTEGER_81 = 81;

    /** The Integer 82. */
    public static final Integer INTEGER_82 = 82;

    /** The Integer 83. */
    public static final Integer INTEGER_83 = 83;

    /** The Integer 84. */
    public static final Integer INTEGER_84 = 84;

    /** The Integer 85. */
    public static final Integer INTEGER_85 = 85;

    /** The Integer 86. */
    public static final Integer INTEGER_86 = 86;

    /** The Integer 87. */
    public static final Integer INTEGER_87 = 87;

    /** The Integer 88. */
    public static final Integer INTEGER_88 = 88;

    /** The Integer 89. */
    public static final Integer INTEGER_89 = 89;

    /** The Integer 90. */
    public static final Integer INTEGER_90 = 90;

    /** The Integer 91. */
    public static final Integer INTEGER_91 = 91;

    /** The Integer 92. */
    public static final Integer INTEGER_92 = 92;

    /** The Integer 93. */
    public static final Integer INTEGER_93 = 93;

    /** The Integer 94. */
    public static final Integer INTEGER_94 = 94;

    /** The Integer 95. */
    public static final Integer INTEGER_95 = 95;

    /** The Integer 96. */
    public static final Integer INTEGER_96 = 96;

    /** The Integer 97. */
    public static final Integer INTEGER_97 = 97;

    /** The Integer 98. */
    public static final Integer INTEGER_98 = 98;

    /** The Integer 99. */
    public static final Integer INTEGER_99 = 99;

    /** The Integer 999. */
    public static final Integer INTEGER_999 = 999;

    /** The Integer 9999. */
    public static final Integer INTEGER_9999 = 9999;

    /** A single {@link Integer} collection. */
    public static final Collection<Integer> INTEGER_COLLECTION_SINGLE = singleton(randomInteger());

    /** A single {@link Integer} list. */
    public static final List<Integer> INTEGER_LIST_SINGLE = singletonList(randomInteger());

    /** A random Integer. */
    public static final Integer INTEGER_RANDOM = randomInt();

    /** The maximum value for an unsigned integer. */
    public static final long INTEGER_UNSIGNED_MAX = (long) Integer.MAX_VALUE - Integer.MIN_VALUE;

    /** The primitive int 00. */
    public static final int INT_00 = 0;

    /** The primitive int 01. */
    public static final int INT_01 = 1;

    /** An {@link Integer} array with a single value. */
    public static final Integer[] INTEGER_ARRAY_SINGLE = INSTANCE.randomArraySingle();

    /** A negative Integer. */
    public static final Integer INTEGER_NEGATIVE = randomNegative();

    /** A positive Integer. */
    public static final Integer INTEGER_POSITIVE = randomPositive();

    /** The primitive int 02. */
    public static final int INT_02 = 2;

    /** The primitive int 03. */
    public static final int INT_03 = 3;

    /** An {@link Integer} map with a single key-value pair. */
    public static final Map<Integer, Integer> INTEGER_MAP_SINGLE =
        unmodifiableMap(INSTANCE.randomMapSingle(Integer.class));

    /** An {@link Integer} set with a single value. */
    public static final Set<Integer> INTEGER_SET_SINGLE =
        unmodifiableSet(INSTANCE.randomSetSingle());

    /** The primitive int 04. */
    public static final int INT_04 = 4;

    /** The primitive int 05. */
    public static final int INT_05 = 5;

    /** The primitive int 06. */
    public static final int INT_06 = 6;

    /** The primitive int 07. */
    public static final int INT_07 = 7;

    /** The primitive int 08. */
    public static final int INT_08 = 8;

    /** The primitive int 09. */
    public static final int INT_09 = 9;

    /** The primitive int 10. */
    public static final int INT_10 = 10;

    /** An {@link Integer} collection. */
    public static final Collection<Integer> INTEGER_COLLECTION =
        unmodifiableCollection(INSTANCE.randomCollection());

    /** An {@link Integer} map. */
    public static final Map<Integer, Integer> INTEGER_MAP =
        unmodifiableMap(INSTANCE.randomMap(Integer.class));

    /** An {@link Integer} array. */
    public static final Integer[] INTEGER_ARRAY = INSTANCE.randomArray();

    /** An {@link Integer} list. */
    public static final List<Integer> INTEGER_LIST = unmodifiableList(INSTANCE.randomList());

    /** An {@link Integer} set. */
    public static final Set<Integer> INTEGER_SET = unmodifiableSet(INSTANCE.randomSet());

    /** The primitive int 100. */
    public static final int INT_100 = 100;

    /** A small Integer between 0-100. */
    public static final Integer INTEGER_SMALL = randomPercent();

    /** The primitive int 1000. */
    public static final int INT_1000 = 1000;

    /** The primitive int 10000. */
    public static final int INT_10000 = 10000;

    /** The primitive int 10001. */
    public static final int INT_10001 = 10001;

    /** The primitive int 1001. */
    public static final int INT_1001 = 1001;

    /** The primitive int 101. */
    public static final int INT_101 = 101;

    /** The primitive int 11. */
    public static final int INT_11 = 11;

    /** The primitive int 12. */
    public static final int INT_12 = 12;

    /** The primitive int 127. */
    public static final int INT_127 = 127;

    /** The primitive int 128. */
    public static final int INT_128 = 128;

    /** The primitive int 13. */
    public static final int INT_13 = 13;

    /** The primitive int 14. */
    public static final int INT_14 = 14;

    /** The primitive int 15. */
    public static final int INT_15 = 15;

    /** The primitive int 16. */
    public static final int INT_16 = 16;

    /** The primitive int 17. */
    public static final int INT_17 = 17;

    /** The primitive int 18. */
    public static final int INT_18 = 18;

    /** The primitive int 19. */
    public static final int INT_19 = 19;

    /** The primitive int 20. */
    public static final int INT_20 = 20;

    /** The primitive int 21. */
    public static final int INT_21 = 21;

    /** The primitive int 22. */
    public static final int INT_22 = 22;

    /** The primitive int 23. */
    public static final int INT_23 = 23;

    /** The primitive int 24. */
    public static final int INT_24 = 24;

    /** The primitive int 25. */
    public static final int INT_25 = 25;

    /** The primitive int 255. */
    public static final int INT_255 = 255;

    /** The primitive int 26. */
    public static final int INT_26 = 26;

    /** The primitive int 27. */
    public static final int INT_27 = 27;

    /** The primitive int 28. */
    public static final int INT_28 = 28;

    /** The primitive int 29. */
    public static final int INT_29 = 29;

    /** The primitive int 30. */
    public static final int INT_30 = 30;

    /** The primitive int 31. */
    public static final int INT_31 = 31;

    /** The primitive int 32. */
    public static final int INT_32 = 32;

    /** The primitive int 33. */
    public static final int INT_33 = 33;

    /** The primitive int 34. */
    public static final int INT_34 = 34;

    /** The primitive int 35. */
    public static final int INT_35 = 35;

    /** The primitive int 36. */
    public static final int INT_36 = 36;

    /** The primitive int 37. */
    public static final int INT_37 = 37;

    /** The primitive int 38. */
    public static final int INT_38 = 38;

    /** The primitive int 39. */
    public static final int INT_39 = 39;

    /** The primitive int 40. */
    public static final int INT_40 = 40;

    /** The primitive int 41. */
    public static final int INT_41 = 41;

    /** The primitive int 42. */
    public static final int INT_42 = 42;

    /** The primitive int 43. */
    public static final int INT_43 = 43;

    /** The primitive int 44. */
    public static final int INT_44 = 44;

    /** The primitive int 45. */
    public static final int INT_45 = 45;

    /** The primitive int 46. */
    public static final int INT_46 = 46;

    /** The primitive int 47. */
    public static final int INT_47 = 47;

    /** The primitive int 48. */
    public static final int INT_48 = 48;

    /** The primitive int 49. */
    public static final int INT_49 = 49;

    /** The primitive int 50. */
    public static final int INT_50 = 50;

    /** The primitive int 51. */
    public static final int INT_51 = 51;

    /** The primitive int 52. */
    public static final int INT_52 = 52;

    /** The primitive int 53. */
    public static final int INT_53 = 53;

    /** The primitive int 54. */
    public static final int INT_54 = 54;

    /** The primitive int 55. */
    public static final int INT_55 = 55;

    /** The primitive int 56. */
    public static final int INT_56 = 56;

    /** The primitive int 57. */
    public static final int INT_57 = 57;

    /** The primitive int 58. */
    public static final int INT_58 = 58;

    /** The primitive int 59. */
    public static final int INT_59 = 59;

    /** The primitive int 60. */
    public static final int INT_60 = 60;

    /** The primitive int 61. */
    public static final int INT_61 = 61;

    /** The primitive int 62. */
    public static final int INT_62 = 62;

    /** The primitive int 63. */
    public static final int INT_63 = 63;

    /** The primitive int 64. */
    public static final int INT_64 = 64;

    /** The primitive int 65. */
    public static final int INT_65 = 65;

    /** The primitive int 66. */
    public static final int INT_66 = 66;

    /** The primitive int 67. */
    public static final int INT_67 = 67;

    /** The primitive int 68. */
    public static final int INT_68 = 68;

    /** The primitive int 69. */
    public static final int INT_69 = 69;

    /** The primitive int 70. */
    public static final int INT_70 = 70;

    /** The primitive int 71. */
    public static final int INT_71 = 71;

    /** The primitive int 72. */
    public static final int INT_72 = 72;

    /** The primitive int 73. */
    public static final int INT_73 = 73;

    /** The primitive int 74. */
    public static final int INT_74 = 74;

    /** The primitive int 75. */
    public static final int INT_75 = 75;

    /** The primitive int 76. */
    public static final int INT_76 = 76;

    /** The primitive int 77. */
    public static final int INT_77 = 77;

    /** The primitive int 78. */
    public static final int INT_78 = 78;

    /** The primitive int 79. */
    public static final int INT_79 = 79;

    /** The primitive int 80. */
    public static final int INT_80 = 80;

    /** The primitive int 81. */
    public static final int INT_81 = 81;

    /** The primitive int 82. */
    public static final int INT_82 = 82;

    /** The primitive int 83. */
    public static final int INT_83 = 83;

    /** The primitive int 84. */
    public static final int INT_84 = 84;

    /** The primitive int 85. */
    public static final int INT_85 = 85;

    /** The primitive int 86. */
    public static final int INT_86 = 86;

    /** The primitive int 87. */
    public static final int INT_87 = 87;

    /** The primitive int 88. */
    public static final int INT_88 = 88;

    /** The primitive int 89. */
    public static final int INT_89 = 89;

    /** The primitive int 90. */
    public static final int INT_90 = 90;

    /** The primitive int 91. */
    public static final int INT_91 = 91;

    /** The primitive int 92. */
    public static final int INT_92 = 92;

    /** The primitive int 93. */
    public static final int INT_93 = 93;

    /** The primitive int 94. */
    public static final int INT_94 = 94;

    /** The primitive int 95. */
    public static final int INT_95 = 95;

    /** The primitive int 96. */
    public static final int INT_96 = 96;

    /** The primitive int 97. */
    public static final int INT_97 = 97;

    /** The primitive int 98. */
    public static final int INT_98 = 98;

    /** The primitive int 99. */
    public static final int INT_99 = 99;

    /** The primitive int 999. */
    public static final int INT_999 = 999;

    /** The primitive int 9999. */
    public static final int INT_9999 = 9999;

    /** A negative primitive int. */
    public static final int INT_NEGATIVE = randomNegative();

    /** A positive primitive int. */
    public static final int INT_POSITIVE = randomPositive();

    /** A random primitive int. */
    public static final int INT_RANDOM = randomInteger();

    /** A small primitive int between 0-100. */
    public static final int INT_SMALL = randomPercent();

    /** Instantiate a utility to produce randomized Integer objects. */
    public TestInteger() {
        super(Integer.class);
    }

    /**
     * Get a random digit between 0 and 10.
     *
     * @return a number between 0 and 10 inclusive
     */
    public static int random0to10() {
        return randomBetween(0, INT_10);
    }

    /**
     * Get a random digit between 1 and 10.
     *
     * @return a number between 1 and 10 inclusive
     */
    public static int random1to10() {
        return randomBetween(INT_01, INT_10);
    }

    /**
     * Get a random number between 1 and 100.
     *
     * @return a number between 1 and 100 inclusive
     */
    public static int random1to100() {
        return randomBetween(INT_01, INT_100);
    }

    /**
     * Return a random int between two ints, inclusive.
     *
     * @param number1 a number
     * @param number2 another number
     *
     * @return the random int
     */
    public static int randomBetween(final int number1, final int number2) {
        final int min = min(number1, number2);
        /* ThreadLocalRandom.nextInt(long, long) is upper bound exclusive, so the following
         * is necessary to get an inclusive range (only MAX_VALUE will never be returned). */
        final int max = min(max(number1, number2), MAX_VALUE - 1) + 1;

        return ThreadLocalRandom.current().nextInt(min, max);
    }

    /**
     * Get a random digit.
     *
     * @return a number between 0 and 9 inclusive
     */
    public static int randomDigit() {
        return randomBetween(DIGIT_MIN, DIGIT_MAX);
    }

    /**
     * A random hexadecimal byte value.
     *
     * @return a  "0" to "FF"
     */
    public static String randomHex() {
        return Long.toHexString(randomUnsigned());
    }

    /**
     * Return a random int.
     *
     * @return the int
     */
    public static int randomInt() {
        return randomInteger();
    }

    /**
     * Return a random Integer.
     *
     * @return the Integer
     */
    public static Integer randomInteger() {
        return INSTANCE.random();
    }

    /**
     * Return a random negative {@link Integer}.
     *
     * @return the big decimal
     */
    public static int randomNegative() {
        return -randomPositive();
    }

    /**
     * Get a random number between 0 and 100.
     *
     * @return a number between 0 and 100 inclusive
     */
    public static int randomPercent() {
        return randomBetween(0, INT_100);
    }

    /**
     * Return a random positive {@link Integer}.
     *
     * @return the big decimal
     */
    public static int randomPositive() {
        return randomBetween(INT_01, Integer.MAX_VALUE);
    }

    /**
     * A random unsigned byte.
     *
     * @return a number between 0 and 255 inclusive
     */
    public static long randomUnsigned() {
        return TestLong.randomBetween(L_00, INTEGER_UNSIGNED_MAX);
    }

    /**
     * Return a random Integer.
     *
     * @return the int
     */
    @Override
    public Integer random() {
        return RANDOM.nextInt();
    }
}

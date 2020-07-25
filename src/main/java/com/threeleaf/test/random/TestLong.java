package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestRandom.RANDOM;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.*;
import static java.util.Collections.*;

import java.util.*;

/** Utilities for random {@link Long} creation. */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestLong extends AbstractTest<Long> {

    /** The instance of {@link TestLong}. */
    public static final TestLong INSTANCE = new TestLong();

    /** A random Long. */
    public static final Long LONG = randomLong();

    /** The Long 00. */
    public static final Long LONG_00 = 0L;

    /** The Long 01. */
    public static final Long LONG_01 = 1L;

    /** The Long 02. */
    public static final Long LONG_02 = 2L;

    /** The Long 03. */
    public static final Long LONG_03 = 3L;

    /** The Long 04. */
    public static final Long LONG_04 = 4L;

    /** The Long 05. */
    public static final Long LONG_05 = 5L;

    /** The Long 06. */
    public static final Long LONG_06 = 6L;

    /** The Long 07. */
    public static final Long LONG_07 = 7L;

    /** The Long 08. */
    public static final Long LONG_08 = 8L;

    /** The Long 09. */
    public static final Long LONG_09 = 9L;

    /** The Long 10. */
    public static final Long LONG_10 = 10L;

    /** The Long 100. */
    public static final Long LONG_100 = 100L;

    /** The Long 1000. */
    public static final Long LONG_1000 = 1000L;

    /** The Long 10000. */
    public static final Long LONG_10000 = 10000L;

    /** The Long 10001. */
    public static final Long LONG_10001 = 10001L;

    /** The Long 1001. */
    public static final Long LONG_1001 = 1001L;

    /** The Long 101. */
    public static final Long LONG_101 = 101L;

    /** The Long 11. */
    public static final Long LONG_11 = 11L;

    /** The Long 12. */
    public static final Long LONG_12 = 12L;

    /** The Long 13. */
    public static final Long LONG_13 = 13L;

    /** The Long 14. */
    public static final Long LONG_14 = 14L;

    /** The Long 15. */
    public static final Long LONG_15 = 15L;

    /** The Long 16. */
    public static final Long LONG_16 = 16L;

    /** The Long 17. */
    public static final Long LONG_17 = 17L;

    /** The Long 18. */
    public static final Long LONG_18 = 18L;

    /** The Long 19. */
    public static final Long LONG_19 = 19L;

    /** The Long 20. */
    public static final Long LONG_20 = 20L;

    /** The Long 21. */
    public static final Long LONG_21 = 21L;

    /** The Long 22. */
    public static final Long LONG_22 = 22L;

    /** The Long 23. */
    public static final Long LONG_23 = 23L;

    /** The Long 24. */
    public static final Long LONG_24 = 24L;

    /** The Long 25. */
    public static final Long LONG_25 = 25L;

    /** The Long 26. */
    public static final Long LONG_26 = 26L;

    /** The Long 27. */
    public static final Long LONG_27 = 27L;

    /** The Long 28. */
    public static final Long LONG_28 = 28L;

    /** The Long 29. */
    public static final Long LONG_29 = 29L;

    /** The Long 30. */
    public static final Long LONG_30 = 30L;

    /** The Long 31. */
    public static final Long LONG_31 = 31L;

    /** The Long 32. */
    public static final Long LONG_32 = 32L;

    /** The Long 33. */
    public static final Long LONG_33 = 33L;

    /** The Long 34. */
    public static final Long LONG_34 = 34L;

    /** The Long 35. */
    public static final Long LONG_35 = 35L;

    /** The Long 36. */
    public static final Long LONG_36 = 36L;

    /** The Long 37. */
    public static final Long LONG_37 = 37L;

    /** The Long 38. */
    public static final Long LONG_38 = 38L;

    /** The Long 39. */
    public static final Long LONG_39 = 39L;

    /** The Long 40. */
    public static final Long LONG_40 = 40L;

    /** The Long 41. */
    public static final Long LONG_41 = 41L;

    /** The Long 42. */
    public static final Long LONG_42 = 42L;

    /** The Long 43. */
    public static final Long LONG_43 = 43L;

    /** The Long 44. */
    public static final Long LONG_44 = 44L;

    /** The Long 45. */
    public static final Long LONG_45 = 45L;

    /** The Long 46. */
    public static final Long LONG_46 = 46L;

    /** The Long 47. */
    public static final Long LONG_47 = 47L;

    /** The Long 48. */
    public static final Long LONG_48 = 48L;

    /** The Long 49. */
    public static final Long LONG_49 = 49L;

    /** The Long 50. */
    public static final Long LONG_50 = 50L;

    /** The Long 51. */
    public static final Long LONG_51 = 51L;

    /** The Long 52. */
    public static final Long LONG_52 = 52L;

    /** The Long 53. */
    public static final Long LONG_53 = 53L;

    /** The Long 54. */
    public static final Long LONG_54 = 54L;

    /** The Long 55. */
    public static final Long LONG_55 = 55L;

    /** The Long 56. */
    public static final Long LONG_56 = 56L;

    /** The Long 57. */
    public static final Long LONG_57 = 57L;

    /** The Long 58. */
    public static final Long LONG_58 = 58L;

    /** The Long 59. */
    public static final Long LONG_59 = 59L;

    /** The Long 60. */
    public static final Long LONG_60 = 60L;

    /** The Long 61. */
    public static final Long LONG_61 = 61L;

    /** The Long 62. */
    public static final Long LONG_62 = 62L;

    /** The Long 63. */
    public static final Long LONG_63 = 63L;

    /** The Long 64. */
    public static final Long LONG_64 = 64L;

    /** The Long 65. */
    public static final Long LONG_65 = 65L;

    /** The Long 66. */
    public static final Long LONG_66 = 66L;

    /** The Long 67. */
    public static final Long LONG_67 = 67L;

    /** The Long 68. */
    public static final Long LONG_68 = 68L;

    /** The Long 69. */
    public static final Long LONG_69 = 69L;

    /** The Long 70. */
    public static final Long LONG_70 = 70L;

    /** The Long 71. */
    public static final Long LONG_71 = 71L;

    /** The Long 72. */
    public static final Long LONG_72 = 72L;

    /** The Long 73. */
    public static final Long LONG_73 = 73L;

    /** The Long 74. */
    public static final Long LONG_74 = 74L;

    /** The Long 75. */
    public static final Long LONG_75 = 75L;

    /** The Long 76. */
    public static final Long LONG_76 = 76L;

    /** The Long 77. */
    public static final Long LONG_77 = 77L;

    /** The Long 78. */
    public static final Long LONG_78 = 78L;

    /** The Long 79. */
    public static final Long LONG_79 = 79L;

    /** The Long 80. */
    public static final Long LONG_80 = 80L;

    /** The Long 81. */
    public static final Long LONG_81 = 81L;

    /** The Long 82. */
    public static final Long LONG_82 = 82L;

    /** The Long 83. */
    public static final Long LONG_83 = 83L;

    /** The Long 84. */
    public static final Long LONG_84 = 84L;

    /** The Long 85. */
    public static final Long LONG_85 = 85L;

    /** The Long 86. */
    public static final Long LONG_86 = 86L;

    /** The Long 87. */
    public static final Long LONG_87 = 87L;

    /** The Long 88. */
    public static final Long LONG_88 = 88L;

    /** The Long 89. */
    public static final Long LONG_89 = 89L;

    /** The Long 90. */
    public static final Long LONG_90 = 90L;

    /** The Long 91. */
    public static final Long LONG_91 = 91L;

    /** The Long 92. */
    public static final Long LONG_92 = 92L;

    /** The Long 93. */
    public static final Long LONG_93 = 93L;

    /** The Long 94. */
    public static final Long LONG_94 = 94L;

    /** The Long 95. */
    public static final Long LONG_95 = 95L;

    /** The Long 96. */
    public static final Long LONG_96 = 96L;

    /** The Long 97. */
    public static final Long LONG_97 = 97L;

    /** The Long 98. */
    public static final Long LONG_98 = 98L;

    /** The Long 99. */
    public static final Long LONG_99 = 99L;

    /** The Long 999. */
    public static final Long LONG_999 = 999L;

    /** The Long 9999. */
    public static final Long LONG_9999 = 9999L;

    /** An {@link Long} array. */
    public static final Long[] LONG_ARRAY = INSTANCE.randomArray();

    /** An {@link Long} array with a single value. */
    public static final Long[] LONG_ARRAY_SINGLE = INSTANCE.randomArraySingle();

    /** An {@link Long} collection. */
    public static final Collection<Long> LONG_COLLECTION =
            unmodifiableCollection(INSTANCE.randomCollection());

    /** An single {@link Integer} collection. */
    public static final Collection<Long> LONG_COLLECTION_SINGLE = singleton(randomLong());

    /** An {@link Long} list. */
    public static final List<Long> LONG_LIST = unmodifiableList(INSTANCE.randomList());

    /** An single {@link Integer} list. */
    public static final List<Long> LONG_LIST_SINGLE = singletonList(randomLong());

    /** An {@link Long} map. */
    public static final Map<Long, Long> LONG_MAP = unmodifiableMap(INSTANCE.randomMap(Long.class));

    /** An {@link Long} map with a single key-value pair. */
    public static final Map<Long, Long> LONG_MAP_SINGLE =
            unmodifiableMap(INSTANCE.randomMapSingle(Long.class));

    /** A negative Long. */
    public static final Long LONG_NEGATIVE = randomNegative();

    /** A positive Long. */
    public static final Long LONG_POSITIVE = randomPositive();

    /** A random Long. */
    public static final Long LONG_RANDOM = randomLong();

    /** An {@link Long} set. */
    public static final Set<Long> LONG_SET = unmodifiableSet(INSTANCE.randomSet());

    /** An {@link Long} set with a single value. */
    public static final Set<Long> LONG_SET_SINGLE = unmodifiableSet(INSTANCE.randomSetSingle());

    /** The primitive long 00. */
    public static final long L_00 = 0;

    /** The primitive long 01. */
    public static final long L_01 = 1;

    /** The primitive long 02. */
    public static final long L_02 = 2;

    /** The primitive long 03. */
    public static final long L_03 = 3;

    /** The primitive long 04. */
    public static final long L_04 = 4;

    /** The primitive long 05. */
    public static final long L_05 = 5;

    /** The primitive long 06. */
    public static final long L_06 = 6;

    /** The primitive long 07. */
    public static final long L_07 = 7;

    /** The primitive long 08. */
    public static final long L_08 = 8;

    /** The primitive long 09. */
    public static final long L_09 = 9;

    /** The primitive long 10. */
    public static final long L_10 = 10;

    /** The primitive long 100. */
    public static final long L_100 = 100;

    /** A small Long between 0-100. */
    public static final Long LONG_SMALL = randomPercent();

    /** The primitive long 1000. */
    public static final long L_1000 = 1000;

    /** The primitive long 10000. */
    public static final long L_10000 = 10000;

    /** The primitive long 10001. */
    public static final long L_10001 = 10001;

    /** The primitive long 1001. */
    public static final long L_1001 = 1001;

    /** The primitive long 101. */
    public static final long L_101 = 101;

    /** The primitive long 11. */
    public static final long L_11 = 11;

    /** The primitive long 12. */
    public static final long L_12 = 12;

    /** The primitive long 13. */
    public static final long L_13 = 13;

    /** The primitive long 14. */
    public static final long L_14 = 14;

    /** The primitive long 15. */
    public static final long L_15 = 15;

    /** The primitive long 16. */
    public static final long L_16 = 16;

    /** The primitive long 17. */
    public static final long L_17 = 17;

    /** The primitive long 18. */
    public static final long L_18 = 18;

    /** The primitive long 19. */
    public static final long L_19 = 19;

    /** The primitive long 20. */
    public static final long L_20 = 20;

    /** The primitive long 21. */
    public static final long L_21 = 21;

    /** The primitive long 22. */
    public static final long L_22 = 22;

    /** The primitive long 23. */
    public static final long L_23 = 23;

    /** The primitive long 24. */
    public static final long L_24 = 24;

    /** The primitive long 25. */
    public static final long L_25 = 25;

    /** The primitive long 26. */
    public static final long L_26 = 26;

    /** The primitive long 27. */
    public static final long L_27 = 27;

    /** The primitive long 28. */
    public static final long L_28 = 28;

    /** The primitive long 29. */
    public static final long L_29 = 29;

    /** The primitive long 30. */
    public static final long L_30 = 30;

    /** The primitive long 31. */
    public static final long L_31 = 31;

    /** The primitive long 32. */
    public static final long L_32 = 32;

    /** The primitive long 33. */
    public static final long L_33 = 33;

    /** The primitive long 34. */
    public static final long L_34 = 34;

    /** The primitive long 35. */
    public static final long L_35 = 35;

    /** The primitive long 36. */
    public static final long L_36 = 36;

    /** The primitive long 37. */
    public static final long L_37 = 37;

    /** The primitive long 38. */
    public static final long L_38 = 38;

    /** The primitive long 39. */
    public static final long L_39 = 39;

    /** The primitive long 40. */
    public static final long L_40 = 40;

    /** The primitive long 41. */
    public static final long L_41 = 41;

    /** The primitive long 42. */
    public static final long L_42 = 42;

    /** The primitive long 43. */
    public static final long L_43 = 43;

    /** The primitive long 44. */
    public static final long L_44 = 44;

    /** The primitive long 45. */
    public static final long L_45 = 45;

    /** The primitive long 46. */
    public static final long L_46 = 46;

    /** The primitive long 47. */
    public static final long L_47 = 47;

    /** The primitive long 48. */
    public static final long L_48 = 48;

    /** The primitive long 49. */
    public static final long L_49 = 49;

    /** The primitive long 50. */
    public static final long L_50 = 50;

    /** The primitive long 51. */
    public static final long L_51 = 51;

    /** The primitive long 52. */
    public static final long L_52 = 52;

    /** The primitive long 53. */
    public static final long L_53 = 53;

    /** The primitive long 54. */
    public static final long L_54 = 54;

    /** The primitive long 55. */
    public static final long L_55 = 55;

    /** The primitive long 56. */
    public static final long L_56 = 56;

    /** The primitive long 57. */
    public static final long L_57 = 57;

    /** The primitive long 58. */
    public static final long L_58 = 58;

    /** The primitive long 59. */
    public static final long L_59 = 59;

    /** The primitive long 60. */
    public static final long L_60 = 60;

    /** The primitive long 61. */
    public static final long L_61 = 61;

    /** The primitive long 62. */
    public static final long L_62 = 62;

    /** The primitive long 63. */
    public static final long L_63 = 63;

    /** The primitive long 64. */
    public static final long L_64 = 64;

    /** The primitive long 65. */
    public static final long L_65 = 65;

    /** The primitive long 66. */
    public static final long L_66 = 66;

    /** The primitive long 67. */
    public static final long L_67 = 67;

    /** The primitive long 68. */
    public static final long L_68 = 68;

    /** The primitive long 69. */
    public static final long L_69 = 69;

    /** The primitive long 70. */
    public static final long L_70 = 70;

    /** The primitive long 71. */
    public static final long L_71 = 71;

    /** The primitive long 72. */
    public static final long L_72 = 72;

    /** The primitive long 73. */
    public static final long L_73 = 73;

    /** The primitive long 74. */
    public static final long L_74 = 74;

    /** The primitive long 75. */
    public static final long L_75 = 75;

    /** The primitive long 76. */
    public static final long L_76 = 76;

    /** The primitive long 77. */
    public static final long L_77 = 77;

    /** The primitive long 78. */
    public static final long L_78 = 78;

    /** The primitive long 79. */
    public static final long L_79 = 79;

    /** The primitive long 80. */
    public static final long L_80 = 80;

    /** The primitive long 81. */
    public static final long L_81 = 81;

    /** The primitive long 82. */
    public static final long L_82 = 82;

    /** The primitive long 83. */
    public static final long L_83 = 83;

    /** The primitive long 84. */
    public static final long L_84 = 84;

    /** The primitive long 85. */
    public static final long L_85 = 85;

    /** The primitive long 86. */
    public static final long L_86 = 86;

    /** The primitive long 87. */
    public static final long L_87 = 87;

    /** The primitive long 88. */
    public static final long L_88 = 88;

    /** The primitive long 89. */
    public static final long L_89 = 89;

    /** The primitive long 90. */
    public static final long L_90 = 90;

    /** The primitive long 91. */
    public static final long L_91 = 91;

    /** The primitive long 92. */
    public static final long L_92 = 92;

    /** The primitive long 93. */
    public static final long L_93 = 93;

    /** The primitive long 94. */
    public static final long L_94 = 94;

    /** The primitive long 95. */
    public static final long L_95 = 95;

    /** The primitive long 96. */
    public static final long L_96 = 96;

    /** The primitive long 97. */
    public static final long L_97 = 97;

    /** The primitive long 98. */
    public static final long L_98 = 98;

    /** The primitive long 99. */
    public static final long L_99 = 99;

    /** The primitive long 999. */
    public static final long L_999 = 999;

    /** The primitive long 9999. */
    public static final long L_9999 = 9999;

    /** A negative primitive long. */
    public static final long L_NEGATIVE = randomNegative();

    /** A positive primitive long. */
    public static final long L_POSITIVE = randomPositive();

    /** A random primitive long. */
    public static final long L_RANDOM = randomLong();

    /** A small primitive long between 0-100. */
    public static final long L_SMALL = randomPercent();

    /** Instantiate a utility to produce randomized Long objects. */
    public TestLong() {
        super(Long.class);
    }

    /**
     * Return a random long between two longs, inclusive.
     *
     * @param number1 a number
     * @param number2 another number
     *
     * @return the random long
     */
    public static long randomBetween(final long number1, final long number2) {
        final long min = min(number1, number2);
        final long max = max(number1, number2);

        return min + (long) ((max - min + 1) * Math.random());
    }

    /**
     * Return a random long.
     *
     * @return the long
     */
    public static long randomLong() {
        return INSTANCE.random();
    }

    /**
     * Return a random negative {@link Long}.
     *
     * @return the big decimal
     */
    public static long randomNegative() {
        return -abs(RANDOM.nextLong());
    }

    /**
     * Get a random number between 0 and 100.
     *
     * @return a number between 0 and 100 inclusive
     */
    public static long randomPercent() {
        return randomBetween(0, L_100);
    }

    /**
     * Return a random positive {@link Long}.
     *
     * @return the big decimal
     */
    public static long randomPositive() {
        return abs(RANDOM.nextLong());
    }

    /**
     * Return a random Long.
     *
     * @return the long
     */
    public Long random() {
        return RANDOM.nextLong();
    }
}

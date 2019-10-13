package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestRandom.RANDOM;
import static java.lang.Math.max;
import static java.lang.Math.min;

@SuppressWarnings({"WeakerAccess", "unused"})
public class RandomIntegerUtil extends AbstractTestUtil<Integer>
{

    /** Maximum digit value. */
    public static final int DIGIT_MAX = 9;

    /** Minimum digit value. */
    public static final int DIGIT_MIN = 0;

    /** A random Integer. */
    public final static Integer INTEGER = randomInt();

    /** The Integer 00. */
    public final static Integer INTEGER_00 = 0;

    /** The Integer 01. */
    public final static Integer INTEGER_01 = 1;

    /** The Integer 02. */
    public final static Integer INTEGER_02 = 2;

    /** The Integer 03. */
    public final static Integer INTEGER_03 = 3;

    /** The Integer 04. */
    public final static Integer INTEGER_04 = 4;

    /** The Integer 05. */
    public final static Integer INTEGER_05 = 5;

    /** The Integer 06. */
    public final static Integer INTEGER_06 = 6;

    /** The Integer 07. */
    public final static Integer INTEGER_07 = 7;

    /** The Integer 08. */
    public final static Integer INTEGER_08 = 8;

    /** The Integer 09. */
    public final static Integer INTEGER_09 = 9;

    /** The Integer 10. */
    public final static Integer INTEGER_10 = 10;

    /** The Integer 100. */
    public final static Integer INTEGER_100 = 100;

    /** The Integer 1000. */
    public final static Integer INTEGER_1000 = 1000;

    /** The Integer 10000. */
    public final static Integer INTEGER_10000 = 10000;

    /** The Integer 10001. */
    public final static Integer INTEGER_10001 = 10001;

    /** The Integer 1001. */
    public final static Integer INTEGER_1001 = 1001;

    /** The Integer 101. */
    public final static Integer INTEGER_101 = 101;

    /** The Integer 11. */
    public final static Integer INTEGER_11 = 11;

    /** The Integer 12. */
    public final static Integer INTEGER_12 = 12;

    /** The Integer 13. */
    public final static Integer INTEGER_13 = 13;

    /** The Integer 14. */
    public final static Integer INTEGER_14 = 14;

    /** The Integer 15. */
    public final static Integer INTEGER_15 = 15;

    /** The Integer 16. */
    public final static Integer INTEGER_16 = 16;

    /** The Integer 17. */
    public final static Integer INTEGER_17 = 17;

    /** The Integer 18. */
    public final static Integer INTEGER_18 = 18;

    /** The Integer 19. */
    public final static Integer INTEGER_19 = 19;

    /** The Integer 20. */
    public final static Integer INTEGER_20 = 20;

    /** The Integer 21. */
    public final static Integer INTEGER_21 = 21;

    /** The Integer 22. */
    public final static Integer INTEGER_22 = 22;

    /** The Integer 23. */
    public final static Integer INTEGER_23 = 23;

    /** The Integer 24. */
    public final static Integer INTEGER_24 = 24;

    /** The Integer 25. */
    public final static Integer INTEGER_25 = 25;

    /** The Integer 26. */
    public final static Integer INTEGER_26 = 26;

    /** The Integer 27. */
    public final static Integer INTEGER_27 = 27;

    /** The Integer 28. */
    public final static Integer INTEGER_28 = 28;

    /** The Integer 29. */
    public final static Integer INTEGER_29 = 29;

    /** The Integer 30. */
    public final static Integer INTEGER_30 = 30;

    /** The Integer 31. */
    public final static Integer INTEGER_31 = 31;

    /** The Integer 32. */
    public final static Integer INTEGER_32 = 32;

    /** The Integer 33. */
    public final static Integer INTEGER_33 = 33;

    /** The Integer 34. */
    public final static Integer INTEGER_34 = 34;

    /** The Integer 35. */
    public final static Integer INTEGER_35 = 35;

    /** The Integer 36. */
    public final static Integer INTEGER_36 = 36;

    /** The Integer 37. */
    public final static Integer INTEGER_37 = 37;

    /** The Integer 38. */
    public final static Integer INTEGER_38 = 38;

    /** The Integer 39. */
    public final static Integer INTEGER_39 = 39;

    /** The Integer 40. */
    public final static Integer INTEGER_40 = 40;

    /** The Integer 41. */
    public final static Integer INTEGER_41 = 41;

    /** The Integer 42. */
    public final static Integer INTEGER_42 = 42;

    /** The Integer 43. */
    public final static Integer INTEGER_43 = 43;

    /** The Integer 44. */
    public final static Integer INTEGER_44 = 44;

    /** The Integer 45. */
    public final static Integer INTEGER_45 = 45;

    /** The Integer 46. */
    public final static Integer INTEGER_46 = 46;

    /** The Integer 47. */
    public final static Integer INTEGER_47 = 47;

    /** The Integer 48. */
    public final static Integer INTEGER_48 = 48;

    /** The Integer 49. */
    public final static Integer INTEGER_49 = 49;

    /** The Integer 50. */
    public final static Integer INTEGER_50 = 50;

    /** The Integer 51. */
    public final static Integer INTEGER_51 = 51;

    /** The Integer 52. */
    public final static Integer INTEGER_52 = 52;

    /** The Integer 53. */
    public final static Integer INTEGER_53 = 53;

    /** The Integer 54. */
    public final static Integer INTEGER_54 = 54;

    /** The Integer 55. */
    public final static Integer INTEGER_55 = 55;

    /** The Integer 56. */
    public final static Integer INTEGER_56 = 56;

    /** The Integer 57. */
    public final static Integer INTEGER_57 = 57;

    /** The Integer 58. */
    public final static Integer INTEGER_58 = 58;

    /** The Integer 59. */
    public final static Integer INTEGER_59 = 59;

    /** The Integer 60. */
    public final static Integer INTEGER_60 = 60;

    /** The Integer 61. */
    public final static Integer INTEGER_61 = 61;

    /** The Integer 62. */
    public final static Integer INTEGER_62 = 62;

    /** The Integer 63. */
    public final static Integer INTEGER_63 = 63;

    /** The Integer 64. */
    public final static Integer INTEGER_64 = 64;

    /** The Integer 65. */
    public final static Integer INTEGER_65 = 65;

    /** The Integer 66. */
    public final static Integer INTEGER_66 = 66;

    /** The Integer 67. */
    public final static Integer INTEGER_67 = 67;

    /** The Integer 68. */
    public final static Integer INTEGER_68 = 68;

    /** The Integer 69. */
    public final static Integer INTEGER_69 = 69;

    /** The Integer 70. */
    public final static Integer INTEGER_70 = 70;

    /** The Integer 71. */
    public final static Integer INTEGER_71 = 71;

    /** The Integer 72. */
    public final static Integer INTEGER_72 = 72;

    /** The Integer 73. */
    public final static Integer INTEGER_73 = 73;

    /** The Integer 74. */
    public final static Integer INTEGER_74 = 74;

    /** The Integer 75. */
    public final static Integer INTEGER_75 = 75;

    /** The Integer 76. */
    public final static Integer INTEGER_76 = 76;

    /** The Integer 77. */
    public final static Integer INTEGER_77 = 77;

    /** The Integer 78. */
    public final static Integer INTEGER_78 = 78;

    /** The Integer 79. */
    public final static Integer INTEGER_79 = 79;

    /** The Integer 80. */
    public final static Integer INTEGER_80 = 80;

    /** The Integer 81. */
    public final static Integer INTEGER_81 = 81;

    /** The Integer 82. */
    public final static Integer INTEGER_82 = 82;

    /** The Integer 83. */
    public final static Integer INTEGER_83 = 83;

    /** The Integer 84. */
    public final static Integer INTEGER_84 = 84;

    /** The Integer 85. */
    public final static Integer INTEGER_85 = 85;

    /** The Integer 86. */
    public final static Integer INTEGER_86 = 86;

    /** The Integer 87. */
    public final static Integer INTEGER_87 = 87;

    /** The Integer 88. */
    public final static Integer INTEGER_88 = 88;

    /** The Integer 89. */
    public final static Integer INTEGER_89 = 89;

    /** The Integer 90. */
    public final static Integer INTEGER_90 = 90;

    /** The Integer 91. */
    public final static Integer INTEGER_91 = 91;

    /** The Integer 92. */
    public final static Integer INTEGER_92 = 92;

    /** The Integer 93. */
    public final static Integer INTEGER_93 = 93;

    /** The Integer 94. */
    public final static Integer INTEGER_94 = 94;

    /** The Integer 95. */
    public final static Integer INTEGER_95 = 95;

    /** The Integer 96. */
    public final static Integer INTEGER_96 = 96;

    /** The Integer 97. */
    public final static Integer INTEGER_97 = 97;

    /** The Integer 98. */
    public final static Integer INTEGER_98 = 98;

    /** The Integer 99. */
    public final static Integer INTEGER_99 = 99;

    /** The Integer 999. */
    public final static Integer INTEGER_999 = 999;

    /** The Integer 9999. */
    public final static Integer INTEGER_9999 = 9999;

    /** A negative Integer. */
    public final static Integer INTEGER_NEGATIVE = -Math.abs(randomInt());

    /** A positive Integer. */
    public final static Integer INTEGER_POSITIVE = Math.abs(randomInt());

    /** A random Integer. */
    public final static Integer INTEGER_RANDOM = randomInt();

    /** A small Integer between 0-100. */
    public final static Integer INTEGER_SMALL = randomBetween(0, 100);

    /** The primitive int 00. */
    public final static int INT_00 = 0;

    /** The primitive int 01. */
    public final static int INT_01 = 1;

    /** The primitive int 02. */
    public final static int INT_02 = 2;

    /** The primitive int 03. */
    public final static int INT_03 = 3;

    /** The primitive int 04. */
    public final static int INT_04 = 4;

    /** The primitive int 05. */
    public final static int INT_05 = 5;

    /** The primitive int 06. */
    public final static int INT_06 = 6;

    /** The primitive int 07. */
    public final static int INT_07 = 7;

    /** The primitive int 08. */
    public final static int INT_08 = 8;

    /** The primitive int 09. */
    public final static int INT_09 = 9;

    /** The primitive int 10. */
    public final static int INT_10 = 10;

    /** The primitive int 100. */
    public final static int INT_100 = 100;

    /** The primitive int 1000. */
    public final static int INT_1000 = 1000;

    /** The primitive int 10000. */
    public final static int INT_10000 = 10000;

    /** The primitive int 10001. */
    public final static int INT_10001 = 10001;

    /** The primitive int 1001. */
    public final static int INT_1001 = 1001;

    /** The primitive int 101. */
    public final static int INT_101 = 101;

    /** The primitive int 11. */
    public final static int INT_11 = 11;

    /** The primitive int 12. */
    public final static int INT_12 = 12;

    /** The primitive int 13. */
    public final static int INT_13 = 13;

    /** The primitive int 14. */
    public final static int INT_14 = 14;

    /** The primitive int 15. */
    public final static int INT_15 = 15;

    /** The primitive int 16. */
    public final static int INT_16 = 16;

    /** The primitive int 17. */
    public final static int INT_17 = 17;

    /** The primitive int 18. */
    public final static int INT_18 = 18;

    /** The primitive int 19. */
    public final static int INT_19 = 19;

    /** The primitive int 20. */
    public final static int INT_20 = 20;

    /** The primitive int 21. */
    public final static int INT_21 = 21;

    /** The primitive int 22. */
    public final static int INT_22 = 22;

    /** The primitive int 23. */
    public final static int INT_23 = 23;

    /** The primitive int 24. */
    public final static int INT_24 = 24;

    /** The primitive int 25. */
    public final static int INT_25 = 25;

    /** The primitive int 26. */
    public final static int INT_26 = 26;

    /** The primitive int 27. */
    public final static int INT_27 = 27;

    /** The primitive int 28. */
    public final static int INT_28 = 28;

    /** The primitive int 29. */
    public final static int INT_29 = 29;

    /** The primitive int 30. */
    public final static int INT_30 = 30;

    /** The primitive int 31. */
    public final static int INT_31 = 31;

    /** The primitive int 32. */
    public final static int INT_32 = 32;

    /** The primitive int 33. */
    public final static int INT_33 = 33;

    /** The primitive int 34. */
    public final static int INT_34 = 34;

    /** The primitive int 35. */
    public final static int INT_35 = 35;

    /** The primitive int 36. */
    public final static int INT_36 = 36;

    /** The primitive int 37. */
    public final static int INT_37 = 37;

    /** The primitive int 38. */
    public final static int INT_38 = 38;

    /** The primitive int 39. */
    public final static int INT_39 = 39;

    /** The primitive int 40. */
    public final static int INT_40 = 40;

    /** The primitive int 41. */
    public final static int INT_41 = 41;

    /** The primitive int 42. */
    public final static int INT_42 = 42;

    /** The primitive int 43. */
    public final static int INT_43 = 43;

    /** The primitive int 44. */
    public final static int INT_44 = 44;

    /** The primitive int 45. */
    public final static int INT_45 = 45;

    /** The primitive int 46. */
    public final static int INT_46 = 46;

    /** The primitive int 47. */
    public final static int INT_47 = 47;

    /** The primitive int 48. */
    public final static int INT_48 = 48;

    /** The primitive int 49. */
    public final static int INT_49 = 49;

    /** The primitive int 50. */
    public final static int INT_50 = 50;

    /** The primitive int 51. */
    public final static int INT_51 = 51;

    /** The primitive int 52. */
    public final static int INT_52 = 52;

    /** The primitive int 53. */
    public final static int INT_53 = 53;

    /** The primitive int 54. */
    public final static int INT_54 = 54;

    /** The primitive int 55. */
    public final static int INT_55 = 55;

    /** The primitive int 56. */
    public final static int INT_56 = 56;

    /** The primitive int 57. */
    public final static int INT_57 = 57;

    /** The primitive int 58. */
    public final static int INT_58 = 58;

    /** The primitive int 59. */
    public final static int INT_59 = 59;

    /** The primitive int 60. */
    public final static int INT_60 = 60;

    /** The primitive int 61. */
    public final static int INT_61 = 61;

    /** The primitive int 62. */
    public final static int INT_62 = 62;

    /** The primitive int 63. */
    public final static int INT_63 = 63;

    /** The primitive int 64. */
    public final static int INT_64 = 64;

    /** The primitive int 65. */
    public final static int INT_65 = 65;

    /** The primitive int 66. */
    public final static int INT_66 = 66;

    /** The primitive int 67. */
    public final static int INT_67 = 67;

    /** The primitive int 68. */
    public final static int INT_68 = 68;

    /** The primitive int 69. */
    public final static int INT_69 = 69;

    /** The primitive int 70. */
    public final static int INT_70 = 70;

    /** The primitive int 71. */
    public final static int INT_71 = 71;

    /** The primitive int 72. */
    public final static int INT_72 = 72;

    /** The primitive int 73. */
    public final static int INT_73 = 73;

    /** The primitive int 74. */
    public final static int INT_74 = 74;

    /** The primitive int 75. */
    public final static int INT_75 = 75;

    /** The primitive int 76. */
    public final static int INT_76 = 76;

    /** The primitive int 77. */
    public final static int INT_77 = 77;

    /** The primitive int 78. */
    public final static int INT_78 = 78;

    /** The primitive int 79. */
    public final static int INT_79 = 79;

    /** The primitive int 80. */
    public final static int INT_80 = 80;

    /** The primitive int 81. */
    public final static int INT_81 = 81;

    /** The primitive int 82. */
    public final static int INT_82 = 82;

    /** The primitive int 83. */
    public final static int INT_83 = 83;

    /** The primitive int 84. */
    public final static int INT_84 = 84;

    /** The primitive int 85. */
    public final static int INT_85 = 85;

    /** The primitive int 86. */
    public final static int INT_86 = 86;

    /** The primitive int 87. */
    public final static int INT_87 = 87;

    /** The primitive int 88. */
    public final static int INT_88 = 88;

    /** The primitive int 89. */
    public final static int INT_89 = 89;

    /** The primitive int 90. */
    public final static int INT_90 = 90;

    /** The primitive int 91. */
    public final static int INT_91 = 91;

    /** The primitive int 92. */
    public final static int INT_92 = 92;

    /** The primitive int 93. */
    public final static int INT_93 = 93;

    /** The primitive int 94. */
    public final static int INT_94 = 94;

    /** The primitive int 95. */
    public final static int INT_95 = 95;

    /** The primitive int 96. */
    public final static int INT_96 = 96;

    /** The primitive int 97. */
    public final static int INT_97 = 97;

    /** The primitive int 98. */
    public final static int INT_98 = 98;

    /** The primitive int 99. */
    public final static int INT_99 = 99;

    /** The primitive int 999. */
    public final static int INT_999 = 999;

    /** The primitive int 9999. */
    public final static int INT_9999 = 9999;

    /** A negative primitive int. */
    public final static int INT_NEGATIVE = -Math.abs(randomInt());

    /** A positive primitive int. */
    public final static int INT_POSITIVE = Math.abs(randomInt());

    /** A random primitive int. */
    public final static int INT_RANDOM = randomInt();

    /** A small primitive int between 0-100. */
    public final static int INT_SMALL = randomBetween(0, 100);

    /** Instantiate a utility to produce randomized Integer objects. */
    public RandomIntegerUtil()
    {
        super(Integer.class);
    }

    /**
     * Get a random digit between 0 and 10.
     *
     * @return a number between 0 to 10 inclusive
     */
    public static int random0to10()
    {
        return randomBetween(0, INT_10);
    }

    /**
     * Get a random number between 0 and 100.
     *
     * @return a number between 0 to 100 inclusive
     */
    public static int random0to100()
    {
        return randomBetween(0, INT_100);
    }

    /**
     * Get a random digit between 1 and 10.
     *
     * @return a number between 1 to 10 inclusive
     */
    public static int random1to10()
    {
        return randomBetween(INT_01, INT_10);
    }

    /**
     * Get a random number between 1 and 100.
     *
     * @return a number between 1 to 100 inclusive
     */
    public static int random1to100()
    {
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
    public static int randomBetween(final int number1, final int number2)
    {
        final int min = min(number1, number2);
        final int max = max(number1, number2);

        return min + (int) ((max - min + 1) * Math.random());
    }

    /**
     * Get a random digit.
     *
     * @return a number between 0 to 9 inclusive
     */
    public static int randomDigit()
    {
        return randomBetween(DIGIT_MIN, DIGIT_MAX);
    }

    /**
     * Return a random int.
     *
     * @return the int
     */
    public static int randomInt()
    {
        return RANDOM.nextInt();
    }

    /**
     * Return a random Integer.
     *
     * @return the Integer
     */
    public static Integer randomInteger()
    {
        return RANDOM.nextInt();
    }

    /**
     * Return a random Integer.
     *
     * @return the int
     */
    public Integer random()
    {
        return RANDOM.nextInt();
    }
}

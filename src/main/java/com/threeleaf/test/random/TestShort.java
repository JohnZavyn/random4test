package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestInteger.INT_100;
import static java.lang.Math.max;
import static java.lang.Math.min;

/** Utilities for random {@link Short} creation */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestShort extends AbstractTest<Short>
{

    /** The instance of {@link TestShort}. */
    public static final TestShort INSTANCE = new TestShort();

    /** A random Short. */
    public final static Short SHORT = randomShort();

    /** The Short 00. */
    public final static Short SHORT_00 = 0;

    /** The Short 01. */
    public final static Short SHORT_01 = 1;

    /** The Short 02. */
    public final static Short SHORT_02 = 2;

    /** The Short 03. */
    public final static Short SHORT_03 = 3;

    /** The Short 04. */
    public final static Short SHORT_04 = 4;

    /** The Short 05. */
    public final static Short SHORT_05 = 5;

    /** The Short 06. */
    public final static Short SHORT_06 = 6;

    /** The Short 07. */
    public final static Short SHORT_07 = 7;

    /** The Short 08. */
    public final static Short SHORT_08 = 8;

    /** The Short 09. */
    public final static Short SHORT_09 = 9;

    /** The Short 10. */
    public final static Short SHORT_10 = 10;

    /** The Short 100. */
    public final static Short SHORT_100 = 100;

    /** The Short 1000. */
    public final static Short SHORT_1000 = 1000;

    /** The Short 10000. */
    public final static Short SHORT_10000 = 10000;

    /** The Short 10001. */
    public final static Short SHORT_10001 = 10001;

    /** The Short 1001. */
    public final static Short SHORT_1001 = 1001;

    /** The Short 101. */
    public final static Short SHORT_101 = 101;

    /** The Short 11. */
    public final static Short SHORT_11 = 11;

    /** The Short 12. */
    public final static Short SHORT_12 = 12;

    /** The Short 13. */
    public final static Short SHORT_13 = 13;

    /** The Short 14. */
    public final static Short SHORT_14 = 14;

    /** The Short 15. */
    public final static Short SHORT_15 = 15;

    /** The Short 16. */
    public final static Short SHORT_16 = 16;

    /** The Short 17. */
    public final static Short SHORT_17 = 17;

    /** The Short 18. */
    public final static Short SHORT_18 = 18;

    /** The Short 19. */
    public final static Short SHORT_19 = 19;

    /** The Short 20. */
    public final static Short SHORT_20 = 20;

    /** The Short 21. */
    public final static Short SHORT_21 = 21;

    /** The Short 22. */
    public final static Short SHORT_22 = 22;

    /** The Short 23. */
    public final static Short SHORT_23 = 23;

    /** The Short 24. */
    public final static Short SHORT_24 = 24;

    /** The Short 25. */
    public final static Short SHORT_25 = 25;

    /** The Short 26. */
    public final static Short SHORT_26 = 26;

    /** The Short 27. */
    public final static Short SHORT_27 = 27;

    /** The Short 28. */
    public final static Short SHORT_28 = 28;

    /** The Short 29. */
    public final static Short SHORT_29 = 29;

    /** The Short 30. */
    public final static Short SHORT_30 = 30;

    /** The Short 31. */
    public final static Short SHORT_31 = 31;

    /** The Short 32. */
    public final static Short SHORT_32 = 32;

    /** The Short 33. */
    public final static Short SHORT_33 = 33;

    /** The Short 34. */
    public final static Short SHORT_34 = 34;

    /** The Short 35. */
    public final static Short SHORT_35 = 35;

    /** The Short 36. */
    public final static Short SHORT_36 = 36;

    /** The Short 37. */
    public final static Short SHORT_37 = 37;

    /** The Short 38. */
    public final static Short SHORT_38 = 38;

    /** The Short 39. */
    public final static Short SHORT_39 = 39;

    /** The Short 40. */
    public final static Short SHORT_40 = 40;

    /** The Short 41. */
    public final static Short SHORT_41 = 41;

    /** The Short 42. */
    public final static Short SHORT_42 = 42;

    /** The Short 43. */
    public final static Short SHORT_43 = 43;

    /** The Short 44. */
    public final static Short SHORT_44 = 44;

    /** The Short 45. */
    public final static Short SHORT_45 = 45;

    /** The Short 46. */
    public final static Short SHORT_46 = 46;

    /** The Short 47. */
    public final static Short SHORT_47 = 47;

    /** The Short 48. */
    public final static Short SHORT_48 = 48;

    /** The Short 49. */
    public final static Short SHORT_49 = 49;

    /** The Short 50. */
    public final static Short SHORT_50 = 50;

    /** The Short 51. */
    public final static Short SHORT_51 = 51;

    /** The Short 52. */
    public final static Short SHORT_52 = 52;

    /** The Short 53. */
    public final static Short SHORT_53 = 53;

    /** The Short 54. */
    public final static Short SHORT_54 = 54;

    /** The Short 55. */
    public final static Short SHORT_55 = 55;

    /** The Short 56. */
    public final static Short SHORT_56 = 56;

    /** The Short 57. */
    public final static Short SHORT_57 = 57;

    /** The Short 58. */
    public final static Short SHORT_58 = 58;

    /** The Short 59. */
    public final static Short SHORT_59 = 59;

    /** The Short 60. */
    public final static Short SHORT_60 = 60;

    /** The Short 61. */
    public final static Short SHORT_61 = 61;

    /** The Short 62. */
    public final static Short SHORT_62 = 62;

    /** The Short 63. */
    public final static Short SHORT_63 = 63;

    /** The Short 64. */
    public final static Short SHORT_64 = 64;

    /** The Short 65. */
    public final static Short SHORT_65 = 65;

    /** The Short 66. */
    public final static Short SHORT_66 = 66;

    /** The Short 67. */
    public final static Short SHORT_67 = 67;

    /** The Short 68. */
    public final static Short SHORT_68 = 68;

    /** The Short 69. */
    public final static Short SHORT_69 = 69;

    /** The Short 70. */
    public final static Short SHORT_70 = 70;

    /** The Short 71. */
    public final static Short SHORT_71 = 71;

    /** The Short 72. */
    public final static Short SHORT_72 = 72;

    /** The Short 73. */
    public final static Short SHORT_73 = 73;

    /** The Short 74. */
    public final static Short SHORT_74 = 74;

    /** The Short 75. */
    public final static Short SHORT_75 = 75;

    /** The Short 76. */
    public final static Short SHORT_76 = 76;

    /** The Short 77. */
    public final static Short SHORT_77 = 77;

    /** The Short 78. */
    public final static Short SHORT_78 = 78;

    /** The Short 79. */
    public final static Short SHORT_79 = 79;

    /** The Short 80. */
    public final static Short SHORT_80 = 80;

    /** The Short 81. */
    public final static Short SHORT_81 = 81;

    /** The Short 82. */
    public final static Short SHORT_82 = 82;

    /** The Short 83. */
    public final static Short SHORT_83 = 83;

    /** The Short 84. */
    public final static Short SHORT_84 = 84;

    /** The Short 85. */
    public final static Short SHORT_85 = 85;

    /** The Short 86. */
    public final static Short SHORT_86 = 86;

    /** The Short 87. */
    public final static Short SHORT_87 = 87;

    /** The Short 88. */
    public final static Short SHORT_88 = 88;

    /** The Short 89. */
    public final static Short SHORT_89 = 89;

    /** The Short 90. */
    public final static Short SHORT_90 = 90;

    /** The Short 91. */
    public final static Short SHORT_91 = 91;

    /** The Short 92. */
    public final static Short SHORT_92 = 92;

    /** The Short 93. */
    public final static Short SHORT_93 = 93;

    /** The Short 94. */
    public final static Short SHORT_94 = 94;

    /** The Short 95. */
    public final static Short SHORT_95 = 95;

    /** The Short 96. */
    public final static Short SHORT_96 = 96;

    /** The Short 97. */
    public final static Short SHORT_97 = 97;

    /** The Short 98. */
    public final static Short SHORT_98 = 98;

    /** The Short 99. */
    public final static Short SHORT_99 = 99;

    /** The Short 999. */
    public final static Short SHORT_999 = 999;

    /** The Short 9999. */
    public final static Short SHORT_9999 = 9999;

    /** A negative Short. */
    public final static Short SHORT_NEGATIVE = randomNegative();

    /** A positive Short. */
    public final static Short SHORT_POSITIVE = randomPositive();

    /** A random Short. */
    public final static Short SHORT_RANDOM = randomShort();

    /** A small Short between 0-100. */
    public final static Short SHORT_SMALL = randomPercent();

    /** The primitive short 00. */
    public final static short S_00 = 0;

    /** The primitive short 01. */
    public final static short S_01 = 1;

    /** The primitive short 02. */
    public final static short S_02 = 2;

    /** The primitive short 03. */
    public final static short S_03 = 3;

    /** The primitive short 04. */
    public final static short S_04 = 4;

    /** The primitive short 05. */
    public final static short S_05 = 5;

    /** The primitive short 06. */
    public final static short S_06 = 6;

    /** The primitive short 07. */
    public final static short S_07 = 7;

    /** The primitive short 08. */
    public final static short S_08 = 8;

    /** The primitive short 09. */
    public final static short S_09 = 9;

    /** The primitive short 10. */
    public final static short S_10 = 10;

    /** The primitive short 100. */
    public final static short S_100 = 100;

    /** The primitive short 1000. */
    public final static short S_1000 = 1000;

    /** The primitive short 10000. */
    public final static short S_10000 = 10000;

    /** The primitive short 10001. */
    public final static short S_10001 = 10001;

    /** The primitive short 1001. */
    public final static short S_1001 = 1001;

    /** The primitive short 101. */
    public final static short S_101 = 101;

    /** The primitive short 11. */
    public final static short S_11 = 11;

    /** The primitive short 12. */
    public final static short S_12 = 12;

    /** The primitive short 13. */
    public final static short S_13 = 13;

    /** The primitive short 14. */
    public final static short S_14 = 14;

    /** The primitive short 15. */
    public final static short S_15 = 15;

    /** The primitive short 16. */
    public final static short S_16 = 16;

    /** The primitive short 17. */
    public final static short S_17 = 17;

    /** The primitive short 18. */
    public final static short S_18 = 18;

    /** The primitive short 19. */
    public final static short S_19 = 19;

    /** The primitive short 20. */
    public final static short S_20 = 20;

    /** The primitive short 21. */
    public final static short S_21 = 21;

    /** The primitive short 22. */
    public final static short S_22 = 22;

    /** The primitive short 23. */
    public final static short S_23 = 23;

    /** The primitive short 24. */
    public final static short S_24 = 24;

    /** The primitive short 25. */
    public final static short S_25 = 25;

    /** The primitive short 26. */
    public final static short S_26 = 26;

    /** The primitive short 27. */
    public final static short S_27 = 27;

    /** The primitive short 28. */
    public final static short S_28 = 28;

    /** The primitive short 29. */
    public final static short S_29 = 29;

    /** The primitive short 30. */
    public final static short S_30 = 30;

    /** The primitive short 31. */
    public final static short S_31 = 31;

    /** The primitive short 32. */
    public final static short S_32 = 32;

    /** The primitive short 33. */
    public final static short S_33 = 33;

    /** The primitive short 34. */
    public final static short S_34 = 34;

    /** The primitive short 35. */
    public final static short S_35 = 35;

    /** The primitive short 36. */
    public final static short S_36 = 36;

    /** The primitive short 37. */
    public final static short S_37 = 37;

    /** The primitive short 38. */
    public final static short S_38 = 38;

    /** The primitive short 39. */
    public final static short S_39 = 39;

    /** The primitive short 40. */
    public final static short S_40 = 40;

    /** The primitive short 41. */
    public final static short S_41 = 41;

    /** The primitive short 42. */
    public final static short S_42 = 42;

    /** The primitive short 43. */
    public final static short S_43 = 43;

    /** The primitive short 44. */
    public final static short S_44 = 44;

    /** The primitive short 45. */
    public final static short S_45 = 45;

    /** The primitive short 46. */
    public final static short S_46 = 46;

    /** The primitive short 47. */
    public final static short S_47 = 47;

    /** The primitive short 48. */
    public final static short S_48 = 48;

    /** The primitive short 49. */
    public final static short S_49 = 49;

    /** The primitive short 50. */
    public final static short S_50 = 50;

    /** The primitive short 51. */
    public final static short S_51 = 51;

    /** The primitive short 52. */
    public final static short S_52 = 52;

    /** The primitive short 53. */
    public final static short S_53 = 53;

    /** The primitive short 54. */
    public final static short S_54 = 54;

    /** The primitive short 55. */
    public final static short S_55 = 55;

    /** The primitive short 56. */
    public final static short S_56 = 56;

    /** The primitive short 57. */
    public final static short S_57 = 57;

    /** The primitive short 58. */
    public final static short S_58 = 58;

    /** The primitive short 59. */
    public final static short S_59 = 59;

    /** The primitive short 60. */
    public final static short S_60 = 60;

    /** The primitive short 61. */
    public final static short S_61 = 61;

    /** The primitive short 62. */
    public final static short S_62 = 62;

    /** The primitive short 63. */
    public final static short S_63 = 63;

    /** The primitive short 64. */
    public final static short S_64 = 64;

    /** The primitive short 65. */
    public final static short S_65 = 65;

    /** The primitive short 66. */
    public final static short S_66 = 66;

    /** The primitive short 67. */
    public final static short S_67 = 67;

    /** The primitive short 68. */
    public final static short S_68 = 68;

    /** The primitive short 69. */
    public final static short S_69 = 69;

    /** The primitive short 70. */
    public final static short S_70 = 70;

    /** The primitive short 71. */
    public final static short S_71 = 71;

    /** The primitive short 72. */
    public final static short S_72 = 72;

    /** The primitive short 73. */
    public final static short S_73 = 73;

    /** The primitive short 74. */
    public final static short S_74 = 74;

    /** The primitive short 75. */
    public final static short S_75 = 75;

    /** The primitive short 76. */
    public final static short S_76 = 76;

    /** The primitive short 77. */
    public final static short S_77 = 77;

    /** The primitive short 78. */
    public final static short S_78 = 78;

    /** The primitive short 79. */
    public final static short S_79 = 79;

    /** The primitive short 80. */
    public final static short S_80 = 80;

    /** The primitive short 81. */
    public final static short S_81 = 81;

    /** The primitive short 82. */
    public final static short S_82 = 82;

    /** The primitive short 83. */
    public final static short S_83 = 83;

    /** The primitive short 84. */
    public final static short S_84 = 84;

    /** The primitive short 85. */
    public final static short S_85 = 85;

    /** The primitive short 86. */
    public final static short S_86 = 86;

    /** The primitive short 87. */
    public final static short S_87 = 87;

    /** The primitive short 88. */
    public final static short S_88 = 88;

    /** The primitive short 89. */
    public final static short S_89 = 89;

    /** The primitive short 90. */
    public final static short S_90 = 90;

    /** The primitive short 91. */
    public final static short S_91 = 91;

    /** The primitive short 92. */
    public final static short S_92 = 92;

    /** The primitive short 93. */
    public final static short S_93 = 93;

    /** The primitive short 94. */
    public final static short S_94 = 94;

    /** The primitive short 95. */
    public final static short S_95 = 95;

    /** The primitive short 96. */
    public final static short S_96 = 96;

    /** The primitive short 97. */
    public final static short S_97 = 97;

    /** The primitive short 98. */
    public final static short S_98 = 98;

    /** The primitive short 99. */
    public final static short S_99 = 99;

    /** The primitive short 999. */
    public final static short S_999 = 999;

    /** The primitive short 9999. */
    public final static short S_9999 = 9999;

    /** A negative primitive short. */
    public final static short S_NEGATIVE = randomNegative();

    /** A positive primitive short. */
    public final static short S_POSITIVE = randomPositive();

    /** A random primitive short. */
    public final static short S_RANDOM = randomShort();

    /** A small primitive short between 0-100. */
    public final static short S_SMALL = randomPercent();

    /** Instantiate a utility to produce randomized {@link Short} objects. */
    public TestShort()
    {
        super(Short.class);
    }

    /**
     * Return a random short between two shorts, inclusive.
     *
     * @param number1 a number
     * @param number2 another number
     *
     * @return the random short
     */
    public static short randomBetween(final int number1, final int number2)
    {
        final int min = min(number1, number2);
        final int max = max(number1, number2);

        return (short) (min + ((max - min + 1) * Math.random()));
    }

    /**
     * Return a random negative {@link Short}.
     *
     * @return the big decimal
     */
    public static short randomNegative()
    {
        return randomBetween(Short.MIN_VALUE, -1);
    }

    /**
     * Get a random number between 0 and 100.
     *
     * @return a number between 0 and 100 inclusive
     */
    public static short randomPercent()
    {
        return randomBetween(0, INT_100);
    }

    /**
     * Return a random positive {@link Short}.
     *
     * @return the big decimal
     */
    public static short randomPositive()
    {
        return randomBetween(INT_01, Short.MAX_VALUE);
    }

    /**
     * Return a random short.
     *
     * @return the short
     */
    public static short randomShort()
    {
        return INSTANCE.random();
    }

    /**
     * Return a random short.
     *
     * @return the short
     */
    public Short random()
    {
        return randomBetween(Short.MIN_VALUE, Short.MAX_VALUE);
    }
}

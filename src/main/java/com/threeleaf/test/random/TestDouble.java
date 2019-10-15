package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestInteger.INT_100;
import static com.threeleaf.test.random.TestRandom.RANDOM;
import static java.lang.Math.max;
import static java.lang.Math.min;

/** Utilities for random {@link Double} creation */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestDouble extends AbstractTest<Double>
{

    /** The Double 00. */
    public final static Double DOUBLE_00 = 0D;

    /** The Double 01. */
    public final static Double DOUBLE_01 = 1D;

    /** The Double 02. */
    public final static Double DOUBLE_02 = 2D;

    /** The Double 03. */
    public final static Double DOUBLE_03 = 3D;

    /** The Double 04. */
    public final static Double DOUBLE_04 = 4D;

    /** The Double 05. */
    public final static Double DOUBLE_05 = 5D;

    /** The Double 06. */
    public final static Double DOUBLE_06 = 6D;

    /** The Double 07. */
    public final static Double DOUBLE_07 = 7D;

    /** The Double 08. */
    public final static Double DOUBLE_08 = 8D;

    /** The Double 09. */
    public final static Double DOUBLE_09 = 9D;

    /** The Double 10. */
    public final static Double DOUBLE_10 = 10D;

    /** The Double 100. */
    public final static Double DOUBLE_100 = 100D;

    /** The Double 1000. */
    public final static Double DOUBLE_1000 = 1000D;

    /** The Double 10000. */
    public final static Double DOUBLE_10000 = 10000D;

    /** The Double 10001. */
    public final static Double DOUBLE_10001 = 10001D;

    /** The Double 1001. */
    public final static Double DOUBLE_1001 = 1001D;

    /** The Double 101. */
    public final static Double DOUBLE_101 = 101D;

    /** The Double 11. */
    public final static Double DOUBLE_11 = 11D;

    /** The Double 12. */
    public final static Double DOUBLE_12 = 12D;

    /** The Double 13. */
    public final static Double DOUBLE_13 = 13D;

    /** The Double 14. */
    public final static Double DOUBLE_14 = 14D;

    /** The Double 15. */
    public final static Double DOUBLE_15 = 15D;

    /** The Double 16. */
    public final static Double DOUBLE_16 = 16D;

    /** The Double 17. */
    public final static Double DOUBLE_17 = 17D;

    /** The Double 18. */
    public final static Double DOUBLE_18 = 18D;

    /** The Double 19. */
    public final static Double DOUBLE_19 = 19D;

    /** The Double 20. */
    public final static Double DOUBLE_20 = 20D;

    /** The Double 21. */
    public final static Double DOUBLE_21 = 21D;

    /** The Double 22. */
    public final static Double DOUBLE_22 = 22D;

    /** The Double 23. */
    public final static Double DOUBLE_23 = 23D;

    /** The Double 24. */
    public final static Double DOUBLE_24 = 24D;

    /** The Double 25. */
    public final static Double DOUBLE_25 = 25D;

    /** The Double 26. */
    public final static Double DOUBLE_26 = 26D;

    /** The Double 27. */
    public final static Double DOUBLE_27 = 27D;

    /** The Double 28. */
    public final static Double DOUBLE_28 = 28D;

    /** The Double 29. */
    public final static Double DOUBLE_29 = 29D;

    /** The Double 30. */
    public final static Double DOUBLE_30 = 30D;

    /** The Double 31. */
    public final static Double DOUBLE_31 = 31D;

    /** The Double 32. */
    public final static Double DOUBLE_32 = 32D;

    /** The Double 33. */
    public final static Double DOUBLE_33 = 33D;

    /** The Double 34. */
    public final static Double DOUBLE_34 = 34D;

    /** The Double 35. */
    public final static Double DOUBLE_35 = 35D;

    /** The Double 36. */
    public final static Double DOUBLE_36 = 36D;

    /** The Double 37. */
    public final static Double DOUBLE_37 = 37D;

    /** The Double 38. */
    public final static Double DOUBLE_38 = 38D;

    /** The Double 39. */
    public final static Double DOUBLE_39 = 39D;

    /** The Double 40. */
    public final static Double DOUBLE_40 = 40D;

    /** The Double 41. */
    public final static Double DOUBLE_41 = 41D;

    /** The Double 42. */
    public final static Double DOUBLE_42 = 42D;

    /** The Double 43. */
    public final static Double DOUBLE_43 = 43D;

    /** The Double 44. */
    public final static Double DOUBLE_44 = 44D;

    /** The Double 45. */
    public final static Double DOUBLE_45 = 45D;

    /** The Double 46. */
    public final static Double DOUBLE_46 = 46D;

    /** The Double 47. */
    public final static Double DOUBLE_47 = 47D;

    /** The Double 48. */
    public final static Double DOUBLE_48 = 48D;

    /** The Double 49. */
    public final static Double DOUBLE_49 = 49D;

    /** The Double 50. */
    public final static Double DOUBLE_50 = 50D;

    /** The Double 51. */
    public final static Double DOUBLE_51 = 51D;

    /** The Double 52. */
    public final static Double DOUBLE_52 = 52D;

    /** The Double 53. */
    public final static Double DOUBLE_53 = 53D;

    /** The Double 54. */
    public final static Double DOUBLE_54 = 54D;

    /** The Double 55. */
    public final static Double DOUBLE_55 = 55D;

    /** The Double 56. */
    public final static Double DOUBLE_56 = 56D;

    /** The Double 57. */
    public final static Double DOUBLE_57 = 57D;

    /** The Double 58. */
    public final static Double DOUBLE_58 = 58D;

    /** The Double 59. */
    public final static Double DOUBLE_59 = 59D;

    /** The Double 60. */
    public final static Double DOUBLE_60 = 60D;

    /** The Double 61. */
    public final static Double DOUBLE_61 = 61D;

    /** The Double 62. */
    public final static Double DOUBLE_62 = 62D;

    /** The Double 63. */
    public final static Double DOUBLE_63 = 63D;

    /** The Double 64. */
    public final static Double DOUBLE_64 = 64D;

    /** The Double 65. */
    public final static Double DOUBLE_65 = 65D;

    /** The Double 66. */
    public final static Double DOUBLE_66 = 66D;

    /** The Double 67. */
    public final static Double DOUBLE_67 = 67D;

    /** The Double 68. */
    public final static Double DOUBLE_68 = 68D;

    /** The Double 69. */
    public final static Double DOUBLE_69 = 69D;

    /** The Double 70. */
    public final static Double DOUBLE_70 = 70D;

    /** The Double 71. */
    public final static Double DOUBLE_71 = 71D;

    /** The Double 72. */
    public final static Double DOUBLE_72 = 72D;

    /** The Double 73. */
    public final static Double DOUBLE_73 = 73D;

    /** The Double 74. */
    public final static Double DOUBLE_74 = 74D;

    /** The Double 75. */
    public final static Double DOUBLE_75 = 75D;

    /** The Double 76. */
    public final static Double DOUBLE_76 = 76D;

    /** The Double 77. */
    public final static Double DOUBLE_77 = 77D;

    /** The Double 78. */
    public final static Double DOUBLE_78 = 78D;

    /** The Double 79. */
    public final static Double DOUBLE_79 = 79D;

    /** The Double 80. */
    public final static Double DOUBLE_80 = 80D;

    /** The Double 81. */
    public final static Double DOUBLE_81 = 81D;

    /** The Double 82. */
    public final static Double DOUBLE_82 = 82D;

    /** The Double 83. */
    public final static Double DOUBLE_83 = 83D;

    /** The Double 84. */
    public final static Double DOUBLE_84 = 84D;

    /** The Double 85. */
    public final static Double DOUBLE_85 = 85D;

    /** The Double 86. */
    public final static Double DOUBLE_86 = 86D;

    /** The Double 87. */
    public final static Double DOUBLE_87 = 87D;

    /** The Double 88. */
    public final static Double DOUBLE_88 = 88D;

    /** The Double 89. */
    public final static Double DOUBLE_89 = 89D;

    /** The Double 90. */
    public final static Double DOUBLE_90 = 90D;

    /** The Double 91. */
    public final static Double DOUBLE_91 = 91D;

    /** The Double 92. */
    public final static Double DOUBLE_92 = 92D;

    /** The Double 93. */
    public final static Double DOUBLE_93 = 93D;

    /** The Double 94. */
    public final static Double DOUBLE_94 = 94D;

    /** The Double 95. */
    public final static Double DOUBLE_95 = 95D;

    /** The Double 96. */
    public final static Double DOUBLE_96 = 96D;

    /** The Double 97. */
    public final static Double DOUBLE_97 = 97D;

    /** The Double 98. */
    public final static Double DOUBLE_98 = 98D;

    /** The Double 99. */
    public final static Double DOUBLE_99 = 99D;

    /** The Double 999. */
    public final static Double DOUBLE_999 = 999D;

    /** The Double 9999. */
    public final static Double DOUBLE_9999 = 9999D;

    /** A known double. */
    public static final Double DOUBLE_FIXED = 12345.67890;

    /** A negative Double. */
    public final static Double DOUBLE_NEGATIVE = randomNegative();

    /** A positive Double. */
    public final static Double DOUBLE_POSITIVE = randomPositive();

    /** A small Double between 0-100. */
    public final static Double DOUBLE_SMALL = randomPercent();

    /** The primitive double 00. */
    public final static double D_00 = 0;

    /** The primitive double 01. */
    public final static double D_01 = 1;

    /** The primitive double 02. */
    public final static double D_02 = 2;

    /** The primitive double 03. */
    public final static double D_03 = 3;

    /** The primitive double 04. */
    public final static double D_04 = 4;

    /** The primitive double 05. */
    public final static double D_05 = 5;

    /** The primitive double 06. */
    public final static double D_06 = 6;

    /** The primitive double 07. */
    public final static double D_07 = 7;

    /** The primitive double 08. */
    public final static double D_08 = 8;

    /** The primitive double 09. */
    public final static double D_09 = 9;

    /** The primitive double 10. */
    public final static double D_10 = 10;

    /** The primitive double 100. */
    public final static double D_100 = 100;

    /** The primitive double 1000. */
    public final static double D_1000 = 1000;

    /** The primitive double 10000. */
    public final static double D_10000 = 10000;

    /** The primitive double 10001. */
    public final static double D_10001 = 10001;

    /** The primitive double 1001. */
    public final static double D_1001 = 1001;

    /** The primitive double 101. */
    public final static double D_101 = 101;

    /** The primitive double 11. */
    public final static double D_11 = 11;

    /** The primitive double 12. */
    public final static double D_12 = 12;

    /** The primitive double 13. */
    public final static double D_13 = 13;

    /** The primitive double 14. */
    public final static double D_14 = 14;

    /** The primitive double 15. */
    public final static double D_15 = 15;

    /** The primitive double 16. */
    public final static double D_16 = 16;

    /** The primitive double 17. */
    public final static double D_17 = 17;

    /** The primitive double 18. */
    public final static double D_18 = 18;

    /** The primitive double 19. */
    public final static double D_19 = 19;

    /** The primitive double 20. */
    public final static double D_20 = 20;

    /** The primitive double 21. */
    public final static double D_21 = 21;

    /** The primitive double 22. */
    public final static double D_22 = 22;

    /** The primitive double 23. */
    public final static double D_23 = 23;

    /** The primitive double 24. */
    public final static double D_24 = 24;

    /** The primitive double 25. */
    public final static double D_25 = 25;

    /** The primitive double 26. */
    public final static double D_26 = 26;

    /** The primitive double 27. */
    public final static double D_27 = 27;

    /** The primitive double 28. */
    public final static double D_28 = 28;

    /** The primitive double 29. */
    public final static double D_29 = 29;

    /** The primitive double 30. */
    public final static double D_30 = 30;

    /** The primitive double 31. */
    public final static double D_31 = 31;

    /** The primitive double 32. */
    public final static double D_32 = 32;

    /** The primitive double 33. */
    public final static double D_33 = 33;

    /** The primitive double 34. */
    public final static double D_34 = 34;

    /** The primitive double 35. */
    public final static double D_35 = 35;

    /** The primitive double 36. */
    public final static double D_36 = 36;

    /** The primitive double 37. */
    public final static double D_37 = 37;

    /** The primitive double 38. */
    public final static double D_38 = 38;

    /** The primitive double 39. */
    public final static double D_39 = 39;

    /** The primitive double 40. */
    public final static double D_40 = 40;

    /** The primitive double 41. */
    public final static double D_41 = 41;

    /** The primitive double 42. */
    public final static double D_42 = 42;

    /** The primitive double 43. */
    public final static double D_43 = 43;

    /** The primitive double 44. */
    public final static double D_44 = 44;

    /** The primitive double 45. */
    public final static double D_45 = 45;

    /** The primitive double 46. */
    public final static double D_46 = 46;

    /** The primitive double 47. */
    public final static double D_47 = 47;

    /** The primitive double 48. */
    public final static double D_48 = 48;

    /** The primitive double 49. */
    public final static double D_49 = 49;

    /** The primitive double 50. */
    public final static double D_50 = 50;

    /** The primitive double 51. */
    public final static double D_51 = 51;

    /** The primitive double 52. */
    public final static double D_52 = 52;

    /** The primitive double 53. */
    public final static double D_53 = 53;

    /** The primitive double 54. */
    public final static double D_54 = 54;

    /** The primitive double 55. */
    public final static double D_55 = 55;

    /** The primitive double 56. */
    public final static double D_56 = 56;

    /** The primitive double 57. */
    public final static double D_57 = 57;

    /** The primitive double 58. */
    public final static double D_58 = 58;

    /** The primitive double 59. */
    public final static double D_59 = 59;

    /** The primitive double 60. */
    public final static double D_60 = 60;

    /** The primitive double 61. */
    public final static double D_61 = 61;

    /** The primitive double 62. */
    public final static double D_62 = 62;

    /** The primitive double 63. */
    public final static double D_63 = 63;

    /** The primitive double 64. */
    public final static double D_64 = 64;

    /** The primitive double 65. */
    public final static double D_65 = 65;

    /** The primitive double 66. */
    public final static double D_66 = 66;

    /** The primitive double 67. */
    public final static double D_67 = 67;

    /** The primitive double 68. */
    public final static double D_68 = 68;

    /** The primitive double 69. */
    public final static double D_69 = 69;

    /** The primitive double 70. */
    public final static double D_70 = 70;

    /** The primitive double 71. */
    public final static double D_71 = 71;

    /** The primitive double 72. */
    public final static double D_72 = 72;

    /** The primitive double 73. */
    public final static double D_73 = 73;

    /** The primitive double 74. */
    public final static double D_74 = 74;

    /** The primitive double 75. */
    public final static double D_75 = 75;

    /** The primitive double 76. */
    public final static double D_76 = 76;

    /** The primitive double 77. */
    public final static double D_77 = 77;

    /** The primitive double 78. */
    public final static double D_78 = 78;

    /** The primitive double 79. */
    public final static double D_79 = 79;

    /** The primitive double 80. */
    public final static double D_80 = 80;

    /** The primitive double 81. */
    public final static double D_81 = 81;

    /** The primitive double 82. */
    public final static double D_82 = 82;

    /** The primitive double 83. */
    public final static double D_83 = 83;

    /** The primitive double 84. */
    public final static double D_84 = 84;

    /** The primitive double 85. */
    public final static double D_85 = 85;

    /** The primitive double 86. */
    public final static double D_86 = 86;

    /** The primitive double 87. */
    public final static double D_87 = 87;

    /** The primitive double 88. */
    public final static double D_88 = 88;

    /** The primitive double 89. */
    public final static double D_89 = 89;

    /** The primitive double 90. */
    public final static double D_90 = 90;

    /** The primitive double 91. */
    public final static double D_91 = 91;

    /** The primitive double 92. */
    public final static double D_92 = 92;

    /** The primitive double 93. */
    public final static double D_93 = 93;

    /** The primitive double 94. */
    public final static double D_94 = 94;

    /** The primitive double 95. */
    public final static double D_95 = 95;

    /** The primitive double 96. */
    public final static double D_96 = 96;

    /** The primitive double 97. */
    public final static double D_97 = 97;

    /** The primitive double 98. */
    public final static double D_98 = 98;

    /** The primitive double 99. */
    public final static double D_99 = 99;

    /** The primitive double 999. */
    public final static double D_999 = 999;

    /** The primitive double 9999. */
    public final static double D_9999 = 9999;

    /** A negative primitive double. */
    public final static double D_NEGATIVE = randomNegative();

    /** A positive primitive double. */
    public final static double D_POSITIVE = randomPositive();

    /** A small primitive double between 0-100. */
    public final static double D_SMALL = randomPercent();

    /** The instance of {@link TestDouble}. */
    public static final TestDouble INSTANCE = new TestDouble();

    /** A random Double. */
    public final static Double DOUBLE = randomDouble();

    /** A random Double. */
    public final static Double DOUBLE_RANDOM = randomDouble();

    /** A random primitive double. */
    public final static double D_RANDOM = randomDouble();

    /** Instantiate a utility to produce randomized {@link Double} objects. */
    public TestDouble()
    {
        super(Double.class);
    }

    /**
     * Return a random double between two doubles, inclusive.
     *
     * @param number1 a number
     * @param number2 another number
     *
     * @return the random double
     */
    public static double randomBetween(final double number1, final double number2)
    {
        final double min = min(number1, number2);
        final double max = max(number1, number2);

        return min + ((max - min) * Math.random());
    }

    /**
     * Return a random double.
     *
     * @return the double
     */
    public static double randomDouble()
    {
        return INSTANCE.random();
    }

    /**
     * Return a random negative {@link Double}.
     *
     * @return the big decimal
     */
    public static double randomNegative()
    {
        return -randomPositive();
    }

    /**
     * Get a random number between 0 and 100.
     *
     * @return a number between 0 and 100 inclusive
     */
    public static double randomPercent()
    {
        return randomBetween(0, INT_100);
    }

    /**
     * Return a random positive {@link Double}.
     *
     * @return the big decimal
     */
    public static double randomPositive()
    {
        return randomBetween(INT_01, Double.MAX_VALUE);
    }

    /**
     * Return a random double.
     *
     * @return the double
     */
    public Double random()
    {
        return RANDOM.nextDouble();
    }
}

/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestInteger.INT_100;
import static com.threeleaf.test.random.TestRandom.RANDOM;
import static java.lang.Math.max;
import static java.lang.Math.min;

/** Utilities for random {@link Double} creation. */
@SuppressWarnings({"WeakerAccess", "unused", "RedundantSuppression"})
public class TestDouble extends AbstractRandom<Double> {

    /** The Double 00. */
    public static final Double DOUBLE_00 = 0D;

    /** The Double 01. */
    public static final Double DOUBLE_01 = 1D;

    /** The Double 02. */
    public static final Double DOUBLE_02 = 2D;

    /** The Double 03. */
    public static final Double DOUBLE_03 = 3D;

    /** The Double 04. */
    public static final Double DOUBLE_04 = 4D;

    /** The Double 05. */
    public static final Double DOUBLE_05 = 5D;

    /** The Double 06. */
    public static final Double DOUBLE_06 = 6D;

    /** The Double 07. */
    public static final Double DOUBLE_07 = 7D;

    /** The Double 08. */
    public static final Double DOUBLE_08 = 8D;

    /** The Double 09. */
    public static final Double DOUBLE_09 = 9D;

    /** The Double 10. */
    public static final Double DOUBLE_10 = 10D;

    /** The Double 100. */
    public static final Double DOUBLE_100 = 100D;

    /** The Double 1000. */
    public static final Double DOUBLE_1000 = 1000D;

    /** The Double 10000. */
    public static final Double DOUBLE_10000 = 10000D;

    /** The Double 10001. */
    public static final Double DOUBLE_10001 = 10001D;

    /** The Double 1001. */
    public static final Double DOUBLE_1001 = 1001D;

    /** The Double 101. */
    public static final Double DOUBLE_101 = 101D;

    /** The Double 11. */
    public static final Double DOUBLE_11 = 11D;

    /** The Double 12. */
    public static final Double DOUBLE_12 = 12D;

    /** The Double 13. */
    public static final Double DOUBLE_13 = 13D;

    /** The Double 14. */
    public static final Double DOUBLE_14 = 14D;

    /** The Double 15. */
    public static final Double DOUBLE_15 = 15D;

    /** The Double 16. */
    public static final Double DOUBLE_16 = 16D;

    /** The Double 17. */
    public static final Double DOUBLE_17 = 17D;

    /** The Double 18. */
    public static final Double DOUBLE_18 = 18D;

    /** The Double 19. */
    public static final Double DOUBLE_19 = 19D;

    /** The Double 20. */
    public static final Double DOUBLE_20 = 20D;

    /** The Double 21. */
    public static final Double DOUBLE_21 = 21D;

    /** The Double 22. */
    public static final Double DOUBLE_22 = 22D;

    /** The Double 23. */
    public static final Double DOUBLE_23 = 23D;

    /** The Double 24. */
    public static final Double DOUBLE_24 = 24D;

    /** The Double 25. */
    public static final Double DOUBLE_25 = 25D;

    /** The Double 26. */
    public static final Double DOUBLE_26 = 26D;

    /** The Double 27. */
    public static final Double DOUBLE_27 = 27D;

    /** The Double 28. */
    public static final Double DOUBLE_28 = 28D;

    /** The Double 29. */
    public static final Double DOUBLE_29 = 29D;

    /** The Double 30. */
    public static final Double DOUBLE_30 = 30D;

    /** The Double 31. */
    public static final Double DOUBLE_31 = 31D;

    /** The Double 32. */
    public static final Double DOUBLE_32 = 32D;

    /** The Double 33. */
    public static final Double DOUBLE_33 = 33D;

    /** The Double 34. */
    public static final Double DOUBLE_34 = 34D;

    /** The Double 35. */
    public static final Double DOUBLE_35 = 35D;

    /** The Double 36. */
    public static final Double DOUBLE_36 = 36D;

    /** The Double 37. */
    public static final Double DOUBLE_37 = 37D;

    /** The Double 38. */
    public static final Double DOUBLE_38 = 38D;

    /** The Double 39. */
    public static final Double DOUBLE_39 = 39D;

    /** The Double 40. */
    public static final Double DOUBLE_40 = 40D;

    /** The Double 41. */
    public static final Double DOUBLE_41 = 41D;

    /** The Double 42. */
    public static final Double DOUBLE_42 = 42D;

    /** The Double 43. */
    public static final Double DOUBLE_43 = 43D;

    /** The Double 44. */
    public static final Double DOUBLE_44 = 44D;

    /** The Double 45. */
    public static final Double DOUBLE_45 = 45D;

    /** The Double 46. */
    public static final Double DOUBLE_46 = 46D;

    /** The Double 47. */
    public static final Double DOUBLE_47 = 47D;

    /** The Double 48. */
    public static final Double DOUBLE_48 = 48D;

    /** The Double 49. */
    public static final Double DOUBLE_49 = 49D;

    /** The Double 50. */
    public static final Double DOUBLE_50 = 50D;

    /** The Double 51. */
    public static final Double DOUBLE_51 = 51D;

    /** The Double 52. */
    public static final Double DOUBLE_52 = 52D;

    /** The Double 53. */
    public static final Double DOUBLE_53 = 53D;

    /** The Double 54. */
    public static final Double DOUBLE_54 = 54D;

    /** The Double 55. */
    public static final Double DOUBLE_55 = 55D;

    /** The Double 56. */
    public static final Double DOUBLE_56 = 56D;

    /** The Double 57. */
    public static final Double DOUBLE_57 = 57D;

    /** The Double 58. */
    public static final Double DOUBLE_58 = 58D;

    /** The Double 59. */
    public static final Double DOUBLE_59 = 59D;

    /** The Double 60. */
    public static final Double DOUBLE_60 = 60D;

    /** The Double 61. */
    public static final Double DOUBLE_61 = 61D;

    /** The Double 62. */
    public static final Double DOUBLE_62 = 62D;

    /** The Double 63. */
    public static final Double DOUBLE_63 = 63D;

    /** The Double 64. */
    public static final Double DOUBLE_64 = 64D;

    /** The Double 65. */
    public static final Double DOUBLE_65 = 65D;

    /** The Double 66. */
    public static final Double DOUBLE_66 = 66D;

    /** The Double 67. */
    public static final Double DOUBLE_67 = 67D;

    /** The Double 68. */
    public static final Double DOUBLE_68 = 68D;

    /** The Double 69. */
    public static final Double DOUBLE_69 = 69D;

    /** The Double 70. */
    public static final Double DOUBLE_70 = 70D;

    /** The Double 71. */
    public static final Double DOUBLE_71 = 71D;

    /** The Double 72. */
    public static final Double DOUBLE_72 = 72D;

    /** The Double 73. */
    public static final Double DOUBLE_73 = 73D;

    /** The Double 74. */
    public static final Double DOUBLE_74 = 74D;

    /** The Double 75. */
    public static final Double DOUBLE_75 = 75D;

    /** The Double 76. */
    public static final Double DOUBLE_76 = 76D;

    /** The Double 77. */
    public static final Double DOUBLE_77 = 77D;

    /** The Double 78. */
    public static final Double DOUBLE_78 = 78D;

    /** The Double 79. */
    public static final Double DOUBLE_79 = 79D;

    /** The Double 80. */
    public static final Double DOUBLE_80 = 80D;

    /** The Double 81. */
    public static final Double DOUBLE_81 = 81D;

    /** The Double 82. */
    public static final Double DOUBLE_82 = 82D;

    /** The Double 83. */
    public static final Double DOUBLE_83 = 83D;

    /** The Double 84. */
    public static final Double DOUBLE_84 = 84D;

    /** The Double 85. */
    public static final Double DOUBLE_85 = 85D;

    /** The Double 86. */
    public static final Double DOUBLE_86 = 86D;

    /** The Double 87. */
    public static final Double DOUBLE_87 = 87D;

    /** The Double 88. */
    public static final Double DOUBLE_88 = 88D;

    /** The Double 89. */
    public static final Double DOUBLE_89 = 89D;

    /** The Double 90. */
    public static final Double DOUBLE_90 = 90D;

    /** The Double 91. */
    public static final Double DOUBLE_91 = 91D;

    /** The Double 92. */
    public static final Double DOUBLE_92 = 92D;

    /** The Double 93. */
    public static final Double DOUBLE_93 = 93D;

    /** The Double 94. */
    public static final Double DOUBLE_94 = 94D;

    /** The Double 95. */
    public static final Double DOUBLE_95 = 95D;

    /** The Double 96. */
    public static final Double DOUBLE_96 = 96D;

    /** The Double 97. */
    public static final Double DOUBLE_97 = 97D;

    /** The Double 98. */
    public static final Double DOUBLE_98 = 98D;

    /** The Double 99. */
    public static final Double DOUBLE_99 = 99D;

    /** The Double 999. */
    public static final Double DOUBLE_999 = 999D;

    /** The Double 9999. */
    public static final Double DOUBLE_9999 = 9999D;

    /** A known double. */
    public static final Double DOUBLE_FIXED = 12345.67890;

    /** A negative Double. */
    public static final Double DOUBLE_NEGATIVE = randomNegative();

    /** A positive Double. */
    public static final Double DOUBLE_POSITIVE = randomPositive();

    /** A small Double between 0-100. */
    public static final Double DOUBLE_SMALL = randomPercent();

    /** The primitive double 00. */
    public static final double D_00 = 0;

    /** The primitive double 01. */
    public static final double D_01 = 1;

    /** The primitive double 02. */
    public static final double D_02 = 2;

    /** The primitive double 03. */
    public static final double D_03 = 3;

    /** The primitive double 04. */
    public static final double D_04 = 4;

    /** The primitive double 05. */
    public static final double D_05 = 5;

    /** The primitive double 06. */
    public static final double D_06 = 6;

    /** The primitive double 07. */
    public static final double D_07 = 7;

    /** The primitive double 08. */
    public static final double D_08 = 8;

    /** The primitive double 09. */
    public static final double D_09 = 9;

    /** The primitive double 10. */
    public static final double D_10 = 10;

    /** The primitive double 100. */
    public static final double D_100 = 100;

    /** The primitive double 1000. */
    public static final double D_1000 = 1000;

    /** The primitive double 10000. */
    public static final double D_10000 = 10000;

    /** The primitive double 10001. */
    public static final double D_10001 = 10001;

    /** The primitive double 1001. */
    public static final double D_1001 = 1001;

    /** The primitive double 101. */
    public static final double D_101 = 101;

    /** The primitive double 11. */
    public static final double D_11 = 11;

    /** The primitive double 12. */
    public static final double D_12 = 12;

    /** The primitive double 13. */
    public static final double D_13 = 13;

    /** The primitive double 14. */
    public static final double D_14 = 14;

    /** The primitive double 15. */
    public static final double D_15 = 15;

    /** The primitive double 16. */
    public static final double D_16 = 16;

    /** The primitive double 17. */
    public static final double D_17 = 17;

    /** The primitive double 18. */
    public static final double D_18 = 18;

    /** The primitive double 19. */
    public static final double D_19 = 19;

    /** The primitive double 20. */
    public static final double D_20 = 20;

    /** The primitive double 21. */
    public static final double D_21 = 21;

    /** The primitive double 22. */
    public static final double D_22 = 22;

    /** The primitive double 23. */
    public static final double D_23 = 23;

    /** The primitive double 24. */
    public static final double D_24 = 24;

    /** The primitive double 25. */
    public static final double D_25 = 25;

    /** The primitive double 26. */
    public static final double D_26 = 26;

    /** The primitive double 27. */
    public static final double D_27 = 27;

    /** The primitive double 28. */
    public static final double D_28 = 28;

    /** The primitive double 29. */
    public static final double D_29 = 29;

    /** The primitive double 30. */
    public static final double D_30 = 30;

    /** The primitive double 31. */
    public static final double D_31 = 31;

    /** The primitive double 32. */
    public static final double D_32 = 32;

    /** The primitive double 33. */
    public static final double D_33 = 33;

    /** The primitive double 34. */
    public static final double D_34 = 34;

    /** The primitive double 35. */
    public static final double D_35 = 35;

    /** The primitive double 36. */
    public static final double D_36 = 36;

    /** The primitive double 37. */
    public static final double D_37 = 37;

    /** The primitive double 38. */
    public static final double D_38 = 38;

    /** The primitive double 39. */
    public static final double D_39 = 39;

    /** The primitive double 40. */
    public static final double D_40 = 40;

    /** The primitive double 41. */
    public static final double D_41 = 41;

    /** The primitive double 42. */
    public static final double D_42 = 42;

    /** The primitive double 43. */
    public static final double D_43 = 43;

    /** The primitive double 44. */
    public static final double D_44 = 44;

    /** The primitive double 45. */
    public static final double D_45 = 45;

    /** The primitive double 46. */
    public static final double D_46 = 46;

    /** The primitive double 47. */
    public static final double D_47 = 47;

    /** The primitive double 48. */
    public static final double D_48 = 48;

    /** The primitive double 49. */
    public static final double D_49 = 49;

    /** The primitive double 50. */
    public static final double D_50 = 50;

    /** The primitive double 51. */
    public static final double D_51 = 51;

    /** The primitive double 52. */
    public static final double D_52 = 52;

    /** The primitive double 53. */
    public static final double D_53 = 53;

    /** The primitive double 54. */
    public static final double D_54 = 54;

    /** The primitive double 55. */
    public static final double D_55 = 55;

    /** The primitive double 56. */
    public static final double D_56 = 56;

    /** The primitive double 57. */
    public static final double D_57 = 57;

    /** The primitive double 58. */
    public static final double D_58 = 58;

    /** The primitive double 59. */
    public static final double D_59 = 59;

    /** The primitive double 60. */
    public static final double D_60 = 60;

    /** The primitive double 61. */
    public static final double D_61 = 61;

    /** The primitive double 62. */
    public static final double D_62 = 62;

    /** The primitive double 63. */
    public static final double D_63 = 63;

    /** The primitive double 64. */
    public static final double D_64 = 64;

    /** The primitive double 65. */
    public static final double D_65 = 65;

    /** The primitive double 66. */
    public static final double D_66 = 66;

    /** The primitive double 67. */
    public static final double D_67 = 67;

    /** The primitive double 68. */
    public static final double D_68 = 68;

    /** The primitive double 69. */
    public static final double D_69 = 69;

    /** The primitive double 70. */
    public static final double D_70 = 70;

    /** The primitive double 71. */
    public static final double D_71 = 71;

    /** The primitive double 72. */
    public static final double D_72 = 72;

    /** The primitive double 73. */
    public static final double D_73 = 73;

    /** The primitive double 74. */
    public static final double D_74 = 74;

    /** The primitive double 75. */
    public static final double D_75 = 75;

    /** The primitive double 76. */
    public static final double D_76 = 76;

    /** The primitive double 77. */
    public static final double D_77 = 77;

    /** The primitive double 78. */
    public static final double D_78 = 78;

    /** The primitive double 79. */
    public static final double D_79 = 79;

    /** The primitive double 80. */
    public static final double D_80 = 80;

    /** The primitive double 81. */
    public static final double D_81 = 81;

    /** The primitive double 82. */
    public static final double D_82 = 82;

    /** The primitive double 83. */
    public static final double D_83 = 83;

    /** The primitive double 84. */
    public static final double D_84 = 84;

    /** The primitive double 85. */
    public static final double D_85 = 85;

    /** The primitive double 86. */
    public static final double D_86 = 86;

    /** The primitive double 87. */
    public static final double D_87 = 87;

    /** The primitive double 88. */
    public static final double D_88 = 88;

    /** The primitive double 89. */
    public static final double D_89 = 89;

    /** The primitive double 90. */
    public static final double D_90 = 90;

    /** The primitive double 91. */
    public static final double D_91 = 91;

    /** The primitive double 92. */
    public static final double D_92 = 92;

    /** The primitive double 93. */
    public static final double D_93 = 93;

    /** The primitive double 94. */
    public static final double D_94 = 94;

    /** The primitive double 95. */
    public static final double D_95 = 95;

    /** The primitive double 96. */
    public static final double D_96 = 96;

    /** The primitive double 97. */
    public static final double D_97 = 97;

    /** The primitive double 98. */
    public static final double D_98 = 98;

    /** The primitive double 99. */
    public static final double D_99 = 99;

    /** The primitive double 999. */
    public static final double D_999 = 999;

    /** The primitive double 9999. */
    public static final double D_9999 = 9999;

    /** A negative primitive double. */
    public static final double D_NEGATIVE = randomNegative();

    /** A positive primitive double. */
    public static final double D_POSITIVE = randomPositive();

    /** A small primitive double between 0-100. */
    public static final double D_SMALL = randomPercent();

    /** The instance of {@link TestDouble}. */
    public static final TestDouble INSTANCE = new TestDouble();

    /** A random Double. */
    public static final Double DOUBLE = randomDouble();

    /** A random Double. */
    public static final Double DOUBLE_RANDOM = randomDouble();

    /** A random primitive double. */
    public static final double D_RANDOM = randomDouble();

    /** Instantiate a utility to produce randomized {@link Double} objects. */
    public TestDouble() {
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
    public static double randomBetween(final double number1, final double number2) {
        final double min = min(number1, number2);
        final double max = max(number1, number2);

        return min + ((max - min) * Math.random());
    }

    /**
     * Return a random double.
     *
     * @return the double
     */
    public static double randomDouble() {
        return INSTANCE.random();
    }

    /**
     * Return a random negative {@link Double}.
     *
     * @return the big decimal
     */
    public static double randomNegative() {
        return -randomPositive();
    }

    /**
     * Get a random number between 0 and 100.
     *
     * @return a number between 0 and 100 inclusive
     */
    public static double randomPercent() {
        return randomBetween(0, INT_100);
    }

    /**
     * Return a random positive {@link Double}.
     *
     * @return the big decimal
     */
    public static double randomPositive() {
        return randomBetween(INT_01, Double.MAX_VALUE);
    }

    /**
     * Return a random double.
     *
     * @return the double
     */
    @Override
    public Double random() {
        return RANDOM.nextDouble();
    }
}

/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_100;
import static com.threeleaf.test.random.TestRandom.RANDOM;
import static java.math.BigDecimal.valueOf;
import static java.math.RoundingMode.HALF_UP;

import java.math.BigDecimal;

/** Utilities for random {@link BigDecimal} creation. */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestBigDecimal extends AbstractRandom<BigDecimal> {

    /** The BigDecimal 00. */
    public static final BigDecimal BIG_DECIMAL_00 = BigDecimal.valueOf(0);

    /** The BigDecimal 01. */
    public static final BigDecimal BIG_DECIMAL_01 = BigDecimal.valueOf(1);

    /** The BigDecimal 02. */
    public static final BigDecimal BIG_DECIMAL_02 = BigDecimal.valueOf(2);

    /** The BigDecimal 03. */
    public static final BigDecimal BIG_DECIMAL_03 = BigDecimal.valueOf(3);

    /** The BigDecimal 04. */
    public static final BigDecimal BIG_DECIMAL_04 = BigDecimal.valueOf(4);

    /** The BigDecimal 05. */
    public static final BigDecimal BIG_DECIMAL_05 = BigDecimal.valueOf(5);

    /** The BigDecimal 06. */
    public static final BigDecimal BIG_DECIMAL_06 = BigDecimal.valueOf(6);

    /** The BigDecimal 07. */
    public static final BigDecimal BIG_DECIMAL_07 = BigDecimal.valueOf(7);

    /** The BigDecimal 08. */
    public static final BigDecimal BIG_DECIMAL_08 = BigDecimal.valueOf(8);

    /** The BigDecimal 09. */
    public static final BigDecimal BIG_DECIMAL_09 = BigDecimal.valueOf(9);

    /** The BigDecimal 10. */
    public static final BigDecimal BIG_DECIMAL_10 = BigDecimal.valueOf(10);

    /** The BigDecimal 100. */
    public static final BigDecimal BIG_DECIMAL_100 = BigDecimal.valueOf(100);

    /** The BigDecimal 1000. */
    public static final BigDecimal BIG_DECIMAL_1000 = BigDecimal.valueOf(1000);

    /** The BigDecimal 10000. */
    public static final BigDecimal BIG_DECIMAL_10000 = BigDecimal.valueOf(10000);

    /** The BigDecimal 10001. */
    public static final BigDecimal BIG_DECIMAL_10001 = BigDecimal.valueOf(10001);

    /** The BigDecimal 1001. */
    public static final BigDecimal BIG_DECIMAL_1001 = BigDecimal.valueOf(1001);

    /** The BigDecimal 101. */
    public static final BigDecimal BIG_DECIMAL_101 = BigDecimal.valueOf(101);

    /** The BigDecimal 11. */
    public static final BigDecimal BIG_DECIMAL_11 = BigDecimal.valueOf(11);

    /** The BigDecimal 12. */
    public static final BigDecimal BIG_DECIMAL_12 = BigDecimal.valueOf(12);

    /** The BigDecimal 13. */
    public static final BigDecimal BIG_DECIMAL_13 = BigDecimal.valueOf(13);

    /** The BigDecimal 14. */
    public static final BigDecimal BIG_DECIMAL_14 = BigDecimal.valueOf(14);

    /** The BigDecimal 15. */
    public static final BigDecimal BIG_DECIMAL_15 = BigDecimal.valueOf(15);

    /** The BigDecimal 16. */
    public static final BigDecimal BIG_DECIMAL_16 = BigDecimal.valueOf(16);

    /** The BigDecimal 17. */
    public static final BigDecimal BIG_DECIMAL_17 = BigDecimal.valueOf(17);

    /** The BigDecimal 18. */
    public static final BigDecimal BIG_DECIMAL_18 = BigDecimal.valueOf(18);

    /** The BigDecimal 19. */
    public static final BigDecimal BIG_DECIMAL_19 = BigDecimal.valueOf(19);

    /** The BigDecimal 20. */
    public static final BigDecimal BIG_DECIMAL_20 = BigDecimal.valueOf(20);

    /** The BigDecimal 21. */
    public static final BigDecimal BIG_DECIMAL_21 = BigDecimal.valueOf(21);

    /** The BigDecimal 22. */
    public static final BigDecimal BIG_DECIMAL_22 = BigDecimal.valueOf(22);

    /** The BigDecimal 23. */
    public static final BigDecimal BIG_DECIMAL_23 = BigDecimal.valueOf(23);

    /** The BigDecimal 24. */
    public static final BigDecimal BIG_DECIMAL_24 = BigDecimal.valueOf(24);

    /** The BigDecimal 25. */
    public static final BigDecimal BIG_DECIMAL_25 = BigDecimal.valueOf(25);

    /** The BigDecimal 26. */
    public static final BigDecimal BIG_DECIMAL_26 = BigDecimal.valueOf(26);

    /** The BigDecimal 27. */
    public static final BigDecimal BIG_DECIMAL_27 = BigDecimal.valueOf(27);

    /** The BigDecimal 28. */
    public static final BigDecimal BIG_DECIMAL_28 = BigDecimal.valueOf(28);

    /** The BigDecimal 29. */
    public static final BigDecimal BIG_DECIMAL_29 = BigDecimal.valueOf(29);

    /** The BigDecimal 30. */
    public static final BigDecimal BIG_DECIMAL_30 = BigDecimal.valueOf(30);

    /** The BigDecimal 31. */
    public static final BigDecimal BIG_DECIMAL_31 = BigDecimal.valueOf(31);

    /** The BigDecimal 32. */
    public static final BigDecimal BIG_DECIMAL_32 = BigDecimal.valueOf(32);

    /** The BigDecimal 33. */
    public static final BigDecimal BIG_DECIMAL_33 = BigDecimal.valueOf(33);

    /** The BigDecimal 34. */
    public static final BigDecimal BIG_DECIMAL_34 = BigDecimal.valueOf(34);

    /** The BigDecimal 35. */
    public static final BigDecimal BIG_DECIMAL_35 = BigDecimal.valueOf(35);

    /** The BigDecimal 36. */
    public static final BigDecimal BIG_DECIMAL_36 = BigDecimal.valueOf(36);

    /** The BigDecimal 37. */
    public static final BigDecimal BIG_DECIMAL_37 = BigDecimal.valueOf(37);

    /** The BigDecimal 38. */
    public static final BigDecimal BIG_DECIMAL_38 = BigDecimal.valueOf(38);

    /** The BigDecimal 39. */
    public static final BigDecimal BIG_DECIMAL_39 = BigDecimal.valueOf(39);

    /** The BigDecimal 40. */
    public static final BigDecimal BIG_DECIMAL_40 = BigDecimal.valueOf(40);

    /** The BigDecimal 41. */
    public static final BigDecimal BIG_DECIMAL_41 = BigDecimal.valueOf(41);

    /** The BigDecimal 42. */
    public static final BigDecimal BIG_DECIMAL_42 = BigDecimal.valueOf(42);

    /** The BigDecimal 43. */
    public static final BigDecimal BIG_DECIMAL_43 = BigDecimal.valueOf(43);

    /** The BigDecimal 44. */
    public static final BigDecimal BIG_DECIMAL_44 = BigDecimal.valueOf(44);

    /** The BigDecimal 45. */
    public static final BigDecimal BIG_DECIMAL_45 = BigDecimal.valueOf(45);

    /** The BigDecimal 46. */
    public static final BigDecimal BIG_DECIMAL_46 = BigDecimal.valueOf(46);

    /** The BigDecimal 47. */
    public static final BigDecimal BIG_DECIMAL_47 = BigDecimal.valueOf(47);

    /** The BigDecimal 48. */
    public static final BigDecimal BIG_DECIMAL_48 = BigDecimal.valueOf(48);

    /** The BigDecimal 49. */
    public static final BigDecimal BIG_DECIMAL_49 = BigDecimal.valueOf(49);

    /** The BigDecimal 50. */
    public static final BigDecimal BIG_DECIMAL_50 = BigDecimal.valueOf(50);

    /** The BigDecimal 51. */
    public static final BigDecimal BIG_DECIMAL_51 = BigDecimal.valueOf(51);

    /** The BigDecimal 52. */
    public static final BigDecimal BIG_DECIMAL_52 = BigDecimal.valueOf(52);

    /** The BigDecimal 53. */
    public static final BigDecimal BIG_DECIMAL_53 = BigDecimal.valueOf(53);

    /** The BigDecimal 54. */
    public static final BigDecimal BIG_DECIMAL_54 = BigDecimal.valueOf(54);

    /** The BigDecimal 55. */
    public static final BigDecimal BIG_DECIMAL_55 = BigDecimal.valueOf(55);

    /** The BigDecimal 56. */
    public static final BigDecimal BIG_DECIMAL_56 = BigDecimal.valueOf(56);

    /** The BigDecimal 57. */
    public static final BigDecimal BIG_DECIMAL_57 = BigDecimal.valueOf(57);

    /** The BigDecimal 58. */
    public static final BigDecimal BIG_DECIMAL_58 = BigDecimal.valueOf(58);

    /** The BigDecimal 59. */
    public static final BigDecimal BIG_DECIMAL_59 = BigDecimal.valueOf(59);

    /** The BigDecimal 60. */
    public static final BigDecimal BIG_DECIMAL_60 = BigDecimal.valueOf(60);

    /** The BigDecimal 61. */
    public static final BigDecimal BIG_DECIMAL_61 = BigDecimal.valueOf(61);

    /** The BigDecimal 62. */
    public static final BigDecimal BIG_DECIMAL_62 = BigDecimal.valueOf(62);

    /** The BigDecimal 63. */
    public static final BigDecimal BIG_DECIMAL_63 = BigDecimal.valueOf(63);

    /** The BigDecimal 64. */
    public static final BigDecimal BIG_DECIMAL_64 = BigDecimal.valueOf(64);

    /** The BigDecimal 65. */
    public static final BigDecimal BIG_DECIMAL_65 = BigDecimal.valueOf(65);

    /** The BigDecimal 66. */
    public static final BigDecimal BIG_DECIMAL_66 = BigDecimal.valueOf(66);

    /** The BigDecimal 67. */
    public static final BigDecimal BIG_DECIMAL_67 = BigDecimal.valueOf(67);

    /** The BigDecimal 68. */
    public static final BigDecimal BIG_DECIMAL_68 = BigDecimal.valueOf(68);

    /** The BigDecimal 69. */
    public static final BigDecimal BIG_DECIMAL_69 = BigDecimal.valueOf(69);

    /** The BigDecimal 70. */
    public static final BigDecimal BIG_DECIMAL_70 = BigDecimal.valueOf(70);

    /** The BigDecimal 71. */
    public static final BigDecimal BIG_DECIMAL_71 = BigDecimal.valueOf(71);

    /** The BigDecimal 72. */
    public static final BigDecimal BIG_DECIMAL_72 = BigDecimal.valueOf(72);

    /** The BigDecimal 73. */
    public static final BigDecimal BIG_DECIMAL_73 = BigDecimal.valueOf(73);

    /** The BigDecimal 74. */
    public static final BigDecimal BIG_DECIMAL_74 = BigDecimal.valueOf(74);

    /** The BigDecimal 75. */
    public static final BigDecimal BIG_DECIMAL_75 = BigDecimal.valueOf(75);

    /** The BigDecimal 76. */
    public static final BigDecimal BIG_DECIMAL_76 = BigDecimal.valueOf(76);

    /** The BigDecimal 77. */
    public static final BigDecimal BIG_DECIMAL_77 = BigDecimal.valueOf(77);

    /** The BigDecimal 78. */
    public static final BigDecimal BIG_DECIMAL_78 = BigDecimal.valueOf(78);

    /** The BigDecimal 79. */
    public static final BigDecimal BIG_DECIMAL_79 = BigDecimal.valueOf(79);

    /** The BigDecimal 80. */
    public static final BigDecimal BIG_DECIMAL_80 = BigDecimal.valueOf(80);

    /** The BigDecimal 81. */
    public static final BigDecimal BIG_DECIMAL_81 = BigDecimal.valueOf(81);

    /** The BigDecimal 82. */
    public static final BigDecimal BIG_DECIMAL_82 = BigDecimal.valueOf(82);

    /** The BigDecimal 83. */
    public static final BigDecimal BIG_DECIMAL_83 = BigDecimal.valueOf(83);

    /** The BigDecimal 84. */
    public static final BigDecimal BIG_DECIMAL_84 = BigDecimal.valueOf(84);

    /** The BigDecimal 85. */
    public static final BigDecimal BIG_DECIMAL_85 = BigDecimal.valueOf(85);

    /** The BigDecimal 86. */
    public static final BigDecimal BIG_DECIMAL_86 = BigDecimal.valueOf(86);

    /** The BigDecimal 87. */
    public static final BigDecimal BIG_DECIMAL_87 = BigDecimal.valueOf(87);

    /** The BigDecimal 88. */
    public static final BigDecimal BIG_DECIMAL_88 = BigDecimal.valueOf(88);

    /** The BigDecimal 89. */
    public static final BigDecimal BIG_DECIMAL_89 = BigDecimal.valueOf(89);

    /** The BigDecimal 90. */
    public static final BigDecimal BIG_DECIMAL_90 = BigDecimal.valueOf(90);

    /** The BigDecimal 91. */
    public static final BigDecimal BIG_DECIMAL_91 = BigDecimal.valueOf(91);

    /** The BigDecimal 92. */
    public static final BigDecimal BIG_DECIMAL_92 = BigDecimal.valueOf(92);

    /** The BigDecimal 93. */
    public static final BigDecimal BIG_DECIMAL_93 = BigDecimal.valueOf(93);

    /** The BigDecimal 94. */
    public static final BigDecimal BIG_DECIMAL_94 = BigDecimal.valueOf(94);

    /** The BigDecimal 95. */
    public static final BigDecimal BIG_DECIMAL_95 = BigDecimal.valueOf(95);

    /** The BigDecimal 96. */
    public static final BigDecimal BIG_DECIMAL_96 = BigDecimal.valueOf(96);

    /** The BigDecimal 97. */
    public static final BigDecimal BIG_DECIMAL_97 = BigDecimal.valueOf(97);

    /** The BigDecimal 98. */
    public static final BigDecimal BIG_DECIMAL_98 = BigDecimal.valueOf(98);

    /** The BigDecimal 99. */
    public static final BigDecimal BIG_DECIMAL_99 = BigDecimal.valueOf(99);

    /** The BigDecimal 999. */
    public static final BigDecimal BIG_DECIMAL_999 = BigDecimal.valueOf(999);

    /** The BigDecimal 9999. */
    public static final BigDecimal BIG_DECIMAL_9999 = BigDecimal.valueOf(9999);

    /** The instance of {@link TestBigDecimal}. */
    public static final TestBigDecimal INSTANCE = new TestBigDecimal();

    /** A random {@link BigDecimal}. */
    public static final BigDecimal BIG_DECIMAL = randomBigDecimal();

    /** A random {@link BigDecimal}. */
    public static final BigDecimal BIG_DECIMAL_RANDOM = randomBigDecimal();

    /** BigDecimal scale for two decimal places. */
    public static final int TWO_DECIMALS = 2;

    /** A random {@link BigDecimal} from 0-100. */
    public static final BigDecimal BIG_DECIMAL_SMALL = randomPercent();

    /** Instantiate a utility to produce randomized {link BigDecimal} objects. */
    public TestBigDecimal() {
        super(BigDecimal.class);
    }

    /**
     * Return a random short between two shorts, inclusive.
     *
     * @param number1 a number
     * @param number2 another number
     *
     * @return the random short
     */
    public static BigDecimal randomBetween(final double number1, final double number2) {
        return valueOf(TestDouble.randomBetween(number1, number2));
    }

    /**
     * Return a random short between two shorts, inclusive.
     *
     * @param number1 a number
     * @param number2 another number
     *
     * @return the random short
     */
    public static BigDecimal randomBetween(final BigDecimal number1, final BigDecimal number2) {
        return randomBetween(number1.doubleValue(), number2.doubleValue());
    }

    /**
     * Return a random {@link BigDecimal}.
     *
     * @return the big decimal
     */
    public static BigDecimal randomBigDecimal() {
        return INSTANCE.random();
    }

    /**
     * Return a random negative {@link BigDecimal}.
     *
     * @return the big decimal
     */
    public static BigDecimal randomNegative() {
        return valueOf(TestDouble.randomNegative());
    }

    /**
     * Get a random number between 0 and 100.
     *
     * @return a number between 0.00 and 100.00 inclusive
     */
    public static BigDecimal randomPercent() {
        return randomBetween(0, INT_100).setScale(TWO_DECIMALS, HALF_UP);
    }

    /**
     * Return a random positive {@link BigDecimal}.
     *
     * @return the big decimal
     */
    public static BigDecimal randomPositive() {
        return valueOf(TestDouble.randomPositive());
    }

    /**
     * Return a random {@link BigDecimal}.
     *
     * @return the big decimal
     */
    @Override
    public BigDecimal random() {
        return valueOf(RANDOM.nextDouble());
    }
}

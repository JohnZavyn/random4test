/*
 * Copyright 2019-2022, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.*;
import static java.lang.Math.max;
import static java.lang.Math.min;

/** Utilities for random {@link Byte} creation. */
@SuppressWarnings({"WeakerAccess", "unused", "RedundantSuppression"})
public class TestByte extends AbstractRandom<Byte> {

    /** The Byte 00. */
    public static final Byte BYTE_00 = 0;

    /** The Byte 01. */
    public static final Byte BYTE_01 = 1;

    /** The Byte 02. */
    public static final Byte BYTE_02 = 2;

    /** The Byte 03. */
    public static final Byte BYTE_03 = 3;

    /** The Byte 04. */
    public static final Byte BYTE_04 = 4;

    /** The Byte 05. */
    public static final Byte BYTE_05 = 5;

    /** The Byte 06. */
    public static final Byte BYTE_06 = 6;

    /** The Byte 07. */
    public static final Byte BYTE_07 = 7;

    /** The Byte 08. */
    public static final Byte BYTE_08 = 8;

    /** The Byte 09. */
    public static final Byte BYTE_09 = 9;

    /** The Byte 10. */
    public static final Byte BYTE_10 = 10;

    /** The Byte 100. */
    public static final Byte BYTE_100 = 100;

    /** The Byte 101. */
    public static final Byte BYTE_101 = 101;

    /** The Byte 11. */
    public static final Byte BYTE_11 = 11;

    /** The Byte 12. */
    public static final Byte BYTE_12 = 12;

    /** The Byte 13. */
    public static final Byte BYTE_13 = 13;

    /** The Byte 14. */
    public static final Byte BYTE_14 = 14;

    /** The Byte 15. */
    public static final Byte BYTE_15 = 15;

    /** The Byte 16. */
    public static final Byte BYTE_16 = 16;

    /** The Byte 17. */
    public static final Byte BYTE_17 = 17;

    /** The Byte 18. */
    public static final Byte BYTE_18 = 18;

    /** The Byte 19. */
    public static final Byte BYTE_19 = 19;

    /** The Byte 20. */
    public static final Byte BYTE_20 = 20;

    /** The Byte 21. */
    public static final Byte BYTE_21 = 21;

    /** The Byte 22. */
    public static final Byte BYTE_22 = 22;

    /** The Byte 23. */
    public static final Byte BYTE_23 = 23;

    /** The Byte 24. */
    public static final Byte BYTE_24 = 24;

    /** The Byte 25. */
    public static final Byte BYTE_25 = 25;

    /** The Byte 26. */
    public static final Byte BYTE_26 = 26;

    /** The Byte 27. */
    public static final Byte BYTE_27 = 27;

    /** The Byte 28. */
    public static final Byte BYTE_28 = 28;

    /** The Byte 29. */
    public static final Byte BYTE_29 = 29;

    /** The Byte 30. */
    public static final Byte BYTE_30 = 30;

    /** The Byte 31. */
    public static final Byte BYTE_31 = 31;

    /** The Byte 32. */
    public static final Byte BYTE_32 = 32;

    /** The Byte 33. */
    public static final Byte BYTE_33 = 33;

    /** The Byte 34. */
    public static final Byte BYTE_34 = 34;

    /** The Byte 35. */
    public static final Byte BYTE_35 = 35;

    /** The Byte 36. */
    public static final Byte BYTE_36 = 36;

    /** The Byte 37. */
    public static final Byte BYTE_37 = 37;

    /** The Byte 38. */
    public static final Byte BYTE_38 = 38;

    /** The Byte 39. */
    public static final Byte BYTE_39 = 39;

    /** The Byte 40. */
    public static final Byte BYTE_40 = 40;

    /** The Byte 41. */
    public static final Byte BYTE_41 = 41;

    /** The Byte 42. */
    public static final Byte BYTE_42 = 42;

    /** The Byte 43. */
    public static final Byte BYTE_43 = 43;

    /** The Byte 44. */
    public static final Byte BYTE_44 = 44;

    /** The Byte 45. */
    public static final Byte BYTE_45 = 45;

    /** The Byte 46. */
    public static final Byte BYTE_46 = 46;

    /** The Byte 47. */
    public static final Byte BYTE_47 = 47;

    /** The Byte 48. */
    public static final Byte BYTE_48 = 48;

    /** The Byte 49. */
    public static final Byte BYTE_49 = 49;

    /** The Byte 50. */
    public static final Byte BYTE_50 = 50;

    /** The Byte 51. */
    public static final Byte BYTE_51 = 51;

    /** The Byte 52. */
    public static final Byte BYTE_52 = 52;

    /** The Byte 53. */
    public static final Byte BYTE_53 = 53;

    /** The Byte 54. */
    public static final Byte BYTE_54 = 54;

    /** The Byte 55. */
    public static final Byte BYTE_55 = 55;

    /** The Byte 56. */
    public static final Byte BYTE_56 = 56;

    /** The Byte 57. */
    public static final Byte BYTE_57 = 57;

    /** The Byte 58. */
    public static final Byte BYTE_58 = 58;

    /** The Byte 59. */
    public static final Byte BYTE_59 = 59;

    /** The Byte 60. */
    public static final Byte BYTE_60 = 60;

    /** The Byte 61. */
    public static final Byte BYTE_61 = 61;

    /** The Byte 62. */
    public static final Byte BYTE_62 = 62;

    /** The Byte 63. */
    public static final Byte BYTE_63 = 63;

    /** The Byte 64. */
    public static final Byte BYTE_64 = 64;

    /** The Byte 65. */
    public static final Byte BYTE_65 = 65;

    /** The Byte 66. */
    public static final Byte BYTE_66 = 66;

    /** The Byte 67. */
    public static final Byte BYTE_67 = 67;

    /** The Byte 68. */
    public static final Byte BYTE_68 = 68;

    /** The Byte 69. */
    public static final Byte BYTE_69 = 69;

    /** The Byte 70. */
    public static final Byte BYTE_70 = 70;

    /** The Byte 71. */
    public static final Byte BYTE_71 = 71;

    /** The Byte 72. */
    public static final Byte BYTE_72 = 72;

    /** The Byte 73. */
    public static final Byte BYTE_73 = 73;

    /** The Byte 74. */
    public static final Byte BYTE_74 = 74;

    /** The Byte 75. */
    public static final Byte BYTE_75 = 75;

    /** The Byte 76. */
    public static final Byte BYTE_76 = 76;

    /** The Byte 77. */
    public static final Byte BYTE_77 = 77;

    /** The Byte 78. */
    public static final Byte BYTE_78 = 78;

    /** The Byte 79. */
    public static final Byte BYTE_79 = 79;

    /** The Byte 80. */
    public static final Byte BYTE_80 = 80;

    /** The Byte 81. */
    public static final Byte BYTE_81 = 81;

    /** The Byte 82. */
    public static final Byte BYTE_82 = 82;

    /** The Byte 83. */
    public static final Byte BYTE_83 = 83;

    /** The Byte 84. */
    public static final Byte BYTE_84 = 84;

    /** The Byte 85. */
    public static final Byte BYTE_85 = 85;

    /** The Byte 86. */
    public static final Byte BYTE_86 = 86;

    /** The Byte 87. */
    public static final Byte BYTE_87 = 87;

    /** The Byte 88. */
    public static final Byte BYTE_88 = 88;

    /** The Byte 89. */
    public static final Byte BYTE_89 = 89;

    /** The Byte 90. */
    public static final Byte BYTE_90 = 90;

    /** The Byte 91. */
    public static final Byte BYTE_91 = 91;

    /** The Byte 92. */
    public static final Byte BYTE_92 = 92;

    /** The Byte 93. */
    public static final Byte BYTE_93 = 93;

    /** The Byte 94. */
    public static final Byte BYTE_94 = 94;

    /** The Byte 95. */
    public static final Byte BYTE_95 = 95;

    /** The Byte 96. */
    public static final Byte BYTE_96 = 96;

    /** The Byte 97. */
    public static final Byte BYTE_97 = 97;

    /** The Byte 98. */
    public static final Byte BYTE_98 = 98;

    /** The Byte 99. */
    public static final Byte BYTE_99 = 99;

    /** A negative Byte. */
    public static final Byte BYTE_NEGATIVE = randomNegative();

    /** A positive Byte. */
    public static final Byte BYTE_POSITIVE = randomPositive();

    /** A small Byte from 0-100. */
    public static final Byte BYTE_SMALL = randomPercent();

    /** The maximum value for an unsigned byte. */
    public static final int BYTE_UNSIGNED_MAX = Byte.MAX_VALUE - Byte.MIN_VALUE;

    /** The primitive byte 00. */
    public static final byte B_00 = 0;

    /** The primitive byte 01. */
    public static final byte B_01 = 1;

    /** The primitive byte 02. */
    public static final byte B_02 = 2;

    /** The primitive byte 03. */
    public static final byte B_03 = 3;

    /** The primitive byte 04. */
    public static final byte B_04 = 4;

    /** The primitive byte 05. */
    public static final byte B_05 = 5;

    /** The primitive byte 06. */
    public static final byte B_06 = 6;

    /** The primitive byte 07. */
    public static final byte B_07 = 7;

    /** The primitive byte 08. */
    public static final byte B_08 = 8;

    /** The primitive byte 09. */
    public static final byte B_09 = 9;

    /** The primitive byte 10. */
    public static final byte B_10 = 10;

    /** The primitive byte 100. */
    public static final byte B_100 = 100;

    /** The primitive byte 101. */
    public static final byte B_101 = 101;

    /** The primitive byte 11. */
    public static final byte B_11 = 11;

    /** The primitive byte 12. */
    public static final byte B_12 = 12;

    /** The primitive byte 13. */
    public static final byte B_13 = 13;

    /** The primitive byte 14. */
    public static final byte B_14 = 14;

    /** The primitive byte 15. */
    public static final byte B_15 = 15;

    /** The primitive byte 16. */
    public static final byte B_16 = 16;

    /** The primitive byte 17. */
    public static final byte B_17 = 17;

    /** The primitive byte 18. */
    public static final byte B_18 = 18;

    /** The primitive byte 19. */
    public static final byte B_19 = 19;

    /** The primitive byte 20. */
    public static final byte B_20 = 20;

    /** The primitive byte 21. */
    public static final byte B_21 = 21;

    /** The primitive byte 22. */
    public static final byte B_22 = 22;

    /** The primitive byte 23. */
    public static final byte B_23 = 23;

    /** The primitive byte 24. */
    public static final byte B_24 = 24;

    /** The primitive byte 25. */
    public static final byte B_25 = 25;

    /** The primitive byte 26. */
    public static final byte B_26 = 26;

    /** The primitive byte 27. */
    public static final byte B_27 = 27;

    /** The primitive byte 28. */
    public static final byte B_28 = 28;

    /** The primitive byte 29. */
    public static final byte B_29 = 29;

    /** The primitive byte 30. */
    public static final byte B_30 = 30;

    /** The primitive byte 31. */
    public static final byte B_31 = 31;

    /** The primitive byte 32. */
    public static final byte B_32 = 32;

    /** The primitive byte 33. */
    public static final byte B_33 = 33;

    /** The primitive byte 34. */
    public static final byte B_34 = 34;

    /** The primitive byte 35. */
    public static final byte B_35 = 35;

    /** The primitive byte 36. */
    public static final byte B_36 = 36;

    /** The primitive byte 37. */
    public static final byte B_37 = 37;

    /** The primitive byte 38. */
    public static final byte B_38 = 38;

    /** The primitive byte 39. */
    public static final byte B_39 = 39;

    /** The primitive byte 40. */
    public static final byte B_40 = 40;

    /** The primitive byte 41. */
    public static final byte B_41 = 41;

    /** The primitive byte 42. */
    public static final byte B_42 = 42;

    /** The primitive byte 43. */
    public static final byte B_43 = 43;

    /** The primitive byte 44. */
    public static final byte B_44 = 44;

    /** The primitive byte 45. */
    public static final byte B_45 = 45;

    /** The primitive byte 46. */
    public static final byte B_46 = 46;

    /** The primitive byte 47. */
    public static final byte B_47 = 47;

    /** The primitive byte 48. */
    public static final byte B_48 = 48;

    /** The primitive byte 49. */
    public static final byte B_49 = 49;

    /** The primitive byte 50. */
    public static final byte B_50 = 50;

    /** The primitive byte 51. */
    public static final byte B_51 = 51;

    /** The primitive byte 52. */
    public static final byte B_52 = 52;

    /** The primitive byte 53. */
    public static final byte B_53 = 53;

    /** The primitive byte 54. */
    public static final byte B_54 = 54;

    /** The primitive byte 55. */
    public static final byte B_55 = 55;

    /** The primitive byte 56. */
    public static final byte B_56 = 56;

    /** The primitive byte 57. */
    public static final byte B_57 = 57;

    /** The primitive byte 58. */
    public static final byte B_58 = 58;

    /** The primitive byte 59. */
    public static final byte B_59 = 59;

    /** The primitive byte 60. */
    public static final byte B_60 = 60;

    /** The primitive byte 61. */
    public static final byte B_61 = 61;

    /** The primitive byte 62. */
    public static final byte B_62 = 62;

    /** The primitive byte 63. */
    public static final byte B_63 = 63;

    /** The primitive byte 64. */
    public static final byte B_64 = 64;

    /** The primitive byte 65. */
    public static final byte B_65 = 65;

    /** The primitive byte 66. */
    public static final byte B_66 = 66;

    /** The primitive byte 67. */
    public static final byte B_67 = 67;

    /** The primitive byte 68. */
    public static final byte B_68 = 68;

    /** The primitive byte 69. */
    public static final byte B_69 = 69;

    /** The primitive byte 70. */
    public static final byte B_70 = 70;

    /** The primitive byte 71. */
    public static final byte B_71 = 71;

    /** The primitive byte 72. */
    public static final byte B_72 = 72;

    /** The primitive byte 73. */
    public static final byte B_73 = 73;

    /** The primitive byte 74. */
    public static final byte B_74 = 74;

    /** The primitive byte 75. */
    public static final byte B_75 = 75;

    /** The primitive byte 76. */
    public static final byte B_76 = 76;

    /** The primitive byte 77. */
    public static final byte B_77 = 77;

    /** The primitive byte 78. */
    public static final byte B_78 = 78;

    /** The primitive byte 79. */
    public static final byte B_79 = 79;

    /** The primitive byte 80. */
    public static final byte B_80 = 80;

    /** The primitive byte 81. */
    public static final byte B_81 = 81;

    /** The primitive byte 82. */
    public static final byte B_82 = 82;

    /** The primitive byte 83. */
    public static final byte B_83 = 83;

    /** The primitive byte 84. */
    public static final byte B_84 = 84;

    /** The primitive byte 85. */
    public static final byte B_85 = 85;

    /** The primitive byte 86. */
    public static final byte B_86 = 86;

    /** The primitive byte 87. */
    public static final byte B_87 = 87;

    /** The primitive byte 88. */
    public static final byte B_88 = 88;

    /** The primitive byte 89. */
    public static final byte B_89 = 89;

    /** The primitive byte 90. */
    public static final byte B_90 = 90;

    /** The primitive byte 91. */
    public static final byte B_91 = 91;

    /** The primitive byte 92. */
    public static final byte B_92 = 92;

    /** The primitive byte 93. */
    public static final byte B_93 = 93;

    /** The primitive byte 94. */
    public static final byte B_94 = 94;

    /** The primitive byte 95. */
    public static final byte B_95 = 95;

    /** The primitive byte 96. */
    public static final byte B_96 = 96;

    /** The primitive byte 97. */
    public static final byte B_97 = 97;

    /** The primitive byte 98. */
    public static final byte B_98 = 98;

    /** The primitive byte 99. */
    public static final byte B_99 = 99;

    /** A negative primitive byte. */
    public static final byte B_NEGATIVE = randomNegative();

    /** A positive primitive byte. */
    public static final byte B_POSITIVE = randomPositive();

    /** A small primitive byte from 0-100. */
    public static final byte B_SMALL = randomPercent();

    /** The instance of {@link TestByte}. */
    public static final TestByte INSTANCE = new TestByte();

    /** A random Byte. */
    public static final Byte BYTE = randomByte();

    /** A random Byte. */
    public static final Byte BYTE_RANDOM = randomByte();

    /** A random primitive byte. */
    public static final byte B_RANDOM = randomByte();

    /** Instantiate a utility to produce randomized {@link Byte} objects. */
    public TestByte() {
        super(Byte.class);
    }

    /**
     * Return a random short between two shorts, inclusive.
     *
     * @param number1 a number
     * @param number2 another number
     *
     * @return the random short
     */
    public static byte randomBetween(final int number1, final int number2) {
        final int min = min(number1, number2);
        final int max = max(number1, number2);

        return (byte) (min + ((max - min + 1) * Math.random()));
    }

    /**
     * Return a random byte.
     *
     * @return the byte
     */
    public static byte randomByte() {
        return INSTANCE.random();
    }

    /**
     * A random hexadecimal byte value.
     *
     * @return a  "0" to "FF"
     */
    public static String randomHex() {
        return Integer.toHexString(randomUnsigned());
    }

    /**
     * Return a random negative {@link Byte}.
     *
     * @return the big decimal
     */
    public static Byte randomNegative() {
        return randomBetween(Byte.MIN_VALUE, -1);
    }

    /**
     * Get a random number between 0 and 100.
     *
     * @return a number between 0 and 100 inclusive
     */
    public static byte randomPercent() {
        return randomBetween(0, INT_100);
    }

    /**
     * Return a random positive {@link Byte}.
     *
     * @return the big decimal
     */
    public static Byte randomPositive() {
        return randomBetween(INT_01, Byte.MAX_VALUE);
    }

    /**
     * A random unsigned byte.
     *
     * @return a number between 0 and 255 inclusive
     */
    public static int randomUnsigned() {
        return TestInteger.randomBetween(INT_00, BYTE_UNSIGNED_MAX);
    }

    /**
     * Return a random byte.
     *
     * @return the byte
     */
    @Override
    public Byte random() {
        return randomBetween(Byte.MIN_VALUE, Byte.MAX_VALUE);
    }
}

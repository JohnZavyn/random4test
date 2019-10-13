package com.threeleaf.test.random;

import com.threeleaf.test.random.util.RandomIntegerUtil;
import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.math.BigInteger;

import static com.threeleaf.test.random.util.TestNumberUtil.*;
import static java.math.BigDecimal.ROUND_HALF_UP;
import static java.math.BigDecimal.valueOf;

/** Number constants for use in testing. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestNumber
{

    /** A random {@link BigDecimal}. */
    public static final BigDecimal BIG_DECIMAL = randomBigDecimal();

    /** A random {@link BigDecimal}. */
    public static final BigDecimal BIG_DECIMAL_RANDOM = randomBigDecimal();

    /** A random {@link BigDecimal} from 0-100. */
    public static final BigDecimal BIG_DECIMAL_SMALL = valueOf(RandomIntegerUtil.randomBetween(1, 10000) / 100D).setScale(2, ROUND_HALF_UP);

    /** A random {@link BigInteger}. */
    public static final BigInteger BIG_INTEGER = randomBigInteger();

    /** A random {@link BigInteger}. */
    public static final BigInteger BIG_INTEGER_RANDOM = randomBigInteger();

    /** A random {@link BigInteger} from 0-100. */
    public static final BigInteger BIG_INTEGER_SMALL = BigInteger.valueOf(RandomIntegerUtil.randomBetween(0, 100));

    /** A random Byte. */
    public final static Byte BYTE = randomByte();

    /** The Byte 00. */
    public final static Byte BYTE_00 = 0;

    /** The Byte 01. */
    public final static Byte BYTE_01 = 1;

    /** The Byte 02. */
    public final static Byte BYTE_02 = 2;

    /** The Byte 03. */
    public final static Byte BYTE_03 = 3;

    /** The Byte 04. */
    public final static Byte BYTE_04 = 4;

    /** The Byte 05. */
    public final static Byte BYTE_05 = 5;

    /** The Byte 06. */
    public final static Byte BYTE_06 = 6;

    /** The Byte 07. */
    public final static Byte BYTE_07 = 7;

    /** The Byte 08. */
    public final static Byte BYTE_08 = 8;

    /** The Byte 09. */
    public final static Byte BYTE_09 = 9;

    /** The Byte 10. */
    public final static Byte BYTE_10 = 10;

    /** The Byte 100. */
    public final static Byte BYTE_100 = 100;

    /** The Byte 101. */
    public final static Byte BYTE_101 = 101;

    /** The Byte 11. */
    public final static Byte BYTE_11 = 11;

    /** The Byte 12. */
    public final static Byte BYTE_12 = 12;

    /** The Byte 13. */
    public final static Byte BYTE_13 = 13;

    /** The Byte 14. */
    public final static Byte BYTE_14 = 14;

    /** The Byte 15. */
    public final static Byte BYTE_15 = 15;

    /** The Byte 16. */
    public final static Byte BYTE_16 = 16;

    /** The Byte 17. */
    public final static Byte BYTE_17 = 17;

    /** The Byte 18. */
    public final static Byte BYTE_18 = 18;

    /** The Byte 19. */
    public final static Byte BYTE_19 = 19;

    /** The Byte 20. */
    public final static Byte BYTE_20 = 20;

    /** The Byte 21. */
    public final static Byte BYTE_21 = 21;

    /** The Byte 22. */
    public final static Byte BYTE_22 = 22;

    /** The Byte 23. */
    public final static Byte BYTE_23 = 23;

    /** The Byte 24. */
    public final static Byte BYTE_24 = 24;

    /** The Byte 25. */
    public final static Byte BYTE_25 = 25;

    /** The Byte 26. */
    public final static Byte BYTE_26 = 26;

    /** The Byte 27. */
    public final static Byte BYTE_27 = 27;

    /** The Byte 28. */
    public final static Byte BYTE_28 = 28;

    /** The Byte 29. */
    public final static Byte BYTE_29 = 29;

    /** The Byte 30. */
    public final static Byte BYTE_30 = 30;

    /** The Byte 31. */
    public final static Byte BYTE_31 = 31;

    /** The Byte 32. */
    public final static Byte BYTE_32 = 32;

    /** The Byte 33. */
    public final static Byte BYTE_33 = 33;

    /** The Byte 34. */
    public final static Byte BYTE_34 = 34;

    /** The Byte 35. */
    public final static Byte BYTE_35 = 35;

    /** The Byte 36. */
    public final static Byte BYTE_36 = 36;

    /** The Byte 37. */
    public final static Byte BYTE_37 = 37;

    /** The Byte 38. */
    public final static Byte BYTE_38 = 38;

    /** The Byte 39. */
    public final static Byte BYTE_39 = 39;

    /** The Byte 40. */
    public final static Byte BYTE_40 = 40;

    /** The Byte 41. */
    public final static Byte BYTE_41 = 41;

    /** The Byte 42. */
    public final static Byte BYTE_42 = 42;

    /** The Byte 43. */
    public final static Byte BYTE_43 = 43;

    /** The Byte 44. */
    public final static Byte BYTE_44 = 44;

    /** The Byte 45. */
    public final static Byte BYTE_45 = 45;

    /** The Byte 46. */
    public final static Byte BYTE_46 = 46;

    /** The Byte 47. */
    public final static Byte BYTE_47 = 47;

    /** The Byte 48. */
    public final static Byte BYTE_48 = 48;

    /** The Byte 49. */
    public final static Byte BYTE_49 = 49;

    /** The Byte 50. */
    public final static Byte BYTE_50 = 50;

    /** The Byte 51. */
    public final static Byte BYTE_51 = 51;

    /** The Byte 52. */
    public final static Byte BYTE_52 = 52;

    /** The Byte 53. */
    public final static Byte BYTE_53 = 53;

    /** The Byte 54. */
    public final static Byte BYTE_54 = 54;

    /** The Byte 55. */
    public final static Byte BYTE_55 = 55;

    /** The Byte 56. */
    public final static Byte BYTE_56 = 56;

    /** The Byte 57. */
    public final static Byte BYTE_57 = 57;

    /** The Byte 58. */
    public final static Byte BYTE_58 = 58;

    /** The Byte 59. */
    public final static Byte BYTE_59 = 59;

    /** The Byte 60. */
    public final static Byte BYTE_60 = 60;

    /** The Byte 61. */
    public final static Byte BYTE_61 = 61;

    /** The Byte 62. */
    public final static Byte BYTE_62 = 62;

    /** The Byte 63. */
    public final static Byte BYTE_63 = 63;

    /** The Byte 64. */
    public final static Byte BYTE_64 = 64;

    /** The Byte 65. */
    public final static Byte BYTE_65 = 65;

    /** The Byte 66. */
    public final static Byte BYTE_66 = 66;

    /** The Byte 67. */
    public final static Byte BYTE_67 = 67;

    /** The Byte 68. */
    public final static Byte BYTE_68 = 68;

    /** The Byte 69. */
    public final static Byte BYTE_69 = 69;

    /** The Byte 70. */
    public final static Byte BYTE_70 = 70;

    /** The Byte 71. */
    public final static Byte BYTE_71 = 71;

    /** The Byte 72. */
    public final static Byte BYTE_72 = 72;

    /** The Byte 73. */
    public final static Byte BYTE_73 = 73;

    /** The Byte 74. */
    public final static Byte BYTE_74 = 74;

    /** The Byte 75. */
    public final static Byte BYTE_75 = 75;

    /** The Byte 76. */
    public final static Byte BYTE_76 = 76;

    /** The Byte 77. */
    public final static Byte BYTE_77 = 77;

    /** The Byte 78. */
    public final static Byte BYTE_78 = 78;

    /** The Byte 79. */
    public final static Byte BYTE_79 = 79;

    /** The Byte 80. */
    public final static Byte BYTE_80 = 80;

    /** The Byte 81. */
    public final static Byte BYTE_81 = 81;

    /** The Byte 82. */
    public final static Byte BYTE_82 = 82;

    /** The Byte 83. */
    public final static Byte BYTE_83 = 83;

    /** The Byte 84. */
    public final static Byte BYTE_84 = 84;

    /** The Byte 85. */
    public final static Byte BYTE_85 = 85;

    /** The Byte 86. */
    public final static Byte BYTE_86 = 86;

    /** The Byte 87. */
    public final static Byte BYTE_87 = 87;

    /** The Byte 88. */
    public final static Byte BYTE_88 = 88;

    /** The Byte 89. */
    public final static Byte BYTE_89 = 89;

    /** The Byte 90. */
    public final static Byte BYTE_90 = 90;

    /** The Byte 91. */
    public final static Byte BYTE_91 = 91;

    /** The Byte 92. */
    public final static Byte BYTE_92 = 92;

    /** The Byte 93. */
    public final static Byte BYTE_93 = 93;

    /** The Byte 94. */
    public final static Byte BYTE_94 = 94;

    /** The Byte 95. */
    public final static Byte BYTE_95 = 95;

    /** The Byte 96. */
    public final static Byte BYTE_96 = 96;

    /** The Byte 97. */
    public final static Byte BYTE_97 = 97;

    /** The Byte 98. */
    public final static Byte BYTE_98 = 98;

    /** The Byte 99. */
    public final static Byte BYTE_99 = 99;

    /** A negative Byte. */
    public final static Byte BYTE_NEGATIVE = (byte) -Math.abs(randomByte());

    /** A positive Byte. */
    public final static Byte BYTE_POSITIVE = (byte) Math.abs(randomByte());

    /** A random Byte. */
    public final static Byte BYTE_RANDOM = randomByte();

    /** A small Byte from 0-100. */
    public final static Byte BYTE_SMALL = (byte) RandomIntegerUtil.randomBetween(0, 100);

    /** A random Double. */
    public final static Double DOUBLE = randomDouble();

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
    public final static Double DOUBLE_NEGATIVE = -Math.abs(randomDouble());

    /** A positive Double. */
    public final static Double DOUBLE_POSITIVE = Math.abs(randomDouble());

    /** A random Double. */
    public final static Double DOUBLE_RANDOM = randomDouble();

    /** A small Double between 0-100. */
    public final static Double DOUBLE_SMALL = RandomIntegerUtil.randomBetween(0, 10000) / 100D;

    /** A random Float. */
    public final static Float FLOAT = randomFloat();

    /** The Float 00. */
    public final static Float FLOAT_00 = 0F;

    /** The Float 01. */
    public final static Float FLOAT_01 = 1F;

    /** The Float 02. */
    public final static Float FLOAT_02 = 2F;

    /** The Float 03. */
    public final static Float FLOAT_03 = 3F;

    /** The Float 04. */
    public final static Float FLOAT_04 = 4F;

    /** The Float 05. */
    public final static Float FLOAT_05 = 5F;

    /** The Float 06. */
    public final static Float FLOAT_06 = 6F;

    /** The Float 07. */
    public final static Float FLOAT_07 = 7F;

    /** The Float 08. */
    public final static Float FLOAT_08 = 8F;

    /** The Float 09. */
    public final static Float FLOAT_09 = 9F;

    /** The Float 10. */
    public final static Float FLOAT_10 = 10F;

    /** The Float 100. */
    public final static Float FLOAT_100 = 100F;

    /** The Float 1000. */
    public final static Float FLOAT_1000 = 1000F;

    /** The Float 10000. */
    public final static Float FLOAT_10000 = 10000F;

    /** The Float 10001. */
    public final static Float FLOAT_10001 = 10001F;

    /** The Float 1001. */
    public final static Float FLOAT_1001 = 1001F;

    /** The Float 101. */
    public final static Float FLOAT_101 = 101F;

    /** The Float 11. */
    public final static Float FLOAT_11 = 11F;

    /** The Float 12. */
    public final static Float FLOAT_12 = 12F;

    /** The Float 13. */
    public final static Float FLOAT_13 = 13F;

    /** The Float 14. */
    public final static Float FLOAT_14 = 14F;

    /** The Float 15. */
    public final static Float FLOAT_15 = 15F;

    /** The Float 16. */
    public final static Float FLOAT_16 = 16F;

    /** The Float 17. */
    public final static Float FLOAT_17 = 17F;

    /** The Float 18. */
    public final static Float FLOAT_18 = 18F;

    /** The Float 19. */
    public final static Float FLOAT_19 = 19F;

    /** The Float 20. */
    public final static Float FLOAT_20 = 20F;

    /** The Float 21. */
    public final static Float FLOAT_21 = 21F;

    /** The Float 22. */
    public final static Float FLOAT_22 = 22F;

    /** The Float 23. */
    public final static Float FLOAT_23 = 23F;

    /** The Float 24. */
    public final static Float FLOAT_24 = 24F;

    /** The Float 25. */
    public final static Float FLOAT_25 = 25F;

    /** The Float 26. */
    public final static Float FLOAT_26 = 26F;

    /** The Float 27. */
    public final static Float FLOAT_27 = 27F;

    /** The Float 28. */
    public final static Float FLOAT_28 = 28F;

    /** The Float 29. */
    public final static Float FLOAT_29 = 29F;

    /** The Float 30. */
    public final static Float FLOAT_30 = 30F;

    /** The Float 31. */
    public final static Float FLOAT_31 = 31F;

    /** The Float 32. */
    public final static Float FLOAT_32 = 32F;

    /** The Float 33. */
    public final static Float FLOAT_33 = 33F;

    /** The Float 34. */
    public final static Float FLOAT_34 = 34F;

    /** The Float 35. */
    public final static Float FLOAT_35 = 35F;

    /** The Float 36. */
    public final static Float FLOAT_36 = 36F;

    /** The Float 37. */
    public final static Float FLOAT_37 = 37F;

    /** The Float 38. */
    public final static Float FLOAT_38 = 38F;

    /** The Float 39. */
    public final static Float FLOAT_39 = 39F;

    /** The Float 40. */
    public final static Float FLOAT_40 = 40F;

    /** The Float 41. */
    public final static Float FLOAT_41 = 41F;

    /** The Float 42. */
    public final static Float FLOAT_42 = 42F;

    /** The Float 43. */
    public final static Float FLOAT_43 = 43F;

    /** The Float 44. */
    public final static Float FLOAT_44 = 44F;

    /** The Float 45. */
    public final static Float FLOAT_45 = 45F;

    /** The Float 46. */
    public final static Float FLOAT_46 = 46F;

    /** The Float 47. */
    public final static Float FLOAT_47 = 47F;

    /** The Float 48. */
    public final static Float FLOAT_48 = 48F;

    /** The Float 49. */
    public final static Float FLOAT_49 = 49F;

    /** The Float 50. */
    public final static Float FLOAT_50 = 50F;

    /** The Float 51. */
    public final static Float FLOAT_51 = 51F;

    /** The Float 52. */
    public final static Float FLOAT_52 = 52F;

    /** The Float 53. */
    public final static Float FLOAT_53 = 53F;

    /** The Float 54. */
    public final static Float FLOAT_54 = 54F;

    /** The Float 55. */
    public final static Float FLOAT_55 = 55F;

    /** The Float 56. */
    public final static Float FLOAT_56 = 56F;

    /** The Float 57. */
    public final static Float FLOAT_57 = 57F;

    /** The Float 58. */
    public final static Float FLOAT_58 = 58F;

    /** The Float 59. */
    public final static Float FLOAT_59 = 59F;

    /** The Float 60. */
    public final static Float FLOAT_60 = 60F;

    /** The Float 61. */
    public final static Float FLOAT_61 = 61F;

    /** The Float 62. */
    public final static Float FLOAT_62 = 62F;

    /** The Float 63. */
    public final static Float FLOAT_63 = 63F;

    /** The Float 64. */
    public final static Float FLOAT_64 = 64F;

    /** The Float 65. */
    public final static Float FLOAT_65 = 65F;

    /** The Float 66. */
    public final static Float FLOAT_66 = 66F;

    /** The Float 67. */
    public final static Float FLOAT_67 = 67F;

    /** The Float 68. */
    public final static Float FLOAT_68 = 68F;

    /** The Float 69. */
    public final static Float FLOAT_69 = 69F;

    /** The Float 70. */
    public final static Float FLOAT_70 = 70F;

    /** The Float 71. */
    public final static Float FLOAT_71 = 71F;

    /** The Float 72. */
    public final static Float FLOAT_72 = 72F;

    /** The Float 73. */
    public final static Float FLOAT_73 = 73F;

    /** The Float 74. */
    public final static Float FLOAT_74 = 74F;

    /** The Float 75. */
    public final static Float FLOAT_75 = 75F;

    /** The Float 76. */
    public final static Float FLOAT_76 = 76F;

    /** The Float 77. */
    public final static Float FLOAT_77 = 77F;

    /** The Float 78. */
    public final static Float FLOAT_78 = 78F;

    /** The Float 79. */
    public final static Float FLOAT_79 = 79F;

    /** The Float 80. */
    public final static Float FLOAT_80 = 80F;

    /** The Float 81. */
    public final static Float FLOAT_81 = 81F;

    /** The Float 82. */
    public final static Float FLOAT_82 = 82F;

    /** The Float 83. */
    public final static Float FLOAT_83 = 83F;

    /** The Float 84. */
    public final static Float FLOAT_84 = 84F;

    /** The Float 85. */
    public final static Float FLOAT_85 = 85F;

    /** The Float 86. */
    public final static Float FLOAT_86 = 86F;

    /** The Float 87. */
    public final static Float FLOAT_87 = 87F;

    /** The Float 88. */
    public final static Float FLOAT_88 = 88F;

    /** The Float 89. */
    public final static Float FLOAT_89 = 89F;

    /** The Float 90. */
    public final static Float FLOAT_90 = 90F;

    /** The Float 91. */
    public final static Float FLOAT_91 = 91F;

    /** The Float 92. */
    public final static Float FLOAT_92 = 92F;

    /** The Float 93. */
    public final static Float FLOAT_93 = 93F;

    /** The Float 94. */
    public final static Float FLOAT_94 = 94F;

    /** The Float 95. */
    public final static Float FLOAT_95 = 95F;

    /** The Float 96. */
    public final static Float FLOAT_96 = 96F;

    /** The Float 97. */
    public final static Float FLOAT_97 = 97F;

    /** The Float 98. */
    public final static Float FLOAT_98 = 98F;

    /** The Float 99. */
    public final static Float FLOAT_99 = 99F;

    /** The Float 999. */
    public final static Float FLOAT_999 = 999F;

    /** The Float 9999. */
    public final static Float FLOAT_9999 = 9999F;

    /** A negative Float. */
    public final static Float FLOAT_NEGATIVE = -Math.abs(randomFloat());

    /** A positive Float. */
    public final static Float FLOAT_POSITIVE = Math.abs(randomFloat());

    /** A random Float. */
    public final static Float FLOAT_RANDOM = randomFloat();

    /** A small Float between 0-100. */
    public final static Float FLOAT_SMALL = RandomIntegerUtil.randomBetween(0, 10000) / 100F;

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
    public final static Short SHORT_NEGATIVE = (short) -Math.abs(randomShort());

    /** A positive Short. */
    public final static Short SHORT_POSITIVE = (short) Math.abs(randomShort());

    /** A random Short. */
    public final static Short SHORT_RANDOM = randomShort();

    /** A small Short between 0-100. */
    public final static Short SHORT_SMALL = (short) RandomIntegerUtil.randomBetween(0, 100);

}

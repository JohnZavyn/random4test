/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

/** Utilities for random {@link Character} creation. */
@SuppressWarnings({"unused", "RedundantSuppression"})
public class TestCharacter extends AbstractRandom<Character> {

    /** The Character 00 / x00 / (NUL - null). */
    public static final Character CHARACTER_00 = 0;

    /** The Character 01 / x01 / (SOH - start of heading). */
    public static final Character CHARACTER_01 = 1;

    /** The Character 02 / x02 / (STX - start of text). */
    public static final Character CHARACTER_02 = 2;

    /** The Character 03 / x03 / (ETX - end of text). */
    public static final Character CHARACTER_03 = 3;

    /** The Character 04 / x04 / (EOT - end of transmission). */
    public static final Character CHARACTER_04 = 4;

    /** The Character 05 / x05 / (ENQ - enquiry). */
    public static final Character CHARACTER_05 = 5;

    /** The Character 06 / x06 / (ACK = acknowledge). */
    public static final Character CHARACTER_06 = 6;

    /** The Character 07 / x07 / (BEL - bell). */
    public static final Character CHARACTER_07 = 7;

    /** The Character 08 / x08 / (BS - backspace). */
    public static final Character CHARACTER_08 = 8;

    /** The Character 09 / x09 / (HT - horizontal tabulation). */
    public static final Character CHARACTER_09 = 9;

    /** The Character 10 / x0A / (LF - line feed, NL new line). */
    public static final Character CHARACTER_10 = 10;

    /** The character 100 / x64 / d. */
    public static final Character CHARACTER_100 = 100;

    /** The character 101 / x65 / e. */
    public static final Character CHARACTER_101 = 101;

    /** The character 102 / x66 / f. */
    public static final Character CHARACTER_102 = 102;

    /** The character 103 / x67 / g. */
    public static final Character CHARACTER_103 = 103;

    /** The character 104 / x68 / h. */
    public static final Character CHARACTER_104 = 104;

    /** The character 105 / x69 / i. */
    public static final Character CHARACTER_105 = 105;

    /** The character 106 / x6A / j. */
    public static final Character CHARACTER_106 = 106;

    /** The character 107 / x6B / k. */
    public static final Character CHARACTER_107 = 107;

    /** The character 108 / x6C / l. */
    public static final Character CHARACTER_108 = 108;

    /** The character 109 / x6D / m. */
    public static final Character CHARACTER_109 = 109;

    /** The Character 11 / x0B / (VT - vertical tab). */
    public static final Character CHARACTER_11 = 11;

    /** The character 110 / x6E / n. */
    public static final Character CHARACTER_110 = 110;

    /** The character 111 / x6F / o. */
    public static final Character CHARACTER_111 = 111;

    /** The character 112 / x70 / p. */
    public static final Character CHARACTER_112 = 112;

    /** The character 113 / x71 / q. */
    public static final Character CHARACTER_113 = 113;

    /** The character 114 / x72 / r. */
    public static final Character CHARACTER_114 = 114;

    /** The character 115 / x73 / s. */
    public static final Character CHARACTER_115 = 115;

    /** The character 116 / x74 / t. */
    public static final Character CHARACTER_116 = 116;

    /** The character 117 / x75 / u. */
    public static final Character CHARACTER_117 = 117;

    /** The character 118 / x76 / v. */
    public static final Character CHARACTER_118 = 118;

    /** The character 119 / x77 / w. */
    public static final Character CHARACTER_119 = 119;

    /** The Character 12 / x0C / (FF - form feed). */
    public static final Character CHARACTER_12 = 12;

    /** The character 120 / x78 / x. */
    public static final Character CHARACTER_120 = 120;

    /** The character 121 / x79 / y. */
    public static final Character CHARACTER_121 = 121;

    /** The character 122 / x7A / z. */
    public static final Character CHARACTER_122 = 122;

    /** The character 123 / x7B / {. */
    public static final Character CHARACTER_123 = 123;

    /** The character 124 / x7C / |. */
    public static final Character CHARACTER_124 = 124;

    /** The character 125 / x7D / }. */
    public static final Character CHARACTER_125 = 125;

    /** The character 126 / x7E / ~. */
    public static final Character CHARACTER_126 = 126;

    /** The Character 13 / x0D / (CR - carriage return). */
    public static final Character CHARACTER_13 = 13;

    /** The Character 14 / x0E / (SO - shift out). */
    public static final Character CHARACTER_14 = 14;

    /** The Character 15 / x0F / (SI - shift in). */
    public static final Character CHARACTER_15 = 15;

    /** The Character 16 / x10 / (DLE - data link escape). */
    public static final Character CHARACTER_16 = 16;

    /** The Character 17 / x11 / (DC1 - device control 1, XON - transmission on). */
    public static final Character CHARACTER_17 = 17;

    /** The Character 18 / x12 / (DC2 - device control 2). */
    public static final Character CHARACTER_18 = 18;

    /** The Character 19 / x13 / (DC3 - device control 3, XOFF - transmission off). */
    public static final Character CHARACTER_19 = 19;

    /** The Character 20 / x14 / (DC4 - device control 4). */
    public static final Character CHARACTER_20 = 20;

    /** The Character 21 / x15 / (NAK - negative acknowledge). */
    public static final Character CHARACTER_21 = 21;

    /** The Character 22 / x16 / (SYN - synchronous idle). */
    public static final Character CHARACTER_22 = 22;

    /** The Character 23 / x17 / (ETB - end of transmission block). */
    public static final Character CHARACTER_23 = 23;

    /** The Character 24 / x18 / (CAN - cancel). */
    public static final Character CHARACTER_24 = 24;

    /** The Character 25 / x19 / (EM - end of medium). */
    public static final Character CHARACTER_25 = 25;

    /** The Character 26 / x1A / (SUB - substitute). */
    public static final Character CHARACTER_26 = 26;

    /** The Character 27 / x1B / (ESC - escape). */
    public static final Character CHARACTER_27 = 27;

    /** The Character 28 / x1C / (FS - file separator). */
    public static final Character CHARACTER_28 = 28;

    /** The Character 29 / x1D / (GS - group separator). */
    public static final Character CHARACTER_29 = 29;

    /** The Character 30 / x1E / (RS - record separator). */
    public static final Character CHARACTER_30 = 30;

    /** The Character 31 / x1F / (US - unit separator). */
    public static final Character CHARACTER_31 = 31;

    /** The Character 32 / x20 / SPACE. */
    public static final Character CHARACTER_32 = 32;

    /** The character 33 / x21 / !. */
    public static final Character CHARACTER_33 = 33;

    /** The character 34 / x22 / ". */
    public static final Character CHARACTER_34 = 34;

    /** The character 35 / x23 / #. */
    public static final Character CHARACTER_35 = 35;

    /** The character 36 / x24 / $. */
    public static final Character CHARACTER_36 = 36;

    /** The character 37 / x25 / %. */
    public static final Character CHARACTER_37 = 37;

    /** The character 38 / x26 / &amp;. */
    public static final Character CHARACTER_38 = 38;

    /** The character 39 / x27 / '. */
    public static final Character CHARACTER_39 = 39;

    /** The character 40 / x28 / (. */
    public static final Character CHARACTER_40 = 40;

    /** The character 41 / x29 / ). */
    public static final Character CHARACTER_41 = 41;

    /** The character 42 / x2A / *. */
    public static final Character CHARACTER_42 = 42;

    /** The character 43 / x2B / +. */
    public static final Character CHARACTER_43 = 43;

    /** The character 44 / x2C / ,. */
    public static final Character CHARACTER_44 = 44;

    /** The character 45 / x2D / -. */
    public static final Character CHARACTER_45 = 45;

    /** The character 46 / x2E / .. */
    public static final Character CHARACTER_46 = 46;

    /** The character 47 / x2F / /. */
    public static final Character CHARACTER_47 = 47;

    /** The character 48 / x30 / 0. */
    public static final Character CHARACTER_48 = 48;

    /** The character 49 / x31 / 1. */
    public static final Character CHARACTER_49 = 49;

    /** The character 50 / x32 / 2. */
    public static final Character CHARACTER_50 = 50;

    /** The character 51 / x33 / 3. */
    public static final Character CHARACTER_51 = 51;

    /** The character 52 / x34 / 4. */
    public static final Character CHARACTER_52 = 52;

    /** The character 53 / x35 / 5. */
    public static final Character CHARACTER_53 = 53;

    /** The character 54 / x36 / 6. */
    public static final Character CHARACTER_54 = 54;

    /** The character 55 / x37 / 7. */
    public static final Character CHARACTER_55 = 55;

    /** The character 56 / x38 / 8. */
    public static final Character CHARACTER_56 = 56;

    /** The character 57 / x39 / 9. */
    public static final Character CHARACTER_57 = 57;

    /** The character 58 / x3A / :. */
    public static final Character CHARACTER_58 = 58;

    /** The character 59 / x3B / ;. */
    public static final Character CHARACTER_59 = 59;

    /** The character 60 / x3C / &lt;. */
    public static final Character CHARACTER_60 = 60;

    /** The character 61 / x3D / =. */
    public static final Character CHARACTER_61 = 61;

    /** The character 62 / x3E / &gt;. */
    public static final Character CHARACTER_62 = 62;

    /** The character 63 / x3F / ?. */
    public static final Character CHARACTER_63 = 63;

    /** The character 64 / x40 / @. */
    public static final Character CHARACTER_64 = 64;

    /** The character 65 / x41 / A. */
    public static final Character CHARACTER_65 = 65;

    /** The character 66 / x42 / B. */
    public static final Character CHARACTER_66 = 66;

    /** The character 67 / x43 / C. */
    public static final Character CHARACTER_67 = 67;

    /** The character 68 / x44 / D. */
    public static final Character CHARACTER_68 = 68;

    /** The character 69 / x45 / E. */
    public static final Character CHARACTER_69 = 69;

    /** The character 70 / x46 / F. */
    public static final Character CHARACTER_70 = 70;

    /** The character 71 / x47 / G. */
    public static final Character CHARACTER_71 = 71;

    /** The character 72 / x48 / H. */
    public static final Character CHARACTER_72 = 72;

    /** The character 73 / x49 / I. */
    public static final Character CHARACTER_73 = 73;

    /** The character 74 / x4A / J. */
    public static final Character CHARACTER_74 = 74;

    /** The character 75 / x4B / K. */
    public static final Character CHARACTER_75 = 75;

    /** The character 76 / x4C / L. */
    public static final Character CHARACTER_76 = 76;

    /** The character 77 / x4D / M. */
    public static final Character CHARACTER_77 = 77;

    /** The character 78 / x4E / N. */
    public static final Character CHARACTER_78 = 78;

    /** The character 79 / x4F / O. */
    public static final Character CHARACTER_79 = 79;

    /** The character 80 / x50 / P. */
    public static final Character CHARACTER_80 = 80;

    /** The character 81 / x51 / Q. */
    public static final Character CHARACTER_81 = 81;

    /** The character 82 / x52 / R. */
    public static final Character CHARACTER_82 = 82;

    /** The character 83 / x53 / S. */
    public static final Character CHARACTER_83 = 83;

    /** The character 84 / x54 / T. */
    public static final Character CHARACTER_84 = 84;

    /** The character 85 / x55 / U. */
    public static final Character CHARACTER_85 = 85;

    /** The character 86 / x56 / V. */
    public static final Character CHARACTER_86 = 86;

    /** The character 87 / x57 / W. */
    public static final Character CHARACTER_87 = 87;

    /** The character 88 / x58 / X. */
    public static final Character CHARACTER_88 = 88;

    /** The character 89 / x59 / Y. */
    public static final Character CHARACTER_89 = 89;

    /** The character 90 / x5A / Z. */
    public static final Character CHARACTER_90 = 90;

    /** The character 91 / x5B / [. */
    public static final Character CHARACTER_91 = 91;

    /** The character 92 / x5C / \. */
    public static final Character CHARACTER_92 = 92;

    /** The character 93 / x5D / ]. */
    public static final Character CHARACTER_93 = 93;

    /** The character 94 / x5E / ^. */
    public static final Character CHARACTER_94 = 94;

    /** The character 95 / x5F / _. */
    public static final Character CHARACTER_95 = 95;

    /** The character 96 / x60 / `. */
    public static final Character CHARACTER_96 = 96;

    /** The character 97 / x61 / a. */
    public static final Character CHARACTER_97 = 97;

    /** The character 98 / x62 / b. */
    public static final Character CHARACTER_98 = 98;

    /** The character 99 / x63 / c. */
    public static final Character CHARACTER_99 = 99;

    /** The Character 00 / x00 / (NUL - null). */
    public static final Character C_00 = 0;

    /** The Character 01 / x01 / (SOH - start of heading). */
    public static final Character C_01 = 1;

    /** The Character 02 / x02 / (STX - start of text). */
    public static final Character C_02 = 2;

    /** The Character 03 / x03 / (ETX - end of text). */
    public static final Character C_03 = 3;

    /** The Character 04 / x04 / (EOT - end of transmission). */
    public static final Character C_04 = 4;

    /** The Character 05 / x05 / (ENQ - enquiry). */
    public static final Character C_05 = 5;

    /** The Character 06 / x06 / (ACK = acknowledge). */
    public static final Character C_06 = 6;

    /** The Character 07 / x07 / (BEL - bell). */
    public static final Character C_07 = 7;

    /** The Character 08 / x08 / (BS - backspace). */
    public static final Character C_08 = 8;

    /** The Character 09 / x09 / (HT - horizontal tabulation). */
    public static final Character C_09 = 9;

    /** The Character 10 / x0A / (LF - line feed, NL new line). */
    public static final Character C_10 = 10;

    /** The character 100 / x64 / d. */
    public static final Character C_100 = 100;

    /** The character 101 / x65 / e. */
    public static final Character C_101 = 101;

    /** The character 102 / x66 / f. */
    public static final Character C_102 = 102;

    /** The character 103 / x67 / g. */
    public static final Character C_103 = 103;

    /** The character 104 / x68 / h. */
    public static final Character C_104 = 104;

    /** The character 105 / x69 / i. */
    public static final Character C_105 = 105;

    /** The character 106 / x6A / j. */
    public static final Character C_106 = 106;

    /** The character 107 / x6B / k. */
    public static final Character C_107 = 107;

    /** The character 108 / x6C / l. */
    public static final Character C_108 = 108;

    /** The character 109 / x6D / m. */
    public static final Character C_109 = 109;

    /** The Character 11 / x0B / (VT - vertical tab). */
    public static final Character C_11 = 11;

    /** The character 110 / x6E / n. */
    public static final Character C_110 = 110;

    /** The character 111 / x6F / o. */
    public static final Character C_111 = 111;

    /** The character 112 / x70 / p. */
    public static final Character C_112 = 112;

    /** The character 113 / x71 / q. */
    public static final Character C_113 = 113;

    /** The character 114 / x72 / r. */
    public static final Character C_114 = 114;

    /** The character 115 / x73 / s. */
    public static final Character C_115 = 115;

    /** The character 116 / x74 / t. */
    public static final Character C_116 = 116;

    /** The character 117 / x75 / u. */
    public static final Character C_117 = 117;

    /** The character 118 / x76 / v. */
    public static final Character C_118 = 118;

    /** The character 119 / x77 / w. */
    public static final Character C_119 = 119;

    /** The Character 12 / x0C / (FF - form feed). */
    public static final Character C_12 = 12;

    /** The character 120 / x78 / x. */
    public static final Character C_120 = 120;

    /** The character 121 / x79 / y. */
    public static final Character C_121 = 121;

    /** The character 122 / x7A / z. */
    public static final Character C_122 = 122;

    /** The character 123 / x7B / {. */
    public static final Character C_123 = 123;

    /** The character 124 / x7C / |. */
    public static final Character C_124 = 124;

    /** The character 125 / x7D / }. */
    public static final Character C_125 = 125;

    /** The character 126 / x7E / ~. */
    public static final Character C_126 = 126;

    /** The Character 13 / x0D / (CR - carriage return). */
    public static final Character C_13 = 13;

    /** The Character 14 / x0E / (SO - shift out). */
    public static final Character C_14 = 14;

    /** The Character 15 / x0F / (SI - shift in). */
    public static final Character C_15 = 15;

    /** The Character 16 / x10 / (DLE - data link escape). */
    public static final Character C_16 = 16;

    /** The Character 17 / x11 / (DC1 - device control 1, XON - transmission on). */
    public static final Character C_17 = 17;

    /** The Character 18 / x12 / (DC2 - device control 2). */
    public static final Character C_18 = 18;

    /** The Character 19 / x13 / (DC3 - device control 3, XOFF - transmission off). */
    public static final Character C_19 = 19;

    /** The Character 20 / x14 / (DC4 - device control 4). */
    public static final Character C_20 = 20;

    /** The Character 21 / x15 / (NAK - negative acknowledge). */
    public static final Character C_21 = 21;

    /** The Character 22 / x16 / (SYN - synchronous idle). */
    public static final Character C_22 = 22;

    /** The Character 23 / x17 / (ETB - end of transmission block). */
    public static final Character C_23 = 23;

    /** The Character 24 / x18 / (CAN - cancel). */
    public static final Character C_24 = 24;

    /** The Character 25 / x19 / (EM - end of medium). */
    public static final Character C_25 = 25;

    /** The Character 26 / x1A / (SUB - substitute). */
    public static final Character C_26 = 26;

    /** The Character 27 / x1B / (ESC - escape). */
    public static final Character C_27 = 27;

    /** The Character 28 / x1C / (FS - file separator). */
    public static final Character C_28 = 28;

    /** The Character 29 / x1D / (GS - group separator). */
    public static final Character C_29 = 29;

    /** The Character 30 / x1E / (RS - record separator). */
    public static final Character C_30 = 30;

    /** The Character 31 / x1F / (US - unit separator). */
    public static final Character C_31 = 31;

    /** The Character 32 / x20 / SPACE. */
    public static final Character C_32 = 32;

    /** The character 33 / x21 / !. */
    public static final Character C_33 = 33;

    /** The character 34 / x22 / ". */
    public static final Character C_34 = 34;

    /** The character 35 / x23 / #. */
    public static final Character C_35 = 35;

    /** The character 36 / x24 / $. */
    public static final Character C_36 = 36;

    /** The character 37 / x25 / %. */
    public static final Character C_37 = 37;

    /** The character 38 / x26 / &amp;. */
    public static final Character C_38 = 38;

    /** The character 39 / x27 / '. */
    public static final Character C_39 = 39;

    /** The character 40 / x28 / (. */
    public static final Character C_40 = 40;

    /** The character 41 / x29 / ). */
    public static final Character C_41 = 41;

    /** The character 42 / x2A / *. */
    public static final Character C_42 = 42;

    /** The character 43 / x2B / +. */
    public static final Character C_43 = 43;

    /** The character 44 / x2C / ,. */
    public static final Character C_44 = 44;

    /** The character 45 / x2D / -. */
    public static final Character C_45 = 45;

    /** The character 46 / x2E / .. */
    public static final Character C_46 = 46;

    /** The character 47 / x2F / /. */
    public static final Character C_47 = 47;

    /** The character 48 / x30 / 0. */
    public static final Character C_48 = 48;

    /** The character 49 / x31 / 1. */
    public static final Character C_49 = 49;

    /** The character 50 / x32 / 2. */
    public static final Character C_50 = 50;

    /** The character 51 / x33 / 3. */
    public static final Character C_51 = 51;

    /** The character 52 / x34 / 4. */
    public static final Character C_52 = 52;

    /** The character 53 / x35 / 5. */
    public static final Character C_53 = 53;

    /** The character 54 / x36 / 6. */
    public static final Character C_54 = 54;

    /** The character 55 / x37 / 7. */
    public static final Character C_55 = 55;

    /** The character 56 / x38 / 8. */
    public static final Character C_56 = 56;

    /** The character 57 / x39 / 9. */
    public static final Character C_57 = 57;

    /** The character 58 / x3A / :. */
    public static final Character C_58 = 58;

    /** The character 59 / x3B / ;. */
    public static final Character C_59 = 59;

    /** The character 60 / x3C / &lt;. */
    public static final Character C_60 = 60;

    /** The character 61 / x3D / =. */
    public static final Character C_61 = 61;

    /** The character 62 / x3E / &gt;. */
    public static final Character C_62 = 62;

    /** The character 63 / x3F / ?. */
    public static final Character C_63 = 63;

    /** The character 64 / x40 / @. */
    public static final Character C_64 = 64;

    /** The character 65 / x41 / A. */
    public static final Character C_65 = 65;

    /** The character 66 / x42 / B. */
    public static final Character C_66 = 66;

    /** The character 67 / x43 / C. */
    public static final Character C_67 = 67;

    /** The character 68 / x44 / D. */
    public static final Character C_68 = 68;

    /** The character 69 / x45 / E. */
    public static final Character C_69 = 69;

    /** The character 70 / x46 / F. */
    public static final Character C_70 = 70;

    /** The character 71 / x47 / G. */
    public static final Character C_71 = 71;

    /** The character 72 / x48 / H. */
    public static final Character C_72 = 72;

    /** The character 73 / x49 / I. */
    public static final Character C_73 = 73;

    /** The character 74 / x4A / J. */
    public static final Character C_74 = 74;

    /** The character 75 / x4B / K. */
    public static final Character C_75 = 75;

    /** The character 76 / x4C / L. */
    public static final Character C_76 = 76;

    /** The character 77 / x4D / M. */
    public static final Character C_77 = 77;

    /** The character 78 / x4E / N. */
    public static final Character C_78 = 78;

    /** The character 79 / x4F / O. */
    public static final Character C_79 = 79;

    /** The character 80 / x50 / P. */
    public static final Character C_80 = 80;

    /** The character 81 / x51 / Q. */
    public static final Character C_81 = 81;

    /** The character 82 / x52 / R. */
    public static final Character C_82 = 82;

    /** The character 83 / x53 / S. */
    public static final Character C_83 = 83;

    /** The character 84 / x54 / T. */
    public static final Character C_84 = 84;

    /** The character 85 / x55 / U. */
    public static final Character C_85 = 85;

    /** The character 86 / x56 / V. */
    public static final Character C_86 = 86;

    /** The character 87 / x57 / W. */
    public static final Character C_87 = 87;

    /** The character 88 / x58 / X. */
    public static final Character C_88 = 88;

    /** The character 89 / x59 / Y. */
    public static final Character C_89 = 89;

    /** The character 90 / x5A / Z. */
    public static final Character C_90 = 90;

    /** The character 91 / x5B / [. */
    public static final Character C_91 = 91;

    /** The character 92 / x5C / \. */
    public static final Character C_92 = 92;

    /** The character 93 / x5D / ]. */
    public static final Character C_93 = 93;

    /** The character 94 / x5E / ^. */
    public static final Character C_94 = 94;

    /** The character 95 / x5F / _. */
    public static final Character C_95 = 95;

    /** The character 96 / x60 / `. */
    public static final Character C_96 = 96;

    /** The character 97 / x61 / a. */
    public static final Character C_97 = 97;

    /** The character 98 / x62 / b. */
    public static final Character C_98 = 98;

    /** The character 99 / x63 / c. */
    public static final Character C_99 = 99;

    /** The instance of {@link TestCharacter}. */
    public static final TestCharacter INSTANCE = new TestCharacter();

    /** A random Character. */
    public static final Character CHAR = randomCharacter();

    /** A random Character. */
    public static final Character CHARACTER_RANDOM = randomCharacter();

    /** A random primitive char. */
    public static final char C_RANDOM = randomCharacter();

    /** Instantiate a utility to produce randomized {@link Character} objects. */
    public TestCharacter() {
        super(Character.class);
    }

    /**
     * Return a random char between two chars, inclusive.
     *
     * @param char1 a char
     * @param char2 another char
     *
     * @return the random char
     */
    public static char randomBetween(final char char1, final char char2) {
        return (char) TestInteger.randomBetween(char1, char2);
    }

    /**
     * Return a random char.
     *
     * @return the char
     */
    public static char randomCharacter() {
        return INSTANCE.random();
    }

    /**
     * Return a random char.
     *
     * @return the char
     */
    @Override
    public Character random() {
        return randomBetween(Character.MIN_VALUE, Character.MAX_VALUE);
    }
}

/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.randomBetween;
import static com.threeleaf.test.random.TestRandom.RANDOM;
import static java.lang.Character.*;
import static java.lang.Character.UnicodeScript.*;

import java.util.Collection;

import com.google.common.collect.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Return a single character from a Unicode script.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Script_(Unicode)">Unicode Script</a>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharRangeUnicodeScript extends Char {

    /**
     * A map with all the Unicode script ranges. Note that the pattern matcher does not always
     * match these properly. For example, the
     * <a href="https://en.wikipedia.org/wiki/Cherokee_(Unicode_block)">Cherokee
     * Unicode</a> range is \u13A0-\u13FF, but the matcher in Java 8 only recognizes
     * \u13A0-\u13EF. The Java 11 matcher seems to be more accurate, but will still fail on
     * undefined characters within the range (for example, \u13F6).
     */
    @SuppressWarnings("checkstyle:AvoidEscapedUnicodeCharacters" /* Unicode ranges easier to see */)
    public static final Multimap<UnicodeScript, Pair<Integer, Integer>> UNICODE_BLOCK_SCRIPTS =
        ImmutableMultimap.<UnicodeScript, Pair<Integer, Integer>>builder()
            .put(COMMON, new ImmutablePair<>(0x0000, 0x0040))
            .put(LATIN, new ImmutablePair<>(0x0041, 0x005A))
            .put(COMMON, new ImmutablePair<>(0x005B, 0x0060))
            .put(LATIN, new ImmutablePair<>(0x0061, 0x007A))
            .put(COMMON, new ImmutablePair<>(0x007B, 0x00A9))
            .put(LATIN, new ImmutablePair<>(0x00AA, 0x00AA))
            .put(COMMON, new ImmutablePair<>(0x00AB, 0x00B9))
            .put(LATIN, new ImmutablePair<>(0x00BA, 0x00BA))
            .put(COMMON, new ImmutablePair<>(0x00BB, 0x00BF))
            .put(LATIN, new ImmutablePair<>(0x00C0, 0x00D6))
            .put(COMMON, new ImmutablePair<>(0x00D7, 0x00D7))
            .put(LATIN, new ImmutablePair<>(0x00D8, 0x00F6))
            .put(COMMON, new ImmutablePair<>(0x00F7, 0x00F7))
            .put(LATIN, new ImmutablePair<>(0x00F8, 0x02B8))
            .put(COMMON, new ImmutablePair<>(0x02B9, 0x02DF))
            .put(LATIN, new ImmutablePair<>(0x02E0, 0x02E4))
            .put(COMMON, new ImmutablePair<>(0x02E5, 0x02E9))
            .put(BOPOMOFO, new ImmutablePair<>(0x02EA, 0x02EB))
            .put(COMMON, new ImmutablePair<>(0x02EC, 0x02FF))
            .put(INHERITED, new ImmutablePair<>(0x0300, 0x036F))
            .put(GREEK, new ImmutablePair<>(0x0370, 0x0373))
            .put(COMMON, new ImmutablePair<>(0x0374, 0x0374))
            .put(GREEK, new ImmutablePair<>(0x0375, 0x037D))
            .put(COMMON, new ImmutablePair<>(0x037E, 0x0383))
            .put(GREEK, new ImmutablePair<>(0x0384, 0x0384))
            .put(COMMON, new ImmutablePair<>(0x0385, 0x0385))
            .put(GREEK, new ImmutablePair<>(0x0386, 0x0386))
            .put(COMMON, new ImmutablePair<>(0x0387, 0x0387))
            .put(GREEK, new ImmutablePair<>(0x0388, 0x03E1))
            .put(COPTIC, new ImmutablePair<>(0x03E2, 0x03EF))
            .put(GREEK, new ImmutablePair<>(0x03F0, 0x03FF))
            .put(CYRILLIC, new ImmutablePair<>(0x0400, 0x0484))
            .put(INHERITED, new ImmutablePair<>(0x0485, 0x0486))
            .put(CYRILLIC, new ImmutablePair<>(0x0487, 0x0530))
            .put(ARMENIAN, new ImmutablePair<>(0x0531, 0x0588))
            .put(COMMON, new ImmutablePair<>(0x0589, 0x0589))
            .put(ARMENIAN, new ImmutablePair<>(0x058A, 0x0590))
            .put(HEBREW, new ImmutablePair<>(0x0591, 0x05FF))
            .put(ARABIC, new ImmutablePair<>(0x0600, 0x060B))
            .put(COMMON, new ImmutablePair<>(0x060C, 0x060C))
            .put(ARABIC, new ImmutablePair<>(0x060D, 0x061A))
            .put(COMMON, new ImmutablePair<>(0x061B, 0x061D))
            .put(ARABIC, new ImmutablePair<>(0x061E, 0x061E))
            .put(COMMON, new ImmutablePair<>(0x061F, 0x061F))
            .put(ARABIC, new ImmutablePair<>(0x0620, 0x063F))
            .put(COMMON, new ImmutablePair<>(0x0640, 0x0640))
            .put(ARABIC, new ImmutablePair<>(0x0641, 0x064A))
            .put(INHERITED, new ImmutablePair<>(0x064B, 0x0655))
            .put(ARABIC, new ImmutablePair<>(0x0656, 0x065F))
            .put(COMMON, new ImmutablePair<>(0x0660, 0x0669))
            .put(ARABIC, new ImmutablePair<>(0x066A, 0x066F))
            .put(INHERITED, new ImmutablePair<>(0x0670, 0x0670))
            .put(ARABIC, new ImmutablePair<>(0x0671, 0x06DC))
            .put(COMMON, new ImmutablePair<>(0x06DD, 0x06DD))
            .put(ARABIC, new ImmutablePair<>(0x06DE, 0x06FF))
            .put(SYRIAC, new ImmutablePair<>(0x0700, 0x074F))
            .put(ARABIC, new ImmutablePair<>(0x0750, 0x077F))
            .put(THAANA, new ImmutablePair<>(0x0780, 0x07BF))
            .put(NKO, new ImmutablePair<>(0x07C0, 0x07FF))
            .put(SAMARITAN, new ImmutablePair<>(0x0800, 0x083F))
            .put(MANDAIC, new ImmutablePair<>(0x0840, 0x089F))
            .put(ARABIC, new ImmutablePair<>(0x08A0, 0x08FF))
            .put(DEVANAGARI, new ImmutablePair<>(0x0900, 0x0950))
            .put(INHERITED, new ImmutablePair<>(0x0951, 0x0952))
            .put(DEVANAGARI, new ImmutablePair<>(0x0953, 0x0963))
            .put(COMMON, new ImmutablePair<>(0x0964, 0x0965))
            .put(DEVANAGARI, new ImmutablePair<>(0x0966, 0x0980))
            .put(BENGALI, new ImmutablePair<>(0x0981, 0x0A00))
            .put(GURMUKHI, new ImmutablePair<>(0x0A01, 0x0A80))
            .put(GUJARATI, new ImmutablePair<>(0x0A81, 0x0B00))
            .put(ORIYA, new ImmutablePair<>(0x0B01, 0x0B81))
            .put(TAMIL, new ImmutablePair<>(0x0B82, 0x0C00))
            .put(TELUGU, new ImmutablePair<>(0x0C01, 0x0C81))
            .put(KANNADA, new ImmutablePair<>(0x0C82, 0x0CF0))
            .put(MALAYALAM, new ImmutablePair<>(0x0D02, 0x0D81))
            .put(SINHALA, new ImmutablePair<>(0x0D82, 0x0E00))
            .put(THAI, new ImmutablePair<>(0x0E01, 0x0E3E))
            .put(COMMON, new ImmutablePair<>(0x0E3F, 0x0E3F))
            .put(THAI, new ImmutablePair<>(0x0E40, 0x0E80))
            .put(LAO, new ImmutablePair<>(0x0E81, 0x0EFF))
            .put(TIBETAN, new ImmutablePair<>(0x0F00, 0x0FD4))
            .put(COMMON, new ImmutablePair<>(0x0FD5, 0x0FD8))
            .put(TIBETAN, new ImmutablePair<>(0x0FD9, 0x0FFF))
            .put(MYANMAR, new ImmutablePair<>(0x1000, 0x109F))
            .put(GEORGIAN, new ImmutablePair<>(0x10A0, 0x10FA))
            .put(COMMON, new ImmutablePair<>(0x10FB, 0x10FB))
            .put(GEORGIAN, new ImmutablePair<>(0x10FC, 0x10FF))
            .put(HANGUL, new ImmutablePair<>(0x1100, 0x11FF))
            .put(ETHIOPIC, new ImmutablePair<>(0x1200, 0x139F))
            .put(CHEROKEE, new ImmutablePair<>(0x13A0, 0x13FF))
            .put(CANADIAN_ABORIGINAL, new ImmutablePair<>(0x1400, 0x167F))
            .put(OGHAM, new ImmutablePair<>(0x1680, 0x169F))
            .put(RUNIC, new ImmutablePair<>(0x16A0, 0x16EA))
            .put(COMMON, new ImmutablePair<>(0x16EB, 0x16ED))
            .put(RUNIC, new ImmutablePair<>(0x16EE, 0x16FF))
            .put(TAGALOG, new ImmutablePair<>(0x1700, 0x171F))
            .put(HANUNOO, new ImmutablePair<>(0x1720, 0x1734))
            .put(COMMON, new ImmutablePair<>(0x1735, 0x173F))
            .put(BUHID, new ImmutablePair<>(0x1740, 0x175F))
            .put(TAGBANWA, new ImmutablePair<>(0x1760, 0x177F))
            .put(KHMER, new ImmutablePair<>(0x1780, 0x17FF))
            .put(MONGOLIAN, new ImmutablePair<>(0x1800, 0x1801))
            .put(COMMON, new ImmutablePair<>(0x1802, 0x1803))
            .put(MONGOLIAN, new ImmutablePair<>(0x1804, 0x1804))
            .put(COMMON, new ImmutablePair<>(0x1805, 0x1805))
            .put(MONGOLIAN, new ImmutablePair<>(0x1806, 0x18AF))
            .put(CANADIAN_ABORIGINAL, new ImmutablePair<>(0x18B0, 0x18FF))
            .put(LIMBU, new ImmutablePair<>(0x1900, 0x194F))
            .put(TAI_LE, new ImmutablePair<>(0x1950, 0x197F))
            .put(NEW_TAI_LUE, new ImmutablePair<>(0x1980, 0x19DF))
            .put(KHMER, new ImmutablePair<>(0x19E0, 0x19FF))
            .put(BUGINESE, new ImmutablePair<>(0x1A00, 0x1A1F))
            .put(TAI_THAM, new ImmutablePair<>(0x1A20, 0x1AFF))
            .put(BALINESE, new ImmutablePair<>(0x1B00, 0x1B7F))
            .put(SUNDANESE, new ImmutablePair<>(0x1B80, 0x1BBF))
            .put(BATAK, new ImmutablePair<>(0x1BC0, 0x1BFF))
            .put(LEPCHA, new ImmutablePair<>(0x1C00, 0x1C4F))
            .put(OL_CHIKI, new ImmutablePair<>(0x1C50, 0x1CBF))
            .put(SUNDANESE, new ImmutablePair<>(0x1CC0, 0x1CCF))
            .put(INHERITED, new ImmutablePair<>(0x1CD0, 0x1CD2))
            .put(COMMON, new ImmutablePair<>(0x1CD3, 0x1CD3))
            .put(INHERITED, new ImmutablePair<>(0x1CD4, 0x1CE0))
            .put(COMMON, new ImmutablePair<>(0x1CE1, 0x1CE1))
            .put(INHERITED, new ImmutablePair<>(0x1CE2, 0x1CE8))
            .put(COMMON, new ImmutablePair<>(0x1CE9, 0x1CEC))
            .put(INHERITED, new ImmutablePair<>(0x1CED, 0x1CED))
            .put(COMMON, new ImmutablePair<>(0x1CEE, 0x1CF3))
            .put(INHERITED, new ImmutablePair<>(0x1CF4, 0x1CF4))
            .put(COMMON, new ImmutablePair<>(0x1CF5, 0x1CFF))
            .put(LATIN, new ImmutablePair<>(0x1D00, 0x1D25))
            .put(GREEK, new ImmutablePair<>(0x1D26, 0x1D2A))
            .put(CYRILLIC, new ImmutablePair<>(0x1D2B, 0x1D2B))
            .put(LATIN, new ImmutablePair<>(0x1D2C, 0x1D5C))
            .put(GREEK, new ImmutablePair<>(0x1D5D, 0x1D61))
            .put(LATIN, new ImmutablePair<>(0x1D62, 0x1D65))
            .put(GREEK, new ImmutablePair<>(0x1D66, 0x1D6A))
            .put(LATIN, new ImmutablePair<>(0x1D6B, 0x1D77))
            .put(CYRILLIC, new ImmutablePair<>(0x1D78, 0x1D78))
            .put(LATIN, new ImmutablePair<>(0x1D79, 0x1DBE))
            .put(GREEK, new ImmutablePair<>(0x1DBF, 0x1DBF))
            .put(INHERITED, new ImmutablePair<>(0x1DC0, 0x1DFF))
            .put(LATIN, new ImmutablePair<>(0x1E00, 0x1EFF))
            .put(GREEK, new ImmutablePair<>(0x1F00, 0x1FFF))
            .put(COMMON, new ImmutablePair<>(0x2000, 0x200B))
            .put(INHERITED, new ImmutablePair<>(0x200C, 0x200D))
            .put(COMMON, new ImmutablePair<>(0x200E, 0x2070))
            .put(LATIN, new ImmutablePair<>(0x2071, 0x2073))
            .put(COMMON, new ImmutablePair<>(0x2074, 0x207E))
            .put(LATIN, new ImmutablePair<>(0x207F, 0x207F))
            .put(COMMON, new ImmutablePair<>(0x2080, 0x208F))
            .put(LATIN, new ImmutablePair<>(0x2090, 0x209F))
            .put(COMMON, new ImmutablePair<>(0x20A0, 0x20CF))
            .put(INHERITED, new ImmutablePair<>(0x20D0, 0x20FF))
            .put(COMMON, new ImmutablePair<>(0x2100, 0x2125))
            .put(GREEK, new ImmutablePair<>(0x2126, 0x2126))
            .put(COMMON, new ImmutablePair<>(0x2127, 0x2129))
            .put(LATIN, new ImmutablePair<>(0x212A, 0x212B))
            .put(COMMON, new ImmutablePair<>(0x212C, 0x2131))
            .put(LATIN, new ImmutablePair<>(0x2132, 0x2132))
            .put(COMMON, new ImmutablePair<>(0x2133, 0x214D))
            .put(LATIN, new ImmutablePair<>(0x214E, 0x214E))
            .put(COMMON, new ImmutablePair<>(0x214F, 0x215F))
            .put(LATIN, new ImmutablePair<>(0x2160, 0x2188))
            .put(COMMON, new ImmutablePair<>(0x2189, 0x27FF))
            .put(BRAILLE, new ImmutablePair<>(0x2800, 0x28FF))
            .put(COMMON, new ImmutablePair<>(0x2900, 0x2BFF))
            .put(GLAGOLITIC, new ImmutablePair<>(0x2C00, 0x2C5F))
            .put(LATIN, new ImmutablePair<>(0x2C60, 0x2C7F))
            .put(COPTIC, new ImmutablePair<>(0x2C80, 0x2CFF))
            .put(GEORGIAN, new ImmutablePair<>(0x2D00, 0x2D2F))
            .put(TIFINAGH, new ImmutablePair<>(0x2D30, 0x2D7F))
            .put(ETHIOPIC, new ImmutablePair<>(0x2D80, 0x2DDF))
            .put(CYRILLIC, new ImmutablePair<>(0x2DE0, 0x2DFF))
            .put(COMMON, new ImmutablePair<>(0x2E00, 0x2E7F))
            .put(HAN, new ImmutablePair<>(0x2E80, 0x2FEF))
            .put(COMMON, new ImmutablePair<>(0x2FF0, 0x3004))
            .put(HAN, new ImmutablePair<>(0x3005, 0x3005))
            .put(COMMON, new ImmutablePair<>(0x3006, 0x3006))
            .put(HAN, new ImmutablePair<>(0x3007, 0x3007))
            .put(COMMON, new ImmutablePair<>(0x3008, 0x3020))
            .put(HAN, new ImmutablePair<>(0x3021, 0x3029))
            .put(INHERITED, new ImmutablePair<>(0x302A, 0x302D))
            .put(HANGUL, new ImmutablePair<>(0x302E, 0x302F))
            .put(COMMON, new ImmutablePair<>(0x3030, 0x3037))
            .put(HAN, new ImmutablePair<>(0x3038, 0x303B))
            .put(COMMON, new ImmutablePair<>(0x303C, 0x3040))
            .put(HIRAGANA, new ImmutablePair<>(0x3041, 0x3098))
            .put(INHERITED, new ImmutablePair<>(0x3099, 0x309A))
            .put(COMMON, new ImmutablePair<>(0x309B, 0x309C))
            .put(HIRAGANA, new ImmutablePair<>(0x309D, 0x309F))
            .put(COMMON, new ImmutablePair<>(0x30A0, 0x30A0))
            .put(KATAKANA, new ImmutablePair<>(0x30A1, 0x30FA))
            .put(COMMON, new ImmutablePair<>(0x30FB, 0x30FC))
            .put(KATAKANA, new ImmutablePair<>(0x30FD, 0x3104))
            .put(BOPOMOFO, new ImmutablePair<>(0x3105, 0x3130))
            .put(HANGUL, new ImmutablePair<>(0x3131, 0x318F))
            .put(COMMON, new ImmutablePair<>(0x3190, 0x319F))
            .put(BOPOMOFO, new ImmutablePair<>(0x31A0, 0x31BF))
            .put(COMMON, new ImmutablePair<>(0x31C0, 0x31EF))
            .put(KATAKANA, new ImmutablePair<>(0x31F0, 0x31FF))
            .put(HANGUL, new ImmutablePair<>(0x3200, 0x321F))
            .put(COMMON, new ImmutablePair<>(0x3220, 0x325F))
            .put(HANGUL, new ImmutablePair<>(0x3260, 0x327E))
            .put(COMMON, new ImmutablePair<>(0x327F, 0x32CF))
            .put(KATAKANA, new ImmutablePair<>(0x32D0, 0x3357))
            .put(COMMON, new ImmutablePair<>(0x3358, 0x33FF))
            .put(HAN, new ImmutablePair<>(0x3400, 0x4DBF))
            .put(COMMON, new ImmutablePair<>(0x4DC0, 0x4DFF))
            .put(HAN, new ImmutablePair<>(0x4E00, 0x9FFF))
            .put(YI, new ImmutablePair<>(0xA000, 0xA4CF))
            .put(LISU, new ImmutablePair<>(0xA4D0, 0xA4FF))
            .put(VAI, new ImmutablePair<>(0xA500, 0xA63F))
            .put(CYRILLIC, new ImmutablePair<>(0xA640, 0xA69F))
            .put(BAMUM, new ImmutablePair<>(0xA6A0, 0xA6FF))
            .put(COMMON, new ImmutablePair<>(0xA700, 0xA721))
            .put(LATIN, new ImmutablePair<>(0xA722, 0xA787))
            .put(COMMON, new ImmutablePair<>(0xA788, 0xA78A))
            .put(LATIN, new ImmutablePair<>(0xA78B, 0xA7FF))
            .put(SYLOTI_NAGRI, new ImmutablePair<>(0xA800, 0xA82F))
            .put(COMMON, new ImmutablePair<>(0xA830, 0xA83F))
            .put(PHAGS_PA, new ImmutablePair<>(0xA840, 0xA87F))
            .put(SAURASHTRA, new ImmutablePair<>(0xA880, 0xA8DF))
            .put(DEVANAGARI, new ImmutablePair<>(0xA8E0, 0xA8FF))
            .put(KAYAH_LI, new ImmutablePair<>(0xA900, 0xA92F))
            .put(REJANG, new ImmutablePair<>(0xA930, 0xA95F))
            .put(HANGUL, new ImmutablePair<>(0xA960, 0xA97F))
            .put(JAVANESE, new ImmutablePair<>(0xA980, 0xA9FF))
            .put(CHAM, new ImmutablePair<>(0xAA00, 0xAA5F))
            .put(MYANMAR, new ImmutablePair<>(0xAA60, 0xAA7F))
            .put(TAI_VIET, new ImmutablePair<>(0xAA80, 0xAADF))
            .put(MEETEI_MAYEK, new ImmutablePair<>(0xAAE0, 0xAB00))
            .put(ETHIOPIC, new ImmutablePair<>(0xAB01, 0xABBF))
            .put(MEETEI_MAYEK, new ImmutablePair<>(0xABC0, 0xABFF))
            .put(HANGUL, new ImmutablePair<>(0xAC00, 0xD7FB))
            .put(UNKNOWN, new ImmutablePair<>(0xD7FC, 0xF8FF))
            .put(HAN, new ImmutablePair<>(0xF900, 0xFAFF))
            .put(LATIN, new ImmutablePair<>(0xFB00, 0xFB12))
            .put(ARMENIAN, new ImmutablePair<>(0xFB13, 0xFB1C))
            .put(HEBREW, new ImmutablePair<>(0xFB1D, 0xFB4F))
            .put(ARABIC, new ImmutablePair<>(0xFB50, 0xFD3D))
            .put(COMMON, new ImmutablePair<>(0xFD3E, 0xFD4F))
            .put(ARABIC, new ImmutablePair<>(0xFD50, 0xFDFC))
            .put(COMMON, new ImmutablePair<>(0xFDFD, 0xFDFF))
            .put(INHERITED, new ImmutablePair<>(0xFE00, 0xFE0F))
            .put(COMMON, new ImmutablePair<>(0xFE10, 0xFE1F))
            .put(INHERITED, new ImmutablePair<>(0xFE20, 0xFE2F))
            .put(COMMON, new ImmutablePair<>(0xFE30, 0xFE6F))
            .put(ARABIC, new ImmutablePair<>(0xFE70, 0xFEFE))
            .put(COMMON, new ImmutablePair<>(0xFEFF, 0xFF20))
            .put(LATIN, new ImmutablePair<>(0xFF21, 0xFF3A))
            .put(COMMON, new ImmutablePair<>(0xFF3B, 0xFF40))
            .put(LATIN, new ImmutablePair<>(0xFF41, 0xFF5A))
            .put(COMMON, new ImmutablePair<>(0xFF5B, 0xFF65))
            .put(KATAKANA, new ImmutablePair<>(0xFF66, 0xFF6F))
            .put(COMMON, new ImmutablePair<>(0xFF70, 0xFF70))
            .put(KATAKANA, new ImmutablePair<>(0xFF71, 0xFF9D))
            .put(COMMON, new ImmutablePair<>(0xFF9E, 0xFF9F))
            .put(HANGUL, new ImmutablePair<>(0xFFA0, 0xFFDF))
            .put(COMMON, new ImmutablePair<>(0xFFE0, 0xFFFF))
            .put(LINEAR_B, new ImmutablePair<>(0x10000, 0x100FF))
            .put(COMMON, new ImmutablePair<>(0x10100, 0x1013F))
            .put(GREEK, new ImmutablePair<>(0x10140, 0x1018F))
            .put(COMMON, new ImmutablePair<>(0x10190, 0x101FC))
            .put(INHERITED, new ImmutablePair<>(0x101FD, 0x1027F))
            .put(LYCIAN, new ImmutablePair<>(0x10280, 0x1029F))
            .put(CARIAN, new ImmutablePair<>(0x102A0, 0x102FF))
            .put(OLD_ITALIC, new ImmutablePair<>(0x10300, 0x1032F))
            .put(GOTHIC, new ImmutablePair<>(0x10330, 0x1037F))
            .put(UGARITIC, new ImmutablePair<>(0x10380, 0x1039F))
            .put(OLD_PERSIAN, new ImmutablePair<>(0x103A0, 0x103FF))
            .put(DESERET, new ImmutablePair<>(0x10400, 0x1044F))
            .put(SHAVIAN, new ImmutablePair<>(0x10450, 0x1047F))
            .put(OSMANYA, new ImmutablePair<>(0x10480, 0x107FF))
            .put(CYPRIOT, new ImmutablePair<>(0x10800, 0x1083F))
            .put(IMPERIAL_ARAMAIC, new ImmutablePair<>(0x10840, 0x108FF))
            .put(PHOENICIAN, new ImmutablePair<>(0x10900, 0x1091F))
            .put(LYDIAN, new ImmutablePair<>(0x10920, 0x1097F))
            .put(MEROITIC_HIEROGLYPHS, new ImmutablePair<>(0x10980, 0x1099F))
            .put(MEROITIC_CURSIVE, new ImmutablePair<>(0x109A0, 0x109FF))
            .put(KHAROSHTHI, new ImmutablePair<>(0x10A00, 0x10A5F))
            .put(OLD_SOUTH_ARABIAN, new ImmutablePair<>(0x10A60, 0x10AFF))
            .put(AVESTAN, new ImmutablePair<>(0x10B00, 0x10B3F))
            .put(INSCRIPTIONAL_PARTHIAN, new ImmutablePair<>(0x10B40, 0x10B5F))
            .put(INSCRIPTIONAL_PAHLAVI, new ImmutablePair<>(0x10B60, 0x10BFF))
            .put(OLD_TURKIC, new ImmutablePair<>(0x10C00, 0x10E5F))
            .put(ARABIC, new ImmutablePair<>(0x10E60, 0x10FFF))
            .put(BRAHMI, new ImmutablePair<>(0x11000, 0x1107F))
            .put(KAITHI, new ImmutablePair<>(0x11080, 0x110CF))
            .put(SORA_SOMPENG, new ImmutablePair<>(0x110D0, 0x110FF))
            .put(CHAKMA, new ImmutablePair<>(0x11100, 0x1117F))
            .put(SHARADA, new ImmutablePair<>(0x11180, 0x1167F))
            .put(TAKRI, new ImmutablePair<>(0x11680, 0x116CF))
            .put(CUNEIFORM, new ImmutablePair<>(0x12000, 0x12FFF))
            .put(EGYPTIAN_HIEROGLYPHS, new ImmutablePair<>(0x13000, 0x167FF))
            .put(BAMUM, new ImmutablePair<>(0x16800, 0x16A38))
            .put(MIAO, new ImmutablePair<>(0x16F00, 0x16F9F))
            .put(KATAKANA, new ImmutablePair<>(0x1B000, 0x1B000))
            .put(HIRAGANA, new ImmutablePair<>(0x1B001, 0x1CFFF))
            .put(COMMON, new ImmutablePair<>(0x1D000, 0x1D166))
            .put(INHERITED, new ImmutablePair<>(0x1D167, 0x1D169))
            .put(COMMON, new ImmutablePair<>(0x1D16A, 0x1D17A))
            .put(INHERITED, new ImmutablePair<>(0x1D17B, 0x1D182))
            .put(COMMON, new ImmutablePair<>(0x1D183, 0x1D184))
            .put(INHERITED, new ImmutablePair<>(0x1D185, 0x1D18B))
            .put(COMMON, new ImmutablePair<>(0x1D18C, 0x1D1A9))
            .put(INHERITED, new ImmutablePair<>(0x1D1AA, 0x1D1AD))
            .put(COMMON, new ImmutablePair<>(0x1D1AE, 0x1D1FF))
            .put(GREEK, new ImmutablePair<>(0x1D200, 0x1D2FF))
            .put(COMMON, new ImmutablePair<>(0x1D300, 0x1EDFF))
            .put(ARABIC, new ImmutablePair<>(0x1EE00, 0x1EFFF))
            .put(COMMON, new ImmutablePair<>(0x1F000, 0x1F1FF))
            .put(HIRAGANA, new ImmutablePair<>(0x1F200, 0x1F200))
            .put(COMMON, new ImmutablePair<>(0x1F210, 0x1FFFF))
            .put(HAN, new ImmutablePair<>(0x20000, 0xE0000))
            .put(COMMON, new ImmutablePair<>(0xE0001, 0xE00FF))
            .put(INHERITED, new ImmutablePair<>(0xE0100, 0xE01EF))
            .put(UNKNOWN, new ImmutablePair<>(0xE01F0, 0x10FFFF))
            .build();

    private final Collection<Pair<Integer, Integer>> unicodeScriptRanges;

    public CharRangeUnicodeScript(final String name) {

        final UnicodeScript unicodeScript;
        try {
            unicodeScript = UnicodeScript.forName(name);
        } catch (final IllegalArgumentException ignored) {
            throw new IllegalArgumentException("Unknown Unicode script name {" + name + "}");
        }

        unicodeScriptRanges = UNICODE_BLOCK_SCRIPTS.get(unicodeScript);
    }

    private void addCodePoint(final int codePoint, final StringBuilder stringBuilder) {
        if (isBmpCodePoint(codePoint)) {
            stringBuilder.append((char) codePoint);
        } else {
            stringBuilder.append(highSurrogate(codePoint));
            stringBuilder.append(lowSurrogate(codePoint));
        }
    }

    public String codepointToString(final int codePoint) {
        final StringBuilder sb = new StringBuilder();
        addCodePoint(codePoint, sb);

        return sb.toString();
    }

    @Override
    public String getCharacters() {
        final StringBuilder sb = new StringBuilder();
        for (final Pair<Integer, Integer> unicodeScriptRange : unicodeScriptRanges) {
            for (int codePoint = unicodeScriptRange.getLeft(); codePoint <= unicodeScriptRange.getRight(); codePoint++) {
                addCodePoint(codePoint, sb);
            }
        }

        return sb.toString();
    }

    @Override
    public String getValue(final Integer forBackreference) {
        final Collection<Pair<Integer, Integer>> unicodeScriptRange = unicodeScriptRanges;
        final Pair<Integer, Integer> block = Iterables.get(unicodeScriptRange, RANDOM.nextInt(unicodeScriptRange.size()));

        return codepointToString(randomBetween(block.getLeft(), block.getRight()));
    }

    @Override
    public int weight() {
        int weight = 0;
        for (final Pair<Integer, Integer> unicodeScriptRange : unicodeScriptRanges) {
            weight += unicodeScriptRange.getRight() - unicodeScriptRange.getLeft();
        }

        return weight;
    }
}

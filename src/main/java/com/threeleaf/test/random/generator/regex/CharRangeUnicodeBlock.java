/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static java.lang.Character.UnicodeBlock.*;

import java.lang.Character.UnicodeBlock;
import java.util.Map;
import java.util.Optional;

import com.google.common.collect.ImmutableMap;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Node class for a Unicode block.
 *
 * @see <a href=https://www.regular-expressions.info/unicode.html>Unicode Regular Expressions</a>
 * @see <a href="https://en.wikipedia.org/wiki/Unicode_block">Unicode Block</a>
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CharRangeUnicodeBlock extends CharRange {

    @SuppressWarnings("checkstyle:AvoidEscapedUnicodeCharacters" /* Unicode ranges easier to see */)
    public static final Map<UnicodeBlock, Pair<Character, Character>> UNICODE_BLOCK_RANGES =
        ImmutableMap.<UnicodeBlock, Pair<Character, Character>>builder()
            .put(BASIC_LATIN, new ImmutablePair<>('\u0000', '\u007F'))
            .put(LATIN_1_SUPPLEMENT, new ImmutablePair<>('\u0080', '\u00FF'))
            .put(LATIN_EXTENDED_A, new ImmutablePair<>('\u0100', '\u017F'))
            .put(LATIN_EXTENDED_B, new ImmutablePair<>('\u0180', '\u024F'))
            .put(IPA_EXTENSIONS, new ImmutablePair<>('\u0250', '\u02AF'))
            .put(SPACING_MODIFIER_LETTERS, new ImmutablePair<>('\u02B0', '\u02FF'))
            .put(COMBINING_DIACRITICAL_MARKS, new ImmutablePair<>('\u0300', '\u036F'))
            .put(GREEK, new ImmutablePair<>('\u0370', '\u03FF'))
            .put(CYRILLIC, new ImmutablePair<>('\u0400', '\u04FF'))
            .put(CYRILLIC_SUPPLEMENTARY, new ImmutablePair<>('\u0500', '\u052F'))
            .put(ARMENIAN, new ImmutablePair<>('\u0530', '\u058F'))
            .put(HEBREW, new ImmutablePair<>('\u0590', '\u05FF'))
            .put(ARABIC, new ImmutablePair<>('\u0600', '\u06FF'))
            .put(SYRIAC, new ImmutablePair<>('\u0700', '\u074F'))
            .put(THAANA, new ImmutablePair<>('\u0780', '\u07BF'))
            .put(DEVANAGARI, new ImmutablePair<>('\u0900', '\u097F'))
            .put(BENGALI, new ImmutablePair<>('\u0980', '\u09FF'))
            .put(GURMUKHI, new ImmutablePair<>('\u0A00', '\u0A7F'))
            .put(GUJARATI, new ImmutablePair<>('\u0A80', '\u0AFF'))
            .put(ORIYA, new ImmutablePair<>('\u0B00', '\u0B7F'))
            .put(TAMIL, new ImmutablePair<>('\u0B80', '\u0BFF'))
            .put(TELUGU, new ImmutablePair<>('\u0C00', '\u0C7F'))
            .put(KANNADA, new ImmutablePair<>('\u0C80', '\u0CFF'))
            .put(MALAYALAM, new ImmutablePair<>('\u0D00', '\u0D7F'))
            .put(SINHALA, new ImmutablePair<>('\u0D80', '\u0DFF'))
            .put(THAI, new ImmutablePair<>('\u0E00', '\u0E7F'))
            .put(LAO, new ImmutablePair<>('\u0E80', '\u0EFF'))
            .put(TIBETAN, new ImmutablePair<>('\u0F00', '\u0FFF'))
            .put(MYANMAR, new ImmutablePair<>('\u1000', '\u109F'))
            .put(GEORGIAN, new ImmutablePair<>('\u10A0', '\u10FF'))
            .put(HANGUL_JAMO, new ImmutablePair<>('\u1100', '\u11FF'))
            .put(ETHIOPIC, new ImmutablePair<>('\u1200', '\u137F'))
            .put(CHEROKEE, new ImmutablePair<>('\u13A0', '\u13FF'))
            .put(UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS, new ImmutablePair<>('\u1400', '\u167F'))
            .put(OGHAM, new ImmutablePair<>('\u1680', '\u169F'))
            .put(RUNIC, new ImmutablePair<>('\u16A0', '\u16FF'))
            .put(TAGALOG, new ImmutablePair<>('\u1700', '\u171F'))
            .put(HANUNOO, new ImmutablePair<>('\u1720', '\u173F'))
            .put(BUHID, new ImmutablePair<>('\u1740', '\u175F'))
            .put(TAGBANWA, new ImmutablePair<>('\u1760', '\u177F'))
            .put(KHMER, new ImmutablePair<>('\u1780', '\u17FF'))
            .put(MONGOLIAN, new ImmutablePair<>('\u1800', '\u18AF'))
            .put(LIMBU, new ImmutablePair<>('\u1900', '\u194F'))
            .put(TAI_LE, new ImmutablePair<>('\u1950', '\u197F'))
            .put(KHMER_SYMBOLS, new ImmutablePair<>('\u19E0', '\u19FF'))
            .put(PHONETIC_EXTENSIONS, new ImmutablePair<>('\u1D00', '\u1D7F'))
            .put(LATIN_EXTENDED_ADDITIONAL, new ImmutablePair<>('\u1E00', '\u1EFF'))
            .put(GREEK_EXTENDED, new ImmutablePair<>('\u1F00', '\u1FFF'))
            .put(GENERAL_PUNCTUATION, new ImmutablePair<>('\u2000', '\u206F'))
            .put(SUPERSCRIPTS_AND_SUBSCRIPTS, new ImmutablePair<>('\u2070', '\u209F'))
            .put(CURRENCY_SYMBOLS, new ImmutablePair<>('\u20A0', '\u20CF'))
            .put(COMBINING_MARKS_FOR_SYMBOLS, new ImmutablePair<>('\u20D0', '\u20FF'))
            .put(LETTERLIKE_SYMBOLS, new ImmutablePair<>('\u2100', '\u214F'))
            .put(NUMBER_FORMS, new ImmutablePair<>('\u2150', '\u218F'))
            .put(ARROWS, new ImmutablePair<>('\u2190', '\u21FF'))
            .put(MATHEMATICAL_OPERATORS, new ImmutablePair<>('\u2200', '\u22FF'))
            .put(MISCELLANEOUS_TECHNICAL, new ImmutablePair<>('\u2300', '\u23FF'))
            .put(CONTROL_PICTURES, new ImmutablePair<>('\u2400', '\u243F'))
            .put(OPTICAL_CHARACTER_RECOGNITION, new ImmutablePair<>('\u2440', '\u245F'))
            .put(ENCLOSED_ALPHANUMERICS, new ImmutablePair<>('\u2460', '\u24FF'))
            .put(BOX_DRAWING, new ImmutablePair<>('\u2500', '\u257F'))
            .put(BLOCK_ELEMENTS, new ImmutablePair<>('\u2580', '\u259F'))
            .put(GEOMETRIC_SHAPES, new ImmutablePair<>('\u25A0', '\u25FF'))
            .put(MISCELLANEOUS_SYMBOLS, new ImmutablePair<>('\u2600', '\u26FF'))
            .put(DINGBATS, new ImmutablePair<>('\u2700', '\u27BF'))
            .put(MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A, new ImmutablePair<>('\u27C0', '\u27EF'))
            .put(SUPPLEMENTAL_ARROWS_A, new ImmutablePair<>('\u27F0', '\u27FF'))
            .put(BRAILLE_PATTERNS, new ImmutablePair<>('\u2800', '\u28FF'))
            .put(SUPPLEMENTAL_ARROWS_B, new ImmutablePair<>('\u2900', '\u297F'))
            .put(MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B, new ImmutablePair<>('\u2980', '\u29FF'))
            .put(SUPPLEMENTAL_MATHEMATICAL_OPERATORS, new ImmutablePair<>('\u2A00', '\u2AFF'))
            .put(MISCELLANEOUS_SYMBOLS_AND_ARROWS, new ImmutablePair<>('\u2B00', '\u2BFF'))
            .put(CJK_RADICALS_SUPPLEMENT, new ImmutablePair<>('\u2E80', '\u2EFF'))
            .put(KANGXI_RADICALS, new ImmutablePair<>('\u2F00', '\u2FDF'))
            .put(IDEOGRAPHIC_DESCRIPTION_CHARACTERS, new ImmutablePair<>('\u2FF0', '\u2FFF'))
            .put(CJK_SYMBOLS_AND_PUNCTUATION, new ImmutablePair<>('\u3000', '\u303F'))
            .put(HIRAGANA, new ImmutablePair<>('\u3040', '\u309F'))
            .put(KATAKANA, new ImmutablePair<>('\u30A0', '\u30FF'))
            .put(BOPOMOFO, new ImmutablePair<>('\u3100', '\u312F'))
            .put(HANGUL_COMPATIBILITY_JAMO, new ImmutablePair<>('\u3130', '\u318F'))
            .put(KANBUN, new ImmutablePair<>('\u3190', '\u319F'))
            .put(BOPOMOFO_EXTENDED, new ImmutablePair<>('\u31A0', '\u31BF'))
            .put(KATAKANA_PHONETIC_EXTENSIONS, new ImmutablePair<>('\u31F0', '\u31FF'))
            .put(ENCLOSED_CJK_LETTERS_AND_MONTHS, new ImmutablePair<>('\u3200', '\u32FF'))
            .put(CJK_COMPATIBILITY, new ImmutablePair<>('\u3300', '\u33FF'))
            .put(CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, new ImmutablePair<>('\u3400', '\u4DBF'))
            .put(YIJING_HEXAGRAM_SYMBOLS, new ImmutablePair<>('\u4DC0', '\u4DFF'))
            .put(CJK_UNIFIED_IDEOGRAPHS, new ImmutablePair<>('\u4E00', '\u9FFF'))
            .put(YI_SYLLABLES, new ImmutablePair<>('\uA000', '\uA48F'))
            .put(YI_RADICALS, new ImmutablePair<>('\uA490', '\uA4CF'))
            .put(HANGUL_SYLLABLES, new ImmutablePair<>('\uAC00', '\uD7AF'))
            .put(HIGH_SURROGATES, new ImmutablePair<>('\uD800', '\uDB7F'))
            .put(HIGH_PRIVATE_USE_SURROGATES, new ImmutablePair<>('\uDB80', '\uDBFF'))
            .put(LOW_SURROGATES, new ImmutablePair<>('\uDC00', '\uDFFF'))
            .put(PRIVATE_USE_AREA, new ImmutablePair<>('\uE000', '\uF8FF'))
            .put(CJK_COMPATIBILITY_IDEOGRAPHS, new ImmutablePair<>('\uF900', '\uFAFF'))
            .put(ALPHABETIC_PRESENTATION_FORMS, new ImmutablePair<>('\uFB00', '\uFB4F'))
            .put(ARABIC_PRESENTATION_FORMS_A, new ImmutablePair<>('\uFB50', '\uFDFF'))
            .put(VARIATION_SELECTORS, new ImmutablePair<>('\uFE00', '\uFE0F'))
            .put(COMBINING_HALF_MARKS, new ImmutablePair<>('\uFE20', '\uFE2F'))
            .put(CJK_COMPATIBILITY_FORMS, new ImmutablePair<>('\uFE30', '\uFE4F'))
            .put(SMALL_FORM_VARIANTS, new ImmutablePair<>('\uFE50', '\uFE6F'))
            .put(ARABIC_PRESENTATION_FORMS_B, new ImmutablePair<>('\uFE70', '\uFEFF'))
            .put(HALFWIDTH_AND_FULLWIDTH_FORMS, new ImmutablePair<>('\uFF00', '\uFFEF'))
            .put(SPECIALS, new ImmutablePair<>('\uFFF0', '\uFFFF'))
            .build();

    public CharRangeUnicodeBlock(final String name) {
        super(
            UNICODE_BLOCK_RANGES.get(getUnicodeBlock(name)).getLeft(),
            UNICODE_BLOCK_RANGES.get(UnicodeBlock.forName(name)).getRight()
        );
    }

    private static UnicodeBlock getUnicodeBlock(final String name) {
        UnicodeBlock unicodeBlock = null;
        try {
            unicodeBlock = UnicodeBlock.forName(name);
        } catch (final IllegalArgumentException ignored) {
            /* Do nothing here */
        }

        return Optional.ofNullable(unicodeBlock)
            .orElseThrow(() -> new IllegalArgumentException("Unknown Unicode block name {" + name + "}"));
    }
}

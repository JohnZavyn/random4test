/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static java.lang.Character.*;
import static java.util.Locale.ENGLISH;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"squid:S125", "SpellCheckingInspection"})
public enum UnicodeType {

    ALPHABETIC {
        @Override
        public boolean is(final int ch) {
            return isAlphabetic(ch);
        }
    },

    LETTER {
        @Override
        public boolean is(final int ch) {
            return isLetter(ch);
        }
    },

    IDEOGRAPHIC {
        @Override
        public boolean is(final int ch) {
            return isIdeographic(ch);
        }
    },

    LOWERCASE {
        @Override
        public boolean is(final int ch) {
            return isLowerCase(ch);
        }
    },

    UPPERCASE {
        @Override
        public boolean is(final int ch) {
            return isUpperCase(ch);
        }
    },

    TITLE_CASE {
        @Override
        public boolean is(final int ch) {
            return isTitleCase(ch);
        }
    },

    /** \p{Whitespace} */
    WHITE_SPACE {
        @Override
        public boolean is(final int ch) {
            return ((((1 << SPACE_SEPARATOR) |
                (1 << LINE_SEPARATOR) |
                (1 << PARAGRAPH_SEPARATOR)) >> getType(ch)) & 1)
                != 0 || (ch >= 0x9 && ch <= 0xd) || (ch == 0x85);
        }
    },

    /** \p{gc=Control} */
    CONTROL {
        @Override
        public boolean is(final int ch) {
            return getType(ch) == Character.CONTROL;
        }
    },

    /** \p{gc=Punctuation} */
    PUNCTUATION {
        @Override
        public boolean is(final int ch) {
            return ((((1 << CONNECTOR_PUNCTUATION) |
                (1 << DASH_PUNCTUATION) |
                (1 << START_PUNCTUATION) |
                (1 << END_PUNCTUATION) |
                (1 << OTHER_PUNCTUATION) |
                (1 << INITIAL_QUOTE_PUNCTUATION) |
                (1 << FINAL_QUOTE_PUNCTUATION)) >> getType(ch)) & 1)
                != 0;
        }
    },

    /**
     * \p{gc=Decimal_Number} <br>
     * \p{Hex_Digit} &rarr; PropList.txt: Hex_Digit
     */
    HEX_DIGIT {
        @Override
        public boolean is(final int ch) {
            return UnicodeType.DIGIT.is(ch) ||
                (ch >= 0x0030 && ch <= 0x0039) ||
                (ch >= 0x0041 && ch <= 0x0046) ||
                (ch >= 0x0061 && ch <= 0x0066) ||
                (ch >= 0xFF10 && ch <= 0xFF19) ||
                (ch >= 0xFF21 && ch <= 0xFF26) ||
                (ch >= 0xFF41 && ch <= 0xFF46);
        }
    },

    ASSIGNED {
        @Override
        public boolean is(final int ch) {
            return getType(ch) != UNASSIGNED;
        }
    },

    /** PropList.txt:Noncharacter_Code_Point */
    NONCHARACTER_CODE_POINT {
        @Override
        public boolean is(final int ch) {
            return (ch & 0xfffe) == 0xfffe || (ch >= 0xfdd0 && ch <= 0xfdef);
        }
    },

    /** \p{gc=Decimal_Number} */
    DIGIT {
        @Override
        public boolean is(final int ch) {
            return isDigit(ch);
        }
    },

    /**
     * \p{alpha} <br>
     * \p{digit}
     */
    ALNUM {
        @Override
        public boolean is(final int ch) {
            return UnicodeType.ALPHABETIC.is(ch) || UnicodeType.DIGIT.is(ch);
        }
    },

    /**
     * <code>\p{Whitespace}</code> -- <br>
     * [\N{LF} \N{VT} \N{FF} \N{CR} \N{NEL} &rarr; 0xa, 0xb, 0xc, 0xd, 0x85 <br>
     * <code>\p{gc=Line_Separator}</code> <br>
     * <code>\p{gc=Paragraph_Separator}</code>]
     */
    BLANK {
        @Override
        public boolean is(final int ch) {
            return getType(ch) == SPACE_SEPARATOR ||
                ch == 0x9;/*  \N{HT} */
        }
    },

    /**
     * [^ <br>
     * \p{space} <br>
     * \p{gc=Control} <br>
     * \p{gc=Surrogate} <br>
     * \p{gc=Unassigned}]
     */
    GRAPH {
        @Override
        public boolean is(final int ch) {
            return ((((1 << SPACE_SEPARATOR) |
                (1 << LINE_SEPARATOR) |
                (1 << PARAGRAPH_SEPARATOR) |
                (1 << Character.CONTROL) |
                (1 << SURROGATE) |
                (1 << UNASSIGNED)) >> getType(ch)) & 1)
                == 0;
        }
    },

    /**
     * \p{graph} <br>
     * \p{blank} <br>
     * -- \p{cntrl}
     */
    PRINT {
        @Override
        public boolean is(final int ch) {
            return (UnicodeType.GRAPH.is(ch) || UnicodeType.BLANK.is(ch)) && !UnicodeType.CONTROL
                .is(ch);
        }
    },

    /**
     * \p{alpha} <br>
     * \p{gc=Mark} <br>
     * \p{digit} <br>
     * \p{gc=Connector_Punctuation} <br>
     * \p{Join_Control}    200C..200D
     */
    WORD {
        @Override
        public boolean is(final int ch) {
            return UnicodeType.ALPHABETIC.is(ch) ||
                ((((1 << NON_SPACING_MARK) |
                    (1 << ENCLOSING_MARK) |
                    (1 << COMBINING_SPACING_MARK) |
                    (1 << DECIMAL_DIGIT_NUMBER) |
                    (1 << CONNECTOR_PUNCTUATION)) >> getType(ch)) & 1)
                    != 0 ||
                UnicodeType.JOIN_CONTROL.is(ch);
        }
    },

    /** 200C..200D    PropList.txt:Join_Control */
    JOIN_CONTROL {
        @Override
        public boolean is(final int ch) {
            return (ch == 0x200C || ch == 0x200D);
        }
    };

    /** A map of Unicode type aliases to normalized Unicode type names. */
    private static final Map<String, String> ALIASES = new HashMap<>();

    /** Mapping of Operating System Interface (POSIX) Unicode type names to normalized Unicode type names. */
    private static final Map<String, String> POSIX_NAME_MAP = new HashMap<>();

    static {
        POSIX_NAME_MAP.put("ALPHA", "ALPHABETIC");
        POSIX_NAME_MAP.put("LOWER", "LOWERCASE");
        POSIX_NAME_MAP.put("UPPER", "UPPERCASE");
        POSIX_NAME_MAP.put("SPACE", "WHITE_SPACE");
        POSIX_NAME_MAP.put("PUNCT", "PUNCTUATION");
        POSIX_NAME_MAP.put("XDIGIT", "HEX_DIGIT");
        POSIX_NAME_MAP.put("ALNUM", "ALNUM");
        POSIX_NAME_MAP.put("CNTRL", "CONTROL");
        POSIX_NAME_MAP.put("DIGIT", "DIGIT");
        POSIX_NAME_MAP.put("BLANK", "BLANK");
        POSIX_NAME_MAP.put("GRAPH", "GRAPH");
        POSIX_NAME_MAP.put("PRINT", "PRINT");

        ALIASES.put("WHITESPACE", "WHITE_SPACE");
        ALIASES.put("HEXDIGIT", "HEX_DIGIT");
        ALIASES.put("NONCHARACTERCODEPOINT", "NONCHARACTER_CODE_POINT");
        ALIASES.put("JOINCONTROL", "JOIN_CONTROL");
    }

    /**
     * Get a Unicode type by name.
     *
     * @param name the name
     *
     * @return the Unicode type
     */
    public static UnicodeType forName(final String name) {
        String unicodeTypeName = name.toUpperCase(ENGLISH);
        final String alias = ALIASES.get(unicodeTypeName);
        if (alias != null) {
            unicodeTypeName = alias;
        }
        try {
            return valueOf(unicodeTypeName);
        } catch (final IllegalArgumentException x) {
            return null;
        }
    }

    /**
     * Get a Unicode type based on a Portable Operating System Interface (POSIX) standard name.
     *
     * @param name the POSIX name
     *
     * @return the Unicode type
     */
    public static UnicodeType forPosixName(final String name) {
        final String unicodeTypeName = POSIX_NAME_MAP.get(name.toUpperCase(ENGLISH));

        return unicodeTypeName == null ? null : valueOf(unicodeTypeName);
    }

    public abstract boolean is(int ch);
}

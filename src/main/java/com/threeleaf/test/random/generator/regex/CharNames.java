/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestByte.BYTE_UNSIGNED_MAX;
import static com.threeleaf.test.random.TestInteger.INT_00;
import static java.lang.Character.*;
import static lombok.AccessLevel.PRIVATE;

import java.util.*;

import lombok.NoArgsConstructor;

/** Character categories, ranges, and types. */
@NoArgsConstructor(access = PRIVATE)
class CharNames {

    private static final Map<String, UnicodeCategoryFactory> FACTORIES = new HashMap<>();

    static {
        /*  Unicode character property aliases, defined in */
        /*  http://www.unicode.org/Public/UNIDATA/PropertyValueAliases.txt */
        createUnicodeCategory("Cn", 1 << UNASSIGNED);
        createUnicodeCategory("Lu", 1 << UPPERCASE_LETTER);
        createUnicodeCategory("Ll", 1 << LOWERCASE_LETTER);
        createUnicodeCategory("Lt", 1 << TITLECASE_LETTER);
        createUnicodeCategory("Lm", 1 << MODIFIER_LETTER);
        createUnicodeCategory("Lo", 1 << OTHER_LETTER);
        createUnicodeCategory("Mn", 1 << NON_SPACING_MARK);
        createUnicodeCategory("Me", 1 << ENCLOSING_MARK);
        createUnicodeCategory("Mc", 1 << COMBINING_SPACING_MARK);
        createUnicodeCategory("Nd", 1 << DECIMAL_DIGIT_NUMBER);
        createUnicodeCategory("Nl", 1 << LETTER_NUMBER);
        createUnicodeCategory("No", 1 << OTHER_NUMBER);
        createUnicodeCategory("Zs", 1 << SPACE_SEPARATOR);
        createUnicodeCategory("Zl", 1 << LINE_SEPARATOR);
        createUnicodeCategory("Zp", 1 << PARAGRAPH_SEPARATOR);
        createUnicodeCategory("Cc", 1 << CONTROL);
        createUnicodeCategory("Cf", 1 << FORMAT);
        createUnicodeCategory("Co", 1 << PRIVATE_USE);
        createUnicodeCategory("Cs", 1 << SURROGATE);
        createUnicodeCategory("Pd", 1 << DASH_PUNCTUATION);
        createUnicodeCategory("Ps", 1 << START_PUNCTUATION);
        createUnicodeCategory("Pe", 1 << END_PUNCTUATION);
        createUnicodeCategory("Pc", 1 << CONNECTOR_PUNCTUATION);
        createUnicodeCategory("Po", 1 << OTHER_PUNCTUATION);
        createUnicodeCategory("Sm", 1 << MATH_SYMBOL);
        createUnicodeCategory("Sc", 1 << CURRENCY_SYMBOL);
        createUnicodeCategory("Sk", 1 << MODIFIER_SYMBOL);
        createUnicodeCategory("So", 1 << OTHER_SYMBOL);
        createUnicodeCategory("Pi", 1 << INITIAL_QUOTE_PUNCTUATION);
        createUnicodeCategory("Pf", 1 << FINAL_QUOTE_PUNCTUATION);
        createUnicodeCategory("L", (
            (1 << UPPERCASE_LETTER) |
                (1 << LOWERCASE_LETTER) |
                (1 << TITLECASE_LETTER) |
                (1 << MODIFIER_LETTER) |
                (1 << OTHER_LETTER)
        ));
        createUnicodeCategory("M", (
            (1 << NON_SPACING_MARK) |
                (1 << ENCLOSING_MARK) |
                (1 << COMBINING_SPACING_MARK)
        ));
        createUnicodeCategory("N", (
            (1 << DECIMAL_DIGIT_NUMBER) |
                (1 << LETTER_NUMBER) |
                (1 << OTHER_NUMBER)
        ));
        createUnicodeCategory("Z", (
            (1 << SPACE_SEPARATOR) |
                (1 << LINE_SEPARATOR) |
                (1 << PARAGRAPH_SEPARATOR)
        ));
        createUnicodeCategory("C", (
            (1 << CONTROL) |
                (1 << FORMAT) |
                (1 << PRIVATE_USE) |
                (1 << SURROGATE)
        ));
        createUnicodeCategory("P", (
            (1 << DASH_PUNCTUATION) |
                (1 << START_PUNCTUATION) |
                (1 << END_PUNCTUATION) |
                (1 << CONNECTOR_PUNCTUATION) |
                (1 << OTHER_PUNCTUATION) |
                (1 << INITIAL_QUOTE_PUNCTUATION) |
                (1 << FINAL_QUOTE_PUNCTUATION)
        ));
        createUnicodeCategory("S", (
            (1 << MATH_SYMBOL) |
                (1 << CURRENCY_SYMBOL) |
                (1 << MODIFIER_SYMBOL) |
                (1 << OTHER_SYMBOL)
        ));
        createUnicodeCategory("LC", (
            (1 << UPPERCASE_LETTER) |
                (1 << LOWERCASE_LETTER) |
                (1 << TITLECASE_LETTER)
        ));
        createUnicodeCategory("LD", (
            (1 << UPPERCASE_LETTER) |
                (1 << LOWERCASE_LETTER) |
                (1 << TITLECASE_LETTER) |
                (1 << MODIFIER_LETTER) |
                (1 << OTHER_LETTER) |
                (1 << DECIMAL_DIGIT_NUMBER)
        ));
        createCharRange("L1", INT_00, BYTE_UNSIGNED_MAX);
        FACTORIES.put(
            "all",
            new UnicodeCategoryFactory() {
                @Override
                Char make() {
                    return new DotAll();
                }
            }
        );

        /*  Posix regular expression character classes, defined in */
        /*  http://www.unix.org/onlinepubs/009695399/basedefs/xbd_chap09.html */
        createCharRange("ASCII", INT_00, Byte.MAX_VALUE);  /* ASCII */
        createClassType("Alnum", AsciiType.ALNUM); /* Alphanumeric characters */
        createClassType("Alpha", AsciiType.ALPHA); /* Alphabetic characters */
        createClassType("Blank", AsciiType.BLANK); /* Space and tab characters */
        createClassType("Cntrl", AsciiType.CNTRL); /* Control characters */
        createCharRange("Digit", '0', '9'); /* Numeric characters */
        createClassType("Graph", AsciiType.GRAPH); /* Printable and visible */
        createCharRange("Lower", 'a', 'z'); /* Lower-case alphabetic */
        createClassType("Print", AsciiType.PRINT);  /* Printable characters */
        createClassType("Punct", AsciiType.PUNCT); /* Punctuation characters */
        createClassType("Space", AsciiType.SPACE); /* Space characters */
        createCharRange("Upper", 'A', 'Z'); /* Upper-case alphabetic */
        createClassType("XDigit", AsciiType.XDIGIT); /* Hexadecimal digits */

        /*  Java character properties, defined by methods in Character.java */
        reuseCategory("javaUpperCase", "Lu");
        reuseCategory("javaLowerCase", "Ll");
        reuseCategory("javaAlphabetic", "L");
        createUnimplemented("javaIdeographic");
        reuseCategory("javaTitleCase", "Lt");
        reuseCategory("javaDigit", "Nd");
        reuseCategory("javaLetter", "L");
        reuseCategory("javaLetterOrDigit", "LD");
        createUnimplemented("javaJavaIdentifierStart");
        createUnimplemented("javaJavaIdentifierPart");
        createUnimplemented("javaUnicodeIdentifierStart");
        createUnimplemented("javaUnicodeIdentifierPart");
        createUnimplemented("javaIdentifierIgnorable");
        reuseCategory("javaSpaceChar", "Zs");
        reuseCategory("javaWhitespace", "Z");
        createUnimplemented("javaISOControl");
        createUnimplemented("javaMirrored");
        createUnicodeCategory("javaDefined", (
            (1 << COMBINING_SPACING_MARK) |
                (1 << CONNECTOR_PUNCTUATION) |
                (1 << CONTROL) |
                (1 << CURRENCY_SYMBOL) |
                (1 << DASH_PUNCTUATION) |
                (1 << DECIMAL_DIGIT_NUMBER) |
                (1 << ENCLOSING_MARK) |
                (1 << END_PUNCTUATION) |
                (1 << FINAL_QUOTE_PUNCTUATION) |
                (1 << FORMAT) |
                (1 << INITIAL_QUOTE_PUNCTUATION) |
                (1 << LETTER_NUMBER) |
                (1 << LINE_SEPARATOR) |
                (1 << LOWERCASE_LETTER) |
                (1 << MATH_SYMBOL) |
                (1 << MODIFIER_LETTER) |
                (1 << MODIFIER_SYMBOL) |
                (1 << NON_SPACING_MARK) |
                (1 << OTHER_LETTER) |
                (1 << OTHER_NUMBER) |
                (1 << OTHER_PUNCTUATION) |
                (1 << OTHER_SYMBOL) |
                (1 << PARAGRAPH_SEPARATOR) |
                (1 << PRIVATE_USE) |
                (1 << SPACE_SEPARATOR) |
                (1 << START_PUNCTUATION) |
                (1 << SURROGATE) |
                (1 << TITLECASE_LETTER) |
                (1 << UPPERCASE_LETTER)
        ));
    }

    /**
     * Create a {@link Char} property from the factory.
     *
     * @param name the category name
     *
     * @return the character generator for the category
     */
    static Char charNodeFor(final String name) {
        return Optional.ofNullable(FACTORIES.get(name))
            .orElseThrow(() -> new IllegalArgumentException("Unknown Unicode category name {" + name + "}"))
            .make();
    }

    /**
     * Add a character range.
     *
     * @param name  the category name
     * @param lower the lower bound
     * @param upper the upper bound
     */
    private static void createCharRange(final String name, final int lower, final int upper) {
        FACTORIES.put(name, new UnicodeCategoryFactory() {
            @Override
            Char make() {
                return new CharRange((char) lower, (char) upper);
            }
        });
    }

    /**
     * Create an ASCII class type.
     *
     * @param name  the category name
     * @param ctype the ASCII type
     */
    private static void createClassType(final String name, final int ctype) {
        FACTORIES.put(name, new UnicodeCategoryFactory() {
            @Override
            Char make() {
                return new CharAscii(ctype);
            }
        });
    }

    /**
     * Create an entry for a Unicode category.
     *
     * @param name         the category name
     * @param categoryMask the mask of characters to include
     */
    private static void createUnicodeCategory(final String name, final int categoryMask) {
        FACTORIES.put(name, new UnicodeCategoryFactory() {
            @Override
            Char make() {
                return new CharCategory(categoryMask);
            }
        });
    }

    /**
     * Create an entry for unimplemented categories.
     *
     * @param name the category name
     */
    private static void createUnimplemented(final String name) {
        FACTORIES.put(name, new UnicodeCategoryFactory() {
            @Override
            Char make() {
                return new CharUnimplemented();
            }
        });
    }

    /**
     * Use a previously added category with another name.
     *
     * @param name     the new name
     * @param category the original name
     */
    private static void reuseCategory(final String name, final String category) {
        FACTORIES.put(name, FACTORIES.get(category));
    }

}

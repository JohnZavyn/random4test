/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.randomPositive;
import static java.lang.Character.isValidCodePoint;
import static java.lang.Character.toChars;

import lombok.Data;
import lombok.EqualsAndHashCode;

/** Generate a Unicode character other than a specific type. */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharUnicodeTypeCompliment extends Char {

    /** The {@link UnicodeType}. */
    private final UnicodeType unicodeType;

    /**
     * Instantiate.
     *
     * @param theUnicodeType the {@link UnicodeType} type to exclude
     */
    public CharUnicodeTypeCompliment(final UnicodeType theUnicodeType) {
        unicodeType = theUnicodeType;
    }

    /**
     * Get object that will return Unicode characters of the specified type.
     *
     * @return the {@link CharUnicodeType}
     */
    @Override
    public Char complement() {
        return new CharUnicodeType(unicodeType);
    }

    /**
     * Return a Unicode character other than this object's type.
     *
     * @param forBackreference unused
     *
     * @return a Unicode character
     */
    @Override
    public String getValue(final Integer forBackreference) {
        /* Accurate, but not efficient. Would need to create a "reverse" java.lang.Character.getType(int) to get character of type. */
        int codePoint;
        do {
            codePoint = randomPositive();
        } while (!isValidCodePoint(codePoint) || unicodeType.is(codePoint));

        return new String(toChars(codePoint));
    }
}

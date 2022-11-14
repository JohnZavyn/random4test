/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.randomPositive;
import static java.lang.Character.toChars;

import lombok.Data;
import lombok.EqualsAndHashCode;

/** Generate a Unicode character of a specific type. */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharUnicodeType extends Char {

    /** The {@link UnicodeType}. */
    private final UnicodeType unicodeType;

    /**
     * Instantiate.
     *
     * @param theUnicodeType the {@link UnicodeType} type
     */
    public CharUnicodeType(final UnicodeType theUnicodeType) {
        unicodeType = theUnicodeType;
    }

    /**
     * Get object that will return Unicode characters outside the type of this object.
     *
     * @return the {@link CharUnicodeTypeCompliment}
     */
    @Override
    public Char complement() {
        return new CharUnicodeTypeCompliment(unicodeType);
    }

    /**
     * Return a Unicode character of this object's type.
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
        } while (!unicodeType.is(codePoint));

        return new String(toChars(codePoint));
    }
}

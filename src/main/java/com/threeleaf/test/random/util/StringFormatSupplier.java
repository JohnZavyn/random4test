/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static java.lang.String.format;
import static java.util.Locale.US;

import java.util.function.Supplier;

import lombok.NonNull;

/**
 * Supplies a formatted message. Lazy implementation so that operations are not performed until
 * needed.
 */
public class StringFormatSupplier implements Supplier<String> {

    /** The formatted string. */
    private final String formattedString;

    /**
     * Specify a formatting string and substitution values.
     *
     * @param template           A <a href="/java/lang/util/Formatter.html#syntax">format string</a>
     * @param substitutionValues Arguments referenced by the format specifiers in the format
     *                           string.
     *
     * @see String#format(String, Object...)
     */
    public StringFormatSupplier(@NonNull final String template, final Object... substitutionValues) {
        super();
        formattedString = format(US, template, substitutionValues);
    }

    /**
     * Get the formatted string.
     *
     * @return the string
     */
    @Override
    public String get() {
        return formattedString;
    }
}

/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.LINE_FEED;

import lombok.Getter;

/** Unchecked exception thrown to indicate a syntax error in a regular-expression (spec JSR-51). */
@Getter
public class PatternSyntaxException extends IllegalArgumentException {

    private static final long serialVersionUID = -5335526834582110685L;

    private final String description;

    private final int index;

    private final String pattern;

    /**
     * Constructs a new instance of this class.
     *
     * @param theDescription A description of the error
     * @param theRegEx       The regular expression
     * @param theIndex       The approximate index in the pattern of the error,
     *                       or <tt>-1</tt> if the index is not known
     */
    public PatternSyntaxException(final String theDescription, final String theRegEx, final int theIndex) {
        description = theDescription;
        pattern = theRegEx;
        index = theIndex;
    }

    /**
     * Returns a multi-line string containing the description of the syntax
     * error and its index, the erroneous regular-expression pattern, and a
     * visual indication of the error index within the...
     *
     * @return The full detail message
     */
    @Override
    public String getMessage() {
        final StringBuilder message = new StringBuilder().append(description);
        if (index >= 0) {
            message.append(" near index ")
                .append(index);
        }
        message.append(LINE_FEED)
            .append(pattern);
        if (index >= 0 && pattern != null && index < pattern.length()) {
            message.append(LINE_FEED);
            for (int i = 0; i < index; i++) {
                message.append(' ');
            }
            message.append('^');
        }
        return message.toString();
    }
}

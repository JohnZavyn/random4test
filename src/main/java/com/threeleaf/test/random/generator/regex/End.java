/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Node to anchor at the end of a line or the end of input based on the
 * multiline mode.
 *
 * <p>When not in multiline mode, the $ can only match at the very end
 * of the input, unless the input ends in a line terminator in which
 * it matches right before the last line terminator.</p>
 *
 * <p>Note that \r\n is considered an atomic line terminator.</p>
 *
 * <p>Like ^ the $ operator matches at a position, it does not match the
 * line terminators themselves.</p>
 *
 * <p>Also: \Z operator.</p>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class End extends Node {

    private boolean multiline;

    End(final boolean isMultiline) {
        multiline = isMultiline;
    }

    /** {@inheritDoc} */
    @Override
    public String getValue(final Integer forBackreference) {
        return EMPTY;
    }
}

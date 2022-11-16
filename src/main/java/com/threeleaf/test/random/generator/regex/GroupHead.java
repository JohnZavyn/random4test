/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestCharacter.*;
import static com.threeleaf.test.random.TestString.EMPTY;

import lombok.*;

/**
 * The GroupHead saves the location where the group begins in the locals
 * and restores them when the match is done.
 *
 * <p>The matchRef is used when a reference to this group is accessed later
 * in the expression. The locals will have a negative value in them to
 * indicate that we do not want to unset the group if the reference
 * doesn't match.</p>
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(of = {"name", "capturingGroupReference", "groupIndex"})
public class GroupHead extends Node {

    /** A group separator used to parse out pre-generated groups. */
    public static final char GROUP_SEPARATOR = CHARACTER_29;

    public static final char TEXT_END = CHARACTER_03;

    public static final char TEXT_START = CHARACTER_02;

    private final int capturingGroupReference;

    private final int groupIndex;

    private final String groupStartTag;

    private final String name;

    public GroupHead(final int theGroupIndex, final int theCapturingGroupIndex, final String theGroupName) {
        groupIndex = theGroupIndex;
        capturingGroupReference = theCapturingGroupIndex * 2;
        groupStartTag = capturingGroupReference > 0 ? EMPTY + GROUP_SEPARATOR + TEXT_START + (char) (theCapturingGroupIndex * 2) : EMPTY;
        name = theGroupName;
    }

    /**
     * Remove all backreference slices.
     *
     * @param value the String to clean
     *
     * @return the cleaned String
     */
    public static String cleanup(final String value) {
        String cleanValue = value;
        for (int groupCount = 9; groupCount > 0; groupCount--) {
            final char groupIndex = (char) (groupCount * 2);
            final String groupRegEx = EMPTY + GROUP_SEPARATOR + TEXT_START + groupIndex
                + ".*?"
                + TEXT_END + GROUP_SEPARATOR + groupIndex;
            cleanValue = cleanValue.replaceAll(groupRegEx, EMPTY);
        }

        return cleanValue;
    }

    @Override
    public String getValue(final Integer forBackreference) {
        final String groupValue;
        if (name.startsWith("Non-capturing")) {
            /* A pure capturing group will simply move on to the next node for a value. */
            groupValue = EMPTY;
        } else {
            groupValue = cleanup(getNext().random(capturingGroupReference));
            BackReference.put(capturingGroupReference, groupValue);
        }

        return groupValue + (
            forBackreference != null && capturingGroupReference == forBackreference
                ? EMPTY
                : groupStartTag
        );
    }

    @Override
    public int length() {
        return getNext().length();
    }
}

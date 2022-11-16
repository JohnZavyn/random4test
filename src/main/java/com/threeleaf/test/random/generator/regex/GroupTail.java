/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;
import static com.threeleaf.test.random.generator.regex.GroupHead.GROUP_SEPARATOR;
import static com.threeleaf.test.random.generator.regex.GroupHead.TEXT_END;

import lombok.*;

/**
 * The GroupTail handles the setting of group beginning and ending
 * locations when groups are successfully matched. It must also be able to
 * unset groups that have to be backed off of.
 *
 * <p>The GroupTail node is also used when a previous group is referenced,
 * and in that case no group information needs to be set.</p>
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(of = {"name", "capturingGroupReference", "groupIndex"})
public class GroupTail extends Node {

    private final Integer capturingGroupReference;

    private final String groupEndTag;

    private final int groupIndex;

    private final String name;

    public GroupTail(
        final int theGroupIndex, final int theCapturingGroupIndex, final String groupName
    ) {
        groupIndex = theGroupIndex;
        capturingGroupReference = theCapturingGroupIndex * 2;
        groupEndTag = capturingGroupReference > 0
            ? EMPTY + TEXT_END + GROUP_SEPARATOR + (char) (theCapturingGroupIndex * 2)
            : EMPTY;
        name = groupName;
    }

    /** {@inheritDoc} */
    @Override
    public int length() {
        return 0;
    }

    /** {@inheritDoc} */
    @Override
    public String random(final Integer forBackreference) {
        return capturingGroupReference.equals(forBackreference)
            ? EMPTY
            : groupEndTag + getNext().random(forBackreference);
    }
}

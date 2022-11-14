/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import com.threeleaf.test.random.TestString;
import lombok.Data;
import lombok.EqualsAndHashCode;

/** Class to return ASCII characters <strong>not</strong> in a specified POSIX type. */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharCompliment extends CharBmp {

    /** The characters to choose from. */
    private final String characters;

    public CharCompliment(final String originalCharacters) {
        super();
        final List<Integer> originalChars = newArrayList(originalCharacters.chars().iterator());
        characters = TestString.ASCII.chars()
            .filter(i -> !originalChars.contains(i))
            .collect(
                StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append
            ).toString();
    }
}

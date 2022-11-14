/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestRandom.RANDOM;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static lombok.AccessLevel.PRIVATE;

import java.util.List;
import java.util.Set;

import lombok.NoArgsConstructor;

/** Test {@link Character} utilities. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings("WeakerAccess")
public final class TestCharacterUtil {

    /**
     * Choose one @{link Character} at random from the provided {@link String}.
     *
     * @param string the character source
     *
     * @return a random character
     */
    public static char chooseOneFrom(final String string) {
        return string.charAt(RANDOM.nextInt(string.length()));
    }

    /**
     * Convert a String into a Set of Characters
     *
     * @param string the string
     *
     * @return the Character Set
     */
    public static Set<Character> toCharacterSet(final String string) {
        return string.chars().mapToObj(e -> (char) e).collect(toSet());
    }

    /**
     * Convert a String into a List of Characters
     *
     * @param string the string
     *
     * @return the Character List
     */
    public static List<Character> toCharacters(final String string) {
        return string.chars().mapToObj(c -> (char) c).collect(toList());
    }
}

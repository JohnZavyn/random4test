/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestCharacter.randomBetween;
import static com.threeleaf.test.random.TestInteger.INT_100;
import static com.threeleaf.test.random.TestInteger.INT_99;
import static com.threeleaf.test.random.generator.regex.AsciiType.isAscii;

import com.threeleaf.test.random.TestInteger;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Returns a single character from a specified range of characters.
 *
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code [a-z]}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>One of the characters in the range</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code [A-Z]} &#x2192; {@code Q}
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharRange extends Char {

    /** The first character in the range. */
    private final char firstCharacter;

    /** The last character in the range. */
    private final char lastCharacter;

    /**
     * Instantiate a character range.
     *
     * @param theFirstCharacter the first character in the range
     * @param theLastCharacter  the last character in the range
     */
    public CharRange(final char theFirstCharacter, final char theLastCharacter) {
        super();
        firstCharacter = theFirstCharacter;
        lastCharacter = theLastCharacter;
    }

    /**
     * Return the compliment to this range.
     *
     * @return the CharRangeCompliment
     */
    @Override
    public Char complement() {
        return new CharRangeCompliment(firstCharacter, lastCharacter);
    }

    /**
     * Return characters inside the range.
     *
     * <p>Note: Attempting to generate the internal string from a large range results in OutOfMemoryError, so unicode ranges are limited to 100 characters. This may cause errors when
     * calculating intersections, for example.</p>
     *
     * @return If both sides of the char range are ASCII, then the full range is returned,
     *     otherwise, up to 100 characters of a contiguous block
     */
    @Override
    public String getCharacters() {
        int first = firstCharacter;
        int last = lastCharacter;
        if (!isAscii(lastCharacter) && last - first > INT_100) {
            first = TestInteger.randomBetween(first, last - INT_100);
            last = first + INT_99;
        }

        final StringBuilder characters = new StringBuilder(INT_100);
        for (int character = first; character <= last; character++) {
            characters.append((char) (character));
        }

        return characters.toString();
    }

    /**
     * Pick a character from the provided range.
     *
     * @param forBackreference optional capturing group number
     *
     * @return the selected character
     */
    @Override
    public String getValue(final Integer forBackreference) {
        return Character.toString(randomBetween(firstCharacter, lastCharacter));
    }

    @Override
    public int weight() {
        return lastCharacter - firstCharacter;
    }
}

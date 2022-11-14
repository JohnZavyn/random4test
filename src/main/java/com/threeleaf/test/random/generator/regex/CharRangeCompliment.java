/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestCharacter.randomBetween;
import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.generator.regex.AsciiType.isAscii;
import static java.lang.Character.MAX_VALUE;
import static java.lang.Character.MIN_VALUE;

import com.threeleaf.test.random.TestInteger;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Returns a single character outsize a specified range of characters.
 *
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code [^a-z]}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>One of the characters outside the range</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code [^0-9]} &#x2192; {@code 7}
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharRangeCompliment extends Char {

    /** The first character in the range. */
    private final char firstCharacter;

    /** The last character in the range. */
    private final char lastCharacter;

    /** The highest character value to the left of the range. */
    private final char leftMaxCharacter;

    /** The lowest character value to the right of the range. */
    private final char rightMinCharacter;

    /**
     * Instantiate a character range.
     *
     * @param theFirstCharacter the first character in the range
     * @param theLastCharacter  the last character in the range
     */
    public CharRangeCompliment(final char theFirstCharacter, final char theLastCharacter) {
        super();
        firstCharacter = theFirstCharacter;
        lastCharacter = theLastCharacter;
        leftMaxCharacter = (char) (theFirstCharacter - 1);
        rightMinCharacter = (char) (theLastCharacter + 1);
    }

    /**
     * Return the compliment to this range.
     *
     * @return the CharRange
     */
    @Override
    public Char complement() {
        return new CharRange(firstCharacter, lastCharacter);
    }

    /**
     * Return characters outside the range.
     *
     * <p>Note: Attempting to generate the internal string from a large range results in OutOfMemoryError, so compliments of unicode ranges are limited to 100 characters. This may cause errors when
     * calculating intersections, for example.</p>
     *
     * @return If both sides of the char range are ASCII, then the full ASCII compliment is returned,
     *     otherwise sections below and above the range, up to 100 characters
     */
    @Override
    public String getCharacters() {
        /* Add up to 50 left-side characters */
        int first = MIN_VALUE;
        int last = leftMaxCharacter;
        if (!isAscii(leftMaxCharacter) && last - first > INT_50) {
            first = TestInteger.randomBetween(first, last - INT_50);
            last = first + INT_50;
        }

        final StringBuilder characters = new StringBuilder(INT_100);
        for (int character = first; character < last; character++) {
            characters.append((char) (character));
        }

        /* Add up to 50 right-side characters */
        first = rightMinCharacter;
        last = isAscii(rightMinCharacter) ? INT_255 : MAX_VALUE;
        if (!isAscii(rightMinCharacter) && last - first > INT_50) {
            first = TestInteger.randomBetween(first, last - INT_50);
            last = first + INT_50;
        }
        for (int character = first; character < last; character++) {
            characters.append((char) (character));
        }

        return characters.toString();
    }

    /**
     * Pick a character outside the provided range.
     *
     * @param forBackreference optional capturing group number
     *
     * @return the selected character
     */
    @Override
    public String getValue(final Integer forBackreference) {
        /* There are two ranges to choose from:
         * The "left" side range is 0 to firstCharacter - 1
         * The "right" side range is lastCharacter + 1 to MAX_VALUE  */
        final int leftNumberChars = leftMaxCharacter;
        final int rightNumberChars = MAX_VALUE - rightMinCharacter;
        final int weightedSelection =
            TestInteger.randomBetween(INT_00, leftNumberChars + rightNumberChars);

        return String.valueOf(
            weightedSelection > leftNumberChars
                ? randomBetween((char) (lastCharacter + 1), MAX_VALUE)
                : randomBetween(MIN_VALUE, (char) leftNumberChars)
        );
    }

    @Override
    public int weight() {
        return MAX_VALUE - lastCharacter + firstCharacter;
    }
}

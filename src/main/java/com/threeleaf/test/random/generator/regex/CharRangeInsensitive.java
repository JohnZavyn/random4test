/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestBoolean.coinFlip;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Returns a single upper or lower-case  character from a specified range of ASCII characters.
 *
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code (?i)[a-z]}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>One of the characters in the range, either upper or lower case</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code (?i)[A-Z]} &#x2192; {@code a}
 *                 <br>{@code (?i)[A-Z]} &#x2192; {@code A}
 *                 <br>{@code (?i)[a-z]} &#x2192; {@code j}
 *                 <br>{@code (?i)[a-z]} &#x2192; {@code J}
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             <ul>
 *                 <li>Uses {@link AsciiType} to convert character case, which is optimized for ASCII ranges, compared to the more general {@link Character} conversion methods.</li>
 *             </ul>
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CharRangeInsensitive extends CharRange {

    /**
     * Instantiate a case-insensitive ASCII character range.
     *
     * @param theFirstCharacter the first character in the range
     * @param theLastCharacter  the last character in the range
     */
    public CharRangeInsensitive(final char theFirstCharacter, final char theLastCharacter) {
        super(theFirstCharacter, theLastCharacter);
    }

    /**
     * Generate random upper or lower case ASCII character.
     *
     * @param forBackreference optional capturing group number
     *
     * @return character as string
     */
    @Override
    public String getValue(final Integer forBackreference) {
        final char character = super.getValue(forBackreference).charAt(0);

        return Character.toString((char) (coinFlip() ? AsciiType.toLower(character) : AsciiType.toUpper(character)));
    }
}

/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestBoolean.coinFlip;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Returns a single upper or lower-case character from a specified range of Unicode characters.
 *
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code (?iU)[\u1E00-\u1EFF]}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>One of the characters in the range, either upper or lower case</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code (?iU)[\u1E00-\u1E00]} &#x2192; {@code Ḁ}
 *                 <br>{@code (?iU)[\u1E00-\u1E00]} &#x2192; {@code ḁ}
 *                 <br>{@code (?iU)[\u1E3F-\u1E3F]} &#x2192; {@code ḿ}
 *                 <br>{@code (?iU)[\u1E3F-\u1E3F]} &#x2192; {@code Ḿ}
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CharRangeUnicodeInsensitive extends CharRange {

    /**
     * Instantiate a case-insensitive Unicode character range.
     *
     * @param theFirstCharacter the first character in the range
     * @param theLastCharacter  the last character in the range
     */
    public CharRangeUnicodeInsensitive(final char theFirstCharacter, final char theLastCharacter) {
        super(theFirstCharacter, theLastCharacter);
    }

    /**
     * Generate random upper or lower case Unicode character.
     *
     * @param forBackreference optional capturing group number
     *
     * @return character as string
     */
    @Override
    public String getValue(final Integer forBackreference) {
        final char character = super.getValue(forBackreference).charAt(0);

        return Character.toString(coinFlip() ? Character.toLowerCase(character) : Character.toUpperCase(character));
    }
}

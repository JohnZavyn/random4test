/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static java.lang.Character.toChars;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Single supplementary character generator.
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code }</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td></td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>{@code } &#x2192; {@code }</td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>A hexadecimal character in the range from {@code \x{10000}} to {@code \x{10FFFF}}</td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharSingleSupplementary extends CharBmp {

    /** The character. */
    final String characters;

    public CharSingleSupplementary(final int character) {
        characters = new String(toChars(character));
    }

    /**
     * Return the supplementary unicode character.
     *
     * @param forBackreference unused
     *
     * @return the character
     */
    @Override
    public String getValue(final Integer forBackreference) {
        /* Supplementary Unicode characters are stored as two "surrogate" UTF-16 chars,
         * and the normal chooseOneFrom method will choose one of them. However, both are
         * needed to compose the character, so this override simply returns the entire
         * string.*/
        return characters;
    }
}

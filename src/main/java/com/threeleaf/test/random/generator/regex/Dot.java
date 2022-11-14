/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.ASCII_PRINTABLE;
import static com.threeleaf.test.random.TestString.WHITESPACE_BLANK;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Returns a single printable ASCII character.
 *
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code .}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>A printable ASCII character</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code .} &#x2192; {@code J}
 *            <br> {@code .} &#x2192; {@code \t}
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             <ul>
 *                 <li>Does not generate line feed, carriage return, or vertical tab</li>
 *             </ul>
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Dot extends Char {

    /**
     * Dot can return printable characters, spaces, and tabs.
     *
     * @return the character set.
     */
    @Override
    public String getCharacters() {
        return ASCII_PRINTABLE + WHITESPACE_BLANK;
    }
}

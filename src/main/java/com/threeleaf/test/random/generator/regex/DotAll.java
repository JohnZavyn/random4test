/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.ASCII_PRINTABLE;
import static com.threeleaf.test.random.TestString.WHITESPACE;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Returns a single printable ASCII character, including all whitespace characters.
 *
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code (?s).}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>A printable ASCII character or white space</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code (?s).} &#x2192; {@code J}
 *             <br>{@code (?s).} &#x2192; {@code  }
 *             <br>{@code (?s).} &#x2192; {@code \r}
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             <ul>
 *                 <li>(?s) is a mnemonic for "single-line" mode</li>
 *                 <li>Includes line feed, carriage return, or vertical tab</li>
 *             </ul>
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DotAll extends Dot {

    /**
     * Dot All can return printable and whitespace characters, including line terminators.
     *
     * @return the character set.
     */
    @Override
    public String getCharacters() {
        return ASCII_PRINTABLE + WHITESPACE;
    }
}

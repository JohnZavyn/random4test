/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Single case-insensitive Unicode character generator.
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code (?i)x}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>One of the upper- or lower-case character 'x'</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code ÿ} &#x2192; {@code Ÿ}
 *             <br>{@code ÿ} &#x2192; {@code ÿ}
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             The class itself requires that the upper and lower case characters already be known to instantiate.
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public class CharSingleUnicodeInsensitive extends CharSingleInsensitive {

    /**
     * Instantiate a single character selector.
     *
     * @param theLowerCaseCharacter the lower case character
     * @param theUpperCaseCharacter the upper case character
     */
    public CharSingleUnicodeInsensitive(final char theLowerCaseCharacter, final char theUpperCaseCharacter) {
        super(theLowerCaseCharacter, theUpperCaseCharacter);
    }
}

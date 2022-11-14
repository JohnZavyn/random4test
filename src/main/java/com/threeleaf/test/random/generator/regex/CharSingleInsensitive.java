/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Single case-insensitive {@link AsciiType} character generator.
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
 *                 {@code a} &#x2192; {@code A}
 *             <br>{@code a} &#x2192; {@code a}
 *             <br>{@code Z} &#x2192; {@code z}
 *             <br>{@code Z} &#x2192; {@code z}
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
@Data
@EqualsAndHashCode(callSuper = false)
public class CharSingleInsensitive extends CharBmp {

    /** The characters to choose from. */
    private final String characters;

    /**
     * Instantiate a single character selector.
     *
     * @param theLowerCaseCharacter the lower case character
     * @param theUpperCaseCharacter the upper case character
     */
    public CharSingleInsensitive(final char theLowerCaseCharacter, final char theUpperCaseCharacter) {
        characters = String.valueOf(theLowerCaseCharacter) + theUpperCaseCharacter;
    }
}

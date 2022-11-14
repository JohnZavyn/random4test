/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.google.common.base.Preconditions.checkArgument;
import static com.threeleaf.test.random.TestByte.BYTE_UNSIGNED_MAX;
import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestString.EMPTY;
import static com.threeleaf.test.random.generator.regex.RegExFlags.CASE_INSENSITIVE;
import static com.threeleaf.test.random.generator.regex.RegExFlags.UNICODE_CASE;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Single Latin-1 character generator [\x00-\xFF].
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code [abc]}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>One of the characters in the collection</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code [jamÿµIiSsKkÅå\xFE]} &#x2192; {@code S}
 *             <br>{@code (?u)[JAMÿµIiSsKkÅå\xFE]} &#x2192; {@code Å}
 *             <br>{@code (?iu)[JAM\xFE]} &#x2192; {@code þ}
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             <ul>
 *                 <li>Does not handle case-insensitive Unicode directives for [ÿµIiSsKkÅå]</li>
 *             </ul>
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharBit extends CharBmp {

    /** The characters to choose from. */
    private String characters = EMPTY;

    /**
     * Add a new character to choose from.
     *
     * @param character  the character
     * @param regExFlags applicable regular expression flags
     *
     * @return this object for chaining
     */
    public CharBit add(final int character, final RegExFlags regExFlags) {
        checkArgument(character >= INT_00 && character <= BYTE_UNSIGNED_MAX);
        if (regExFlags.isOff(CASE_INSENSITIVE)) {
            characters += ((char) character);
        } else {
            if (AsciiType.isAscii(character)) {
                characters += ((char) AsciiType.toUpper(character));
                characters += ((char) AsciiType.toLower(character));
            } else if (regExFlags.isOn(UNICODE_CASE)) {
                characters += ((char) Character.toLowerCase(character));
                characters += ((char) Character.toUpperCase(character));
            }
        }

        return this;
    }
}

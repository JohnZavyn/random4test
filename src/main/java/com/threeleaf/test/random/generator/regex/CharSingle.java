/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Single character generator in the <a href="https://en.wikipedia.org/wiki/Plane_(Unicode)">Basic Multilingual Plane</a>.
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code x}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>The character 'x'</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code a} &#x2192; {@code a}
 *             <br>{@code \u2700} &#x2192; {@code \u2700}
 *             <br>{@code \\} &#x2192; {@code \}
 *             <br>{@code \0277} &#x2192; {@code \0277}
 *             <br>{@code \x77} &#x2192; {@code \x77}
 *             <br>{@code \x{777}} &#x2192; {@code \x{777}}
 *             <br>{@code \u1234} &#x2192; {@code \u1234}
 *             <br>{@code \ca} &#x2192; {@code !}
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             Also handles:
 *             <ul>
 *                 <li>An escaped backslash character</li>
 *                 <li>An octal character that starts with {@code \0}</li>
 *                 <li>A hexadecimal character in the range from {@code \x00} to {@code \xFF}</li>
 *                 <li>A hexadecimal character in the range from {@code \x{0}} to {@code \x{9999}}</li>
 *                 <li>A unicode character in the range from {@code \u0000} to {@code \uFFFF}</li>
 *                 <li>The tab character ({@code \t})</li>
 *                 <li>The new line character ({@code \n})</li>
 *                 <li>The carriage-return character ({@code \r})</li>
 *                 <li>The form-feed character ({@code \f})</li>
 *                 <li>The alert (bell) character ({@code \a})</li>
 *                 <li>The escape character ({@code \e})</li>
 *                 <li>A control character that starts with {@code \c}</li>
 *             </ul>
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharSingle extends CharBmp {

    /** The character. */
    private final String characters;

    public CharSingle(final char theCharacter) {
        characters = String.valueOf(theCharacter);
    }
}

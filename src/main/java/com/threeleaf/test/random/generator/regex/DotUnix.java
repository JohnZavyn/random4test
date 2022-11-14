/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Returns a single printable ASCII character, space, tab, or line feed.
 *
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Partial</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code (?d).}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>A printable ASCII character, space, tab, line feed</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code (?d).} &#x2192; {@code J}
 *             <br>{@code (?d).} &#x2192; {@code \t}
 *             <br>{@code (?d).} &#x2192; {@code \n}
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             <ul>
 *                 <li>(?d) is a mnemonic for "Unix-line" mode</li>
 *                 <li>Includes line feed</li>
 *                 <li>Have not figured out a reliable way of making a valid string with the line feed. {@code (?d)..+} works most of the time, but will occasionally fail, when it generates a
 *                 new-line followed by a single character for example. Adding characters or slices before or after the . seem to increase the rate of failure.</li>
 *             </ul>
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DotUnix extends Dot {

    /**
     * Dot can return a printable character, space, tab, or line feed.
     *
     * @return the character set.
     */
    @Override
    public String getCharacters() {
        return ASCII_PRINTABLE + WHITESPACE_BLANK + LINE_FEED;
    }
}

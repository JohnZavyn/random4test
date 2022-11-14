/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Single case-sensitive Unicode character generator.
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code (?u)x}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>A Unicode character</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code (?u)Ÿ} &#x2192; {@code Ÿ}
 *             <br>{@code (?u)ÿ} &#x2192; {@code ÿ}
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public class CharSingleUnicode extends CharSingle {

    public CharSingleUnicode(final char theCharacter) {
        super(theCharacter);
    }
}

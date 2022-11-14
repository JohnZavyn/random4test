/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Positive behind. In RegEx verifies that a pattern is found just before the current point.
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Partial</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code (?<=regex)}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>The content of the regex</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *             {@code a+(?<=a)h!} &#x2192; {@code aaah!}
 *             <br> {@code a(?<=a)h!} &#x2192; {@code aah!} (Regex find, but not match)
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             <ul>
 *                 <li>In RegEx, the pattern inside the lookbehind must be matched just before the position.</li>
 *                 <li>It does not consume any characters or expand the match.</li>
 *                 <li>In a pattern like {@code one(?<=two)three}, both one and two have to match at the position
 *                 where the match of three begins (which isn't possible).</li>
 *             </ul>
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LookbehindPositive extends Node {

    /** The group {@link Node}. */
    private final Node group;

    public LookbehindPositive(final Node theGroupNode) {
        group = theGroupNode;
    }

    /**
     * Returning the regular expression is the best chance of success.
     * The function of a positive lookahead is difficult to construct,
     * and reverse-engineering this functionality reliably seems unlikely.
     *
     * @param forBackreference optional capturing group number
     *
     * @return the value of the lookahead group
     */
    @Override
    public String getValue(final Integer forBackreference) {
        return group.getValue(forBackreference);
    }
}

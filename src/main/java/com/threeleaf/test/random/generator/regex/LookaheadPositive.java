/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Positive lookahead. In RegEx verifies that a pattern is found just before the current point.
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Partial</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code (?=regex)}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>The content of the regex</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *             {@code M(?=m)m+} &#x2192; {@code Mmmmm}
 *             <br> {@code A(?=B)} &#x2192; {@code AB} (Regex find, but not match)
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             <ul>
 *                 <li>In RegEx, the pattern inside the lookahead must be matched just after the position.</li>
 *                 <li>It does not consume any characters or expand the match.</li>
 *                 <li>In a pattern like {@code one(?=two)three}, both two and three have to match at the position
 *                 where the match of one ends (which isn't possible).</li>
 *             </ul>
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LookaheadPositive extends Node {

    /** The group {@link Node}. */
    private final Node group;

    /**
     * Instantiate a positive lookahead.
     *
     * @param theGroupNode the group {@link Node}
     */
    public LookaheadPositive(final Node theGroupNode) {
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

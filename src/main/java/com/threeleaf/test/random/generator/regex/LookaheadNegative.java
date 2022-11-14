/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Negative lookahead. In RegEx verifies that a pattern is not found just after the current point.
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Partial</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code (?!regex)}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>An empty character</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code Z(?!z)} &#x2192; {@code Z}
 *            <br> {@code A(?!b)[c-f]} &#x2192; {@code Ae}
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             <ul>
 *                 <li>This can fail based on the structure of the regex.
 *                 <br>For example, {@code A(?!a).*} will fail if one of the Dot characters generated is a lower-case "a" value</li>
 *             </ul>
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LookaheadNegative extends Node {

    /** The undesired regular expression {@link Node}. */
    private final Node group;

    /**
     * Instantiate a negative lookahead.
     *
     * @param theGroupNode the RegEx we do not want to find
     */
    public LookaheadNegative(final Node theGroupNode) {
        group = theGroupNode;
    }

    /**
     * For this to fully work, we would need to be able to guarantee
     * that no combination of future nodes would produce the indicated regular expression.
     * That is not practical. Instead, simply returning an empty string here and
     * noting only partial support in the documentation.
     *
     * @param forBackreference unused
     *
     * @return empty string
     */
    @Override
    public String getValue(final Integer forBackreference) {
        return EMPTY;
    }
}

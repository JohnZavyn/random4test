/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.EMPTY;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Negative behind. In RegEx, verifies that a pattern is not found just before the current point.
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Partial</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code (?<!regex)}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>An empty character</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code [c-f](?<!b)[a-z]} &#x2192; {@code cz}
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             <ul>
 *                 <li>This can fail based on the structure of the regex.
 *                 <br>For example, {@code [a-f](?<!b)[a-z]} will fail if the left side character range generates a lower-case "b" value</li>
 *             </ul>
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LookbehindNegative extends Node {

    /** The undesired regular expression {@link Node}. */
    private final Node group;

    /**
     * Instantiate a negative lookbehind.
     *
     * @param theGroupNode the RegEx we do not want to find
     */
    public LookbehindNegative(final Node theGroupNode) {
        group = theGroupNode;
    }

    /**
     * For this to fully work, we would need to be able to guarantee
     * that no combination of past nodes have/would produce the indicated regular expression.
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

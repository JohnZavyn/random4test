/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.util.TestCharacterUtil.toCharacterSet;

import java.util.Set;

import com.threeleaf.test.random.util.TestStringUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Generate a single character that occurs in two different character sets.
 *
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code [a-z&&[def]]}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>d, e, or f</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code [a-z&&[def]]} &#x2192; {@code d}, {@code e}, or {@code f}
 *             <br>{@code [a-e&&[d-z]]} &#x2192; {@code d} or {@code e}
 *             <br>{@code [a-d&&[m-p]]} &#x2192; {@link IllegalArgumentException}
 *         </td>
 *     </tr>
 *     <tr>
 *         <th>Notes</th>
 *         <td>
 *             <ul>
 *                 <li>Empty intersections, like {@code [a-d&&[m-p]]} will produce an empty string, which would never match this regular expression</li>
 *             </ul>
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 *
 * @see <a href="https://en.wikipedia.org/wiki/Intersection_(set_theory)">Intersection</a>
 * @see <a href="https://www.regular-expressions.info/charclassintersect.html">Character Class Intersection</a>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharIntersection extends Char {

    /** The characters to choose from. */
    private final String characters;

    /**
     * Instantiate a new character intersection.
     *
     * @param chars1 the first set of characters
     * @param chars2 the second set of characters
     */
    public CharIntersection(final Char chars1, final Char chars2) {
        final Set<Character> characters1 = toCharacterSet(chars1.getCharacters());
        final Set<Character> characters2 = toCharacterSet(chars2.getCharacters());
        characters1.retainAll(characters2);

        characters = TestStringUtil.toString(characters1);
        if (characters.length() == 0) {
            throw new IllegalArgumentException("Intersection has zero characters");
        }
    }

    /** Get the characters to choose from. */
    @Override
    public String getCharacters() {
        return characters;
    }
}

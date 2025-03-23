/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.util.TestCharacterUtil.toCharacterSet;

import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

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
        String result;
        final Set<Character> characters1 = toCharacterSet(chars1.getCharacters());
        final Set<Character> characters2 = toCharacterSet(chars2.getCharacters());
        
        /* Handle empty sets */
        if (characters1.isEmpty() || characters2.isEmpty()) {
            result = "";
        }
        /* Handle special case for Unicode properties */
        else if (chars1 instanceof CharUnicodeType || chars2 instanceof CharUnicodeType) {
            result = handleUnicodeIntersection(chars1, chars2);
        }
        else {
            characters1.retainAll(characters2);
            result = TestStringUtil.toString(characters1);
        }
        characters = result;
    }

    private String handleUnicodeIntersection(final Char chars1, final Char chars2) {
        /* Get all characters from both sets */
        final Set<Character> allChars = new HashSet<>();
        allChars.addAll(toCharacterSet(chars1.getCharacters()));
        allChars.addAll(toCharacterSet(chars2.getCharacters()));
        
        /* Filter characters that match both sets */
        final Set<Character> intersection = allChars.stream()
            .filter(c -> chars1.getValue(null).contains(String.valueOf(c)))
            .filter(c -> chars2.getValue(null).contains(String.valueOf(c)))
            .collect(Collectors.toSet());
            
        return TestStringUtil.toString(intersection);
    }

    /** Get the characters to choose from. */
    @Override
    public String getCharacters() {
        return characters;
    }
}

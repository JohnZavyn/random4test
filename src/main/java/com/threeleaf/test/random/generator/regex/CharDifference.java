/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.util.TestCharacterUtil.toCharacterSet;
import static com.threeleaf.test.random.util.TestCharacterUtil.toCharacters;

import java.util.Collection;

import com.threeleaf.test.random.util.TestStringUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Return a single character from the difference between two character sets.
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code [^a-z]}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>One of the characters outsize the expression</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code [^A-Z]} &#x2192; {@code b}
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharDifference extends Char {

    /** The characters to choose from. */
    private final String characters;

    /**
     * Instantiate a new character difference.
     *
     * @param minuend    the base set of characters
     * @param subtrahend the characters to subtract from the base
     */
    public CharDifference(final Char minuend, final Char subtrahend) {
        final Collection<Character> remainingCharacters = toCharacterSet(minuend.getCharacters());
        remainingCharacters.removeAll(toCharacters(subtrahend.getCharacters()));

        characters = TestStringUtil.toString(remainingCharacters);
    }

    /** Get the characters to choose from. */
    @Override
    public String getCharacters() {
        return characters;
    }
}

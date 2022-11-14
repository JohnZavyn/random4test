/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestInteger.randomBetween;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Generate a single character from the combination of two different character sets.
 *
 * <table>
 *     <tbody>
 *     <tr>
 *         <th>Support</th>
 *         <td>Yes</td>
 *     </tr>
 *     <tr>
 *         <th>Construct</th>
 *         <td>{@code [a-d[m-p]]}</td>
 *     </tr>
 *     <tr>
 *         <th style="white-space: nowrap;">Generates</th>
 *         <td>a through d, or m through p: `[a-dm-p]`</td>
 *     </tr>
 *     <tr>
 *         <th>Examples</th>
 *         <td>
 *                 {@code [a-d[m-p]]} &#x2192; {@code n}
 *             <br>{@code [a-d[m-p]]} &#x2192; {@code c}
 *         </td>
 *     </tr>
 *     </tbody>
 *     <caption>&nbsp;</caption>
 * </table>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharUnion extends Char {

    /** The first character set. */
    private final Char characterSet1;

    /** The second character set. */
    private final Char characterSet2;

    /**
     * Instantiate a union character set with the provided sets.
     *
     * @param chars1 the first character set
     * @param chars2 the second character set
     */
    public CharUnion(final Char chars1, final Char chars2) {
        super();
        characterSet1 = chars1;
        characterSet2 = chars2;
    }

    @Override
    public String getCharacters() {
        return characterSet1.getCharacters() + characterSet2.getCharacters();
    }

    @Override
    public String getValue(final Integer forBackreference) {
        /* Make a weighted selection of the two options provided. */
        final int weightTotal =
            characterSet1.getCharacters().length() + characterSet2.getCharacters().length();
        final int weightSelected = randomBetween(INT_01, weightTotal);
        final Node selected = weightSelected > characterSet1
            .getCharacters().length() ? characterSet2 : characterSet1;

        return selected.getValue(forBackreference);
    }
}

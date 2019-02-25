package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import static com.threeleaf.test.random.TestNumber.INT_01;
import static com.threeleaf.test.random.TestNumber.INT_02;
import static com.threeleaf.test.random.TestNumberUtil.randomBetween;

@UtilityClass
@SuppressWarnings({"WeakerAccess"})
public class TestBooleanUtil
{

    /**
     * Simple two-sided coin flip.
     *
     * @return true if heads
     */
    public static boolean coinFlip()
    {
        return oneOutOf(INT_02);
    }

    /**
     * Roll a die of a given number of sides, and see if it is one.
     *
     * @param number the number of sides on the die (must be &gt; 0)
     *
     * @return true if a 1 was rolled
     */
    public static boolean oneOutOf(final int number)
    {
        assert (number > 0);

        return randomBetween(INT_01, number) == INT_01;
    }
}

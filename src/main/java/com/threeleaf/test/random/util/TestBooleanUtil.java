package com.threeleaf.test.random.util;

import lombok.experimental.UtilityClass;

import static com.threeleaf.test.random.TestRandom.RANDOM;
import static com.threeleaf.test.random.util.RandomIntegerUtil.INT_01;
import static com.threeleaf.test.random.util.RandomIntegerUtil.randomBetween;

@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestBooleanUtil
{

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

    /**
     * Return a random boolean.
     *
     * @return true or false
     */
    public static boolean randomBoolean()
    {
        return RANDOM.nextBoolean();
    }
}

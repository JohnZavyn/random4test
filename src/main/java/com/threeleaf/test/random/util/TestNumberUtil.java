package com.threeleaf.test.random.util;

import com.threeleaf.test.random.TestRandom;
import lombok.experimental.UtilityClass;

import java.math.BigDecimal;

import static com.threeleaf.test.random.TestNumber.*;
import static java.lang.Integer.MAX_VALUE;

/** Test Number Utilities. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestNumberUtil
{

    /**
     * Get a random digit between 0 and 10.
     *
     * @return a number between 0 to 10 inclusive
     */
    public static int random0to10()
    {
        return randomBetween(0, INT_10);
    }

    /**
     * Get a random number between 0 and 100.
     *
     * @return a number between 0 to 100 inclusive
     */
    public static int random0to100()
    {
        return randomBetween(0, INT_100);
    }

    /**
     * Get a random digit between 1 and 10.
     *
     * @return a number between 1 to 10 inclusive
     */
    public static int random1to10()
    {
        return randomBetween(INT_01, INT_10);
    }

    /**
     * Get a random number between 1 and 100.
     *
     * @return a number between 1 to 100 inclusive
     */
    public static int random1to100()
    {
        return randomBetween(INT_01, INT_100);
    }

    /**
     * Return a random integer between minValue and maxValue, inclusive.
     *
     * @param minValue the minimum number
     * @param maxValue the maximum number
     *
     * @return the random integer
     */
    public static int randomBetween(final int minValue, final int maxValue)
    {
        return TestRandom.RANDOM.nextInt(maxValue - minValue + 1) + minValue;
    }

    /**
     * Return a random {@link BigDecimal} between 1 and {@value Integer#MAX_VALUE}.
     *
     * @return the double
     */
    public static BigDecimal randomBigDecimal()
    {
        return BigDecimal.valueOf(randomDouble());
    }

    /**
     * Get a random digit.
     *
     * @return a number between 0 to 9 inclusive
     */
    public static int randomDigit()
    {
        return randomBetween(MIN_DIGIT, MAX_DIGIT);
    }

    /**
     * Return a random double between 1 and {@value Integer#MAX_VALUE}.
     *
     * @return the double
     */
    public static double randomDouble()
    {
        return (double) randomNumber() / (double) (random1to10());
    }

    /**
     * Return a random number between 1 and {@value Integer#MAX_VALUE}.
     *
     * @return the random number
     */
    public static int randomNumber()
    {
        return randomBetween(INT_01, MAX_VALUE);
    }

    /**
     * Get a random number between 0.00 and 100.00.
     *
     * @return a number between 0.00 and 100.00 inclusive
     */
    public static double randomPercent()
    {
        return (double) randomBetween(0, INT_10000) / (double) INT_100;
    }
}

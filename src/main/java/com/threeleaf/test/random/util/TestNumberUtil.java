package com.threeleaf.test.random.util;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.math.BigInteger;

import static com.threeleaf.test.random.TestNumber.MAX_DIGIT;
import static com.threeleaf.test.random.TestNumber.MIN_DIGIT;
import static com.threeleaf.test.random.TestPrimitive.*;
import static com.threeleaf.test.random.TestRandom.RANDOM;

/** Test Number Utilities. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
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
        return RANDOM.nextInt(maxValue - minValue + 1) + minValue;
    }

    /**
     * Return a random {@link BigDecimal}.
     *
     * @return the big decimal
     */
    public static BigDecimal randomBigDecimal()
    {
        return BigDecimal.valueOf(RANDOM.nextDouble());
    }

    /**
     * Return a random {@link BigInteger}.
     *
     * @return the big decimal
     */
    public static BigInteger randomBigInteger()
    {
        return BigInteger.valueOf(RANDOM.nextLong());
    }

    /**
     * Return a random byte.
     *
     * @return the byte
     */
    public static byte randomByte()
    {
        return (byte) randomBetween(Byte.MIN_VALUE, Byte.MAX_VALUE);
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
     * Return a random double.
     *
     * @return the double
     */
    public static double randomDouble()
    {
        return RANDOM.nextDouble();
    }

    /**
     * Return a random float.
     *
     * @return the float
     */
    public static float randomFloat()
    {
        return RANDOM.nextFloat();
    }

    /**
     * Return a random int.
     *
     * @return the int
     */
    public static int randomInt()
    {
        return RANDOM.nextInt();
    }

    /**
     * Return a random int.
     *
     * @return the int
     */
    public static long randomLong()
    {
        return RANDOM.nextLong();
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

    /**
     * Return a random short.
     *
     * @return the short
     */
    public static short randomShort()
    {
        return (short) randomBetween(Short.MIN_VALUE, Short.MAX_VALUE);
    }
}

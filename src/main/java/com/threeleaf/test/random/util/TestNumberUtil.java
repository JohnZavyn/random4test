package com.threeleaf.test.random.util;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.math.BigInteger;

import static com.threeleaf.test.random.TestRandom.RANDOM;
import static com.threeleaf.test.random.util.RandomIntegerUtil.INT_100;
import static com.threeleaf.test.random.util.RandomIntegerUtil.INT_10000;

/** Test Number Utilities. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestNumberUtil
{

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
        return (byte) RandomIntegerUtil.randomBetween(Byte.MIN_VALUE, Byte.MAX_VALUE);
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
     * Get a random number between 0.00 and 100.00.
     *
     * @return a number between 0.00 and 100.00 inclusive
     */
    public static double randomPercent()
    {
        return (double) RandomIntegerUtil.randomBetween(0, INT_10000) / (double) INT_100;
    }

    /**
     * Return a random short.
     *
     * @return the short
     */
    public static short randomShort()
    {
        return (short) RandomIntegerUtil.randomBetween(Short.MIN_VALUE, Short.MAX_VALUE);
    }
}

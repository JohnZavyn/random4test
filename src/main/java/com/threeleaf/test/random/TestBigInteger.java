package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_100;
import static com.threeleaf.test.random.TestRandom.RANDOM;
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

/** Utilities for random {@link BigInteger} creation. */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestBigInteger extends AbstractTest<BigInteger> {

    /** A random {@link BigInteger} from 0-100. */
    public static final BigInteger BIG_INTEGER_SMALL =
            BigInteger.valueOf(TestInteger.randomBetween(0, 100));

    /** The instance of {@link TestBigInteger}. */
    public static final TestBigInteger INSTANCE = new TestBigInteger();

    /** A random {@link BigInteger}. */
    public static final BigInteger BIG_INTEGER = randomBigInteger();

    /** A random {@link BigInteger}. */
    public static final BigInteger BIG_INTEGER_RANDOM = randomBigInteger();

    /** Instantiate a utility to produce randomized {@link BigInteger} objects. */
    public TestBigInteger() {
        super(BigInteger.class);
    }

    /**
     * Return a random short between two shorts, inclusive.
     *
     * @param number1 a number
     * @param number2 another number
     *
     * @return the random short
     */
    public static BigInteger randomBetween(long number1, long number2) {
        return valueOf(TestLong.randomBetween(number1, number2));
    }

    /**
     * Return a random short between two shorts, inclusive.
     *
     * @param number1 a number
     * @param number2 another number
     *
     * @return the random short
     */
    public static BigInteger randomBetween(BigInteger number1, BigInteger number2) {
        return randomBetween(number1.longValue(), number2.longValue());
    }

    /**
     * Return a random {@link BigInteger}.
     *
     * @return the big integer
     */
    public static BigInteger randomBigInteger() {
        return INSTANCE.random();
    }

    /**
     * Return a random negative {@link BigInteger}.
     *
     * @return the big decimal
     */
    public static BigInteger randomNegative() {
        return valueOf(TestLong.randomNegative());
    }

    /**
     * Get a random number between 0 and 100.
     *
     * @return a number between 0 and 100 inclusive
     */
    public static BigInteger randomPercent() {
        return randomBetween(0, INT_100);
    }

    /**
     * Return a random positive {@link BigInteger}.
     *
     * @return the big decimal
     */
    public static BigInteger randomPositive() {
        return valueOf(TestLong.randomPositive());
    }

    /**
     * Return a random {@link BigInteger}.
     *
     * @return the big integer
     */
    @Override
    public BigInteger random() {
        return BigInteger.valueOf(RANDOM.nextLong());
    }
}

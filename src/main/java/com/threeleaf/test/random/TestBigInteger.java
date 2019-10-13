package com.threeleaf.test.random;

import java.math.BigInteger;

import static com.threeleaf.test.random.TestRandom.RANDOM;

/** Utilities for random {@link BigInteger} creation */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestBigInteger extends AbstractTest<BigInteger>
{

    /** A random {@link BigInteger} from 0-100. */
    public static final BigInteger BIG_INTEGER_SMALL = BigInteger.valueOf(TestInteger.randomBetween(0, 100));

    /** The instance of {@link TestBigInteger}. */
    public static final TestBigInteger INSTANCE = new TestBigInteger();

    /** A random {@link BigInteger}. */
    public static final BigInteger BIG_INTEGER = randomBigInteger();

    /** A random {@link BigInteger}. */
    public static final BigInteger BIG_INTEGER_RANDOM = randomBigInteger();

    /** Instantiate a utility to produce randomized {@link BigInteger} objects. */
    public TestBigInteger()
    {
        super(BigInteger.class);
    }

    /**
     * Return a random {@link BigInteger}.
     *
     * @return the big integer
     */
    public static BigInteger randomBigInteger()
    {
        return INSTANCE.random();
    }

    /**
     * Return a random {@link BigInteger}.
     *
     * @return the big integer
     */
    public BigInteger random()
    {
        return BigInteger.valueOf(RANDOM.nextLong());
    }
}

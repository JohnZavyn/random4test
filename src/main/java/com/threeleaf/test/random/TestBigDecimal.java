package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_100;
import static com.threeleaf.test.random.TestRandom.RANDOM;
import static java.math.BigDecimal.valueOf;
import static java.math.RoundingMode.HALF_UP;

import java.math.BigDecimal;

/** Utilities for random {@link BigDecimal} creation. */
@SuppressWarnings({"WeakerAccess"})
public class TestBigDecimal extends AbstractRandom<BigDecimal> {

    /** The instance of {@link TestBigDecimal}. */
    public static final TestBigDecimal INSTANCE = new TestBigDecimal();

    /** A random {@link BigDecimal}. */
    public static final BigDecimal BIG_DECIMAL = randomBigDecimal();

    /** A random {@link BigDecimal}. */
    public static final BigDecimal BIG_DECIMAL_RANDOM = randomBigDecimal();

    /** BigDecimal scale for two decimal places. */
    public static final int TWO_DECIMALS = 2;

    /** A random {@link BigDecimal} from 0-100. */
    public static final BigDecimal BIG_DECIMAL_SMALL = randomPercent();

    /** Instantiate a utility to produce randomized {link BigDecimal} objects. */
    public TestBigDecimal() {
        super(BigDecimal.class);
    }

    /**
     * Return a random short between two shorts, inclusive.
     *
     * @param number1 a number
     * @param number2 another number
     *
     * @return the random short
     */
    public static BigDecimal randomBetween(final double number1, final double number2) {
        return valueOf(TestDouble.randomBetween(number1, number2));
    }

    /**
     * Return a random short between two shorts, inclusive.
     *
     * @param number1 a number
     * @param number2 another number
     *
     * @return the random short
     */
    public static BigDecimal randomBetween(final BigDecimal number1, final BigDecimal number2) {
        return randomBetween(number1.doubleValue(), number2.doubleValue());
    }

    /**
     * Return a random {@link BigDecimal}.
     *
     * @return the big decimal
     */
    public static BigDecimal randomBigDecimal() {
        return INSTANCE.random();
    }

    /**
     * Return a random negative {@link BigDecimal}.
     *
     * @return the big decimal
     */
    public static BigDecimal randomNegative() {
        return valueOf(TestDouble.randomNegative());
    }

    /**
     * Get a random number between 0 and 100.
     *
     * @return a number between 0.00 and 100.00 inclusive
     */
    public static BigDecimal randomPercent() {
        return randomBetween(0, INT_100).setScale(TWO_DECIMALS, HALF_UP);
    }

    /**
     * Return a random positive {@link BigDecimal}.
     *
     * @return the big decimal
     */
    public static BigDecimal randomPositive() {
        return valueOf(TestDouble.randomPositive());
    }

    /**
     * Return a random {@link BigDecimal}.
     *
     * @return the big decimal
     */
    @Override
    public BigDecimal random() {
        return valueOf(RANDOM.nextDouble());
    }
}

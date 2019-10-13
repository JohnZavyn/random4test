package com.threeleaf.test.random;

import java.math.BigDecimal;

import static com.threeleaf.test.random.TestRandom.RANDOM;
import static java.math.BigDecimal.ROUND_HALF_UP;
import static java.math.BigDecimal.valueOf;

/** Utilities for random {@link BigDecimal} creation */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestBigDecimal extends AbstractTestUtil<BigDecimal>
{

    /** A random {@link BigDecimal}. */
    public static final BigDecimal BIG_DECIMAL = randomBigDecimal();

    /** A random {@link BigDecimal}. */
    public static final BigDecimal BIG_DECIMAL_RANDOM = randomBigDecimal();

    /** A random {@link BigDecimal} from 0-100. */
    public static final BigDecimal BIG_DECIMAL_SMALL = BigDecimal.valueOf(TestInteger.randomBetween(1, 10000) / 100D).setScale(2, ROUND_HALF_UP);

    /** The instance of {@link TestBigDecimal}. */
    public static final TestBigDecimal INSTANCE = new TestBigDecimal();

    /** Instantiate a utility to produce randomized {link BigDecimal} objects. */
    public TestBigDecimal()
    {
        super(BigDecimal.class);
    }

    /**
     * Return a random {@link BigDecimal}.
     *
     * @return the big decimal
     */
    public static BigDecimal randomBigDecimal()
    {
        return valueOf(RANDOM.nextDouble());
    }
}

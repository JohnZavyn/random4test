package com.threeleaf.test.random;

import static com.google.common.base.Preconditions.checkArgument;
import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestInteger.randomBetween;
import static com.threeleaf.test.random.TestRandom.RANDOM;

/** Utilities for random {@link Boolean} creation. */
@SuppressWarnings("WeakerAccess")
public class TestBoolean extends AbstractRandom<Boolean> {

    /** The instance of {@link TestBoolean}. */
    public static final TestBoolean INSTANCE = new TestBoolean();

    /** Instantiate a utility to produce randomized Boolean objects. */
    public TestBoolean() {
        super(Boolean.class);
    }

    /**
     * Simple two-sided coin flip.
     *
     * @return true if heads
     */
    public static boolean coinFlip() {
        return RANDOM.nextBoolean();
    }

    /**
     * Roll a die of a given number of sides, and see if it is one.
     *
     * @param number the number of sides on the die (must be &gt; 0)
     *
     * @return true if a 1 was rolled
     */
    public static boolean oneOutOf(int number) {
        checkArgument(number > 0);

        return randomBetween(INT_01, number) == INT_01;
    }

    /**
     * Return a random boolean.
     *
     * @return true or false
     */
    public static boolean randomBoolean() {
        return INSTANCE.random();
    }

    /**
     * Return a random {@link Boolean}.
     *
     * @return the big integer
     */
    @Override
    public Boolean random() {
        return RANDOM.nextBoolean();
    }
}

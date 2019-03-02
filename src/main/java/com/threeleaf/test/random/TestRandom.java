package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.Random;

import static io.github.benas.randombeans.api.EnhancedRandom.random;

/** Class to contain the random generator. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestRandom
{

    /** A random {@link Object}. */
    public static final Object OBJECT = random(Object.class);

    /**
     * The Constant RANDOM. {@link Random} object for selecting random numbers.
     * The method .nextInt(n) will return an integer between 0 (inclusive) and n (exclusive).
     */
    public static final Random RANDOM = new Random();
}

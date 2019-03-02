package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.Random;

/** Class to contain the random generator. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestRandom
{

    /**
     * The Constant RANDOM. {@link Random} object for selecting random numbers.
     * The method .nextInt(n) will return an integer between 0 (inclusive) and n (exclusive).
     */
    public static final Random RANDOM = new Random();
}

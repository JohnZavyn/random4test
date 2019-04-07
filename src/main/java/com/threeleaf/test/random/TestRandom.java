package com.threeleaf.test.random;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import lombok.NonNull;
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

    /** The {@link EnhancedRandom} engine. */
    private static final EnhancedRandom enhancedRandom = new EnhancedRandomBuilder().build();

    /** A random {@link Object}. */
    public static final Object OBJECT = random(Object.class);

    /**
     * Return an object with randomized fields.
     * This is a helper/wrapper method around
     * {@link EnhancedRandom#nextObject(Class, String...)}.
     *
     * @param type           the class of object to create
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a randomized object
     */
    public static <T> T random(@NonNull final Class<T> type, final String... fieldsExcluded)
    {
        return enhancedRandom.nextObject(type, fieldsExcluded);
    }
}

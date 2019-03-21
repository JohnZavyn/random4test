package com.threeleaf.test.random;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import lombok.experimental.UtilityClass;

import java.util.*;

/** Class to contain the random generator. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestRandom
{

    /**
     * The Constant RANDOM. {@link Random} object for selecting random numbers.
     * The method .nextInt(n) will return an integer between 0 (inclusive) and n (exclusive).
     */
    public static final Random RANDOM = new Random();

    /**
     *
     */
    private static final EnhancedRandom enhancedRandom = new EnhancedRandomBuilder().build();

    /** A random {@link Object}. */
    public static final Object OBJECT = random(Object.class);

    public static <T> T random(final Class<T> type, final String... excludedFields)
    {
        return enhancedRandom.nextObject(type, excludedFields);
    }

    /**
     * Generate a List of randomized Objects.
     *
     * @param size           number of objects in list
     * @param type           the type of objects in list
     * @param excludedFields fields to exclude from randomization
     * @param <T>            the Type
     *
     * @return the randomized Object List
     */
    public static <T> List<T> randomListOf(final int size, final Class<T> type, final String... excludedFields)
    {
        final List<T> randomObjects = new ArrayList<>();
        for (int index = 0; index < size; index++)
        {
            randomObjects.add(random(type, excludedFields));
        }

        return randomObjects;
    }

    /**
     * Generate a Set of randomized Objects.
     *
     * @param size           number of objects in set
     * @param type           the type of objects in set
     * @param excludedFields fields to exclude from randomization
     * @param <T>            the Type
     *
     * @return the randomized Object Set
     */
    public static <T> Set<T> randomSetOf(final int size, final Class<T> type, final String... excludedFields)
    {
        final Set<T> randomObjects = new HashSet<>();
        for (int index = 0; index < size; index++)
        {
            randomObjects.add(random(type, excludedFields));
        }

        return randomObjects;
    }
}

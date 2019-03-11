package com.threeleaf.test.random.util;

import io.github.benas.randombeans.api.EnhancedRandom;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.*;

import static com.threeleaf.test.random.TestNumber.INT_01;
import static com.threeleaf.test.random.TestNumber.INT_03;
import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;
import static com.threeleaf.test.random.util.TestNumberUtil.randomBetween;

/** Test Set Utilities. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestSetUtil
{

    /**
     * Return a {@link HashSet} of randomized objects.
     *
     * @param size size of set
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    private static <T> HashSet<T> randomHashSetOf(final int size, final @NonNull Class<T> type)
    {
        return (HashSet<T>) EnhancedRandom.randomSetOf(size, type);
    }

    /**
     * Return a {@link HashSet} of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    private static <T> HashSet<T> randomHashSetOf(final @NonNull Class<T> type)
    {
        return (HashSet<T>) randomSetOf(random1to10(), type);
    }

    /**
     * Return a {@link LinkedHashSet} of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    private static <T> HashSet<T> randomLinkedHashSetOf(final @NonNull Class<T> type)
    {
        return randomLinkedHashSetOf(random1to10(), type);
    }

    /**
     * Return a {@link HashSet} of randomized objects.
     *
     * @param size size of set
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    private static <T> HashSet<T> randomLinkedHashSetOf(final int size, final @NonNull Class<T> type)
    {
        return new LinkedHashSet<>(randomHashSetOf(size, type));
    }

    /**
     * Return a {@link Set} of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    public static <T> Set<T> randomSetOf(@NonNull Class<T> type)
    {
        return randomSetOf(random1to10(), type);
    }

    /**
     * Return a {@link Set} of randomized objects.
     *
     * @param size size of set
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    public static <T> Set<T> randomSetOf(final int size, @NonNull Class<T> type)
    {
        Set<T> set;
        switch (randomBetween(INT_01, INT_03))
        {
            case 1:
                set = randomHashSetOf(size, type);
                break;
            case 2:
                set = randomTreeSetOf(size, type);
                break;
            default:
                set = randomLinkedHashSetOf(size, type);
                break;
        }

        return set;
    }

    /**
     * Return a {@link SortedSet} of randomized objects.
     *
     * @param size size of set
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    private static <T> SortedSet<T> randomSortedSetOf(final int size, final @NonNull Class<T> type)
    {
        return randomTreeSetOf(size, type);
    }

    /**
     * Return a {@link SortedSet} of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    private static <T> SortedSet<T> randomSortedSetOf(final @NonNull Class<T> type)
    {
        return randomSortedSetOf(random1to10(), type);
    }

    /**
     * Return a {@link TreeSet} of randomized objects.
     *
     * @param size size of set
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    private static <T> TreeSet<T> randomTreeSetOf(final int size, final @NonNull Class<T> type)
    {
        return new TreeSet<>(randomHashSetOf(size, type));
    }

    /**
     * Return a {@link TreeSet} of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    private static <T> TreeSet<T> randomTreeSetOf(final @NonNull Class<T> type)
    {
        return randomTreeSetOf(random1to10(), type);
    }
}

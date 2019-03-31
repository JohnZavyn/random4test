package com.threeleaf.test.random.util;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.*;

import static com.threeleaf.test.random.TestNumber.INT_01;
import static com.threeleaf.test.random.TestNumber.INT_03;
import static com.threeleaf.test.random.TestRandom.random;
import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;
import static com.threeleaf.test.random.util.TestNumberUtil.randomBetween;
import static java.util.Comparator.comparing;

/** Test Set Utilities. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestSetUtil
{

    /**
     * Return a {@link HashSet} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param excludedFields (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the set of randomized objects
     */
    public static <T> HashSet<T> randomHashSetOf(final int size, @NonNull final Class<T> type, final String... excludedFields)
    {
        final HashSet<T> randomObjects = new HashSet<>();
        for (int index = 0; index < size; index++)
        {
            randomObjects.add(random(type, excludedFields));
        }

        return randomObjects;
    }

    /**
     * Return a {@link HashSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param excludedFields (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the set of randomized objects
     */
    public static <T> HashSet<T> randomHashSetOf(@NonNull final Class<T> type, final String... excludedFields)
    {
        return randomHashSetOf(random1to10(), type, excludedFields);
    }

    /**
     * Return a {@link LinkedHashSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param excludedFields (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the set of randomized objects
     */
    public static <T> HashSet<T> randomLinkedHashSetOf(@NonNull final Class<T> type, final String... excludedFields)
    {
        return randomLinkedHashSetOf(random1to10(), type, excludedFields);
    }

    /**
     * Return a {@link HashSet} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param excludedFields (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the set of randomized objects
     */
    public static <T> HashSet<T> randomLinkedHashSetOf(final int size, @NonNull final Class<T> type, final String... excludedFields)
    {
        return new LinkedHashSet<>(randomHashSetOf(size, type, excludedFields));
    }

    /**
     * Return a {@link Set} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param excludedFields (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the set of randomized objects
     */
    public static <T> Set<T> randomSetOf(@NonNull final Class<T> type, final String... excludedFields)
    {
        return randomSetOf(random1to10(), type, excludedFields);
    }

    /**
     * Return a {@link Set} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param excludedFields (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the set of randomized objects
     */
    public static <T> Set<T> randomSetOf(final int size, @NonNull final Class<T> type, final String... excludedFields)
    {
        Set<T> set;
        switch (randomBetween(INT_01, INT_03))
        {
            case 1:
                set = randomHashSetOf(size, type, excludedFields);
                break;
            case 2:
                set = randomTreeSetOf(size, type, excludedFields);
                break;
            default:
                set = randomLinkedHashSetOf(size, type, excludedFields);
                break;
        }

        return set;
    }

    /**
     * Return a {@link SortedSet} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param excludedFields (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the set of randomized objects
     */
    public static <T> SortedSet<T> randomSortedSetOf(final int size, @NonNull final Class<T> type, final String... excludedFields)
    {
        return randomTreeSetOf(size, type, excludedFields);
    }

    /**
     * Return a {@link SortedSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param excludedFields (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the set of randomized objects
     */
    public static <T> SortedSet<T> randomSortedSetOf(@NonNull final Class<T> type, final String... excludedFields)
    {
        return randomSortedSetOf(random1to10(), type, excludedFields);
    }

    /**
     * Return a {@link TreeSet} of randomized objects.
     * If the specified type is not Comparable, then a
     * toString Comparator will automatically be added.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param excludedFields (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the set of randomized objects
     */
    public static <T> TreeSet<T> randomTreeSetOf(final int size, @NonNull final Class<T> type, final String... excludedFields)
    {
        Set<T>     set = randomHashSetOf(size, type, excludedFields);
        TreeSet<T> treeSet;
        /* A TreeSet must be of a Comparable type or be constructed with a Comparator. */
        try
        {
            treeSet = new TreeSet<>(set);
        }
        catch (ClassCastException e)
        {
            treeSet = new TreeSet<>(comparing(Object::toString));
            treeSet.addAll(set);
        }

        return treeSet;
    }

    /**
     * Return a {@link TreeSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param excludedFields (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the set of randomized objects
     */
    public static <T> TreeSet<T> randomTreeSetOf(@NonNull final Class<T> type, final String... excludedFields)
    {
        return randomTreeSetOf(random1to10(), type, excludedFields);
    }
}

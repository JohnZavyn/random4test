/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestRandom.randomType;
import static java.util.Comparator.comparing;
import static lombok.AccessLevel.PRIVATE;

import java.util.*;
import java.util.function.Function;
import javax.annotation.Nonnull;

import lombok.NoArgsConstructor;

/** Utilities to generate randomly populated Set objects. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings(
    {"WeakerAccess", "PMD.LooseCoupling", "squid:S1319" /* Using specific implementations */})
public final class TestSetUtil {

    /**
     * Convert any collection into a {@link TreeSet}.
     * <ul>
     *     <li>If the provided collection is not a {@link Set},
     *      then the normal rules of converting to set will apply</li>
     *     <li>If the specified type is not Comparable, then a
     *      toString Comparator will automatically be added</li>
     * </ul>
     *
     * @param collection the original collection of objects
     * @param <T>        the set type
     *
     * @return the TreeSet of object
     */
    public static <T> TreeSet<T> convertToTreeSet(final Collection<T> collection) {
        TreeSet<T> treeSet;
        /* A TreeSet must be of a Comparable type or be constructed with a Comparator. */
        try {
            treeSet = new TreeSet<>(collection);
        } catch (final ClassCastException e) {
            treeSet = new TreeSet<>(comparing(Object::toString));
            treeSet.addAll(collection);
        }

        return treeSet;
    }

    /**
     * Return a {@link HashSet} of randomized objects.
     *
     * @param size           size of set
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet of randomized objects
     */
    public static <T> HashSet<T> randomHashSetOf(
        final int size, @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        final HashSet<T> randomObjects = new HashSet<>();
        for (int index = 0; index < size; index++) {
            randomObjects.add(randomFunction.apply(fieldsExcluded));
        }

        return randomObjects;
    }

    /**
     * Return a {@link HashSet} of 1 to 10 randomized objects.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet of randomized objects
     */
    public static <T> HashSet<T> randomHashSetOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomHashSetOf(random1to10(), randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link HashSet} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet of randomized objects
     */
    public static <T> HashSet<T> randomHashSetOf(
        final int size, @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomHashSetOf(size, randomType(type), fieldsExcluded);
    }

    /**
     * Return a {@link HashSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet of randomized objects
     */
    public static <T> HashSet<T> randomHashSetOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomHashSetOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link HashSet} with a single randomized object.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet with a randomized object
     */
    public static <T> HashSet<T> randomHashSetSingleOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomHashSetOf(INT_01, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link HashSet} with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet with a randomized object
     */
    public static <T> HashSet<T> randomHashSetSingleOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomHashSetOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} of 1 to 10 randomized objects.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedHashSet of randomized objects
     */
    public static <T> LinkedHashSet<T> randomLinkedHashSetOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomLinkedHashSetOf(random1to10(), randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} of randomized objects.
     *
     * @param size           size of set
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedHashSet of randomized objects
     */
    public static <T> LinkedHashSet<T> randomLinkedHashSetOf(
        final int size,
        @Nonnull final Function<String[], T> randomFunction, final String... fieldsExcluded
    ) {
        return new LinkedHashSet<>(randomHashSetOf(size, randomFunction, fieldsExcluded));
    }

    /**
     * Return a {@link LinkedHashSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedHashSet of randomized objects
     */
    public static <T> LinkedHashSet<T> randomLinkedHashSetOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomLinkedHashSetOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedHashSet of randomized objects
     */
    public static <T> LinkedHashSet<T> randomLinkedHashSetOf(
        final int size,
        @Nonnull final Class<T> type, final String... fieldsExcluded
    ) {
        return new LinkedHashSet<>(randomHashSetOf(size, type, fieldsExcluded));
    }

    /**
     * Return a {@link LinkedHashSet} with a single randomized object.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedHashSet with a randomized object
     */
    public static <T> LinkedHashSet<T> randomLinkedHashSetSingleOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomLinkedHashSetOf(INT_01, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedHashSet with a randomized object
     */
    public static <T> LinkedHashSet<T> randomLinkedHashSetSingleOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomLinkedHashSetOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a {@link Set} of 1 to 10 randomized objects.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet, TreeSet, or LinkedHashSet of randomized objects
     */
    public static <T> Set<T> randomSetOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomSetOf(random1to10(), randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Set} of randomized objects.
     *
     * @param size           size of set
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet, TreeSet, or LinkedHashSet of randomized objects
     */
    public static <T> Set<T> randomSetOf(
        final int size, @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        final Set<T> set;
        switch (randomBetween(INT_01, INT_03)) {
            case 1:
                set = randomHashSetOf(size, randomFunction, fieldsExcluded);
                break;
            case 2:
                set = randomTreeSetOf(size, randomFunction, fieldsExcluded);
                break;
            default:
                set = randomLinkedHashSetOf(size, randomFunction, fieldsExcluded);
                break;
        }

        return set;
    }

    /**
     * Return a {@link Set} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet, TreeSet, or LinkedHashSet of randomized objects
     */
    public static <T> Set<T> randomSetOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomSetOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link Set} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet, TreeSet, or LinkedHashSet of randomized objects
     */
    public static <T> Set<T> randomSetOf(
        final int size, @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomSetOf(size, randomType(type), fieldsExcluded);
    }

    /**
     * Return a {@link Set} with a single randomized object.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet, TreeSet, or LinkedHashSet with a randomized object
     */
    public static <T> Set<T> randomSetSingleOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomSetOf(INT_01, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Set} with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet, TreeSet, or LinkedHashSet with a randomized object
     */
    public static <T> Set<T> randomSetSingleOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomSetOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} of randomized objects.
     *
     * @param size           size of set
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a SortedSet of randomized objects
     */
    public static <T> SortedSet<T> randomSortedSetOf(
        final int size, @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomTreeSetOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} of 1 to 10 randomized objects.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a SortedSet of randomized objects
     */
    public static <T> SortedSet<T> randomSortedSetOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomSortedSetOf(random1to10(), randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a SortedSet of randomized objects
     */
    public static <T> SortedSet<T> randomSortedSetOf(
        final int size, @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomTreeSetOf(size, type, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a SortedSet of randomized objects
     */
    public static <T> SortedSet<T> randomSortedSetOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomSortedSetOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} with a single randomized object.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a SortedSet with a randomized object
     */
    public static <T> SortedSet<T> randomSortedSetSingleOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomSortedSetOf(INT_01, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a SortedSet with a randomized object
     */
    public static <T> SortedSet<T> randomSortedSetSingleOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomSortedSetOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} of randomized objects.
     *
     * @param size           size of set
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a TreeSet of randomized objects
     */
    public static <T> TreeSet<T> randomTreeSetOf(
        final int size, @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return convertToTreeSet(randomHashSetOf(size, randomFunction, fieldsExcluded));
    }

    /**
     * Return a {@link TreeSet} of 1 to 10 randomized objects.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a TreeSet of randomized objects
     */
    public static <T> TreeSet<T> randomTreeSetOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomTreeSetOf(random1to10(), randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a TreeSet of randomized objects
     */
    public static <T> TreeSet<T> randomTreeSetOf(
        final int size, @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return convertToTreeSet(randomHashSetOf(size, type, fieldsExcluded));
    }

    /**
     * Return a {@link TreeSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a TreeSet of randomized objects
     */
    public static <T> TreeSet<T> randomTreeSetOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomTreeSetOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} with a single randomized object.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a TreeSet with a randomized object
     */
    public static <T> TreeSet<T> randomTreeSetSingleOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomTreeSetOf(INT_01, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a TreeSet with a randomized object
     */
    public static <T> TreeSet<T> randomTreeSetSingleOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomTreeSetOf(INT_01, type, fieldsExcluded);
    }
}

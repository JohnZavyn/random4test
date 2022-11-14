/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.google.common.collect.Sets.newHashSet;
import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestRandom.randomType;
import static com.threeleaf.test.random.util.TestListUtil.randomArrayListOf;
import static java.lang.reflect.Array.newInstance;
import static lombok.AccessLevel.PRIVATE;

import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nonnull;

import lombok.NoArgsConstructor;

/** Utilities to generate randomly populated Array objects. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings({"WeakerAccess", "unchecked"})
public final class TestArrayUtil {

    /**
     * Choose a random item from an array.
     *
     * @param array the collection to choose from
     * @param <T>   the type of objects in the collection
     *
     * @return a random object
     */
    public static <T> T chooseOneFrom(@Nonnull final T... array) {
        return TestCollectionUtil.chooseOneFrom(newHashSet(array));
    }

    /**
     * Return an array of randomized objects.
     *
     * @param size           the size of array
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an Array of randomized objects
     */
    public static <T> T[] randomArrayOf(
        final int size,
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return toArray(randomArrayListOf(size, randomFunction, fieldsExcluded));
    }

    /**
     * Return an array of randomized objects.
     *
     * @param size           the size of array
     * @param type           the object type
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an Array of randomized objects
     */
    public static <T> T[] randomArrayOf(
        final int size, @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomArrayListOf(size, randomType(type), fieldsExcluded)
            .toArray((T[]) Array.newInstance(type, INT_00));
    }

    /**
     * Return an array of 1 to 10 randomized objects.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an Array of randomized objects
     */
    public static <T> T[] randomArrayOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomArrayOf(random1to10(), randomFunction, fieldsExcluded);
    }

    /**
     * Return an array of 1 to 10 randomized objects.
     *
     * @param type           the object type
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an Array of randomized objects
     */
    public static <T> T[] randomArrayOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomArrayOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return an array with a single randomized object.
     *
     * @param type           the object type
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an Array with a randomized object
     */
    public static <T> T[] randomArraySingleOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomArrayOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return an array with a single randomized object.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an Array with a randomized object
     */
    public static <T> T[] randomArraySingleOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomArrayOf(INT_01, randomFunction, fieldsExcluded);
    }

    /**
     * Convert a generic list into an array.
     *
     * @param list the list to convert
     * @param <T>  the generic type
     *
     * @return the array
     */
    public static <T> T[] toArray(final List<T> list) {
        final Class<?> aClass = list.isEmpty() ? Object.class : list.get(0).getClass();

        return (T[]) newInstance(aClass, list.size());
    }
}

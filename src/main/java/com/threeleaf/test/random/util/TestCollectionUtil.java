/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestBoolean.randomBoolean;
import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestRandom.randomType;
import static com.threeleaf.test.random.util.TestListUtil.randomListOf;
import static com.threeleaf.test.random.util.TestSetUtil.randomSetOf;
import static java.util.Arrays.asList;
import static lombok.AccessLevel.PRIVATE;

import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nonnull;

import lombok.NoArgsConstructor;

/** Utilities to generate randomly populated Collections. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings("WeakerAccess")
public final class TestCollectionUtil {

    /**
     * Choose a random item from an array.
     * Method placed here to allow for easier overloading when
     * statically importing classes.
     *
     * @param array the collection to choose from
     * @param <T>   the type of objects in the collection
     *
     * @return a random object
     *
     * @see TestArrayUtil#chooseOneFrom(Object[])
     */
    public static <T> T chooseOneFrom(@Nonnull final T[] array) {
        return chooseOneFrom(asList(array));
    }

    /**
     * Choose a random item from a collection.
     *
     * @param collection the collection to choose from
     * @param <T>        the type of objects in the collection
     *
     * @return a random object
     */
    public static <T> T chooseOneFrom(@Nonnull final Collection<T> collection) {
        T value = null;
        try {
            value = collection.stream()
                .skip(randomBetween(0, collection.size() - 1))
                .findFirst()
                .orElse(null);
        } catch (final NullPointerException e) {
            /* findFirst() will fail if it selects a null from a collection. */
        }

        return value;
    }

    /**
     * Return a collection of randomized objects.
     *
     * @param size           number of objects in the collection
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a List or Set of randomized objects
     */
    public static <T> Collection<T> randomCollectionOf(
        final int size, @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        final Collection<T> collection;
        if (randomBoolean()) {
            collection = randomSetOf(size, randomFunction, fieldsExcluded);
        } else {
            collection = randomListOf(size, randomFunction, fieldsExcluded);
        }

        return collection;
    }

    /**
     * Return a collection of 1 to 10 randomized objects.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a List or Set of randomized objects
     */
    public static <T> Collection<T> randomCollectionOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomCollectionOf(random1to10(), randomFunction, fieldsExcluded);
    }

    /**
     * Return a collection of randomized objects.
     *
     * @param size           number of objects in the collection
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a List or Set of randomized objects
     */
    public static <T> Collection<T> randomCollectionOf(
        final int size, @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomCollectionOf(size, randomType(type), fieldsExcluded);
    }

    /**
     * Return a collection of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a List or Set of randomized objects
     */
    public static <T> Collection<T> randomCollectionOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomCollectionOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a collection with a single randomized object.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a List or Set with a randomized object
     */
    public static <T> Collection<T> randomCollectionSingleOf(
        @Nonnull final Function<String[], T> randomFunction,
        final String... fieldsExcluded
    ) {
        return randomCollectionOf(INT_01, randomFunction, fieldsExcluded);
    }

    /**
     * Return a collection with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a List or Set with a randomized object
     */
    public static <T> Collection<T> randomCollectionSingleOf(
        @Nonnull final Class<T> type,
        final String... fieldsExcluded
    ) {
        return randomCollectionOf(INT_01, type, fieldsExcluded);
    }
}

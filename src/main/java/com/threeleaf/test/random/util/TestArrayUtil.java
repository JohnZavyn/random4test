package com.threeleaf.test.random.util;

import lombok.experimental.UtilityClass;

import javax.annotation.Nonnull;
import java.lang.reflect.Array;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.util.TestListUtil.randomArrayListOf;
import static java.util.Arrays.asList;

/** Utilities to generate randomly populated Array objects. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unchecked"})
public class TestArrayUtil
{

    /**
     * Choose a random item from an array.
     *
     * @param array the collection to choose from
     * @param <T>   the type of objects in the collection
     *
     * @return a random object
     */
    public static <T> T chooseOneFrom(@Nonnull final T[] array)
    {
        return TestCollectionUtil.chooseOneFrom(asList(array));
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
    public static <T> T[] randomArrayOf(final int size, @Nonnull final Class<T> type, final String... fieldsExcluded)
    {
        return randomArrayListOf(size, type, fieldsExcluded).toArray((T[]) Array.newInstance(type, INT_00));
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
    public static <T> T[] randomArrayOf(@Nonnull final Class<T> type, final String... fieldsExcluded)
    {
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
    public static <T> T[] randomArraySingleOf(@Nonnull final Class<T> type, final String... fieldsExcluded)
    {
        return randomArrayOf(INT_01, type, fieldsExcluded);
    }
}

package com.threeleaf.test.random.util;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.Collection;

import static com.threeleaf.test.random.util.RandomIntegerUtil.INT_01;
import static com.threeleaf.test.random.util.RandomIntegerUtil.random1to10;
import static com.threeleaf.test.random.util.TestBooleanUtil.randomBoolean;
import static com.threeleaf.test.random.util.TestListUtil.randomListOf;
import static com.threeleaf.test.random.util.TestSetUtil.randomSetOf;
import static java.util.Arrays.asList;

/** Utilities to generate randomly populated Collections. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestCollectionUtil
{

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
    public static <T> T chooseOneFrom(@NonNull final T[] array)
    {
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
    public static <T> T chooseOneFrom(@NonNull final Collection<T> collection)
    {
        // @formatter:off //
        return collection.stream()
            .skip((int) (collection.size() * Math.random()))
            .findFirst()
            .orElse(null);
        // @formatter:on //
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
    public static <T> Collection<T> randomCollectionOf(@NonNull final Class<T> type, final String... fieldsExcluded)
    {
        return randomCollectionOf(random1to10(), type, fieldsExcluded);
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
    public static <T> Collection<T> randomCollectionOf(final int size, @NonNull final Class<T> type, final String... fieldsExcluded)
    {
        Collection<T> collection;
        if (randomBoolean())
        {
            collection = randomSetOf(size, type, fieldsExcluded);
        }
        else
        {
            collection = randomListOf(size, type, fieldsExcluded);
        }

        return collection;
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
    public static <T> Collection<T> randomCollectionSingleOf(@NonNull final Class<T> type, final String... fieldsExcluded)
    {
        return randomCollectionOf(INT_01, type, fieldsExcluded);
    }
}

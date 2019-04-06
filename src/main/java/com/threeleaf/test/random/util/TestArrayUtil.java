package com.threeleaf.test.random.util;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.lang.reflect.Array;

import static com.threeleaf.test.random.TestPrimitive.INT_00;
import static com.threeleaf.test.random.util.TestListUtil.randomArrayListOf;
import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;
import static java.util.Arrays.asList;

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
    public static <T> T chooseOneFrom(@NonNull final T[] array)
    {
        return TestCollectionUtil.chooseOneFrom(asList(array));
    }

    /**
     * Return an array of randomized objects.
     *
     * @param size           the size of array
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the array of randomized objects
     */
    public static <T> T[] randomArrayOf(final int size, @NonNull final Class<T> type, final String... fieldsExcluded)
    {
        return randomArrayListOf(size, type, fieldsExcluded).toArray((T[]) Array.newInstance(type, INT_00));
    }

    /**
     * Return an array of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return the array of randomized objects
     */
    public static <T> T[] randomArrayOf(@NonNull final Class<T> type, final String... fieldsExcluded)
    {
        return randomArrayOf(random1to10(), type, fieldsExcluded);
    }
}

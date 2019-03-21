package com.threeleaf.test.random.util;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.lang.reflect.Array;

import static com.threeleaf.test.random.TestNumber.INT_00;
import static com.threeleaf.test.random.util.TestListUtil.randomArrayListOf;
import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;

@UtilityClass
@SuppressWarnings({"WeakerAccess", "unchecked"})
public class TestArrayUtil
{

    /**
     * Return an array of randomized objects.
     *
     * @param size the size of array
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the array of randomized objects
     */
    public static <T> T[] randomArrayOf(final int size, @NonNull Class<T> type)
    {
        return randomArrayListOf(size, type).toArray((T[]) Array.newInstance(type, INT_00));
    }

    /**
     * Return an array of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the array of randomized objects
     */
    public static <T> T[] randomArrayOf(@NonNull Class<T> type)
    {
        return randomArrayOf(random1to10(), type);
    }
}

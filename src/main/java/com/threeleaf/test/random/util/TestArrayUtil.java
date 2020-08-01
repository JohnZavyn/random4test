package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.util.TestListUtil.randomArrayListOf;
import static java.util.Arrays.asList;
import static lombok.AccessLevel.PRIVATE;

import java.lang.reflect.Array;
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
    public static <T> T chooseOneFrom(@Nonnull T... array) {
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
    public static <T> T[] randomArrayOf(int size, @Nonnull Class<T> type,
            String... fieldsExcluded) {
        return randomArrayListOf(size, type, fieldsExcluded)
                .toArray((T[]) Array.newInstance(type, INT_00));
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
    public static <T> T[] randomArrayOf(@Nonnull Class<T> type,
            String... fieldsExcluded) {
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
    public static <T> T[] randomArraySingleOf(@Nonnull Class<T> type,
            String... fieldsExcluded) {
        return randomArrayOf(INT_01, type, fieldsExcluded);
    }
}

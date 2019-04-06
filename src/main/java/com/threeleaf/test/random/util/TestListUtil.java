package com.threeleaf.test.random.util;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.*;

import static com.threeleaf.test.random.TestPrimitive.INT_01;
import static com.threeleaf.test.random.TestPrimitive.INT_03;
import static com.threeleaf.test.random.TestRandom.random;
import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;
import static com.threeleaf.test.random.util.TestNumberUtil.randomBetween;

@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestListUtil
{

    /**
     * Return a {@link ArrayList} of randomized objects.
     *
     * @param size the number of objects in the list
     * @param type type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>  the generic type
     *
     * @return the list of randomized objects
     */
    public static <T> ArrayList<T> randomArrayListOf(final int size, @NonNull final Class<T> type, final String... fieldsExcluded)
    {
        final ArrayList<T> randomObjects = new ArrayList<>();
        for (int index = 0; index < size; index++)
        {
            randomObjects.add(random(type, fieldsExcluded));
        }

        return randomObjects;
    }

    /**
     * Return an {@link ArrayList} of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>  the generic type
     *
     * @return the list of randomized objects
     */
    public static <T> ArrayList<T> randomArrayListOf(@NonNull final Class<T> type, final String... fieldsExcluded)
    {
        return randomArrayListOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedList} of randomized objects.
     *
     * @param size the number of objects in the linked list
     * @param type type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>  the generic type
     *
     * @return the list of randomized objects
     */
    public static <T> LinkedList<T> randomLinkedListOf(final int size, @NonNull final Class<T> type, final String... fieldsExcluded)
    {
        return new LinkedList<>(randomArrayListOf(size, type, fieldsExcluded));
    }

    /**
     * Return an {@link LinkedList} of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>  the generic type
     *
     * @return the list of randomized objects
     */
    public static <T> LinkedList<T> randomLinkedListOf(@NonNull final Class<T> type, final String... fieldsExcluded)
    {
        return randomLinkedListOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a list of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>  the generic type
     *
     * @return the list of randomized objects
     */
    public static <T> List<T> randomListOf(@NonNull final Class<T> type, final String... fieldsExcluded)
    {
        return randomListOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link List} of randomized objects.
     *
     * @param size the number of objects in the list
     * @param type type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>  the generic type
     *
     * @return the list of randomized objects
     */
    public static <T> List<T> randomListOf(final int size, @NonNull final Class<T> type, final String... fieldsExcluded)
    {
        List<T> list;
        switch (randomBetween(INT_01, INT_03))
        {
            case 1:
                list = randomArrayListOf(size, type, fieldsExcluded);
                break;
            case 2:
                list = randomLinkedListOf(size, type, fieldsExcluded);
                break;
            default:
                list = randomVectorOf(size, type, fieldsExcluded);
                break;
        }

        return list;
    }

    /**
     * Return an {@link Vector} of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>  the generic type
     *
     * @return the list of randomized objects
     */
    public static <T> Vector<T> randomVectorOf(@NonNull final Class<T> type, final String... fieldsExcluded)
    {
        return randomVectorOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link Vector} of randomized objects.
     *
     * @param size the number of objects in the list
     * @param type type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>  the generic type
     *
     * @return the list of randomized objects
     */
    public static <T> Vector<T> randomVectorOf(final int size, @NonNull final Class<T> type, final String... fieldsExcluded)
    {
        return new Vector<>(randomArrayListOf(size, type, fieldsExcluded));
    }
}

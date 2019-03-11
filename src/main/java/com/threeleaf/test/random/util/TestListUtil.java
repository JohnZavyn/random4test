package com.threeleaf.test.random.util;

import io.github.benas.randombeans.api.EnhancedRandom;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.*;

import static com.threeleaf.test.random.TestNumber.INT_01;
import static com.threeleaf.test.random.TestNumber.INT_03;
import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;
import static com.threeleaf.test.random.util.TestNumberUtil.randomBetween;

@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestListUtil
{

    /**
     * Return a {@link ArrayList} of randomized objects.
     *
     * @param size the number of objects in the list
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the list of randomized objects
     */
    private static <T> ArrayList<T> randomArrayListOf(final int size, final @NonNull Class<T> type)
    {
        return (ArrayList<T>) EnhancedRandom.randomListOf(size, type);
    }

    /**
     * Return an {@link ArrayList} of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the list of randomized objects
     */
    public static <T> ArrayList<T> randomArrayListOf(@NonNull Class<T> type)
    {
        return randomArrayListOf(random1to10(), type);
    }

    /**
     * Return a {@link LinkedList} of randomized objects.
     *
     * @param size the number of objects in the linked list
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the list of randomized objects
     */
    private static <T> LinkedList<T> randomLinkedListOf(final int size, final @NonNull Class<T> type)
    {
        return new LinkedList<>(EnhancedRandom.randomListOf(size, type));
    }

    /**
     * Return an {@link LinkedList} of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the list of randomized objects
     */
    public static <T> LinkedList<T> randomLinkedListOf(@NonNull Class<T> type)
    {
        return randomLinkedListOf(random1to10(), type);
    }

    /**
     * Return a list of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the list of randomized objects
     */
    public static <T> List<T> randomListOf(@NonNull Class<T> type)
    {
        return randomListOf(random1to10(), type);
    }

    /**
     * Return a {@link List} of randomized objects.
     *
     * @param size the number of objects in the list
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the list of randomized objects
     */
    public static <T> List<T> randomListOf(final int size, @NonNull Class<T> type)
    {
        List<T> list;
        switch (randomBetween(INT_01, INT_03))
        {
            case 1:
                list = randomArrayListOf(size, type);
                break;
            case 2:
                list = randomLinkedListOf(size, type);
                break;
            default:
                list = randomVectorOf(size, type);
                break;
        }

        return list;
    }

    /**
     * Return an {@link Vector} of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the list of randomized objects
     */
    public static <T> Vector<T> randomVectorOf(@NonNull Class<T> type)
    {
        return randomVectorOf(random1to10(), type);
    }

    /**
     * Return a {@link Vector} of randomized objects.
     *
     * @param size the number of objects in the list
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the list of randomized objects
     */
    private static <T> Vector<T> randomVectorOf(final int size, final @NonNull Class<T> type)
    {
        return new Vector<>(randomArrayListOf(size, type));
    }
}

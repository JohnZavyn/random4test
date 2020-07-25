package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestRandom.random;

import java.util.*;
import javax.annotation.Nonnull;

import lombok.experimental.UtilityClass;

/** Utilities to generate randomly populated List objects. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestListUtil {

    /**
     * Return a {@link ArrayList} of randomized objects.
     *
     * @param size           the number of objects in the list
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an ArrayList of randomized objects
     */
    public <T> ArrayList<T> randomArrayListOf(final int size, @Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        final ArrayList<T> randomObjects = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            randomObjects.add(random(type, fieldsExcluded));
        }

        return randomObjects;
    }

    /**
     * Return an {@link ArrayList} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an ArrayList of randomized objects
     */
    public <T> ArrayList<T> randomArrayListOf(@Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        return randomArrayListOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return an {@link ArrayList} with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an ArrayList with a randomized object
     */
    public <T> ArrayList<T> randomArrayListSingleOf(@Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        return randomArrayListOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedList} of randomized objects.
     *
     * @param size           the number of objects in the linked list
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedList of randomized objects
     */
    public <T> LinkedList<T> randomLinkedListOf(final int size, @Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        return new LinkedList<>(randomArrayListOf(size, type, fieldsExcluded));
    }

    /**
     * Return an {@link LinkedList} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedList of randomized objects
     */
    public <T> LinkedList<T> randomLinkedListOf(@Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        return randomLinkedListOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return an {@link LinkedList} with a singe randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedList with a randomized object
     */
    public <T> LinkedList<T> randomLinkedListSingleOf(@Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        return randomLinkedListOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a list of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a ArrayList, LinkedList, or Vector of randomized objects
     */
    public <T> List<T> randomListOf(@Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        return randomListOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link List} of randomized objects.
     *
     * @param size           the number of objects in the list
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a ArrayList, LinkedList, or Vector of randomized objects
     */
    public <T> List<T> randomListOf(final int size, @Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        List<T> list;
        switch (randomBetween(INT_01, INT_03)) {
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
     * Return a list with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a ArrayList, LinkedList, or Vector with a randomized object
     */
    public <T> List<T> randomListSingleOf(@Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        return randomListOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return an {@link Vector} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a Vector of randomized objects
     */
    public <T> Vector<T> randomVectorOf(@Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        return randomVectorOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link Vector} of randomized objects.
     *
     * @param size           the number of objects in the list
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a Vector of randomized objects
     */
    public <T> Vector<T> randomVectorOf(final int size, @Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        return new Vector<>(randomArrayListOf(size, type, fieldsExcluded));
    }

    /**
     * Return an {@link Vector} with a singe randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a Vector with a randomized object
     */
    public <T> Vector<T> randomVectorSingleOf(@Nonnull final Class<T> type,
            final String... fieldsExcluded) {
        return randomVectorOf(INT_01, type, fieldsExcluded);
    }
}

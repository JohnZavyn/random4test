package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestRandom.randomType;
import static lombok.AccessLevel.PRIVATE;

import java.util.*;
import java.util.function.Function;
import javax.annotation.Nonnull;

import lombok.NoArgsConstructor;

/** Utilities to generate randomly populated List objects. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings({"WeakerAccess", "PMD.ReplaceVectorWithList", "PMD.LooseCoupling",
                      "squid:S1149" /* For Vectors */,
                      "squid:S1319" /* Using implementation classes */})
public final class TestListUtil {

    /**
     * Return a {@link ArrayList} of randomized objects.
     *
     * @param size           the number of objects in the list
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an ArrayList of randomized objects
     */
    public static <T> ArrayList<T> randomArrayListOf(
        int size, @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        ArrayList<T> randomObjects = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            randomObjects.add(randomFunction.apply(fieldsExcluded));
        }

        return randomObjects;
    }

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
    public static <T> ArrayList<T> randomArrayListOf(
        int size,
        @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return randomArrayListOf(size, randomType(type), fieldsExcluded);
    }

    /**
     * Return an {@link ArrayList} of 1 to 10 randomized objects.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an ArrayList of randomized objects
     */
    public static <T> ArrayList<T> randomArrayListOf(
        @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        return randomArrayListOf(random1to10(), randomFunction, fieldsExcluded);
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
    public static <T> ArrayList<T> randomArrayListOf(
        @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return randomArrayListOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return an {@link ArrayList} with a single randomized object.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return an ArrayList with a randomized object
     */
    public static <T> ArrayList<T> randomArrayListSingleOf(
        @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        return randomArrayListOf(INT_01, randomFunction, fieldsExcluded);
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
    public static <T> ArrayList<T> randomArrayListSingleOf(
        @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return randomArrayListOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedList} of randomized objects.
     *
     * @param size           the number of objects in the linked list
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedList of randomized objects
     */
    public static <T> LinkedList<T> randomLinkedListOf(
        int size, @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        return new LinkedList<>(randomArrayListOf(size, randomFunction, fieldsExcluded));
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
    public static <T> LinkedList<T> randomLinkedListOf(
        int size, @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return new LinkedList<>(randomArrayListOf(size, type, fieldsExcluded));
    }

    /**
     * Return an {@link LinkedList} of 1 to 10 randomized objects.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedList of randomized objects
     */
    public static <T> LinkedList<T> randomLinkedListOf(
        @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        return randomLinkedListOf(random1to10(), randomFunction, fieldsExcluded);
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
    public static <T> LinkedList<T> randomLinkedListOf(
        @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return randomLinkedListOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return an {@link LinkedList} with a singe randomized object.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedList with a randomized object
     */
    public static <T> LinkedList<T> randomLinkedListSingleOf(
        @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        return randomLinkedListOf(INT_01, randomFunction, fieldsExcluded);
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
    public static <T> LinkedList<T> randomLinkedListSingleOf(
        @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return randomLinkedListOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a list of 1 to 10 randomized objects.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a ArrayList, LinkedList, or Vector of randomized objects
     */
    public static <T> List<T> randomListOf(
        @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        return randomListOf(random1to10(), randomFunction, fieldsExcluded);
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
    public static <T> List<T> randomListOf(
        @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return randomListOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link List} of randomized objects.
     *
     * @param size           the number of objects in the list
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a ArrayList, LinkedList, or Vector of randomized objects
     */
    public static <T> List<T> randomListOf(
        int size, @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        List<T> list;
        switch (randomBetween(INT_01, INT_03)) {
            case 1:
                list = randomArrayListOf(size, randomFunction, fieldsExcluded);
                break;
            case 2:
                list = randomLinkedListOf(size, randomFunction, fieldsExcluded);
                break;
            default:
                list = randomVectorOf(size, randomFunction, fieldsExcluded);
                break;
        }

        return list;
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
    public static <T> List<T> randomListOf(
        int size, @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return randomListOf(size, randomType(type), fieldsExcluded);
    }

    /**
     * Return a list with a single randomized object.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a ArrayList, LinkedList, or Vector with a randomized object
     */
    public static <T> List<T> randomListSingleOf(
        @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        return randomListOf(INT_01, randomFunction, fieldsExcluded);
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
    public static <T> List<T> randomListSingleOf(
        @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return randomListOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return an {@link Vector} of 1 to 10 randomized objects.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a Vector of randomized objects
     */
    public static <T> Vector<T> randomVectorOf(
        @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        return randomVectorOf(random1to10(), randomFunction, fieldsExcluded);
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
    public static <T> Vector<T> randomVectorOf(
        @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return randomVectorOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link Vector} of randomized objects.
     *
     * @param size           the number of objects in the list
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a Vector of randomized objects
     */
    public static <T> Vector<T> randomVectorOf(
        int size, @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        return new Vector<>(randomArrayListOf(size, randomFunction, fieldsExcluded));
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
    public static <T> Vector<T> randomVectorOf(
        int size, @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return new Vector<>(randomArrayListOf(size, type, fieldsExcluded));
    }

    /**
     * Return an {@link Vector} with a singe randomized object.
     *
     * @param randomFunction the {@link Function} used to generate random objects
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a Vector with a randomized object
     */
    public static <T> Vector<T> randomVectorSingleOf(
        @Nonnull Function<String[], T> randomFunction,
        String... fieldsExcluded
    ) {
        return randomVectorOf(INT_01, randomFunction, fieldsExcluded);
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
    public static <T> Vector<T> randomVectorSingleOf(
        @Nonnull Class<T> type,
        String... fieldsExcluded
    ) {
        return randomVectorOf(INT_01, type, fieldsExcluded);
    }
}

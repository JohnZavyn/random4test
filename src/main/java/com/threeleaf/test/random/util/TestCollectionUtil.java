package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestBoolean.randomBoolean;
import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.util.TestListUtil.randomListOf;
import static com.threeleaf.test.random.util.TestSetUtil.randomSetOf;
import static java.util.Arrays.asList;
import static lombok.AccessLevel.PRIVATE;

import java.util.Collection;
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
    public static <T> T chooseOneFrom(@Nonnull T[] array) {
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
    public static <T> T chooseOneFrom(@Nonnull Collection<T> collection) {
        return collection.stream()
            .skip(randomBetween(0, collection.size() - 1))
            .findFirst()
            .orElse(null);
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
    public static <T> Collection<T> randomCollectionOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
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
    public static <T> Collection<T> randomCollectionOf(int size, @Nonnull Class<T> type,
        String... fieldsExcluded) {
        Collection<T> collection;
        if (randomBoolean()) {
            collection = randomSetOf(size, type, fieldsExcluded);
        } else {
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
    public static <T> Collection<T> randomCollectionSingleOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomCollectionOf(INT_01, type, fieldsExcluded);
    }
}

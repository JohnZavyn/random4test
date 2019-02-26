package com.threeleaf.test.random.util;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.Collection;

import static com.threeleaf.test.random.util.TestBooleanUtil.coinFlip;
import static com.threeleaf.test.random.util.TestListUtil.randomListOf;
import static com.threeleaf.test.random.util.TestSetUtil.randomSetOf;

@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestCollectionUtil
{

    /**
     * Choose a random item from a collection
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
     * May be either a List or Set.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the collection of randomized objects
     */
    public static <T> Collection<T> randomCollectionOf(@NonNull Class<T> type)
    {
        Collection<T> collection;
        if (coinFlip())
        {
            collection = randomSetOf(type);
        }
        else
        {
            collection = randomListOf(type);
        }

        return collection;
    }
}

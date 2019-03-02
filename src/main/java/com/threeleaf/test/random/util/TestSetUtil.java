package com.threeleaf.test.random.util;

import io.github.benas.randombeans.api.EnhancedRandom;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.Set;

import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;

@UtilityClass
@SuppressWarnings({"WeakerAccess"})
public class TestSetUtil
{

    /**
     * Return a set of  randomized objects.
     *
     * @param size size of set
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    public static <T> Set<T> randomSetOf(final int size, @NonNull Class<T> type)
    {
        return EnhancedRandom.randomSetOf(size, type);
    }

    /**
     * Return a set of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the set of randomized objects
     */
    public static <T> Set<T> randomSetOf(@NonNull Class<T> type)
    {
        return randomSetOf(random1to10(), type);
    }
}

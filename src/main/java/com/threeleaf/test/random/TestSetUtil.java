package com.threeleaf.test.random;

import io.github.benas.randombeans.api.EnhancedRandom;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.Set;

import static com.threeleaf.test.random.TestNumberUtil.random1to10;

@UtilityClass
@SuppressWarnings({"WeakerAccess"})
public class TestSetUtil
{

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
        return EnhancedRandom.randomSetOf(random1to10(), type);
    }
}

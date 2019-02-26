package com.threeleaf.test.random.util;

import io.github.benas.randombeans.api.EnhancedRandom;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.List;

import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;

@UtilityClass
@SuppressWarnings({"WeakerAccess"})
public class TestListUtil
{

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
        return EnhancedRandom.randomListOf(random1to10(), type);
    }
}

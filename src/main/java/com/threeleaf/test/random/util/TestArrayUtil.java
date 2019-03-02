package com.threeleaf.test.random.util;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.lang.reflect.Array;
import java.util.List;

import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;
import static io.github.benas.randombeans.api.EnhancedRandom.randomListOf;

@UtilityClass
@SuppressWarnings({"WeakerAccess", "unchecked"})
public class TestArrayUtil
{

    /**
     * Return an array of 1 to 10 randomized objects.
     *
     * @param type type of Class
     * @param <T>  the Class
     *
     * @return the array of randomized objects
     */
    public static <T> T[] randomArrayOf(@NonNull Class<T> type)
    {
        List<T> list = randomListOf(random1to10(), type);

        return list.toArray((T[]) Array.newInstance(type, list.size()));
    }
}

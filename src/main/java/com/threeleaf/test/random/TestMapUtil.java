package com.threeleaf.test.random;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.*;

import static com.threeleaf.test.random.TestSetUtil.randomSetOf;
import static io.github.benas.randombeans.api.EnhancedRandom.random;

@UtilityClass
@SuppressWarnings({"unused", "WeakerAccess"})
public class TestMapUtil
{

    /**
     * Return a map of 1 to 10 randomized key-value pairs.
     *
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return the list of randomized objects
     */
    public static <K, V> Map<K, V> randomMapOf(@NonNull Class<K> keyType, @NonNull final Class<V> valueType)
    {
        final Map<K, V> randomMap = new HashMap<>();
        final Set<K>    keySet    = randomSetOf(keyType);
        for (final K key : keySet)
        {
            randomMap.put(key, random(valueType));
        }

        return randomMap;
    }
}

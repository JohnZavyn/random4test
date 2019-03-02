package com.threeleaf.test.random.util;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.*;

import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;
import static com.threeleaf.test.random.util.TestSetUtil.randomSetOf;
import static io.github.benas.randombeans.api.EnhancedRandom.random;

@UtilityClass
@SuppressWarnings({"unused", "WeakerAccess"})
public class TestMapUtil
{

    /**
     * Pick a random key from a map.
     *
     * @param map the map of interest
     * @param <K> the Key class
     * @param <V> the Value class
     *
     * @return a random key
     */
    public static <K, V> K chooseOneKeyFrom(Map<K, V> map)
    {
        return chooseOneFrom(map.keySet());
    }

    /**
     * Pick a random value from a map.
     *
     * @param map the map of interest
     * @param <K> the Key class
     * @param <V> the Value class
     *
     * @return a random value
     */
    public static <K, V> V chooseOneValueFrom(Map<K, V> map)
    {
        return map.get(chooseOneFrom(map.keySet()));
    }

    /**
     * Return a map of 1 to 10 randomized key-value pairs.
     *
     * @param size      the number of key-value pairs in the map
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return the list of randomized objects
     */
    public static <K, V> Map<K, V> randomMapOf(final int size, @NonNull Class<K> keyType, @NonNull final Class<V> valueType)
    {
        final Map<K, V> randomMap = new HashMap<>();
        final Set<K>    keySet    = randomSetOf(size, keyType);
        for (final K key : keySet)
        {
            randomMap.put(key, random(valueType));
        }

        return randomMap;
    }

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
        return randomMapOf(random1to10(), keyType, valueType);
    }
}

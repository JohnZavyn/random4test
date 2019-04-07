package com.threeleaf.test.random.util;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.*;

import static com.threeleaf.test.random.TestPrimitive.INT_01;
import static com.threeleaf.test.random.TestPrimitive.INT_03;
import static com.threeleaf.test.random.TestRandom.random;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;
import static com.threeleaf.test.random.util.TestNumberUtil.randomBetween;
import static com.threeleaf.test.random.util.TestSetUtil.randomHashSetOf;
import static java.util.Comparator.comparing;

/** Utilities to generate randomly populated Map objects. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
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
     * Return a {@link HashMap} of randomized key-value pairs.
     *
     * @param size      the number of key-value pairs in the map
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a HashMap of randomized key-value pairs
     */
    public static <K, V> HashMap<K, V> randomHashMapOf(final int size, final @NonNull Class<K> keyType, final @NonNull Class<V> valueType)
    {
        final HashMap<K, V> randomMap = new HashMap<>();
        final Set<K>        keySet    = randomHashSetOf(size, keyType);
        for (final K key : keySet)
        {
            randomMap.put(key, random(valueType));
        }

        return randomMap;
    }

    /**
     * Return a {@link HashMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a HashMap of randomized key-value pairs
     */
    public static <K, V> HashMap<K, V> randomHashMapOf(@NonNull Class<K> keyType, @NonNull final Class<V> valueType)
    {
        return randomHashMapOf(random1to10(), keyType, valueType);
    }

    /**
     * Return a {@link HashMap} with a single randomized key-value pair.
     *
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a HashMap with a randomized key-value pair
     */
    public static <K, V> HashMap<K, V> randomHashMapSingle(@NonNull Class<K> keyType, @NonNull final Class<V> valueType)
    {
        return randomHashMapOf(INT_01, keyType, valueType);
    }

    /**
     * Return a {@link LinkedHashMap} of randomized key-value pairs.
     *
     * @param size      the number of key-value pairs in the map
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a LinkedHashMap of randomized key-value pairs
     */
    public static <K, V> LinkedHashMap<K, V> randomLinkedHashMapOf(final int size, final @NonNull Class<K> keyType, final @NonNull Class<V> valueType)
    {
        return new LinkedHashMap<>(randomHashMapOf(size, keyType, valueType));
    }

    /**
     * Return a {@link LinkedHashMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a LinkedHashMap of randomized key-value pairs
     */
    public static <K, V> LinkedHashMap<K, V> randomLinkedHashMapOf(@NonNull Class<K> keyType, @NonNull final Class<V> valueType)
    {
        return randomLinkedHashMapOf(random1to10(), keyType, valueType);
    }

    /**
     * Return a {@link LinkedHashMap} with a single randomized key-value pair.
     *
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a LinkedHashMap with a randomized key-value pair
     */
    public static <K, V> LinkedHashMap<K, V> randomLinkedHashMapSingle(@NonNull Class<K> keyType, @NonNull final Class<V> valueType)
    {
        return randomLinkedHashMapOf(INT_01, keyType, valueType);
    }

    /**
     * Return a {@link Map} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap of randomized key-value pairs
     */
    public static <K, V> Map<K, V> randomMapOf(@NonNull Class<K> keyType, @NonNull final Class<V> valueType)
    {
        return randomMapOf(random1to10(), keyType, valueType);
    }

    /**
     * Return a {@link Map} of randomized key-value pairs.
     *
     * @param size      the number of key-value pairs in the map
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap of randomized key-value pairs
     */
    public static <K, V> Map<K, V> randomMapOf(final int size, @NonNull Class<K> keyType, @NonNull final Class<V> valueType)
    {
        Map<K, V> map;
        switch (randomBetween(INT_01, INT_03))
        {
            case 1:
                map = randomHashMapOf(size, keyType, valueType);
                break;
            case 2:
                map = randomLinkedHashMapOf(size, keyType, valueType);
                break;
            default:
                map = randomTreeMapOf(size, keyType, valueType);
                break;
        }

        return map;
    }

    /**
     * Return a {@link Map} with a single randomized key-value pair.
     *
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap with a randomized key-value pair
     */
    public static <K, V> Map<K, V> randomMapSingle(@NonNull Class<K> keyType, @NonNull final Class<V> valueType)
    {
        return randomMapOf(INT_01, keyType, valueType);
    }

    /**
     * Return a {@link TreeMap} of randomized key-value pairs.
     * If the specified type is not Comparable, then a
     * toString Comparator will automatically be added.
     *
     * @param size      the number of key-value pairs in the map
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a TreeMap of randomized key-value pairs
     */
    public static <K, V> TreeMap<K, V> randomTreeMapOf(final int size, final @NonNull Class<K> keyType, final @NonNull Class<V> valueType)
    {
        Map<K, V>     map = randomHashMapOf(size, keyType, valueType);
        TreeMap<K, V> treeMap;
        /* A TreeMap must be of a Comparable type or be constructed with a Comparator. */
        try
        {
            treeMap = new TreeMap<>(map);
        }
        catch (ClassCastException e)
        {
            treeMap = new TreeMap<>(comparing(Object::toString));
            treeMap.putAll(map);
        }

        return treeMap;
    }

    /**
     * Return a {@link TreeMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a TreeMap of randomized key-value pairs
     */
    public static <K, V> TreeMap<K, V> randomTreeMapOf(@NonNull Class<K> keyType, @NonNull final Class<V> valueType)
    {
        return randomTreeMapOf(random1to10(), keyType, valueType);
    }

    /**
     * Return a {@link TreeMap} with a single randomized key-value pair.
     *
     * @param keyType   type of keys in the map
     * @param valueType the type of values in the map
     * @param <K>       the key Class
     * @param <V>       the value Class
     *
     * @return a TreeMap with a randomized key-value pair
     */
    public static <K, V> TreeMap<K, V> randomTreeMapSingle(@NonNull Class<K> keyType, @NonNull final Class<V> valueType)
    {
        return randomTreeMapOf(INT_01, keyType, valueType);
    }
}

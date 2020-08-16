package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestRandom.randomType;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static java.util.Comparator.comparing;
import static lombok.AccessLevel.PRIVATE;

import java.util.*;
import java.util.function.Function;
import javax.annotation.Nonnull;

import lombok.NoArgsConstructor;

/** Utilities to generate randomly populated Map objects. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings(
    {"WeakerAccess", "PMD.LooseCoupling", "squid:S1319" /* Using specific implementations */})
public final class TestMapUtil {

    /**
     * Pick a random key from a map.
     *
     * @param map the map of interest
     * @param <K> the Key class
     * @param <V> the Value class
     *
     * @return a random key
     */
    public static <K, V> K chooseOneKeyFrom(Map<K, V> map) {
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
    public static <K, V> V chooseOneValueFrom(Map<K, V> map) {
        return map.get(chooseOneFrom(map.keySet()));
    }

    /**
     * Return a {@link HashMap} of randomized key-value pairs.
     *
     * @param size                the number of key-value pairs in the map
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value objects
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a HashMap of randomized key-value pairs
     */
    public static <K, V> HashMap<K, V> randomHashMapOf(
        int size,
        @Nonnull Class<K> keyType,
        @Nonnull Function<String[], V> randomValueFunction,
        String... fieldsExcluded
    ) {
        HashMap<K, V> randomMap = new HashMap<>();
        Set<K> keySet = TestSetUtil.randomHashSetOf(size, keyType);
        for (K key : keySet) {
            randomMap.put(key, randomValueFunction.apply(fieldsExcluded));
        }

        return randomMap;
    }

    /**
     * Return a {@link HashMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value objects
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a HashMap of randomized key-value pairs
     */
    public static <K, V> HashMap<K, V> randomHashMapOf(
        @Nonnull Class<K> keyType,
        @Nonnull Function<String[], V> randomValueFunction, String... fieldsExcluded
    ) {
        return randomHashMapOf(random1to10(), keyType, randomValueFunction, fieldsExcluded);
    }

    /**
     * Return a {@link HashMap} of randomized key-value pairs.
     *
     * @param size           the number of key-value pairs in the map
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a HashMap of randomized key-value pairs
     */
    public static <K, V> HashMap<K, V> randomHashMapOf(
        int size,
        @Nonnull Class<K> keyType, @Nonnull Class<V> valueType,
        String... fieldsExcluded
    ) {
        return randomHashMapOf(size, keyType, randomType(valueType), fieldsExcluded);
    }

    /**
     * Return a {@link HashMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a HashMap of randomized key-value pairs
     */
    public static <K, V> HashMap<K, V> randomHashMapOf(
        @Nonnull Class<K> keyType,
        @Nonnull Class<V> valueType, String... fieldsExcluded
    ) {
        return randomHashMapOf(random1to10(), keyType, valueType, fieldsExcluded);
    }

    /**
     * Return a {@link HashMap} with a single randomized key-value pair.
     *
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value object
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a HashMap with a randomized key-value pair
     */
    public static <K, V> HashMap<K, V> randomHashMapSingleOf(
        @Nonnull Class<K> keyType,
        @Nonnull Function<String[], V> randomValueFunction, String... fieldsExcluded
    ) {
        return randomHashMapOf(INT_01, keyType, randomValueFunction, fieldsExcluded);
    }

    /**
     * Return a {@link HashMap} with a single randomized key-value pair.
     *
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value object
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a HashMap with a randomized key-value pair
     */
    public static <K, V> HashMap<K, V> randomHashMapSingleOf(
        @Nonnull Class<K> keyType,
        @Nonnull Class<V> valueType, String... fieldsExcluded
    ) {
        return randomHashMapOf(INT_01, keyType, valueType, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashMap} of randomized key-value pairs.
     *
     * @param size                the number of key-value pairs in the map
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value objects
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a LinkedHashMap of randomized key-value pairs
     */
    public static <K, V> LinkedHashMap<K, V> randomLinkedHashMapOf(
        int size,
        @Nonnull Class<K> keyType, @Nonnull Function<String[], V> randomValueFunction,
        String... fieldsExcluded
    ) {
        return new LinkedHashMap<>(
            randomHashMapOf(size, keyType, randomValueFunction, fieldsExcluded));
    }

    /**
     * Return a {@link LinkedHashMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value objects
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a LinkedHashMap of randomized key-value pairs
     */
    public static <K, V> LinkedHashMap<K, V> randomLinkedHashMapOf(
        @Nonnull Class<K> keyType,
        @Nonnull Function<String[], V> randomValueFunction, String... fieldsExcluded
    ) {
        return randomLinkedHashMapOf(random1to10(), keyType, randomValueFunction, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashMap} of randomized key-value pairs.
     *
     * @param size           the number of key-value pairs in the map
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a LinkedHashMap of randomized key-value pairs
     */
    public static <K, V> LinkedHashMap<K, V> randomLinkedHashMapOf(
        int size,
        @Nonnull Class<K> keyType, @Nonnull Class<V> valueType,
        String... fieldsExcluded
    ) {
        return new LinkedHashMap<>(randomHashMapOf(size, keyType, valueType, fieldsExcluded));
    }

    /**
     * Return a {@link LinkedHashMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a LinkedHashMap of randomized key-value pairs
     */
    public static <K, V> LinkedHashMap<K, V> randomLinkedHashMapOf(
        @Nonnull Class<K> keyType,
        @Nonnull Class<V> valueType, String... fieldsExcluded
    ) {
        return randomLinkedHashMapOf(random1to10(), keyType, valueType, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashMap} with a single randomized key-value pair.
     *
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value object
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a LinkedHashMap with a randomized key-value pair
     */
    public static <K, V> LinkedHashMap<K, V> randomLinkedHashMapSingleOf(
        @Nonnull Class<K> keyType,
        @Nonnull Function<String[], V> randomValueFunction, String... fieldsExcluded
    ) {
        return randomLinkedHashMapOf(INT_01, keyType, randomValueFunction, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashMap} with a single randomized key-value pair.
     *
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value object
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a LinkedHashMap with a randomized key-value pair
     */
    public static <K, V> LinkedHashMap<K, V> randomLinkedHashMapSingleOf(
        @Nonnull Class<K> keyType,
        @Nonnull Class<V> valueType, String... fieldsExcluded
    ) {
        return randomLinkedHashMapOf(INT_01, keyType, valueType, fieldsExcluded);
    }

    /**
     * Return a {@link Map} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value objects
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap of randomized key-value pairs
     */
    public static <K, V> Map<K, V> randomMapOf(
        @Nonnull Class<K> keyType,
        @Nonnull Function<String[], V> randomValueFunction, String... fieldsExcluded
    ) {
        return randomMapOf(random1to10(), keyType, randomValueFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Map} of randomized key-value pairs.
     *
     * @param size                the number of key-value pairs in the map
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value objects
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap of randomized key-value pairs
     */
    public static <K, V> Map<K, V> randomMapOf(
        int size, @Nonnull Class<K> keyType,
        @Nonnull Function<String[], V> randomValueFunction, String... fieldsExcluded
    ) {
        Map<K, V> map;
        switch (randomBetween(INT_01, INT_03)) {
            case 1:
                map = randomHashMapOf(size, keyType, randomValueFunction, fieldsExcluded);
                break;
            case 2:
                map = randomLinkedHashMapOf(size, keyType, randomValueFunction, fieldsExcluded);
                break;
            default:
                map = randomTreeMapOf(size, keyType, randomValueFunction, fieldsExcluded);
                break;
        }

        return map;
    }

    /**
     * Return a {@link Map} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap of randomized key-value pairs
     */
    public static <K, V> Map<K, V> randomMapOf(
        @Nonnull Class<K> keyType,
        @Nonnull Class<V> valueType, String... fieldsExcluded
    ) {
        return randomMapOf(random1to10(), keyType, valueType, fieldsExcluded);
    }

    /**
     * Return a {@link Map} of randomized key-value pairs.
     *
     * @param size           the number of key-value pairs in the map
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap of randomized key-value pairs
     */
    public static <K, V> Map<K, V> randomMapOf(
        int size, @Nonnull Class<K> keyType,
        @Nonnull Class<V> valueType, String... fieldsExcluded
    ) {
        return randomMapOf(size, keyType, randomType(valueType), fieldsExcluded);
    }

    /**
     * Return a {@link Map} with a single randomized key-value pair.
     *
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value object
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap with a randomized key-value pair
     */
    public static <K, V> Map<K, V> randomMapSingleOf(
        @Nonnull Class<K> keyType,
        @Nonnull Function<String[], V> randomValueFunction, String... fieldsExcluded
    ) {
        return randomMapOf(INT_01, keyType, randomValueFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Map} with a single randomized key-value pair.
     *
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value object
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap with a randomized key-value pair
     */
    public static <K, V> Map<K, V> randomMapSingleOf(
        @Nonnull Class<K> keyType,
        @Nonnull Class<V> valueType, String... fieldsExcluded
    ) {
        return randomMapOf(INT_01, keyType, valueType, fieldsExcluded);
    }

    /**
     * Return a {@link TreeMap} of randomized key-value pairs.
     * If the specified type is not Comparable, then a
     * toString Comparator will automatically be added.
     *
     * @param size                the number of key-value pairs in the map
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value objects
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a TreeMap of randomized key-value pairs
     */
    public static <K, V> TreeMap<K, V> randomTreeMapOf(
        int size,
        @Nonnull Class<K> keyType, @Nonnull Function<String[], V> randomValueFunction,
        String... fieldsExcluded
    ) {
        Map<K, V> map = randomHashMapOf(size, keyType, randomValueFunction, fieldsExcluded);
        TreeMap<K, V> treeMap;
        /* A TreeMap must be of a Comparable type or be constructed with a Comparator. */
        try {
            treeMap = new TreeMap<>(map);
        } catch (ClassCastException e) {
            treeMap = new TreeMap<>(comparing(Object::toString));
            treeMap.putAll(map);
        }

        return treeMap;
    }

    /**
     * Return a {@link TreeMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value objects
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a TreeMap of randomized key-value pairs
     */
    public static <K, V> TreeMap<K, V> randomTreeMapOf(
        @Nonnull Class<K> keyType,
        @Nonnull Function<String[], V> randomValueFunction, String... fieldsExcluded
    ) {
        return randomTreeMapOf(random1to10(), keyType, randomValueFunction, fieldsExcluded);
    }

    /**
     * Return a {@link TreeMap} of randomized key-value pairs.
     * If the specified type is not Comparable, then a
     * toString Comparator will automatically be added.
     *
     * @param size           the number of key-value pairs in the map
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a TreeMap of randomized key-value pairs
     */
    public static <K, V> TreeMap<K, V> randomTreeMapOf(
        int size,
        @Nonnull Class<K> keyType, @Nonnull Class<V> valueType,
        String... fieldsExcluded
    ) {
        return randomTreeMapOf(size, keyType, randomType(valueType), fieldsExcluded);
    }

    /**
     * Return a {@link TreeMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a TreeMap of randomized key-value pairs
     */
    public static <K, V> TreeMap<K, V> randomTreeMapOf(
        @Nonnull Class<K> keyType,
        @Nonnull Class<V> valueType, String... fieldsExcluded
    ) {
        return randomTreeMapOf(random1to10(), keyType, valueType, fieldsExcluded);
    }

    /**
     * Return a {@link TreeMap} with a single randomized key-value pair.
     *
     * @param keyType             type of keys in the map
     * @param randomValueFunction the type of values in the map
     * @param fieldsExcluded      the fields to exclude in the value object
     * @param <K>                 the key Class
     * @param <V>                 the value Class
     *
     * @return a TreeMap with a randomized key-value pair
     */
    public static <K, V> TreeMap<K, V> randomTreeMapSingleOf(
        @Nonnull Class<K> keyType,
        @Nonnull Function<String[], V> randomValueFunction, String... fieldsExcluded
    ) {
        return randomTreeMapOf(INT_01, keyType, randomValueFunction, fieldsExcluded);
    }

    /**
     * Return a {@link TreeMap} with a single randomized key-value pair.
     *
     * @param keyType        type of keys in the map
     * @param valueType      the type of values in the map
     * @param fieldsExcluded the fields to exclude in the value object
     * @param <K>            the key Class
     * @param <V>            the value Class
     *
     * @return a TreeMap with a randomized key-value pair
     */
    public static <K, V> TreeMap<K, V> randomTreeMapSingleOf(
        @Nonnull Class<K> keyType,
        @Nonnull Class<V> valueType, String... fieldsExcluded
    ) {
        return randomTreeMapOf(INT_01, keyType, valueType, fieldsExcluded);
    }
}

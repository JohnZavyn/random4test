package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.Map;

import static com.threeleaf.test.random.util.TestMapUtil.randomMapOf;
import static com.threeleaf.test.random.util.TestMapUtil.randomMapSingleOf;
import static java.util.Collections.unmodifiableMap;

/** Map constants for use in testing. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestMap
{

    /** An {@link Integer} map. */
    public static final Map<Integer, Integer> MAP_INTEGER = unmodifiableMap(randomMapOf(Integer.class, Integer.class));

    /** An {@link Integer} map with a single key-value pair. */
    public static final Map<Integer, Integer> MAP_INTEGER_SINGLE = unmodifiableMap(randomMapSingleOf(Integer.class, Integer.class));

    /** An {@link Integer} key and {@link String} value map. */
    public static final Map<Integer, String> MAP_INTEGER_STRING = unmodifiableMap(randomMapOf(Integer.class, String.class));

    /** An {@link Integer} key and {@link String} value map with a single key-value pair. */
    public static final Map<Integer, String> MAP_INTEGER_STRING_SINGLE = unmodifiableMap(randomMapSingleOf(Integer.class, String.class));

    /** An {@link Long} map. */
    public static final Map<Long, Long> MAP_LONG = unmodifiableMap(randomMapOf(Long.class, Long.class));

    /** An {@link Long} map with a single key-value pair. */
    public static final Map<Long, Long> MAP_LONG_SINGLE = unmodifiableMap(randomMapSingleOf(Long.class, Long.class));

    /** An {@link Long} key and {@link String} value map. */
    public static final Map<Long, String> MAP_LONG_STRING = unmodifiableMap(randomMapOf(Long.class, String.class));

    /** An {@link Long} key and {@link String} value map with a single key-value pair. */
    public static final Map<Long, String> MAP_LONG_STRING_SINGLE = unmodifiableMap(randomMapSingleOf(Long.class, String.class));

    /** An {@link Object} map. */
    public static final Map<Object, Object> MAP_OBJECT = unmodifiableMap(randomMapOf(Object.class, Object.class));

    /** An {@link Object} map with a single key-value pair. */
    public static final Map<Object, Object> MAP_OBJECT_SINGLE = unmodifiableMap(randomMapSingleOf(Object.class, Object.class));

    /** An {@link String} map. */
    public static final Map<String, String> MAP_STRING = unmodifiableMap(randomMapOf(String.class, String.class));

    /** An {@link String} map with a single key-value pair. */
    public static final Map<String, String> MAP_STRING_SINGLE = unmodifiableMap(randomMapSingleOf(String.class, String.class));
}

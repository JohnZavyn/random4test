package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.Map;

import static com.threeleaf.test.random.util.TestMapUtil.randomMapOf;

/** Map constants for use in testing. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestMap
{

    /** An {@link Integer} map. */
    public static final Map<Integer, Integer> INTEGER_MAP = randomMapOf(Integer.class, Integer.class);

    /** An {@link Integer} key and {@link String} value map. */
    public static final Map<Integer, String> INTEGER_STRING_MAP = randomMapOf(Integer.class, String.class);

    /** An {@link Long} map. */
    public static final Map<Long, Long> LONG_MAP = randomMapOf(Long.class, Long.class);

    /** An {@link Long} key and {@link String} value map. */
    public static final Map<Long, String> LONG_STRING_MAP = randomMapOf(Long.class, String.class);

    /** An {@link Object} map. */
    public static final Map<Object, Object> OBJECT_MAP = randomMapOf(Object.class, Object.class);

    /** An {@link String} map. */
    public static final Map<String, String> STRING_MAP = randomMapOf(String.class, String.class);
}
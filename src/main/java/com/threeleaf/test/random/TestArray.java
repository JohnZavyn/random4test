package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import static com.threeleaf.test.random.util.TestArrayUtil.randomArrayOf;

/** Array constants for use in testing. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestArray
{

    /** An {@link Integer} array. */
    public static final Integer[] ARRAY_INTEGER = randomArrayOf(Integer.class);

    /** An {@link Long} array. */
    public static final Long[] ARRAY_LONG = randomArrayOf(Long.class);

    /** An {@link Object} array. */
    public static final Object[] ARRAY_OBJECT = randomArrayOf(Object.class);

    /** An {@link String} array. */
    public static final String[] ARRAY_STRING = randomArrayOf(String.class);
}

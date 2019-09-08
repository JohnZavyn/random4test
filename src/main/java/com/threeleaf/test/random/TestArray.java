package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import static com.threeleaf.test.random.util.TestArrayUtil.randomArrayOf;
import static com.threeleaf.test.random.util.TestArrayUtil.randomArraySingleOf;

/**
 * Array constants for use in testing.
 * Note that all arrays are mutable in Java, so be aware of using these
 * global "constants" in tests where the contents of the array may be changed.
 * If code modifies an array, it will not stay the same throughout the method
 * being tested.
 */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestArray
{

    /** An {@link Integer} array. */
    public static final Integer[] ARRAY_INTEGER = randomArrayOf(Integer.class);

    /** An {@link Integer} array with a single value. */
    public static final Integer[] ARRAY_INTEGER_SINGLE = randomArraySingleOf(Integer.class);

    /** An {@link Long} array. */
    public static final Long[] ARRAY_LONG = randomArrayOf(Long.class);

    /** An {@link Long} array with a single value. */
    public static final Long[] ARRAY_LONG_SINGLE = randomArraySingleOf(Long.class);

    /** An {@link Object} array. */
    public static final Object[] ARRAY_OBJECT = randomArrayOf(Object.class);

    /** An {@link Object} array with a single value. */
    public static final Object[] ARRAY_OBJECT_SINGLE = randomArraySingleOf(Object.class);

    /** An {@link String} array. */
    public static final String[] ARRAY_STRING = randomArrayOf(String.class);

    /** An {@link String} array with a single value. */
    public static final String[] ARRAY_STRING_SINGLE = randomArraySingleOf(String.class);
}

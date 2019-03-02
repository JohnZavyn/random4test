package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import static com.threeleaf.test.random.util.TestArrayUtil.randomArrayOf;

/** Array constants for use in testing. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestArray
{

    /** An {@link Integer} array. */
    public static final Integer[] INTEGER_ARRAY = randomArrayOf(Integer.class);

    /** An {@link Long} array. */
    public static final Long[] LONG_ARRAY = randomArrayOf(Long.class);

    /** An {@link Object} array. */
    public static final Object[] OBJECT_ARRAY = randomArrayOf(Object.class);

    /** An {@link String} array. */
    public static final String[] STRING_ARRAY = randomArrayOf(String.class);
}

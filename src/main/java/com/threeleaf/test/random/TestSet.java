package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.Set;

import static com.threeleaf.test.random.util.TestSetUtil.randomSetOf;

/** Set constants for use in testing. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestSet
{

    /** An {@link Integer} set. */
    public static final Set<Integer> INTEGER_SET = randomSetOf(Integer.class);

    /** An {@link Long} set. */
    public static final Set<Long> LONG_SET = randomSetOf(Long.class);

    /** An {@link Object} set. */
    public static final Set<Object> OBJECT_SET = randomSetOf(Object.class);

    /** An {@link String} set. */
    public static final Set<String> STRING_SET = randomSetOf(String.class);
}

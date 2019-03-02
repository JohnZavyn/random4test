package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.Set;

import static com.threeleaf.test.random.util.TestSetUtil.randomSetOf;
import static java.util.Collections.unmodifiableSet;

/** Set constants for use in testing. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestSet
{

    /** An {@link Integer} set. */
    public static final Set<Integer> INTEGER_SET = unmodifiableSet(randomSetOf(Integer.class));

    /** An {@link Long} set. */
    public static final Set<Long> LONG_SET = unmodifiableSet(randomSetOf(Long.class));

    /** An {@link Object} set. */
    public static final Set<Object> OBJECT_SET = unmodifiableSet(randomSetOf(Object.class));

    /** An {@link String} set. */
    public static final Set<String> STRING_SET = unmodifiableSet(randomSetOf(String.class));
}

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
    public static final Set<Integer> SET_INTEGER = unmodifiableSet(randomSetOf(Integer.class));

    /** An {@link Long} set. */
    public static final Set<Long> SET_LONG = unmodifiableSet(randomSetOf(Long.class));

    /** An {@link Object} set. */
    public static final Set<Object> SET_OBJECT = unmodifiableSet(randomSetOf(Object.class));

    /** An {@link String} set. */
    public static final Set<String> SET_STRING = unmodifiableSet(randomSetOf(String.class));
}

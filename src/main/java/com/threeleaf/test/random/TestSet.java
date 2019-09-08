package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.Set;

import static com.threeleaf.test.random.util.TestSetUtil.randomSetOf;
import static com.threeleaf.test.random.util.TestSetUtil.randomSetSingleOf;
import static java.util.Collections.unmodifiableSet;

/** Set constants for use in testing. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestSet
{

    /** An {@link Integer} set. */
    public static final Set<Integer> SET_INTEGER = unmodifiableSet(randomSetOf(Integer.class));

    /** An {@link Integer} set with a single value. */
    public static final Set<Integer> SET_INTEGER_SINGLE = unmodifiableSet(randomSetSingleOf(Integer.class));

    /** An {@link Long} set. */
    public static final Set<Long> SET_LONG = unmodifiableSet(randomSetOf(Long.class));

    /** An {@link Long} set with a single value. */
    public static final Set<Long> SET_LONG_SINGLE = unmodifiableSet(randomSetSingleOf(Long.class));

    /** An {@link Object} set. */
    public static final Set<Object> SET_OBJECT = unmodifiableSet(randomSetOf(Object.class));

    /** An {@link Object} set with a single value. */
    public static final Set<Object> SET_OBJECT_SINGLE = unmodifiableSet(randomSetSingleOf(Object.class));

    /** An {@link String} set. */
    public static final Set<String> SET_STRING = unmodifiableSet(randomSetOf(String.class));

    /** An {@link String} set with a single value. */
    public static final Set<String> SET_STRING_SINGLE = unmodifiableSet(randomSetSingleOf(String.class));
}

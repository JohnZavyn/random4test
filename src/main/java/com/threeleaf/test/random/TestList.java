package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.List;

import static com.threeleaf.test.random.TestRandom.random;
import static com.threeleaf.test.random.util.TestListUtil.randomListOf;
import static java.util.Collections.singletonList;
import static java.util.Collections.unmodifiableList;

/** List constants for use in testing. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestList
{

    /** An {@link Integer} list. */
    public static final List<Integer> LIST_INTEGER = unmodifiableList(randomListOf(Integer.class));

    /** An single {@link Integer} list. */
    public static final List<Integer> LIST_INTEGER_SINGLE = singletonList(random(Integer.class));

    /** An {@link Long} list. */
    public static final List<Long> LIST_LONG = unmodifiableList(randomListOf(Long.class));

    /** An single {@link Integer} list. */
    public static final List<Long> LIST_LONG_SINGLE = singletonList(random(Long.class));

    /** An {@link Object} list. */
    public static final List<Object> LIST_OBJECT = unmodifiableList(randomListOf(Object.class));

    /** An single {@link Integer} list. */
    public static final List<Object> LIST_OBJECT_SINGLE = singletonList(random(Object.class));

    /** An {@link String} list. */
    public static final List<String> LIST_STRING = unmodifiableList(randomListOf(String.class));

    /** An single {@link Integer} list. */
    public static final List<String> LIST_STRING_SINGLE = singletonList(random(String.class));
}

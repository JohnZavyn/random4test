package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.List;

import static com.threeleaf.test.random.util.TestListUtil.randomListOf;
import static java.util.Collections.unmodifiableList;

/** List constants for use in testing. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestList
{

    /** An {@link Integer} list. */
    public static final List<Integer> INTEGER_LIST = unmodifiableList(randomListOf(Integer.class));

    /** An {@link Long} list. */
    public static final List<Long> LONG_LIST = unmodifiableList(randomListOf(Long.class));

    /** An {@link Object} list. */
    public static final List<Object> OBJECT_LIST = unmodifiableList(randomListOf(Object.class));

    /** An {@link String} list. */
    public static final List<String> STRING_LIST = unmodifiableList(randomListOf(String.class));
}

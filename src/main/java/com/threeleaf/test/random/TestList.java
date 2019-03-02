package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.List;

import static com.threeleaf.test.random.util.TestListUtil.randomListOf;

/** List constants for use in testing. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestList
{

    /** An {@link Integer} list. */
    public static final List<Integer> INTEGER_LIST = randomListOf(Integer.class);

    /** An {@link Long} list. */
    public static final List<Long> LONG_LIST = randomListOf(Long.class);

    /** An {@link Object} list. */
    public static final List<Object> OBJECT_LIST = randomListOf(Object.class);

    /** An {@link String} list. */
    public static final List<String> STRING_LIST = randomListOf(String.class);
}

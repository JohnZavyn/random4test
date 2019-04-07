package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.util.Collection;

import static com.threeleaf.test.random.TestRandom.random;
import static com.threeleaf.test.random.util.TestCollectionUtil.randomCollectionOf;
import static java.util.Collections.singleton;
import static java.util.Collections.unmodifiableCollection;

/** Collection constants for use in testing. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestCollection
{

    /** An {@link Integer} collection. */
    public static final Collection<Integer> COLLECTION_INTEGER = unmodifiableCollection(randomCollectionOf(Integer.class));

    /** An single {@link Integer} collection. */
    public static final Collection<Integer> COLLECTION_INTEGER_SINGLE = singleton(random(Integer.class));

    /** An {@link Long} collection. */
    public static final Collection<Long> COLLECTION_LONG = unmodifiableCollection(randomCollectionOf(Long.class));

    /** An single {@link Integer} collection. */
    public static final Collection<Long> COLLECTION_LONG_SINGLE = singleton(random(Long.class));

    /** An {@link Object} collection. */
    public static final Collection<Object> COLLECTION_OBJECT = unmodifiableCollection(randomCollectionOf(Object.class));

    /** An single {@link Integer} collection. */
    public static final Collection<Object> COLLECTION_OBJECT_SINGLE = singleton(random(Object.class));

    /** An {@link String} collection. */
    public static final Collection<String> COLLECTION_STRING = unmodifiableCollection(randomCollectionOf(String.class));

    /** An single {@link Integer} collection. */
    public static final Collection<String> COLLECTION_STRING_SINGLE = singleton(random(String.class));
}

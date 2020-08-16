package com.threeleaf.test.random;

import static java.util.Collections.*;

import java.util.*;

@SuppressWarnings({"WeakerAccess", "unused", "squid:S2386" /* Mutable arrays */})
public class TestObject extends AbstractTest<Object> {

    /** The instance of {@link TestObject}. */
    public static final TestObject INSTANCE = new TestObject();

    /** A random {@link Object}. */
    public static final Object OBJECT = TestRandom.random(Object.class);

    /** An {@link Object} array. */
    public static final Object[] OBJECT_ARRAY = INSTANCE.randomArray();

    /** An {@link Object} array with a single value. */
    public static final Object[] OBJECT_ARRAY_SINGLE = INSTANCE.randomArraySingle();

    /** An {@link Object} collection. */
    public static final Collection<Object> OBJECT_COLLECTION =
        unmodifiableCollection(INSTANCE.randomCollection());

    /** An single {@link Integer} collection. */
    public static final Collection<Object> OBJECT_COLLECTION_SINGLE =
        singleton(INSTANCE.randomCollectionSingle());

    /** An {@link Object} list. */
    public static final List<Object> OBJECT_LIST = unmodifiableList(INSTANCE.randomList());

    /** An single {@link Integer} list. */
    public static final List<Object> OBJECT_LIST_SINGLE = singletonList(randomObject());

    /** An {@link Object} map. */
    public static final Map<Object, Object> OBJECT_MAP =
        unmodifiableMap(INSTANCE.randomMap(Object.class));

    /** An {@link Integer} key and {@link Object} value map. */
    public static final Map<Integer, Object> OBJECT_MAP_INTEGER =
        unmodifiableMap(INSTANCE.randomMap(Integer.class));

    /** An {@link Integer} key and {@link Object} value map with a single key-value pair. */
    public static final Map<Integer, Object> OBJECT_MAP_INTEGER_SINGLE =
        unmodifiableMap(INSTANCE.randomMapSingle(Integer.class));

    /** An {@link Long} key and {@link Object} value map. */
    public static final Map<Long, Object> OBJECT_MAP_LONG =
        unmodifiableMap(INSTANCE.randomMap(Long.class));

    /** An {@link Long} key and {@link Object} value map with a single key-value pair. */
    public static final Map<Long, Object> OBJECT_MAP_LONG_SINGLE =
        unmodifiableMap(INSTANCE.randomMapSingle(Long.class));

    /** An {@link Object} map with a single key-value pair. */
    public static final Map<Object, Object> OBJECT_MAP_SINGLE =
        unmodifiableMap(INSTANCE.randomMapSingle(Object.class));

    /** An {@link String} key and {@link Object} value map. */
    public static final Map<String, Object> OBJECT_MAP_STRING =
        unmodifiableMap(INSTANCE.randomMap(String.class));

    /** An {@link String} key and {@link Object} value map with a single key-value pair. */
    public static final Map<String, Object> OBJECT_MAP_STRING_SINGLE =
        unmodifiableMap(INSTANCE.randomMapSingle(String.class));

    /** An {@link Object} set. */
    public static final Set<Object> OBJECT_SET = unmodifiableSet(INSTANCE.randomSet());

    /** An {@link Object} set with a single value. */
    public static final Set<Object> OBJECT_SET_SINGLE = unmodifiableSet(INSTANCE.randomSetSingle());

    /** Instantiate a utility to produce randomized {@link Object} objects. */
    public TestObject() {
        super(Object.class);
    }

    /**
     * Get a random {@link Object}.
     *
     * @return an object
     */
    public static Object randomObject() {
        return INSTANCE.random();
    }
}

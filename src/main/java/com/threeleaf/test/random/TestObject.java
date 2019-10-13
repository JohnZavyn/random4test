package com.threeleaf.test.random;

import java.util.*;

import static com.threeleaf.test.random.util.TestArrayUtil.randomArrayOf;
import static com.threeleaf.test.random.util.TestArrayUtil.randomArraySingleOf;
import static com.threeleaf.test.random.util.TestCollectionUtil.randomCollectionOf;
import static com.threeleaf.test.random.util.TestListUtil.randomListOf;
import static com.threeleaf.test.random.util.TestMapUtil.randomMapOf;
import static com.threeleaf.test.random.util.TestMapUtil.randomMapSingleOf;
import static com.threeleaf.test.random.util.TestSetUtil.randomSetOf;
import static com.threeleaf.test.random.util.TestSetUtil.randomSetSingleOf;
import static java.util.Collections.*;

@SuppressWarnings({"WeakerAccess", "unused"})
public class TestObject extends AbstractTestUtil<Object>
{

    /** An {@link Object} array. */
    public static final Object[] ARRAY_OBJECT = randomArrayOf(Object.class);

    /** An {@link Object} array with a single value. */
    public static final Object[] ARRAY_OBJECT_SINGLE = randomArraySingleOf(Object.class);

    /** An {@link Object} collection. */
    public static final Collection<Object> COLLECTION_OBJECT = unmodifiableCollection(randomCollectionOf(Object.class));

    /** An single {@link Integer} collection. */
    public static final Collection<Object> COLLECTION_OBJECT_SINGLE = singleton(TestRandom.random(Object.class));

    /** The instance of {@link TestObject}. */
    public static final TestObject INSTANCE = new TestObject();

    /** An {@link Object} list. */
    public static final List<Object> LIST_OBJECT = unmodifiableList(randomListOf(Object.class));

    /** An single {@link Integer} list. */
    public static final List<Object> LIST_OBJECT_SINGLE = singletonList(TestRandom.random(Object.class));

    /** An {@link Object} map. */
    public static final Map<Object, Object> MAP_OBJECT = unmodifiableMap(randomMapOf(Object.class, Object.class));

    /** An {@link Object} map with a single key-value pair. */
    public static final Map<Object, Object> MAP_OBJECT_SINGLE = unmodifiableMap(randomMapSingleOf(Object.class, Object.class));

    /** A random {@link Object}. */
    public static final Object OBJECT = TestRandom.random(Object.class);

    /** An {@link Object} set. */
    public static final Set<Object> SET_OBJECT = unmodifiableSet(randomSetOf(Object.class));

    /** An {@link Object} set with a single value. */
    public static final Set<Object> SET_OBJECT_SINGLE = unmodifiableSet(randomSetSingleOf(Object.class));

    /** Instantiate a utility to produce randomized {@link Object} objects. */
    public TestObject()
    {
        super(Object.class);
    }
}

/*
 * Copyright 2020-2022, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import com.threeleaf.test.random.model.Address;
import org.junit.jupiter.api.Test;

/** Test {@link AbstractRandom}. */
class AbstractTestRandomTest {

    private final Class<Address> theType = Address.class;

    private final AbstractRandom<Address> abstractRandom = new AbstractRandom<Address>(theType) {
    };

    /** Test {@link AbstractRandom#emptyCollection()}. */
    @Test
    void emptyCollection() {
        assertEquals(INT_00, abstractRandom.emptyCollection().size());
    }

    /** Test {@link AbstractRandom#emptyList()}. */
    @Test
    void emptyList() {
        assertEquals(INT_00, abstractRandom.emptyList().size());
    }

    /** Test {@link AbstractRandom#emptySet()}. */
    @Test
    void emptySet() {
        assertEquals(INT_00, abstractRandom.emptySet().size());
    }

    /** Test {@link AbstractRandom#random()}. */
    @Test
    void random() {
        assertNotNull(abstractRandom.random());
    }

    /** Test {@link AbstractRandom#randomArray(String...)}. */
    @Test
    void randomArray() {
        final Address[] result = abstractRandom.randomArray();

        assertTrue(result.length > INT_00);
        assertTrue(result.length < INT_11);
    }

    /** Test {@link AbstractRandom#randomArrayList(String...)}. */
    @Test
    void randomArrayList() {
        final ArrayList<Address> result = abstractRandom.randomArrayList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomArrayListSingle(String...)}. */
    @Test
    void randomArrayListSingle() {
        final ArrayList<Address> result = abstractRandom.randomArrayListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomArrayList(int, String...)}. */
    @Test
    void randomArrayListSized() {
        final int size = TestInteger.random1to100();

        final ArrayList<Address> result = abstractRandom.randomArrayList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomArraySingle(String...)}. */
    @Test
    void randomArraySingle() {
        final Address[] result = abstractRandom.randomArraySingle();

        assertEquals(INT_01, result.length);
    }

    /** Test {@link AbstractRandom#randomArray(int, String...)}. */
    @Test
    void randomArraySized() {
        final int size = TestInteger.random1to100();

        final Address[] result = abstractRandom.randomArray(size);

        assertEquals(size, result.length);
    }

    /** Test {@link AbstractRandom#randomCollection(String...)}. */
    @Test
    void randomCollection() {
        final Collection<Address> result = abstractRandom.randomCollection();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomCollectionSingle(String...)}. */
    @Test
    void randomCollectionSingle() {
        final Collection<Address> result = abstractRandom.randomCollectionSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomCollection(int, String...)}. */
    @Test
    void randomCollectionSized() {
        final int size = TestInteger.random1to100();

        final Collection<Address> result = abstractRandom.randomCollection(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#random(String...)}. */
    @Test
    void randomFieldsExcluded() {
        final Address result = abstractRandom.random("city", "state");

        assertNull((result.getCity()));
        assertNull((result.getState()));
        assertNotNull(result.getNameResident());
        assertNotNull(result.getStreetAddress());
        assertNotNull(result.getZipCode());
    }

    /** Test {@link AbstractRandom#randomHashMap(Class, String...)}. */
    @Test
    void randomHashMap() {
        final Map<Object, Address> result = abstractRandom.randomHashMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomHashMapSingle(Class, String...)}. */
    @Test
    void randomHashMapSingle() {
        final Map<Integer, Address> result =
            abstractRandom.randomHashMapSingle(Integer.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomHashMap(int, Class, String...)}. */
    @Test
    void randomHashMapSized() {
        final int size = TestInteger.random1to100();

        final Map<Object, Address> result = abstractRandom.randomHashMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomHashSet(String...)}. */
    @Test
    void randomHashSet() {
        final HashSet<Address> result = abstractRandom.randomHashSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomHashSetSingle(String...)}. */
    @Test
    void randomHashSetSingle() {
        final HashSet<Address> result = abstractRandom.randomHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomHashSet(int, String...)}. */
    @Test
    void randomHashSetSized() {
        final int size = TestInteger.random1to100();

        final HashSet<Address> result = abstractRandom.randomHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedHashMap(Class, String...)}. */
    @Test
    void randomLinkedHashMap() {
        final Map<Object, Address> result = abstractRandom.randomLinkedHashMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomLinkedHashMapSingle(Class, String...)}. */
    @Test
    void randomLinkedHashMapSingle() {
        final Map<Object, Address> result =
            abstractRandom.randomLinkedHashMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedHashMap(int, Class, String...)}. */
    @Test
    void randomLinkedHashMapSized() {
        final int size = TestInteger.random1to100();

        final Map<Object, Address> result =
            abstractRandom.randomLinkedHashMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedHashSet(String...)}. */
    @Test
    void randomLinkedHashSet() {
        final LinkedHashSet<Address> result = abstractRandom.randomLinkedHashSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomLinkedHashSetSingle(String...)}. */
    @Test
    void randomLinkedHashSetSingle() {
        final LinkedHashSet<Address> result = abstractRandom.randomLinkedHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedHashSet(int, String...)}. */
    @Test
    void randomLinkedHashSetSized() {
        final int size = TestInteger.random1to100();

        final LinkedHashSet<Address> result = abstractRandom.randomLinkedHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedList(String...)}. */
    @Test
    void randomLinkedList() {
        final LinkedList<Address> result = abstractRandom.randomLinkedList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomLinkedListSingle(String...)}. */
    @Test
    void randomLinkedListSingle() {
        final LinkedList<Address> result = abstractRandom.randomLinkedListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedList(int, String...)}. */
    @Test
    void randomLinkedListSized() {
        final int size = TestInteger.random1to100();

        final LinkedList<Address> result = abstractRandom.randomLinkedList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomList(String...)}. */
    @Test
    void randomList() {
        final List<Address> result = abstractRandom.randomList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomListSingle(String...)}. */
    @Test
    void randomListSingle() {
        final List<Address> result = abstractRandom.randomListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomList(int, String...)}. */
    @Test
    void randomListSized() {
        final int size = TestInteger.random1to100();

        final List<Address> result = abstractRandom.randomList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomMap(Class, String...)}. */
    @Test
    void randomMap() {
        final Map<Object, Address> result = abstractRandom.randomMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomMapSingle(Class, String...)}. */
    @Test
    void randomMapSingle() {
        final Map<Object, Address> result = abstractRandom.randomMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomMap(int, Class, String...)}. */
    @Test
    void randomMapSized() {
        final int size = TestInteger.random1to100();

        final Map<Object, Address> result = abstractRandom.randomMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomSet(String...)}. */
    @Test
    void randomSet() {
        final Set<Address> result = abstractRandom.randomSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomSetSingle(String...)}. */
    @Test
    void randomSetSingle() {
        final Set<Address> result = abstractRandom.randomSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomSet(int, String...)}. */
    @Test
    void randomSetSized() {
        final int size = TestInteger.random1to100();

        final Set<Address> result = abstractRandom.randomSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomSortedSet(String...)}. */
    @Test
    void randomSortedSet() {
        final SortedSet<Address> result = abstractRandom.randomSortedSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomSortedSetSingle(String...)}. */
    @Test
    void randomSortedSetSingle() {
        final SortedSet<Address> result = abstractRandom.randomSortedSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomSortedSet(int, String...)}. */
    @Test
    void randomSortedSetSized() {
        final int size = TestInteger.random1to100();

        final SortedSet<Address> result = abstractRandom.randomSortedSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomTreeMap(Class, String...)}. */
    @Test
    void randomTreeMap() {
        final Map<Object, Address> result = abstractRandom.randomTreeMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomTreeMapSingle(Class, String...)}. */
    @Test
    void randomTreeMapSingle() {
        final Map<Object, Address> result = abstractRandom.randomTreeMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomTreeMap(int, Class, String...)}. */
    @Test
    void randomTreeMapSized() {
        final int size = TestInteger.random1to100();

        final Map<Object, Address> result = abstractRandom.randomTreeMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomTreeSet(String...)}. */
    @Test
    void randomTreeSet() {
        final TreeSet<Address> result = abstractRandom.randomTreeSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomTreeSetSingle(String...)}. */
    @Test
    void randomTreeSetSingle() {
        final TreeSet<Address> result = abstractRandom.randomTreeSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomTreeSet(int, String...)}. */
    @Test
    void randomTreeSetSized() {
        final int size = TestInteger.random1to100();

        final TreeSet<Address> result = abstractRandom.randomTreeSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomVector(String...)}. */
    @Test
    void randomVector() {
        final Vector<Address> result = abstractRandom.randomVector();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomVectorSingle(String...)}. */
    @Test
    void randomVectorSingle() {
        final Vector<Address> result = abstractRandom.randomVectorSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomVector(int, String...)}. */
    @Test
    void randomVectorSized() {
        final int size = TestInteger.random1to100();

        final Vector<Address> result = abstractRandom.randomVector(size);

        assertEquals(size, result.size());
    }
}

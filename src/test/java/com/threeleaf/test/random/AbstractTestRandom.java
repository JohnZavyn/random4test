package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import com.threeleaf.test.random.model.Address;
import org.junit.jupiter.api.Test;

/** Test {@link AbstractRandom}. */
class AbstractTestRandom {

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
        Address[] result = abstractRandom.randomArray();

        assertTrue(result.length > INT_00);
        assertTrue(result.length < INT_11);
    }

    /** Test {@link AbstractRandom#randomArrayList(String...)}. */
    @Test
    void randomArrayList() {
        ArrayList<Address> result = abstractRandom.randomArrayList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomArrayListSingle(String...)}. */
    @Test
    void randomArrayListSingle() {
        ArrayList<Address> result = abstractRandom.randomArrayListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomArrayList(int, String...)}. */
    @Test
    void randomArrayListSized() {
        int size = TestInteger.random1to100();

        ArrayList<Address> result = abstractRandom.randomArrayList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomArraySingle(String...)}. */
    @Test
    void randomArraySingle() {
        Address[] result = abstractRandom.randomArraySingle();

        assertEquals(INT_01, result.length);
    }

    /** Test {@link AbstractRandom#randomArray(int, String...)}. */
    @Test
    void randomArraySized() {
        int size = TestInteger.random1to100();

        Address[] result = abstractRandom.randomArray(size);

        assertEquals(size, result.length);
    }

    /** Test {@link AbstractRandom#randomCollection(String...)}. */
    @Test
    void randomCollection() {
        Collection<Address> result = abstractRandom.randomCollection();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomCollectionSingle(String...)}. */
    @Test
    void randomCollectionSingle() {
        Collection<Address> result = abstractRandom.randomCollectionSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomCollection(int, String...)}. */
    @Test
    void randomCollectionSized() {
        int size = TestInteger.random1to100();

        Collection<Address> result = abstractRandom.randomCollection(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#random(String...)}. */
    @Test
    void randomFieldsExcluded() {
        Address result = abstractRandom.random("city", "state");

        assertNull((result.getCity()));
        assertNull((result.getState()));
        assertNotNull(result.getNameResident());
        assertNotNull(result.getStreetAddress());
        assertNotNull(result.getZipCode());
    }

    /** Test {@link AbstractRandom#randomHashMap(Class, String...)}. */
    @Test
    void randomHashMap() {
        Map<Object, Address> result = abstractRandom.randomHashMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomHashMapSingle(Class, String...)}. */
    @Test
    void randomHashMapSingle() {
        Map<Integer, Address> result =
            abstractRandom.randomHashMapSingle(Integer.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomHashMap(int, Class, String...)}. */
    @Test
    void randomHashMapSized() {
        int size = TestInteger.random1to100();

        Map<Object, Address> result = abstractRandom.randomHashMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomHashSet(String...)}. */
    @Test
    void randomHashSet() {
        HashSet<Address> result = abstractRandom.randomHashSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomHashSetSingle(String...)}. */
    @Test
    void randomHashSetSingle() {
        HashSet<Address> result = abstractRandom.randomHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomHashSet(int, String...)}. */
    @Test
    void randomHashSetSized() {
        int size = TestInteger.random1to100();

        HashSet<Address> result = abstractRandom.randomHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedHashMap(Class, String...)}. */
    @Test
    void randomLinkedHashMap() {
        Map<Object, Address> result = abstractRandom.randomLinkedHashMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomLinkedHashMapSingle(Class, String...)}. */
    @Test
    void randomLinkedHashMapSingle() {
        Map<Object, Address> result =
            abstractRandom.randomLinkedHashMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedHashMap(int, Class, String...)}. */
    @Test
    void randomLinkedHashMapSized() {
        int size = TestInteger.random1to100();

        Map<Object, Address> result =
            abstractRandom.randomLinkedHashMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedHashSet(String...)}. */
    @Test
    void randomLinkedHashSet() {
        LinkedHashSet<Address> result = abstractRandom.randomLinkedHashSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomLinkedHashSetSingle(String...)}. */
    @Test
    void randomLinkedHashSetSingle() {
        LinkedHashSet<Address> result = abstractRandom.randomLinkedHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedHashSet(int, String...)}. */
    @Test
    void randomLinkedHashSetSized() {
        int size = TestInteger.random1to100();

        LinkedHashSet<Address> result = abstractRandom.randomLinkedHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedList(String...)}. */
    @Test
    void randomLinkedList() {
        LinkedList<Address> result = abstractRandom.randomLinkedList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomLinkedListSingle(String...)}. */
    @Test
    void randomLinkedListSingle() {
        LinkedList<Address> result = abstractRandom.randomLinkedListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedList(int, String...)}. */
    @Test
    void randomLinkedListSized() {
        int size = TestInteger.random1to100();

        LinkedList<Address> result = abstractRandom.randomLinkedList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomList(String...)}. */
    @Test
    void randomList() {
        List<Address> result = abstractRandom.randomList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomListSingle(String...)}. */
    @Test
    void randomListSingle() {
        List<Address> result = abstractRandom.randomListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomList(int, String...)}. */
    @Test
    void randomListSized() {
        int size = TestInteger.random1to100();

        List<Address> result = abstractRandom.randomList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomMap(Class, String...)}. */
    @Test
    void randomMap() {
        Map<Object, Address> result = abstractRandom.randomMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomMapSingle(Class, String...)}. */
    @Test
    void randomMapSingle() {
        Map<Object, Address> result = abstractRandom.randomMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomMap(int, Class, String...)}. */
    @Test
    void randomMapSized() {
        int size = TestInteger.random1to100();

        Map<Object, Address> result = abstractRandom.randomMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomSet(String...)}. */
    @Test
    void randomSet() {
        Set<Address> result = abstractRandom.randomSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomSetSingle(String...)}. */
    @Test
    void randomSetSingle() {
        Set<Address> result = abstractRandom.randomSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomSet(int, String...)}. */
    @Test
    void randomSetSized() {
        int size = TestInteger.random1to100();

        Set<Address> result = abstractRandom.randomSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomSortedSet(String...)}. */
    @Test
    void randomSortedSet() {
        SortedSet<Address> result = abstractRandom.randomSortedSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomSortedSetSingle(String...)}. */
    @Test
    void randomSortedSetSingle() {
        SortedSet<Address> result = abstractRandom.randomSortedSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomSortedSet(int, String...)}. */
    @Test
    void randomSortedSetSized() {
        int size = TestInteger.random1to100();

        SortedSet<Address> result = abstractRandom.randomSortedSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomTreeMap(Class, String...)}. */
    @Test
    void randomTreeMap() {
        Map<Object, Address> result = abstractRandom.randomTreeMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomTreeMapSingle(Class, String...)}. */
    @Test
    void randomTreeMapSingle() {
        Map<Object, Address> result = abstractRandom.randomTreeMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomTreeMap(int, Class, String...)}. */
    @Test
    void randomTreeMapSized() {
        int size = TestInteger.random1to100();

        Map<Object, Address> result = abstractRandom.randomTreeMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomTreeSet(String...)}. */
    @Test
    void randomTreeSet() {
        TreeSet<Address> result = abstractRandom.randomTreeSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomTreeSetSingle(String...)}. */
    @Test
    void randomTreeSetSingle() {
        TreeSet<Address> result = abstractRandom.randomTreeSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomTreeSet(int, String...)}. */
    @Test
    void randomTreeSetSized() {
        int size = TestInteger.random1to100();

        TreeSet<Address> result = abstractRandom.randomTreeSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomVector(String...)}. */
    @Test
    void randomVector() {
        Vector<Address> result = abstractRandom.randomVector();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractRandom#randomVectorSingle(String...)}. */
    @Test
    void randomVectorSingle() {
        Vector<Address> result = abstractRandom.randomVectorSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomVector(int, String...)}. */
    @Test
    void randomVectorSized() {
        int size = TestInteger.random1to100();

        Vector<Address> result = abstractRandom.randomVector(size);

        assertEquals(size, result.size());
    }
}

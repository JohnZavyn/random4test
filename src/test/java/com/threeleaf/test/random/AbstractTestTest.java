package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import com.threeleaf.test.random.model.Address;
import org.junit.jupiter.api.Test;

/** Test {@link AbstractTest}. */
class AbstractTestTest {

    private final Class<Address> theType = Address.class;

    private final AbstractTest<Address> abstractTest = new AbstractTest<Address>(theType) {
    };

    /** Test {@link AbstractTest#emptyList()}. */
    @Test
    void emptyList() {
        assertEquals(INT_00, abstractTest.emptyList().size());
    }

    /** Test {@link AbstractTest#random()}. */
    @Test
    void random() {
        assertNotNull(abstractTest.random());
    }

    /** Test {@link AbstractTest#randomArray(String...)}. */
    @Test
    void randomArray() {
        Address[] result = abstractTest.randomArray();

        assertTrue(result.length > INT_00);
        assertTrue(result.length < INT_11);
    }

    /** Test {@link AbstractTest#randomArrayList(String...)}. */
    @Test
    void randomArrayList() {
        ArrayList<Address> result = abstractTest.randomArrayList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomArrayListSingle(String...)}. */
    @Test
    void randomArrayListSingle() {
        ArrayList<Address> result = abstractTest.randomArrayListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomArrayList(int, String...)}. */
    @Test
    void randomArrayListSized() {
        int size = TestInteger.random1to100();

        ArrayList<Address> result = abstractTest.randomArrayList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomArraySingle(String...)}. */
    @Test
    void randomArraySingle() {
        Address[] result = abstractTest.randomArraySingle();

        assertEquals(INT_01, result.length);
    }

    /** Test {@link AbstractTest#randomArray(int, String...)}. */
    @Test
    void randomArraySized() {
        int size = TestInteger.random1to100();

        Address[] result = abstractTest.randomArray(size);

        assertEquals(size, result.length);
    }

    /** Test {@link AbstractTest#randomCollection(String...)}. */
    @Test
    void randomCollection() {
        Collection<Address> result = abstractTest.randomCollection();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomCollectionSingle(String...)}. */
    @Test
    void randomCollectionSingle() {
        Collection<Address> result = abstractTest.randomCollectionSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomCollection(int, String...)}. */
    @Test
    void randomCollectionSized() {
        int size = TestInteger.random1to100();

        Collection<Address> result = abstractTest.randomCollection(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#random(String...)}. */
    @Test
    void randomFieldsExcluded() {
        Address result = abstractTest.random("city", "state");

        assertNull((result.getCity()));
        assertNull((result.getState()));
        assertNotNull(result.getNameResident());
        assertNotNull(result.getStreetAddress());
        assertNotNull(result.getZipCode());
    }

    /** Test {@link AbstractTest#randomHashMap(Class, String...)}. */
    @Test
    void randomHashMap() {
        Map<Object, Address> result = abstractTest.randomHashMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomHashMapSingle(Class, String...)}. */
    @Test
    void randomHashMapSingle() {
        Map<Integer, Address> result =
            abstractTest.randomHashMapSingle(Integer.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomHashMap(int, Class, String...)}. */
    @Test
    void randomHashMapSized() {
        int size = TestInteger.random1to100();

        Map<Object, Address> result = abstractTest.randomHashMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomHashSet(String...)}. */
    @Test
    void randomHashSet() {
        HashSet<Address> result = abstractTest.randomHashSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomHashSetSingle(String...)}. */
    @Test
    void randomHashSetSingle() {
        HashSet<Address> result = abstractTest.randomHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomHashSet(int, String...)}. */
    @Test
    void randomHashSetSized() {
        int size = TestInteger.random1to100();

        HashSet<Address> result = abstractTest.randomHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashMap(Class, String...)}. */
    @Test
    void randomLinkedHashMap() {
        Map<Object, Address> result = abstractTest.randomLinkedHashMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomLinkedHashMapSingle(Class, String...)}. */
    @Test
    void randomLinkedHashMapSingle() {
        Map<Object, Address> result =
            abstractTest.randomLinkedHashMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashMap(int, Class, String...)}. */
    @Test
    void randomLinkedHashMapSized() {
        int size = TestInteger.random1to100();

        Map<Object, Address> result =
            abstractTest.randomLinkedHashMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashSet(String...)}. */
    @Test
    void randomLinkedHashSet() {
        LinkedHashSet<Address> result = abstractTest.randomLinkedHashSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomLinkedHashSetSingle(String...)}. */
    @Test
    void randomLinkedHashSetSingle() {
        LinkedHashSet<Address> result = abstractTest.randomLinkedHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashSet(int, String...)}. */
    @Test
    void randomLinkedHashSetSized() {
        int size = TestInteger.random1to100();

        LinkedHashSet<Address> result = abstractTest.randomLinkedHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedList(String...)}. */
    @Test
    void randomLinkedList() {
        LinkedList<Address> result = abstractTest.randomLinkedList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomLinkedListSingle(String...)}. */
    @Test
    void randomLinkedListSingle() {
        LinkedList<Address> result = abstractTest.randomLinkedListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedList(int, String...)}. */
    @Test
    void randomLinkedListSized() {
        int size = TestInteger.random1to100();

        LinkedList<Address> result = abstractTest.randomLinkedList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomList(String...)}. */
    @Test
    void randomList() {
        List<Address> result = abstractTest.randomList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomListSingle(String...)}. */
    @Test
    void randomListSingle() {
        List<Address> result = abstractTest.randomListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomList(int, String...)}. */
    @Test
    void randomListSized() {
        int size = TestInteger.random1to100();

        List<Address> result = abstractTest.randomList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomMap(Class, String...)}. */
    @Test
    void randomMap() {
        Map<Object, Address> result = abstractTest.randomMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomMapSingle(Class, String...)}. */
    @Test
    void randomMapSingle() {
        Map<Object, Address> result = abstractTest.randomMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomMap(int, Class, String...)}. */
    @Test
    void randomMapSized() {
        int size = TestInteger.random1to100();

        Map<Object, Address> result = abstractTest.randomMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomSet(String...)}. */
    @Test
    void randomSet() {
        Set<Address> result = abstractTest.randomSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomSetSingle(String...)}. */
    @Test
    void randomSetSingle() {
        Set<Address> result = abstractTest.randomSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomSet(int, String...)}. */
    @Test
    void randomSetSized() {
        int size = TestInteger.random1to100();

        Set<Address> result = abstractTest.randomSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomSortedSet(String...)}. */
    @Test
    void randomSortedSet() {
        SortedSet<Address> result = abstractTest.randomSortedSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomSortedSetSingle(String...)}. */
    @Test
    void randomSortedSetSingle() {
        SortedSet<Address> result = abstractTest.randomSortedSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomSortedSet(int, String...)}. */
    @Test
    void randomSortedSetSized() {
        int size = TestInteger.random1to100();

        SortedSet<Address> result = abstractTest.randomSortedSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomTreeMap(Class, String...)}. */
    @Test
    void randomTreeMap() {
        Map<Object, Address> result = abstractTest.randomTreeMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomTreeMapSingle(Class, String...)}. */
    @Test
    void randomTreeMapSingle() {
        Map<Object, Address> result = abstractTest.randomTreeMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomTreeMap(int, Class, String...)}. */
    @Test
    void randomTreeMapSized() {
        int size = TestInteger.random1to100();

        Map<Object, Address> result = abstractTest.randomTreeMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomTreeSet(String...)}. */
    @Test
    void randomTreeSet() {
        TreeSet<Address> result = abstractTest.randomTreeSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomTreeSetSingle(String...)}. */
    @Test
    void randomTreeSetSingle() {
        TreeSet<Address> result = abstractTest.randomTreeSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomTreeSet(int, String...)}. */
    @Test
    void randomTreeSetSized() {
        int size = TestInteger.random1to100();

        TreeSet<Address> result = abstractTest.randomTreeSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomVector(String...)}. */
    @Test
    void randomVector() {
        Vector<Address> result = abstractTest.randomVector();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomVectorSingle(String...)}. */
    @Test
    void randomVectorSingle() {
        Vector<Address> result = abstractTest.randomVectorSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomVector(int, String...)}. */
    @Test
    void randomVectorSized() {
        int size = TestInteger.random1to100();

        Vector<Address> result = abstractTest.randomVector(size);

        assertEquals(size, result.size());
    }
}

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import com.threeleaf.test.random.AbstractTest;
import com.threeleaf.test.random.model.Address;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link AbstractTest}. */
class AbstractTestUtilTest {

    /** The test {@link  AbstractTest AbstractTest&lt;Address&gt;}. */
    private AbstractTest<Address> abstractTest;

    /** Test {@link AbstractTest#randomArray(String[])}. */
    @Test
    void randomArray() {
        Address[] result = abstractTest.randomArray();

        assertTrue(result.length > 0);
    }

    /** Test {@link AbstractTest#randomArrayList(String[])}. */
    @Test
    void randomArrayList() {
        ArrayList<Address> result = abstractTest.randomArrayList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomArrayListSingle(String[])}. */
    @Test
    void randomArrayListSingle() {
        ArrayList<Address> result = abstractTest.randomArrayListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomArrayList(int, String[])}. */
    @Test
    void randomArrayListSize() {
        int size = randomBetween(INT_01, INT_10);

        ArrayList<Address> result = abstractTest.randomArrayList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomArraySingle(String[])}. */
    @Test
    void randomArraySingle() {
        Address[] result = abstractTest.randomArraySingle();

        assertEquals(INT_01, result.length);
    }

    /** Test {@link AbstractTest#randomArray(int, String[])}. */
    @Test
    void randomArraySize() {
        int size = randomBetween(INT_01, INT_10);

        Address[] result = abstractTest.randomArray(size);

        assertEquals(size, result.length);
    }

    /** Test {@link AbstractTest#randomCollection(String[])}. */
    @Test
    void randomCollection() {
        Collection<Address> result = abstractTest.randomCollection();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomCollection(int, String[])}. */
    @Test
    void randomCollection1() {
        int size = randomBetween(INT_01, INT_10);

        Collection<Address> result = abstractTest.randomCollection(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomCollectionSingle(String[])}. */
    @Test
    void randomCollectionSingle() {
        Collection<Address> result = abstractTest.randomCollectionSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomHashSet(String[])}. */
    @Test
    void randomHashSet() {
        HashSet<Address> result = abstractTest.randomHashSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomHashSet(int, String[])}. */
    @Test
    void randomHashSet1() {
        int size = randomBetween(INT_01, INT_10);

        HashSet<Address> result = abstractTest.randomHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomHashSetSingle(String[])}. */
    @Test
    void randomHashSetSingle() {
        HashSet<Address> result = abstractTest.randomHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashSet(String[])}. */
    @Test
    void randomLinkedHashSet() {
        LinkedHashSet<Address> result = abstractTest.randomLinkedHashSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomLinkedHashSet(int, String[])}. */
    @Test
    void randomLinkedHashSet1() {
        int size = randomBetween(INT_01, INT_10);

        LinkedHashSet<Address> result = abstractTest.randomLinkedHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashSetSingle(String[])}. */
    @Test
    void randomLinkedHashSetSingle() {
        LinkedHashSet<Address> result = abstractTest.randomLinkedHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedList(String[])}. */
    @Test
    void randomLinkedList() {
        LinkedList<Address> result = abstractTest.randomLinkedList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomLinkedList(int, String[])}. */
    @Test
    void randomLinkedList1() {
        int size = randomBetween(INT_01, INT_10);

        LinkedList<Address> result = abstractTest.randomLinkedList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedListSingle(String[])}. */
    @Test
    void randomLinkedListSingle() {
        LinkedList<Address> result = abstractTest.randomLinkedListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomList(String[])}. */
    @Test
    void randomList() {
        List<Address> result = abstractTest.randomList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomList(int, String[])}. */
    @Test
    void randomList1() {
        int size = randomBetween(INT_01, INT_10);

        List<Address> result = abstractTest.randomList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomListSingle(String[])}. */
    @Test
    void randomListSingle() {
        List<Address> result = abstractTest.randomListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#random(String[])}. */
    @Test
    void randomObject() {
        Address result = abstractTest.random();

        assertNotNull(result);
    }

    /** Test {@link AbstractTest#randomSet(String[])}. */
    @Test
    void randomSet() {
        Set<Address> result = abstractTest.randomSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomSet(int, String[])}. */
    @Test
    void randomSet1() {
        int size = randomBetween(INT_01, INT_10);

        Set<Address> result = abstractTest.randomSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomSetSingle(String[])}. */
    @Test
    void randomSetSingle() {
        Set<Address> result = abstractTest.randomSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomSortedSet(String[])}. */
    @Test
    void randomSortedSet() {
        SortedSet<Address> result = abstractTest.randomSortedSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomSortedSet(int, String[])}. */
    @Test
    void randomSortedSet1() {
        int size = randomBetween(INT_01, INT_10);

        SortedSet<Address> result = abstractTest.randomSortedSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomSortedSetSingle(String[])}. */
    @Test
    void randomSortedSetSingle() {
        SortedSet<Address> result = abstractTest.randomSortedSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomTreeSet(String[])}. */
    @Test
    void randomTreeSet() {
        TreeSet<Address> result = abstractTest.randomTreeSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomTreeSet(int, String[])}. */
    @Test
    void randomTreeSet1() {
        int size = randomBetween(INT_01, INT_10);

        TreeSet<Address> result = abstractTest.randomTreeSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomTreeSetSingle(String[])}. */
    @Test
    void randomTreeSetSingle() {
        TreeSet<Address> result = abstractTest.randomTreeSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomVector(String[])}. */
    @Test
    void randomVector() {
        Vector<Address> result = abstractTest.randomVector();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomVector(int, String[])}. */
    @Test
    void randomVector1() {
        int size = randomBetween(INT_01, INT_10);

        Vector<Address> result = abstractTest.randomVector(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomVectorSingle(String[])}. */
    @Test
    void randomVectorSingle() {
        Vector<Address> result = abstractTest.randomVectorSingle();

        assertEquals(INT_01, result.size());
    }

    /** Initialize fields before each test. */
    @BeforeEach
    void setUp() {
        abstractTest = new AbstractTest<Address>(Address.class) {
        };
    }
}

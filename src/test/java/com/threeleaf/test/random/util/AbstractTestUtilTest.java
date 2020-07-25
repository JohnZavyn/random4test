package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import com.threeleaf.test.random.AbstractTest;
import com.threeleaf.test.random.model.Address;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link AbstractTest}. */
public class AbstractTestUtilTest {

    /** The test {@link AbstractTest <Address>}. */
    private AbstractTest<Address> abstractTest;

    /** Test {@link AbstractTest#randomArray(String[])}. */
    @Test
    public void randomArray() {
        final Address[] result = abstractTest.randomArray();

        assertTrue(result.length > 0);
    }

    /** Test {@link AbstractTest#randomArrayList(String[])}. */
    @Test
    public void randomArrayList() {
        final ArrayList<Address> result = abstractTest.randomArrayList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomArrayListSingle(String[])}. */
    @Test
    public void randomArrayListSingle() {
        final ArrayList<Address> result = abstractTest.randomArrayListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomArrayList(int, String[])}. */
    @Test
    public void randomArrayListSize() {
        final int size = randomBetween(INT_01, INT_10);

        final ArrayList<Address> result = abstractTest.randomArrayList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomArraySingle(String[])}. */
    @Test
    public void randomArraySingle() {
        final Address[] result = abstractTest.randomArraySingle();

        assertEquals(INT_01, result.length);
    }

    /** Test {@link AbstractTest#randomArray(int, String[])}. */
    @Test
    public void randomArraySize() {
        final int size = randomBetween(INT_01, INT_10);

        final Address[] result = abstractTest.randomArray(size);

        assertEquals(size, result.length);
    }

    /** Test {@link AbstractTest#randomCollection(String[])}. */
    @Test
    public void randomCollection() {
        final Collection<Address> result = abstractTest.randomCollection();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomCollection(int, String[])}. */
    @Test
    public void randomCollection1() {
        final int size = randomBetween(INT_01, INT_10);

        final Collection<Address> result = abstractTest.randomCollection(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomCollectionSingle(String[])}. */
    @Test
    public void randomCollectionSingle() {
        final Collection<Address> result = abstractTest.randomCollectionSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomHashSet(String[])}. */
    @Test
    public void randomHashSet() {
        final HashSet<Address> result = abstractTest.randomHashSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomHashSet(int, String[])}. */
    @Test
    public void randomHashSet1() {
        final int size = randomBetween(INT_01, INT_10);

        final HashSet<Address> result = abstractTest.randomHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomHashSetSingle(String[])}. */
    @Test
    public void randomHashSetSingle() {
        final HashSet<Address> result = abstractTest.randomHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashSet(String[])}. */
    @Test
    public void randomLinkedHashSet() {
        final LinkedHashSet<Address> result = abstractTest.randomLinkedHashSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomLinkedHashSet(int, String[])}. */
    @Test
    public void randomLinkedHashSet1() {
        final int size = randomBetween(INT_01, INT_10);

        final LinkedHashSet<Address> result = abstractTest.randomLinkedHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashSetSingle(String[])}. */
    @Test
    public void randomLinkedHashSetSingle() {
        final LinkedHashSet<Address> result = abstractTest.randomLinkedHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedList(String[])}. */
    @Test
    public void randomLinkedList() {
        final LinkedList<Address> result = abstractTest.randomLinkedList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomLinkedList(int, String[])}. */
    @Test
    public void randomLinkedList1() {
        final int size = randomBetween(INT_01, INT_10);

        final LinkedList<Address> result = abstractTest.randomLinkedList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedListSingle(String[])}. */
    @Test
    public void randomLinkedListSingle() {
        final LinkedList<Address> result = abstractTest.randomLinkedListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomList(String[])}. */
    @Test
    public void randomList() {
        final List<Address> result = abstractTest.randomList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomList(int, String[])}. */
    @Test
    public void randomList1() {
        final int size = randomBetween(INT_01, INT_10);

        final List<Address> result = abstractTest.randomList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomListSingle(String[])}. */
    @Test
    public void randomListSingle() {
        final List<Address> result = abstractTest.randomListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#random(String[])}. */
    @Test
    public void randomObject() {
        final Address result = abstractTest.random();

        assertNotNull(result);
    }

    /** Test {@link AbstractTest#randomSet(String[])}. */
    @Test
    public void randomSet() {
        final Set<Address> result = abstractTest.randomSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomSet(int, String[])}. */
    @Test
    public void randomSet1() {
        final int size = randomBetween(INT_01, INT_10);

        final Set<Address> result = abstractTest.randomSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomSetSingle(String[])}. */
    @Test
    public void randomSetSingle() {
        final Set<Address> result = abstractTest.randomSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomSortedSet(String[])}. */
    @Test
    public void randomSortedSet() {
        final SortedSet<Address> result = abstractTest.randomSortedSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomSortedSet(int, String[])}. */
    @Test
    public void randomSortedSet1() {
        final int size = randomBetween(INT_01, INT_10);

        final SortedSet<Address> result = abstractTest.randomSortedSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomSortedSetSingle(String[])}. */
    @Test
    public void randomSortedSetSingle() {
        final SortedSet<Address> result = abstractTest.randomSortedSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomTreeSet(String[])}. */
    @Test
    public void randomTreeSet() {
        final TreeSet<Address> result = abstractTest.randomTreeSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomTreeSet(int, String[])}. */
    @Test
    public void randomTreeSet1() {
        final int size = randomBetween(INT_01, INT_10);

        final TreeSet<Address> result = abstractTest.randomTreeSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomTreeSetSingle(String[])}. */
    @Test
    public void randomTreeSetSingle() {
        final TreeSet<Address> result = abstractTest.randomTreeSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomVector(String[])}. */
    @Test
    public void randomVector() {
        final Vector<Address> result = abstractTest.randomVector();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTest#randomVector(int, String[])}. */
    @Test
    public void randomVector1() {
        final int size = randomBetween(INT_01, INT_10);

        final Vector<Address> result = abstractTest.randomVector(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomVectorSingle(String[])}. */
    @Test
    public void randomVectorSingle() {
        final Vector<Address> result = abstractTest.randomVectorSingle();

        assertEquals(INT_01, result.size());
    }

    /** Initialize fields before each test. */
    @BeforeEach
    public void setUp() {
        abstractTest = new AbstractTest<Address>(Address.class) {
        };
    }
}

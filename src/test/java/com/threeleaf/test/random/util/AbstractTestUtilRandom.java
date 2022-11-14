/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import com.threeleaf.test.random.AbstractRandom;
import com.threeleaf.test.random.model.Address;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link AbstractRandom}. */
class AbstractTestUtilRandom {

    /** The test {@link  AbstractRandom AbstractTest&lt;Address&gt;}. */
    private AbstractRandom<Address> abstractRandom;

    /** Test {@link AbstractRandom#randomArray(String[])}. */
    @Test
    void randomArray() {
        final Address[] result = abstractRandom.randomArray();

        assertTrue(result.length > 0);
    }

    /** Test {@link AbstractRandom#randomArrayList(String[])}. */
    @Test
    void randomArrayList() {
        final ArrayList<Address> result = abstractRandom.randomArrayList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractRandom#randomArrayListSingle(String[])}. */
    @Test
    void randomArrayListSingle() {
        final ArrayList<Address> result = abstractRandom.randomArrayListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomArrayList(int, String[])}. */
    @Test
    void randomArrayListSize() {
        final int size = randomBetween(INT_01, INT_10);

        final ArrayList<Address> result = abstractRandom.randomArrayList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomArraySingle(String[])}. */
    @Test
    void randomArraySingle() {
        final Address[] result = abstractRandom.randomArraySingle();

        assertEquals(INT_01, result.length);
    }

    /** Test {@link AbstractRandom#randomArray(int, String[])}. */
    @Test
    void randomArraySize() {
        final int size = randomBetween(INT_01, INT_10);

        final Address[] result = abstractRandom.randomArray(size);

        assertEquals(size, result.length);
    }

    /** Test {@link AbstractRandom#randomCollection(String[])}. */
    @Test
    void randomCollection() {
        final Collection<Address> result = abstractRandom.randomCollection();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractRandom#randomCollection(int, String[])}. */
    @Test
    void randomCollection1() {
        final int size = randomBetween(INT_01, INT_10);

        final Collection<Address> result = abstractRandom.randomCollection(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomCollectionSingle(String[])}. */
    @Test
    void randomCollectionSingle() {
        final Collection<Address> result = abstractRandom.randomCollectionSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomHashSet(String[])}. */
    @Test
    void randomHashSet() {
        final HashSet<Address> result = abstractRandom.randomHashSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractRandom#randomHashSet(int, String[])}. */
    @Test
    void randomHashSet1() {
        final int size = randomBetween(INT_01, INT_10);

        final HashSet<Address> result = abstractRandom.randomHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomHashSetSingle(String[])}. */
    @Test
    void randomHashSetSingle() {
        final HashSet<Address> result = abstractRandom.randomHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedHashSet(String[])}. */
    @Test
    void randomLinkedHashSet() {
        final LinkedHashSet<Address> result = abstractRandom.randomLinkedHashSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractRandom#randomLinkedHashSet(int, String[])}. */
    @Test
    void randomLinkedHashSet1() {
        final int size = randomBetween(INT_01, INT_10);

        final LinkedHashSet<Address> result = abstractRandom.randomLinkedHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedHashSetSingle(String[])}. */
    @Test
    void randomLinkedHashSetSingle() {
        final LinkedHashSet<Address> result = abstractRandom.randomLinkedHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedList(String[])}. */
    @Test
    void randomLinkedList() {
        final LinkedList<Address> result = abstractRandom.randomLinkedList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractRandom#randomLinkedList(int, String[])}. */
    @Test
    void randomLinkedList1() {
        final int size = randomBetween(INT_01, INT_10);

        final LinkedList<Address> result = abstractRandom.randomLinkedList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomLinkedListSingle(String[])}. */
    @Test
    void randomLinkedListSingle() {
        final LinkedList<Address> result = abstractRandom.randomLinkedListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomList(String[])}. */
    @Test
    void randomList() {
        final List<Address> result = abstractRandom.randomList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractRandom#randomList(int, String[])}. */
    @Test
    void randomList1() {
        final int size = randomBetween(INT_01, INT_10);

        final List<Address> result = abstractRandom.randomList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomListSingle(String[])}. */
    @Test
    void randomListSingle() {
        final List<Address> result = abstractRandom.randomListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#random(String[])}. */
    @Test
    void randomObject() {
        final Address result = abstractRandom.random();

        assertNotNull(result);
    }

    /** Test {@link AbstractRandom#randomSet(String[])}. */
    @Test
    void randomSet() {
        final Set<Address> result = abstractRandom.randomSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractRandom#randomSet(int, String[])}. */
    @Test
    void randomSet1() {
        final int size = randomBetween(INT_01, INT_10);

        final Set<Address> result = abstractRandom.randomSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomSetSingle(String[])}. */
    @Test
    void randomSetSingle() {
        final Set<Address> result = abstractRandom.randomSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomSortedSet(String[])}. */
    @Test
    void randomSortedSet() {
        final SortedSet<Address> result = abstractRandom.randomSortedSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractRandom#randomSortedSet(int, String[])}. */
    @Test
    void randomSortedSet1() {
        final int size = randomBetween(INT_01, INT_10);

        final SortedSet<Address> result = abstractRandom.randomSortedSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomSortedSetSingle(String[])}. */
    @Test
    void randomSortedSetSingle() {
        final SortedSet<Address> result = abstractRandom.randomSortedSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomTreeSet(String[])}. */
    @Test
    void randomTreeSet() {
        final TreeSet<Address> result = abstractRandom.randomTreeSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractRandom#randomTreeSet(int, String[])}. */
    @Test
    void randomTreeSet1() {
        final int size = randomBetween(INT_01, INT_10);

        final TreeSet<Address> result = abstractRandom.randomTreeSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomTreeSetSingle(String[])}. */
    @Test
    void randomTreeSetSingle() {
        final TreeSet<Address> result = abstractRandom.randomTreeSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractRandom#randomVector(String[])}. */
    @Test
    void randomVector() {
        final Vector<Address> result = abstractRandom.randomVector();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractRandom#randomVector(int, String[])}. */
    @Test
    void randomVector1() {
        final int size = randomBetween(INT_01, INT_10);

        final Vector<Address> result = abstractRandom.randomVector(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractRandom#randomVectorSingle(String[])}. */
    @Test
    void randomVectorSingle() {
        final Vector<Address> result = abstractRandom.randomVectorSingle();

        assertEquals(INT_01, result.size());
    }

    /** Initialize fields before each test. */
    @BeforeEach
    void setUp() {
        abstractRandom = new AbstractRandom<Address>(Address.class) {
        };
    }
}

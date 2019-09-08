package com.threeleaf.test.random.util;

import com.threeleaf.test.random.model.Address;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static com.threeleaf.test.random.TestPrimitive.INT_01;
import static com.threeleaf.test.random.TestPrimitive.INT_10;
import static com.threeleaf.test.random.util.TestNumberUtil.randomBetween;
import static org.junit.Assert.*;

/** Test {@link AbstractTestUtil}. */
@SuppressWarnings("unchecked")
public class AbstractTestUtilTest
{

    /** The test {@link AbstractTestUtil<Address>}. */
    private AbstractTestUtil<Address> abstractTestUtil;

    /** Test {@link AbstractTestUtil#randomArray(String[])}. */
    @Test
    public void randomArray()
    {
        final Address[] result = abstractTestUtil.randomArray();

        assertTrue(result.length > 0);
    }

    /** Test {@link AbstractTestUtil#randomArrayList(String[])}. */
    @Test
    public void randomArrayList()
    {
        final ArrayList<Address> result = abstractTestUtil.randomArrayList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTestUtil#randomArrayListSingle(String[])}. */
    @Test
    public void randomArrayListSingle()
    {
        final ArrayList<Address> result = abstractTestUtil.randomArrayListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTestUtil#randomArrayList(int, String[])}. */
    @Test
    public void randomArrayListSize()
    {
        final int size = randomBetween(INT_01, INT_10);

        final ArrayList<Address> result = abstractTestUtil.randomArrayList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTestUtil#randomArraySingle(String[])}. */
    @Test
    public void randomArraySingle()
    {
        final Address[] result = abstractTestUtil.randomArraySingle();

        assertEquals(INT_01, result.length);
    }

    /** Test {@link AbstractTestUtil#randomArray(int, String[])}. */
    @Test
    public void randomArraySize()
    {
        final int size = randomBetween(INT_01, INT_10);

        final Address[] result = abstractTestUtil.randomArray(size);

        assertEquals(size, result.length);
    }

    /** Test {@link AbstractTestUtil#randomCollection(String[])}. */
    @Test
    public void randomCollection()
    {
        final Collection<Address> result = abstractTestUtil.randomCollection();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTestUtil#randomCollection(int, String[])}. */
    @Test
    public void randomCollection1()
    {
        final int size = randomBetween(INT_01, INT_10);

        final Collection<Address> result = abstractTestUtil.randomCollection(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTestUtil#randomCollectionSingle(String[])}. */
    @Test
    public void randomCollectionSingle()
    {
        final Collection<Address> result = abstractTestUtil.randomCollectionSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTestUtil#randomHashSet(String[])}. */
    @Test
    public void randomHashSet()
    {
        final HashSet<Address> result = abstractTestUtil.randomHashSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTestUtil#randomHashSet(int, String[])}. */
    @Test
    public void randomHashSet1()
    {
        final int size = randomBetween(INT_01, INT_10);

        final HashSet<Address> result = abstractTestUtil.randomHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTestUtil#randomHashSetSingle(String[])}. */
    @Test
    public void randomHashSetSingle()
    {
        final HashSet<Address> result = abstractTestUtil.randomHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTestUtil#randomLinkedHashSet(String[])}. */
    @Test
    public void randomLinkedHashSet()
    {
        final LinkedHashSet<Address> result = abstractTestUtil.randomLinkedHashSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTestUtil#randomLinkedHashSet(int, String[])}. */
    @Test
    public void randomLinkedHashSet1()
    {
        final int size = randomBetween(INT_01, INT_10);

        final LinkedHashSet<Address> result = abstractTestUtil.randomLinkedHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTestUtil#randomLinkedHashSetSingle(String[])}. */
    @Test
    public void randomLinkedHashSetSingle()
    {
        final LinkedHashSet<Address> result = abstractTestUtil.randomLinkedHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTestUtil#randomLinkedList(String[])}. */
    @Test
    public void randomLinkedList()
    {
        final LinkedList<Address> result = abstractTestUtil.randomLinkedList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTestUtil#randomLinkedList(int, String[])}. */
    @Test
    public void randomLinkedList1()
    {
        final int size = randomBetween(INT_01, INT_10);

        final LinkedList<Address> result = abstractTestUtil.randomLinkedList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTestUtil#randomLinkedListSingle(String[])}. */
    @Test
    public void randomLinkedListSingle()
    {
        final LinkedList<Address> result = abstractTestUtil.randomLinkedListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTestUtil#randomList(String[])}. */
    @Test
    public void randomList()
    {
        final List<Address> result = abstractTestUtil.randomList();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTestUtil#randomList(int, String[])}. */
    @Test
    public void randomList1()
    {
        final int size = randomBetween(INT_01, INT_10);

        final List<Address> result = abstractTestUtil.randomList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTestUtil#randomListSingle(String[])}. */
    @Test
    public void randomListSingle()
    {
        final List<Address> result = abstractTestUtil.randomListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTestUtil#random(String[])}. */
    @Test
    public void randomObject()
    {
        final Address result = abstractTestUtil.random();

        assertNotNull(result);
    }

    /** Test {@link AbstractTestUtil#randomSet(String[])}. */
    @Test
    public void randomSet()
    {
        final Set<Address> result = abstractTestUtil.randomSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTestUtil#randomSet(int, String[])}. */
    @Test
    public void randomSet1()
    {
        final int size = randomBetween(INT_01, INT_10);

        final Set<Address> result = abstractTestUtil.randomSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTestUtil#randomSetSingle(String[])}. */
    @Test
    public void randomSetSingle()
    {
        final Set<Address> result = abstractTestUtil.randomSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTestUtil#randomSortedSet(String[])}. */
    @Test
    public void randomSortedSet()
    {
        final SortedSet<Address> result = abstractTestUtil.randomSortedSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTestUtil#randomSortedSet(int, String[])}. */
    @Test
    public void randomSortedSet1()
    {
        final int size = randomBetween(INT_01, INT_10);

        final SortedSet<Address> result = abstractTestUtil.randomSortedSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTestUtil#randomSortedSetSingle(String[])}. */
    @Test
    public void randomSortedSetSingle()
    {
        final SortedSet<Address> result = abstractTestUtil.randomSortedSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTestUtil#randomTreeSet(String[])}. */
    @Test
    public void randomTreeSet()
    {
        final TreeSet<Address> result = abstractTestUtil.randomTreeSet();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTestUtil#randomTreeSet(int, String[])}. */
    @Test
    public void randomTreeSet1()
    {
        final int size = randomBetween(INT_01, INT_10);

        final TreeSet<Address> result = abstractTestUtil.randomTreeSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTestUtil#randomTreeSetSingle(String[])}. */
    @Test
    public void randomTreeSetSingle()
    {
        final TreeSet<Address> result = abstractTestUtil.randomTreeSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTestUtil#randomVector(String[])}. */
    @Test
    public void randomVector()
    {
        final Vector<Address> result = abstractTestUtil.randomVector();

        assertFalse(result.isEmpty());
    }

    /** Test {@link AbstractTestUtil#randomVector(int, String[])}. */
    @Test
    public void randomVector1()
    {
        final int size = randomBetween(INT_01, INT_10);

        final Vector<Address> result = abstractTestUtil.randomVector(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTestUtil#randomVectorSingle(String[])}. */
    @Test
    public void randomVectorSingle()
    {
        final Vector<Address> result = abstractTestUtil.randomVectorSingle();

        assertEquals(INT_01, result.size());
    }

    /** Initialize fields before each test. */
    @Before
    public void setUp()
    {
        abstractTestUtil = new AbstractTestUtil(Address.class)
        {
        };
    }
}

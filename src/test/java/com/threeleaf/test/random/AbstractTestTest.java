package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import com.threeleaf.test.random.model.Address;
import org.junit.jupiter.api.Test;

/** Test {@link AbstractTest}. */
public class AbstractTestTest {

    private final Class<Address> theType = Address.class;

    private final AbstractTest<Address> abstractTestUnderTest = new AbstractTest<Address>(theType) {
    };

    /** Test {@link AbstractTest#random()}. */
    @Test
    public void random() {
        assertNotNull(abstractTestUnderTest.random());
    }

    /** Test {@link AbstractTest#randomArray(String...)}. */
    @Test
    public void randomArray() {
        final Address[] result = abstractTestUnderTest.randomArray();

        assertTrue(result.length > INT_00);
        assertTrue(result.length < INT_11);
    }

    /** Test {@link AbstractTest#randomArrayList(String...)}. */
    @Test
    public void randomArrayList() {
        final ArrayList<Address> result = abstractTestUnderTest.randomArrayList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomArrayListSingle(String...)}. */
    @Test
    public void randomArrayListSingle() {
        final ArrayList<Address> result = abstractTestUnderTest.randomArrayListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomArrayList(int, String...)}. */
    @Test
    public void randomArrayListSized() {
        final int size = TestInteger.random1to100();

        final ArrayList<Address> result = abstractTestUnderTest.randomArrayList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomArraySingle(String...)}. */
    @Test
    public void randomArraySingle() {
        final Address[] result = abstractTestUnderTest.randomArraySingle();

        assertEquals(INT_01, result.length);
    }

    /** Test {@link AbstractTest#randomArray(int, String...)}. */
    @Test
    public void randomArraySized() {
        final int size = TestInteger.random1to100();

        final Address[] result = abstractTestUnderTest.randomArray(size);

        assertEquals(size, result.length);
    }

    /** Test {@link AbstractTest#randomCollection(String...)}. */
    @Test
    public void randomCollection() {
        final Collection<Address> result = abstractTestUnderTest.randomCollection();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomCollectionSingle(String...)}. */
    @Test
    public void randomCollectionSingle() {
        final Collection<Address> result = abstractTestUnderTest.randomCollectionSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomCollection(int, String...)}. */
    @Test
    public void randomCollectionSized() {
        final int size = TestInteger.random1to100();

        final Collection<Address> result = abstractTestUnderTest.randomCollection(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#random(String...)}. */
    @Test
    public void randomFieldsExcluded() {
        final Address result = abstractTestUnderTest.random("city", "state");

        assertNull((result.getCity()));
        assertNull((result.getState()));
        assertNotNull(result.getNameResident());
        assertNotNull(result.getStreetAddress());
        assertNotNull(result.getZipCode());
    }

    /** Test {@link AbstractTest#randomHashMap(Class, String...)}. */
    @Test
    public void randomHashMap() {
        final Map<Object, Address> result = abstractTestUnderTest.randomHashMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomHashMapSingle(Class, String...)}. */
    @Test
    public void randomHashMapSingle() {
        final Map<Integer, Address> result =
                abstractTestUnderTest.randomHashMapSingle(Integer.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomHashMap(int, Class, String...)}. */
    @Test
    public void randomHashMapSized() {
        final int size = TestInteger.random1to100();

        final Map<Object, Address> result = abstractTestUnderTest.randomHashMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomHashSet(String...)}. */
    @Test
    public void randomHashSet() {
        final HashSet<Address> result = abstractTestUnderTest.randomHashSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomHashSetSingle(String...)}. */
    @Test
    public void randomHashSetSingle() {
        final HashSet<Address> result = abstractTestUnderTest.randomHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomHashSet(int, String...)}. */
    @Test
    public void randomHashSetSized() {
        final int size = TestInteger.random1to100();

        final HashSet<Address> result = abstractTestUnderTest.randomHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashMap(Class, String...)}. */
    @Test
    public void randomLinkedHashMap() {
        final Map<Object, Address> result = abstractTestUnderTest.randomLinkedHashMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomLinkedHashMapSingle(Class, String...)}. */
    @Test
    public void randomLinkedHashMapSingle() {
        final Map<Object, Address> result =
                abstractTestUnderTest.randomLinkedHashMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashMap(int, Class, String...)}. */
    @Test
    public void randomLinkedHashMapSized() {
        final int size = TestInteger.random1to100();

        final Map<Object, Address> result =
                abstractTestUnderTest.randomLinkedHashMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashSet(String...)}. */
    @Test
    public void randomLinkedHashSet() {
        final LinkedHashSet<Address> result = abstractTestUnderTest.randomLinkedHashSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomLinkedHashSetSingle(String...)}. */
    @Test
    public void randomLinkedHashSetSingle() {
        final LinkedHashSet<Address> result = abstractTestUnderTest.randomLinkedHashSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedHashSet(int, String...)}. */
    @Test
    public void randomLinkedHashSetSized() {
        final int size = TestInteger.random1to100();

        final LinkedHashSet<Address> result = abstractTestUnderTest.randomLinkedHashSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedList(String...)}. */
    @Test
    public void randomLinkedList() {
        final LinkedList<Address> result = abstractTestUnderTest.randomLinkedList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomLinkedListSingle(String...)}. */
    @Test
    public void randomLinkedListSingle() {
        final LinkedList<Address> result = abstractTestUnderTest.randomLinkedListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomLinkedList(int, String...)}. */
    @Test
    public void randomLinkedListSized() {
        final int size = TestInteger.random1to100();

        final LinkedList<Address> result = abstractTestUnderTest.randomLinkedList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomList(String...)}. */
    @Test
    public void randomList() {
        final List<Address> result = abstractTestUnderTest.randomList();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomListSingle(String...)}. */
    @Test
    public void randomListSingle() {
        final List<Address> result = abstractTestUnderTest.randomListSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomList(int, String...)}. */
    @Test
    public void randomListSized() {
        final int size = TestInteger.random1to100();

        final List<Address> result = abstractTestUnderTest.randomList(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomMap(Class, String...)}. */
    @Test
    public void randomMap() {
        final Map<Object, Address> result = abstractTestUnderTest.randomMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomMapSingle(Class, String...)}. */
    @Test
    public void randomMapSingle() {
        final Map<Object, Address> result = abstractTestUnderTest.randomMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomMap(int, Class, String...)}. */
    @Test
    public void randomMapSized() {
        final int size = TestInteger.random1to100();

        final Map<Object, Address> result = abstractTestUnderTest.randomMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomSet(String...)}. */
    @Test
    public void randomSet() {
        final Set<Address> result = abstractTestUnderTest.randomSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomSetSingle(String...)}. */
    @Test
    public void randomSetSingle() {
        final Set<Address> result = abstractTestUnderTest.randomSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomSet(int, String...)}. */
    @Test
    public void randomSetSized() {
        final int size = TestInteger.random1to100();

        final Set<Address> result = abstractTestUnderTest.randomSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomSortedSet(String...)}. */
    @Test
    public void randomSortedSet() {
        final SortedSet<Address> result = abstractTestUnderTest.randomSortedSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomSortedSetSingle(String...)}. */
    @Test
    public void randomSortedSetSingle() {
        final SortedSet<Address> result = abstractTestUnderTest.randomSortedSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomSortedSet(int, String...)}. */
    @Test
    public void randomSortedSetSized() {
        final int size = TestInteger.random1to100();

        final SortedSet<Address> result = abstractTestUnderTest.randomSortedSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomTreeMap(Class, String...)}. */
    @Test
    public void randomTreeMap() {
        final Map<Object, Address> result = abstractTestUnderTest.randomTreeMap(Object.class);

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomTreeMapSingle(Class, String...)}. */
    @Test
    public void randomTreeMapSingle() {
        final Map<Object, Address> result = abstractTestUnderTest.randomTreeMapSingle(Object.class);

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomTreeMap(int, Class, String...)}. */
    @Test
    public void randomTreeMapSized() {
        final int size = TestInteger.random1to100();

        final Map<Object, Address> result = abstractTestUnderTest.randomTreeMap(size, Object.class);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomTreeSet(String...)}. */
    @Test
    public void randomTreeSet() {
        final TreeSet<Address> result = abstractTestUnderTest.randomTreeSet();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomTreeSetSingle(String...)}. */
    @Test
    public void randomTreeSetSingle() {
        final TreeSet<Address> result = abstractTestUnderTest.randomTreeSetSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomTreeSet(int, String...)}. */
    @Test
    public void randomTreeSetSized() {
        final int size = TestInteger.random1to100();

        final TreeSet<Address> result = abstractTestUnderTest.randomTreeSet(size);

        assertEquals(size, result.size());
    }

    /** Test {@link AbstractTest#randomVector(String...)}. */
    @Test
    public void randomVector() {
        final Vector<Address> result = abstractTestUnderTest.randomVector();

        assertTrue(result.size() > INT_00);
        assertTrue(result.size() < INT_11);
    }

    /** Test {@link AbstractTest#randomVectorSingle(String...)}. */
    @Test
    public void randomVectorSingle() {
        final Vector<Address> result = abstractTestUnderTest.randomVectorSingle();

        assertEquals(INT_01, result.size());
    }

    /** Test {@link AbstractTest#randomVector(int, String...)}. */
    @Test
    public void randomVectorSized() {
        final int size = TestInteger.random1to100();

        final Vector<Address> result = abstractTestUnderTest.randomVector(size);

        assertEquals(size, result.size());
    }
}

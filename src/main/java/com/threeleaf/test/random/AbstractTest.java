package com.threeleaf.test.random;

import com.threeleaf.test.random.util.*;
import lombok.Getter;

import javax.annotation.Nonnull;
import java.util.*;

import static com.threeleaf.test.random.TestInteger.random1to10;

/**
 * An abstract class to be extended to produce randomized objects of a specified type.
 * <ul>
 *     <li>Provides many helper methods that will produce single instances and collections of objects.</li>
 *     <li>The default method for randomizing objects is provided, and can be overridden to customize
 *  how the objects are randomized to suit specific needs of the tests.</li>
 *     <li>Extension also allows for the use of class-level methods and variables as needed.</li>
 * </ul>
 */
@SuppressWarnings({"WeakerAccess", "unused"})
@Getter
public abstract class AbstractTest<T>
{

    /** The type of objects to be randomized. */
    private final Class<T> type;

    /**
     * Instantiate a utility to produce randomized objects of the given type.
     *
     * @param theType the type of object to randomize
     */
    public AbstractTest(final Class<T> theType)
    {
        type = theType;
    }

    /**
     * Return a randomized object.
     * This method may be overridden to provide customized randomization suitable
     * to the application's test needs.
     *
     * @return a randomized object
     */
    public T random()
    {
        return TestRandom.random(type);
    }

    /**
     * Return a randomized object.
     * This method may be overridden to provide customized randomization suitable
     * to the application's test needs.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return a randomized object
     */
    public T random(final String... fieldsExcluded)
    {
        return TestRandom.random(type, fieldsExcluded);
    }

    /**
     * Return an array of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Array of objects
     */
    public T[] randomArray(final String... fieldsExcluded)
    {
        return TestArrayUtil.randomArrayOf(type, fieldsExcluded);
    }

    /**
     * Return an array of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Array of objects
     */
    public T[] randomArray(final int size, final String... fieldsExcluded)
    {
        return TestArrayUtil.randomArrayOf(size, type, fieldsExcluded);
    }

    /**
     * Return an {@link ArrayList} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the ArrayList of objects
     */
    public ArrayList<T> randomArrayList(final String... fieldsExcluded)
    {
        return TestListUtil.randomArrayListOf(type, fieldsExcluded);
    }

    /**
     * Return an {@link ArrayList} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the ArrayList of objects
     */
    public ArrayList<T> randomArrayList(final int size, final String... fieldsExcluded)
    {
        return TestListUtil.randomArrayListOf(size, type, fieldsExcluded);
    }

    /**
     * Return an {@link ArrayList} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the ArrayList with a single object
     */
    public ArrayList<T> randomArrayListSingle(final String... fieldsExcluded)
    {
        return TestListUtil.randomArrayListSingleOf(type, fieldsExcluded);
    }

    /**
     * Return an array with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Array with a single object
     */
    public T[] randomArraySingle(final String... fieldsExcluded)
    {
        return TestArrayUtil.randomArraySingleOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link Collection} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Collection of objects
     */
    public Collection<T> randomCollection(final String... fieldsExcluded)
    {
        return randomCollection(random1to10(), fieldsExcluded);
    }

    /**
     * Return a {@link Collection} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Collection of objects
     */
    public Collection<T> randomCollection(final int size, final String... fieldsExcluded)
    {
        return TestCollectionUtil.randomCollectionOf(size, type, fieldsExcluded);
    }

    /**
     * Return a {@link Collection} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Collection with a single object
     */
    public Collection<T> randomCollectionSingle(final String... fieldsExcluded)
    {
        return TestCollectionUtil.randomCollectionSingleOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link HashMap} of randomized key-value pairs.
     *
     * @param size           the number of key-value pairs in the map
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     *
     * @return a HashMap of randomized key-value pairs
     */
    public <K> Map<K, T> randomHashMap(final int size, final @Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomHashMapOf(size, keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link HashMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     *
     * @return a HashMap of randomized key-value pairs
     */
    public <K> Map<K, T> randomHashMap(@Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomHashMapOf(keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link HashMap} with a single randomized key-value pair.
     *
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value object
     * @param <K>            the key Class
     *
     * @return a HashMap with a randomized key-value pair
     */
    public <K> Map<K, T> randomHashMapSingle(@Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomHashMapSingleOf(keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link HashSet} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the HashSet of objects
     */
    public HashSet<T> randomHashSet(final String... fieldsExcluded)
    {
        return TestSetUtil.randomHashSetOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link HashSet} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the HashSet of objects
     */
    public HashSet<T> randomHashSet(final int size, final String... fieldsExcluded)
    {
        return TestSetUtil.randomHashSetOf(size, type, fieldsExcluded);
    }

    /**
     * Return a {@link HashSet} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the HashSet with a single object
     */
    public HashSet<T> randomHashSetSingle(final String... fieldsExcluded)
    {
        return TestSetUtil.randomHashSetSingleOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashMap} of randomized key-value pairs.
     *
     * @param size           the number of key-value pairs in the map
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     *
     * @return a LinkedHashMap of randomized key-value pairs
     */
    public <K> Map<K, T> randomLinkedHashMap(final int size, final @Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomLinkedHashMapOf(size, keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     *
     * @return a LinkedHashMap of randomized key-value pairs
     */
    public <K> Map<K, T> randomLinkedHashMap(@Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomLinkedHashMapOf(keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashMap} with a single randomized key-value pair.
     *
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value object
     * @param <K>            the key Class
     *
     * @return a LinkedHashMap with a randomized key-value pair
     */
    public <K> Map<K, T> randomLinkedHashMapSingle(@Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomLinkedHashMapSingleOf(keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedHashSet of objects
     */
    public LinkedHashSet<T> randomLinkedHashSet(final String... fieldsExcluded)
    {
        return TestSetUtil.randomLinkedHashSetOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedHashSet of objects
     */
    public LinkedHashSet<T> randomLinkedHashSet(final int size, final String... fieldsExcluded)
    {
        return TestSetUtil.randomLinkedHashSetOf(size, type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedHashSet with a single object
     */
    public LinkedHashSet<T> randomLinkedHashSetSingle(final String... fieldsExcluded)
    {
        return TestSetUtil.randomLinkedHashSetSingleOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedList} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedList of objects
     */
    public LinkedList<T> randomLinkedList(final String... fieldsExcluded)
    {
        return TestListUtil.randomLinkedListOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedList} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedList of objects
     */
    public LinkedList<T> randomLinkedList(final int size, final String... fieldsExcluded)
    {
        return TestListUtil.randomLinkedListOf(size, type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedList} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedList with a single object
     */
    public LinkedList<T> randomLinkedListSingle(final String... fieldsExcluded)
    {
        return TestListUtil.randomLinkedListSingleOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link List} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the List of objects
     */
    public List<T> randomList(final String... fieldsExcluded)
    {
        return TestListUtil.randomListOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link List} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the List of objects
     */
    public List<T> randomList(final int size, final String... fieldsExcluded)
    {
        return TestListUtil.randomListOf(size, type, fieldsExcluded);
    }

    /**
     * Return a {@link List} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the List with a single object
     */
    public List<T> randomListSingle(final String... fieldsExcluded)
    {
        return TestListUtil.randomListSingleOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link Map} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap of randomized key-value pairs
     */
    public <K> Map<K, T> randomMap(@Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomMapOf(keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link Map} of randomized key-value pairs.
     *
     * @param size           the number of key-value pairs in the map
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap of randomized key-value pairs
     */
    public <K> Map<K, T> randomMap(final int size, @Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomMapOf(size, keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link Map} with a single randomized key-value pair.
     *
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value object
     * @param <K>            the key Class
     *
     * @return a HashMap, LinkedHashMap, or TreeMap with a randomized key-value pair
     */
    public <K> Map<K, T> randomMapSingle(@Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomMapSingleOf(keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link Set} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Set of objects
     */
    public Set<T> randomSet(final String... fieldsExcluded)
    {
        return TestSetUtil.randomSetOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link Set} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Set of objects
     */
    public Set<T> randomSet(final int size, final String... fieldsExcluded)
    {
        return TestSetUtil.randomSetOf(size, type, fieldsExcluded);
    }

    /**
     * Return a {@link Set} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Set with a single object
     */
    public Set<T> randomSetSingle(final String... fieldsExcluded)
    {
        return TestSetUtil.randomSetSingleOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the SortedSet of objects
     */
    public SortedSet<T> randomSortedSet(final String... fieldsExcluded)
    {
        return TestSetUtil.randomSortedSetOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the SortedSet of objects
     */
    public SortedSet<T> randomSortedSet(final int size, final String... fieldsExcluded)
    {
        return TestSetUtil.randomSortedSetOf(size, type, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the SortedSet with a single object
     */
    public SortedSet<T> randomSortedSetSingle(final String... fieldsExcluded)
    {
        return TestSetUtil.randomSortedSetSingleOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link TreeMap} of randomized key-value pairs.
     * If the specified type is not Comparable, then a
     * toString Comparator will automatically be added.
     *
     * @param size           the number of key-value pairs in the map
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     *
     * @return a TreeMap of randomized key-value pairs
     */
    public <K> Map<K, T> randomTreeMap(final int size, final @Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomTreeMapOf(size, keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link TreeMap} of 1 to 10 randomized key-value pairs.
     *
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value objects
     * @param <K>            the key Class
     *
     * @return a TreeMap of randomized key-value pairs
     */
    public <K> Map<K, T> randomTreeMap(@Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomTreeMapOf(keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link TreeMap} with a single randomized key-value pair.
     *
     * @param keyType        type of keys in the map
     * @param fieldsExcluded the fields to exclude in the value object
     * @param <K>            the key Class
     *
     * @return a TreeMap with a randomized key-value pair
     */
    public <K> Map<K, T> randomTreeMapSingle(@Nonnull Class<K> keyType, final String... fieldsExcluded)
    {
        return TestMapUtil.randomTreeMapSingleOf(keyType, type, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the TreeSet of objects
     */
    public TreeSet<T> randomTreeSet(final String... fieldsExcluded)
    {
        return TestSetUtil.randomTreeSetOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the TreeSet of objects
     */
    public TreeSet<T> randomTreeSet(final int size, final String... fieldsExcluded)
    {
        return TestSetUtil.randomTreeSetOf(size, type, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the TreeSet with a single object
     */
    public TreeSet<T> randomTreeSetSingle(final String... fieldsExcluded)
    {
        return TestSetUtil.randomTreeSetSingleOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link Vector} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Vector of objects
     */
    public Vector<T> randomVector(final String... fieldsExcluded)
    {
        return TestListUtil.randomVectorOf(type, fieldsExcluded);
    }

    /**
     * Return a {@link Vector} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Vector of objects
     */
    public Vector<T> randomVector(final int size, final String... fieldsExcluded)
    {
        return TestListUtil.randomVectorOf(size, type, fieldsExcluded);
    }

    /**
     * Return a {@link Vector} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Vector with a single object
     */
    public Vector<T> randomVectorSingle(final String... fieldsExcluded)
    {
        return TestListUtil.randomVectorSingleOf(type, fieldsExcluded);
    }
}

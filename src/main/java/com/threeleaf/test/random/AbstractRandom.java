package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.util.TestStringUtil.STRING_NULL;

import java.util.*;
import java.util.function.Function;
import javax.annotation.Nonnull;

import com.threeleaf.test.random.util.*;
import lombok.Getter;

/**
 * An abstract class to be extended to produce randomized objects of a specified type.
 * <ul>
 *     <li>Provides many helper methods that will produce single instances and collections of objects.</li>
 *     <li>The default method for randomizing objects is provided, and can be overridden to customize
 *  how the objects are randomized to suit specific needs of the tests.</li>
 *     <li>Extension also allows for the use of class-level methods and variables as needed.</li>
 * </ul>
 */
@SuppressWarnings(
    {"WeakerAccess", "unused", "PMD.ReplaceVectorWithList", "PMD.VisibilityModifierCheck",
        "PMD.LooseCoupling", "PMD.LooseCoupling", "squid:S1149", "squid:S1319"})
@Getter
public abstract class AbstractRandom<T> {

    /** The type of objects to be randomized. */
    private final Class<T> type;

    /**
     * The instance {@link #random(String...)} method. This gets passed into other methods for
     * generating randomized objects. Useful when inheriting class needs to override the random
     * method, and subsequently have that customized method used when generating new  objects within
     * the called method.
     */
    private final Function<String[], T> randomFunction = this::random;

    /**
     * Instantiate a utility to produce randomized objects of the given type.
     *
     * @param theType the type of object to randomize
     */
    public AbstractRandom(Class<T> theType) {
        super();
        type = theType;
    }

    /**
     * Return an empty {@link Collection}.
     *
     * @return an empty collection
     */
    public Collection<T> emptyCollection() {
        return TestCollectionUtil.randomCollectionOf(INT_00, randomFunction, STRING_NULL);
    }

    /**
     * Return an empty {@link List}.
     *
     * @return an empty list
     */
    public List<T> emptyList() {
        return TestListUtil.randomListOf(INT_00, randomFunction, STRING_NULL);
    }

    /**
     * Return an empty {@link Set}.
     *
     * @return an empty set
     */
    public Set<T> emptySet() {
        return TestSetUtil.randomSetOf(INT_00, randomFunction, STRING_NULL);
    }

    /**
     * Return a randomized object.
     * This method may be overridden to provide customized randomization suitable
     * to the application's test needs.
     *
     * @return a randomized object
     */
    public T random() {
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
    public T random(String... fieldsExcluded) {
        return TestRandom.random(type, fieldsExcluded);
    }

    /**
     * Return an array of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Array of objects
     */
    public T[] randomArray(String... fieldsExcluded) {
        return TestArrayUtil.randomArrayOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return an array of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Array of objects
     */
    public T[] randomArray(int size, String... fieldsExcluded) {
        return TestArrayUtil.randomArrayOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return an {@link ArrayList} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the ArrayList of objects
     */
    public ArrayList<T> randomArrayList(String... fieldsExcluded) {
        return TestListUtil.randomArrayListOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return an {@link ArrayList} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the ArrayList of objects
     */
    public ArrayList<T> randomArrayList(int size, String... fieldsExcluded) {
        return TestListUtil.randomArrayListOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return an {@link ArrayList} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the ArrayList with a single object
     */
    public ArrayList<T> randomArrayListSingle(String... fieldsExcluded) {
        return TestListUtil.randomArrayListSingleOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return an array with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Array with a single object
     */
    public T[] randomArraySingle(String... fieldsExcluded) {
        return TestArrayUtil.randomArraySingleOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Collection} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Collection of objects
     */
    public Collection<T> randomCollection(String... fieldsExcluded) {
        return TestCollectionUtil.randomCollectionOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Collection} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Collection of objects
     */
    public Collection<T> randomCollection(int size, String... fieldsExcluded) {
        return TestCollectionUtil.randomCollectionOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Collection} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Collection with a single object
     */
    public Collection<T> randomCollectionSingle(String... fieldsExcluded) {
        return TestCollectionUtil.randomCollectionSingleOf(randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomHashMap(
        int size, @Nonnull Class<K> keyType,
        String... fieldsExcluded
    ) {
        return TestMapUtil.randomHashMapOf(size, keyType, randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomHashMap(@Nonnull Class<K> keyType, String... fieldsExcluded) {
        return TestMapUtil.randomHashMapOf(keyType, randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomHashMapSingle(
        @Nonnull Class<K> keyType,
        String... fieldsExcluded
    ) {
        return TestMapUtil.randomHashMapSingleOf(keyType, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link HashSet} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the HashSet of objects
     */
    public HashSet<T> randomHashSet(String... fieldsExcluded) {
        return TestSetUtil.randomHashSetOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link HashSet} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the HashSet of objects
     */
    public HashSet<T> randomHashSet(int size, String... fieldsExcluded) {
        return TestSetUtil.randomHashSetOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link HashSet} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the HashSet with a single object
     */
    public HashSet<T> randomHashSetSingle(String... fieldsExcluded) {
        return TestSetUtil.randomHashSetSingleOf(randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomLinkedHashMap(
        int size, @Nonnull Class<K> keyType,
        String... fieldsExcluded
    ) {
        return TestMapUtil.randomLinkedHashMapOf(size, keyType, randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomLinkedHashMap(
        @Nonnull Class<K> keyType,
        String... fieldsExcluded
    ) {
        return TestMapUtil.randomLinkedHashMapOf(keyType, randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomLinkedHashMapSingle(
        @Nonnull Class<K> keyType,
        String... fieldsExcluded
    ) {
        return TestMapUtil.randomLinkedHashMapSingleOf(keyType, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedHashSet of objects
     */
    public LinkedHashSet<T> randomLinkedHashSet(String... fieldsExcluded) {
        return TestSetUtil.randomLinkedHashSetOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedHashSet of objects
     */
    public LinkedHashSet<T> randomLinkedHashSet(int size, String... fieldsExcluded) {
        return TestSetUtil.randomLinkedHashSetOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedHashSet with a single object
     */
    public LinkedHashSet<T> randomLinkedHashSetSingle(String... fieldsExcluded) {
        return TestSetUtil.randomLinkedHashSetSingleOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedList} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedList of objects
     */
    public LinkedList<T> randomLinkedList(String... fieldsExcluded) {
        return TestListUtil.randomLinkedListOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedList} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedList of objects
     */
    public LinkedList<T> randomLinkedList(int size, String... fieldsExcluded) {
        return TestListUtil.randomLinkedListOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedList} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the LinkedList with a single object
     */
    public LinkedList<T> randomLinkedListSingle(String... fieldsExcluded) {
        return TestListUtil.randomLinkedListSingleOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link List} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the List of objects
     */
    public List<T> randomList(String... fieldsExcluded) {
        return TestListUtil.randomListOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link List} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the List of objects
     */
    public List<T> randomList(int size, String... fieldsExcluded) {
        return TestListUtil.randomListOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link List} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the List with a single object
     */
    public List<T> randomListSingle(String... fieldsExcluded) {
        return TestListUtil.randomListSingleOf(randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomMap(@Nonnull Class<K> keyType, String... fieldsExcluded) {
        return TestMapUtil.randomMapOf(keyType, randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomMap(
        int size, @Nonnull Class<K> keyType,
        String... fieldsExcluded
    ) {
        return TestMapUtil.randomMapOf(size, keyType, randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomMapSingle(
        @Nonnull Class<K> keyType,
        String... fieldsExcluded
    ) {
        return TestMapUtil.randomMapSingleOf(keyType, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Set} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Set of objects
     */
    public Set<T> randomSet(String... fieldsExcluded) {
        return TestSetUtil.randomSetOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Set} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Set of objects
     */
    public Set<T> randomSet(int size, String... fieldsExcluded) {
        return TestSetUtil.randomSetOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Set} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Set with a single object
     */
    public Set<T> randomSetSingle(String... fieldsExcluded) {
        return TestSetUtil.randomSetSingleOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the SortedSet of objects
     */
    public SortedSet<T> randomSortedSet(String... fieldsExcluded) {
        return TestSetUtil.randomSortedSetOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the SortedSet of objects
     */
    public SortedSet<T> randomSortedSet(int size, String... fieldsExcluded) {
        return TestSetUtil.randomSortedSetOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the SortedSet with a single object
     */
    public SortedSet<T> randomSortedSetSingle(String... fieldsExcluded) {
        return TestSetUtil.randomSortedSetSingleOf(randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomTreeMap(
        int size, @Nonnull Class<K> keyType,
        String... fieldsExcluded
    ) {
        return TestMapUtil.randomTreeMapOf(size, keyType, randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomTreeMap(@Nonnull Class<K> keyType, String... fieldsExcluded) {
        return TestMapUtil.randomTreeMapOf(keyType, randomFunction, fieldsExcluded);
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
    public <K> Map<K, T> randomTreeMapSingle(
        @Nonnull Class<K> keyType,
        String... fieldsExcluded
    ) {
        return TestMapUtil.randomTreeMapSingleOf(keyType, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the TreeSet of objects
     */
    public TreeSet<T> randomTreeSet(String... fieldsExcluded) {
        return TestSetUtil.randomTreeSetOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the TreeSet of objects
     */
    public TreeSet<T> randomTreeSet(int size, String... fieldsExcluded) {
        return TestSetUtil.randomTreeSetOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the TreeSet with a single object
     */
    public TreeSet<T> randomTreeSetSingle(String... fieldsExcluded) {
        return TestSetUtil.randomTreeSetSingleOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Vector} of randomized objects.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Vector of objects
     */
    public Vector<T> randomVector(String... fieldsExcluded) {
        return TestListUtil.randomVectorOf(randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Vector} of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Vector of objects
     */
    public Vector<T> randomVector(int size, String... fieldsExcluded) {
        return TestListUtil.randomVectorOf(size, randomFunction, fieldsExcluded);
    }

    /**
     * Return a {@link Vector} with one randomized object.
     *
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Vector with a single object
     */
    public Vector<T> randomVectorSingle(String... fieldsExcluded) {
        return TestListUtil.randomVectorSingleOf(randomFunction, fieldsExcluded);
    }
}

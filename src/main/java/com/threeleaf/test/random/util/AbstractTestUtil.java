package com.threeleaf.test.random.util;

import com.threeleaf.test.random.TestRandom;

import java.util.*;

import static com.threeleaf.test.random.util.TestArrayUtil.randomArrayOf;
import static com.threeleaf.test.random.util.TestArrayUtil.randomArraySingleOf;
import static com.threeleaf.test.random.util.TestCollectionUtil.randomCollectionOf;
import static com.threeleaf.test.random.util.TestCollectionUtil.randomCollectionSingleOf;
import static com.threeleaf.test.random.util.TestListUtil.*;
import static com.threeleaf.test.random.util.TestSetUtil.*;

@SuppressWarnings("WeakerAccess")
public abstract class AbstractTestUtil<T>
{

    private Class<T> type;

    public AbstractTestUtil(final Class<T> theType)
    {
        type = theType;
    }

    /**
     * Return a randomized object;
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
        return randomArrayOf(type, fieldsExcluded);
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
        return randomArrayOf(size, type, fieldsExcluded);
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
        return randomArrayListOf(type, fieldsExcluded);
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
        return randomArrayListOf(size, type, fieldsExcluded);
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
        return randomArrayListSingleOf(type, fieldsExcluded);
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
        return randomArraySingleOf(type, fieldsExcluded);
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
        return randomCollectionOf(type, fieldsExcluded);
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
        return randomCollectionOf(size, type, fieldsExcluded);
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
        return randomCollectionSingleOf(type, fieldsExcluded);
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
        return randomHashSetOf(type, fieldsExcluded);
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
        return randomHashSetOf(size, type, fieldsExcluded);
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
        return randomHashSetSingleOf(type, fieldsExcluded);
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
        return randomLinkedHashSetOf(type, fieldsExcluded);
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
        return randomLinkedHashSetOf(size, type, fieldsExcluded);
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
        return randomLinkedHashSetSingleOf(type, fieldsExcluded);
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
        return randomLinkedListOf(type, fieldsExcluded);
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
        return randomLinkedListOf(size, type, fieldsExcluded);
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
        return randomLinkedListSingleOf(type, fieldsExcluded);
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
        return randomListOf(type, fieldsExcluded);
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
        return randomListOf(size, type, fieldsExcluded);
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
        return randomListSingleOf(type, fieldsExcluded);
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
        return randomSetOf(type, fieldsExcluded);
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
        return randomSetOf(size, type, fieldsExcluded);
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
        return randomSetSingleOf(type, fieldsExcluded);
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
        return randomSortedSetOf(type, fieldsExcluded);
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
        return randomSortedSetOf(size, type, fieldsExcluded);
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
        return randomSortedSetSingleOf(type, fieldsExcluded);
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
        return randomTreeSetOf(type, fieldsExcluded);
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
        return randomTreeSetOf(size, type, fieldsExcluded);
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
        return randomTreeSetSingleOf(type, fieldsExcluded);
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
        return randomVectorOf(type, fieldsExcluded);
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
        return randomVectorOf(size, type, fieldsExcluded);
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
        return randomVectorSingleOf(type, fieldsExcluded);
    }
}

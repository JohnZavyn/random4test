package com.threeleaf.test.random;

import lombok.Getter;

import java.lang.reflect.Array;
import java.util.*;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.util.TestBooleanUtil.randomBoolean;
import static com.threeleaf.test.random.util.TestSetUtil.convertToTreeSet;

/**
 * An abstract class to be extended to produce randomized objects of a specified type.
 * <ul>
 *     <li>Provides many helper methods that will produce single instances and collections of objects.</li>
 *     <li>The default method for randomizing objects is provided, and can be overridden to customize
 *  how the objects are randomized to suit specific needs of the tests.</li>
 *     <li>Extension also allows for the use of class-level methods and variables as needed.</li>
 * </ul>
 */
@SuppressWarnings("WeakerAccess")
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
        return randomArray(random1to10(), fieldsExcluded);
    }

    /**
     * Return an array of randomized objects.
     *
     * @param size           the number of objects to be included
     * @param fieldsExcluded the fields to not randomize
     *
     * @return the Array of objects
     */
    @SuppressWarnings("unchecked")
    public T[] randomArray(final int size, final String... fieldsExcluded)
    {
        return randomArrayList(size, fieldsExcluded).toArray((T[]) Array.newInstance(type, INT_00));
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
        return randomArrayList(random1to10(), fieldsExcluded);
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
        final ArrayList<T> randomObjects = new ArrayList<>();
        for (int index = 0; index < size; index++)
        {
            randomObjects.add(random(fieldsExcluded));
        }

        return randomObjects;
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
        return randomArrayList(INT_01, fieldsExcluded);
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
        return randomArray(INT_01, fieldsExcluded);
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
        Collection<T> collection;
        if (randomBoolean())
        {
            collection = randomSet(size, fieldsExcluded);
        }
        else
        {
            collection = randomList(size, fieldsExcluded);
        }

        return collection;
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
        return randomCollection(INT_01, fieldsExcluded);
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
        return randomHashSet(random1to10(), fieldsExcluded);
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
        return new HashSet<>(randomArrayList(size, fieldsExcluded));
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
        return randomHashSet(INT_01, fieldsExcluded);
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
        return randomLinkedHashSet(random1to10(), fieldsExcluded);
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
        return new LinkedHashSet<>(randomArrayList(size, fieldsExcluded));
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
        return randomLinkedHashSet(INT_01, fieldsExcluded);
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
        return randomLinkedList(random1to10(), fieldsExcluded);
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
        return new LinkedList<>(randomArrayList(size, fieldsExcluded));
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
        return randomLinkedList(INT_01, fieldsExcluded);
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
        return randomList(random1to10(), fieldsExcluded);
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
        List<T> list;
        switch (TestInteger.randomBetween(INT_01, INT_03))
        {
            case 1:
                list = randomArrayList(size, fieldsExcluded);
                break;
            case 2:
                list = randomLinkedList(size, fieldsExcluded);
                break;
            default:
                list = randomVector(size, fieldsExcluded);
                break;
        }

        return list;
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
        return randomList(INT_01, fieldsExcluded);
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
        return randomSet(random1to10(), fieldsExcluded);
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
        Set<T> set;
        switch (TestInteger.randomBetween(INT_01, INT_03))
        {
            case 1:
                set = randomHashSet(size, fieldsExcluded);
                break;
            case 2:
                set = randomTreeSet(size, fieldsExcluded);
                break;
            default:
                set = randomLinkedHashSet(size, fieldsExcluded);
                break;
        }

        return set;
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
        return randomSet(INT_01, fieldsExcluded);
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
        return randomSortedSet(random1to10(), fieldsExcluded);
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
        return randomTreeSet(size, fieldsExcluded);
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
        return randomSortedSet(INT_01, fieldsExcluded);
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
        return randomTreeSet(random1to10(), fieldsExcluded);
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
        return convertToTreeSet(randomHashSet(size, fieldsExcluded));
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
        return randomTreeSet(INT_01, fieldsExcluded);
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
        return randomVector(random1to10(), fieldsExcluded);
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
        return new Vector<>(randomArrayList(size, fieldsExcluded));
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
        return randomVector(INT_01, fieldsExcluded);
    }
}

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestRandom.random;
import static java.util.Comparator.comparing;
import static lombok.AccessLevel.PRIVATE;

import java.util.*;
import javax.annotation.Nonnull;

import lombok.NoArgsConstructor;

/** Utilities to generate randomly populated Set objects. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings(
    {"WeakerAccess", "PMD.LooseCoupling", "squid:S1319" /* Using specific implementations */})
public final class TestSetUtil {

    /**
     * Convert any collection into a {@link TreeSet}.
     * <ul>
     *     <li>If the provided collection is not a {@link Set},
     *      then the normal rules of converting to set will apply</li>
     *     <li>If the specified type is not Comparable, then a
     *      toString Comparator will automatically be added</li>
     * </ul>
     *
     * @param collection the original collection of objects
     * @param <T>        the set type
     *
     * @return the TreeSet of object
     */
    public static <T> TreeSet<T> convertToTreeSet(Collection<T> collection) {
        TreeSet<T> treeSet;
        /* A TreeSet must be of a Comparable type or be constructed with a Comparator. */
        try {
            treeSet = new TreeSet<>(collection);
        } catch (ClassCastException e) {
            treeSet = new TreeSet<>(comparing(Object::toString));
            treeSet.addAll(collection);
        }

        return treeSet;
    }

    /**
     * Return a {@link HashSet} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet of randomized objects
     */
    public static <T> HashSet<T> randomHashSetOf(int size, @Nonnull Class<T> type,
        String... fieldsExcluded) {
        HashSet<T> randomObjects = new HashSet<>();
        for (int index = 0; index < size; index++) {
            randomObjects.add(random(type, fieldsExcluded));
        }

        return randomObjects;
    }

    /**
     * Return a {@link HashSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet of randomized objects
     */
    public static <T> HashSet<T> randomHashSetOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomHashSetOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link HashSet} with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet with a randomized object
     */
    public static <T> HashSet<T> randomHashSetSingleOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomHashSetOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedHashSet of randomized objects
     */
    public static <T> LinkedHashSet<T> randomLinkedHashSetOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomLinkedHashSetOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link LinkedHashSet} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedHashSet of randomized objects
     */
    public static <T> LinkedHashSet<T> randomLinkedHashSetOf(int size,
        @Nonnull Class<T> type, String... fieldsExcluded) {
        return new LinkedHashSet<>(randomHashSetOf(size, type, fieldsExcluded));
    }

    /**
     * Return a {@link LinkedHashSet} with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a LinkedHashSet with a randomized object
     */
    public static <T> LinkedHashSet<T> randomLinkedHashSetSingleOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomLinkedHashSetOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a {@link Set} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet, TreeSet, or LinkedHashSet of randomized objects
     */
    public static <T> Set<T> randomSetOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomSetOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link Set} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet, TreeSet, or LinkedHashSet of randomized objects
     */
    public static <T> Set<T> randomSetOf(int size, @Nonnull Class<T> type,
        String... fieldsExcluded) {
        Set<T> set;
        switch (randomBetween(INT_01, INT_03)) {
            case 1:
                set = randomHashSetOf(size, type, fieldsExcluded);
                break;
            case 2:
                set = randomTreeSetOf(size, type, fieldsExcluded);
                break;
            default:
                set = randomLinkedHashSetOf(size, type, fieldsExcluded);
                break;
        }

        return set;
    }

    /**
     * Return a {@link Set} with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a HashSet, TreeSet, or LinkedHashSet with a randomized object
     */
    public static <T> Set<T> randomSetSingleOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomSetOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a SortedSet of randomized objects
     */
    public static <T> SortedSet<T> randomSortedSetOf(int size, @Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomTreeSetOf(size, type, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a SortedSet of randomized objects
     */
    public static <T> SortedSet<T> randomSortedSetOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomSortedSetOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link SortedSet} with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a SortedSet with a randomized object
     */
    public static <T> SortedSet<T> randomSortedSetSingleOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomSortedSetOf(INT_01, type, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} of randomized objects.
     *
     * @param size           size of set
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a TreeSet of randomized objects
     */
    public static <T> TreeSet<T> randomTreeSetOf(int size, @Nonnull Class<T> type,
        String... fieldsExcluded) {
        return convertToTreeSet(randomHashSetOf(size, type, fieldsExcluded));
    }

    /**
     * Return a {@link TreeSet} of 1 to 10 randomized objects.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a TreeSet of randomized objects
     */
    public static <T> TreeSet<T> randomTreeSetOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomTreeSetOf(random1to10(), type, fieldsExcluded);
    }

    /**
     * Return a {@link TreeSet} with a single randomized object.
     *
     * @param type           type of Class
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a TreeSet with a randomized object
     */
    public static <T> TreeSet<T> randomTreeSetSingleOf(@Nonnull Class<T> type,
        String... fieldsExcluded) {
        return randomTreeSetOf(INT_01, type, fieldsExcluded);
    }
}

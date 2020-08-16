package com.threeleaf.test.random;

import static lombok.AccessLevel.PRIVATE;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import javax.annotation.Nonnull;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import lombok.NoArgsConstructor;

/** Class to contain the random generator. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings("PMD.ClassNamingConventions")
public class TestRandom {

    /** The {@link EnhancedRandom} engine. */
    public static final EnhancedRandom ENHANCED_RANDOM = new EnhancedRandomBuilder().build();

    /**
     * The Constant RANDOM. {@link Random} object for selecting random numbers.
     * The method .nextInt(n) will return an integer between 0 (inclusive) and n (exclusive).
     */
    public static final Random RANDOM = new Random();

    public static final BiFunction<Class<?>, String[], ?> RANDOM_OBJECT_FUNCTION =
        ENHANCED_RANDOM::nextObject;

    /**
     * Return an object with randomized fields.
     * This is a helper/wrapper method around
     * {@link EnhancedRandom#nextObject(Class, String...)}.
     *
     * @param type           the class of object to create
     * @param fieldsExcluded (optional) fields that should not be randomized
     * @param <T>            the generic type
     *
     * @return a randomized object
     */
    @SuppressWarnings({"squid:S1845" /* Want name to be "random" */, "unchecked"})
    public static <T> T random(@Nonnull Class<T> type, String... fieldsExcluded) {
        return (T) RANDOM_OBJECT_FUNCTION.apply(type, fieldsExcluded);
    }

    @SuppressWarnings("unchecked")
    public static <T> Function<String[], T> randomType(Class<T> type) {
        return fieldsExcluded -> (T) RANDOM_OBJECT_FUNCTION.apply(type, fieldsExcluded);
    }
}

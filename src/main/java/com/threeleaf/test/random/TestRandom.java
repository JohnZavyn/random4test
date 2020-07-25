package com.threeleaf.test.random;

import java.util.Random;
import javax.annotation.Nonnull;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import lombok.experimental.UtilityClass;

/** Class to contain the random generator. */
@UtilityClass
public class TestRandom {

    /**
     * The Constant RANDOM. {@link Random} object for selecting random numbers.
     * The method .nextInt(n) will return an integer between 0 (inclusive) and n (exclusive).
     */
    public final Random RANDOM = new Random();

    /** The {@link EnhancedRandom} engine. */
    private final EnhancedRandom ENHANCED_RANDOM = new EnhancedRandomBuilder().build();

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
    public <T> T random(@Nonnull final Class<T> type, final String... fieldsExcluded) {
        return ENHANCED_RANDOM.nextObject(type, fieldsExcluded);
    }
}

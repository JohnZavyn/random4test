/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

/**
 * Simple concrete extension of {@link AbstractRandom} to provide
 * an alternative to extending the abstract, or as a convenience when
 * only the default functionality is required.
 */
public class TestGeneric<T> extends AbstractRandom<T> {

    /**
     * Instantiate a utility to produce randomized objects of the given type.
     *
     * @param theType the type of object to randomize
     */
    public TestGeneric(final Class<T> theType) {
        super(theType);
    }
}

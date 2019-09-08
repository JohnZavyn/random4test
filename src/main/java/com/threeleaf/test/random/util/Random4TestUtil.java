package com.threeleaf.test.random.util;

/**
 * Simple concrete extension of {@link AbstractTestUtil} to provide
 * an alternative to extending the abstract, or as a convenience when
 * only the default functionality is required.
 */
@SuppressWarnings("WeakerAccess")
public class Random4TestUtil<T> extends AbstractTestUtil<T>
{

    /**
     * Instantiate a utility to produce randomized objects of the given type.
     *
     * @param theType the type of object to randomize
     */
    public Random4TestUtil(final Class<T> theType)
    {
        super(theType);
    }
}

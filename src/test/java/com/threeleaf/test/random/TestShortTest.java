package com.threeleaf.test.random;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/** Test {@link TestShort}. */
public class TestShortTest
{

    /** Test {@link TestShort#randomShort()}. */
    @SuppressWarnings("ObviousNullCheck")
    @Test
    public void randomShort()
    {
        assertNotNull(TestShort.randomShort());
    }
}

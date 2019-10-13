package com.threeleaf.test.random;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/** Test {@link TestFloat}. */
public class TestFloatTest
{

    /** Test {@link TestFloat#randomFloat()}. */
    @SuppressWarnings("ObviousNullCheck")
    @Test
    public void randomFloat()
    {
        assertNotNull(TestFloat.randomFloat());
    }
}

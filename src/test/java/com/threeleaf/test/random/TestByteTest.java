package com.threeleaf.test.random;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/** Test {@link TestByte}. */
public class TestByteTest
{

    /** Test {@link TestByte#randomByte()}. */
    @SuppressWarnings("ObviousNullCheck")
    @Test
    public void randomByte()
    {
        assertNotNull(TestByte.randomByte());
    }
}

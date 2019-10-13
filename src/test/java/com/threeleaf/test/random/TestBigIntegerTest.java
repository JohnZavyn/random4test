package com.threeleaf.test.random;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/** Test {@link TestBigInteger}. */
public class TestBigIntegerTest
{

    /** Test {@link TestBigInteger#random()}. */
    @Test
    public void random()
    {
        assertNotNull(TestBigInteger.randomBigInteger());
    }
}

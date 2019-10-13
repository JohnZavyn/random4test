package com.threeleaf.test.random;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/** Test {@link TestBigDecimal}. */
public class TestBigDecimalTest
{

    /** Test {@link TestBigDecimal#randomBigDecimal()}. */
    @Test
    public void randomBigDecimal()
    {
        assertNotNull(TestBigDecimal.randomBigDecimal());
    }

}

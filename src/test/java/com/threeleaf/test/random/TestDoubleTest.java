package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_100;
import static org.junit.Assert.assertTrue;

/** Test {@link TestDouble}. */
public class TestDoubleTest
{

    /** Test {@link TestDouble#randomPercent()}. */
    @Test
    public void randomPercent()
    {
        final double percent = TestDouble.randomPercent();

        assertTrue(percent >= INT_00);
        assertTrue(percent <= INT_100);
    }
}

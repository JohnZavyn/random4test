package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestDouble.D_00;
import static com.threeleaf.test.random.TestDouble.D_100;
import static com.threeleaf.test.random.TestInteger.INT_10000;
import static org.junit.Assert.assertTrue;

/** Test {@link TestDouble}. */
public class TestDoubleTest
{

    /** Test {@link TestDouble#randomPercent()}. */
    @Test
    public void randomPercent()
    {
        final double percent = TestDouble.randomPercent();

        assertTrue(percent >= D_00);
        assertTrue(percent <= D_100);
    }

    /** Test {@link TestDouble#randomPercent()}. */
    @Test
    public void randomPercent2()
    {
        double max = 0;
        double min = 100;

        for (int i = 1; i < INT_10000; i++)
        {
            final double percent = TestDouble.randomPercent();

            max = Math.max(max, percent);
            min = Math.min(min, percent);

            assertTrue(percent >= D_00);
            assertTrue(percent <= D_100);
        }
        System.out.println(min);
        System.out.println(max);
    }
}

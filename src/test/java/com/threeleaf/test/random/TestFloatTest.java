package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestFloat.*;
import static com.threeleaf.test.random.TestInteger.INT_10000;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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

    /** Test {@link TestFloat#randomPercent()}. */
    @Test
    public void randomPercent2()
    {
        float max = 0;
        float min = 100;

        for (int i = 1; i < INT_10000; i++)
        {
            final float percent = TestFloat.randomPercent();

            max = Math.max(max, percent);
            min = Math.min(min, percent);
        }

        /* Because of the number of decimals, odds are very small that 0.0̅ and 100.0̅
         * will be selected, so just verify largest and smallest values are close.
         */
        assertTrue(min >= F_00);
        assertTrue(max <= F_100);
        assertTrue(min < F_01);
        assertTrue(max > F_99);
    }
}

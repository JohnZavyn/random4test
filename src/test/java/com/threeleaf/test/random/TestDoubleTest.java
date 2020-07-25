package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestDouble.*;
import static com.threeleaf.test.random.TestInteger.INT_10000;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** Test {@link TestDouble}. */
public class TestDoubleTest {

    /** Test {@link TestDouble#randomPercent()}. */
    @Test
    public void randomPercent() {
        final double percent = TestDouble.randomPercent();

        assertTrue(percent >= D_00);
        assertTrue(percent <= D_100);
    }

    /** Test {@link TestDouble#randomPercent()}. */
    @Test
    public void randomPercent2() {
        double max = 0;
        double min = 100;

        for (int i = 1; i < INT_10000; i++) {
            final double percent = TestDouble.randomPercent();

            max = Math.max(max, percent);
            min = Math.min(min, percent);
        }

        /* Because of the number of decimals, odds are very small that 0.0̅ and 100.0̅
         * will be selected, so just verify largest and smallest values are close. */
        assertTrue(min >= D_00);
        assertTrue(max <= D_100);
        assertTrue(min < D_01);
        assertTrue(max > D_99);
    }
}

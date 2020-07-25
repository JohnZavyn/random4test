package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestFloat.*;
import static com.threeleaf.test.random.TestInteger.INT_10000;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** Test {@link TestFloat}. */
class TestFloatTest {

    /** Test {@link TestFloat#randomFloat()}. */
    @SuppressWarnings("ObviousNullCheck")
    @Test
    void randomFloat() {
        assertNotNull(TestFloat.randomFloat());
    }

    /** Test {@link TestFloat#randomPercent()}. */
    @Test
    void randomPercent2() {
        float max = 0;
        float min = 100;

        for (int i = 1; i < INT_10000; i++) {
            float percent = TestFloat.randomPercent();

            max = Math.max(max, percent);
            min = Math.min(min, percent);
        }

        /* Because of the number of decimals, odds are very small that 0.0̅ and 100.0̅
         * will be selected, so just verify largest and smallest values are close. */
        assertTrue(min >= F_00);
        assertTrue(max <= F_100);
        assertTrue(min < F_01);
        assertTrue(max > F_99);
    }
}

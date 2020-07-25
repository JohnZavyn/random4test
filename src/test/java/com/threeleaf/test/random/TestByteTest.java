package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestByte.*;
import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_16;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** Test {@link TestByte}. */
public class TestByteTest {

    /** Test {@link TestByte#randomByte()}. */
    @SuppressWarnings("ObviousNullCheck")
    @Test
    public void randomByte() {
        assertNotNull(TestByte.randomByte());
    }

    /** Test {@link TestByte#randomHex()}. */
    @Test
    public void randomHex() {
        final int unsigned = Integer.parseInt(TestByte.randomHex(), INT_16);
        assertTrue(unsigned <= BYTE_UNSIGNED_MAX);
        assertTrue(unsigned >= INT_00);
    }

    /** Test {@link TestByte#randomPercent()}. */
    @Test
    public void randomPercent() {
        byte max = 0;
        byte min = 100;

        for (int i = 1; i < 1000; i++) {
            final byte percent = TestByte.randomPercent();

            max = (byte) Math.max(max, percent);
            min = (byte) Math.min(min, percent);

            assertTrue(percent >= B_00);
            assertTrue(percent <= B_100);
        }
    }
}

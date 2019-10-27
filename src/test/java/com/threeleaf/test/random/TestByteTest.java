package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestByte.B_00;
import static com.threeleaf.test.random.TestByte.B_100;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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

    /** Test {@link TestByte#randomPercent()}. */
    @Test
    public void randomPercent()
    {
        byte max = 0;
        byte min = 100;

        for (int i = 1; i < 1000; i++)
        {
            final byte percent = TestByte.randomPercent();

            max = (byte) Math.max(max, percent);
            min = (byte) Math.min(min, percent);

            assertTrue(percent >= B_00);
            assertTrue(percent <= B_100);
        }
        System.out.println(min);
        System.out.println(max);
    }
}

package com.threeleaf.test.random;

import org.junit.Test;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_16;
import static com.threeleaf.test.random.TestShort.SHORT_UNSIGNED_MAX;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/** Test {@link TestShort}. */
public class TestShortTest
{

    /** Test {@link TestShort#randomHex()}. */
    @Test
    public void randomHex()
    {
        final int unsigned = Integer.parseInt(TestShort.randomHex(), INT_16);
        assertTrue(unsigned <= SHORT_UNSIGNED_MAX);
        assertTrue(unsigned >= INT_00);
    }

    /** Test {@link TestShort#randomShort()}. */
    @SuppressWarnings("ObviousNullCheck")
    @Test
    public void randomShort()
    {
        assertNotNull(TestShort.randomShort());
    }
}

package com.threeleaf.test.random.util;

import org.junit.Test;

import static com.threeleaf.test.random.util.TestArrayUtil.randomArrayOf;
import static org.junit.Assert.assertTrue;

/** Test {@link TestArrayUtil}. */
public class TestArrayUtilTest
{

    /** Test {@link TestArrayUtil#randomArrayOf(Class)}. */
    @Test
    public void testRandomArrayOf()
    {
        String[]  strings  = randomArrayOf(String.class);
        Long[]    longs    = randomArrayOf(Long.class);
        Integer[] integers = randomArrayOf(Integer.class);
        Object[]  objects  = randomArrayOf(Object.class);
        assertTrue(strings.length > 0);
        assertTrue(longs.length > 0);
        assertTrue(integers.length > 0);
        assertTrue(objects.length > 0);
    }
}

package com.threeleaf.test.random.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** Test {@link Random4TestUtil}. */
public class Random4TestUtilTest
{

    /** Test {@link Random4TestUtil#Random4TestUtil(Class)}. */
    @Test
    public void constructor()
    {
        final Random4TestUtil<String> random4TestUtil = new Random4TestUtil<>(String.class);

        assertEquals(String.class, random4TestUtil.getType());
    }
}

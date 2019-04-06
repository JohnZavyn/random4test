package com.threeleaf.test.random.util;

import org.junit.Test;

import static com.threeleaf.test.random.TestPrimitive.INT_02;
import static com.threeleaf.test.random.TestPrimitive.INT_05;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/** Test {@link TestAddressUtil}. */
public class TestAddressUtilTest
{

    /** Test {@link TestAddressUtil#randomState()}. */
    @Test
    public void randomState()
    {
        assertEquals(INT_02, TestAddressUtil.randomState().length());
    }

    /** Test {@link TestAddressUtil#randomStateName()}. */
    @Test
    public void randomStateName()
    {
        assertNotNull(TestAddressUtil.randomStateName());
    }

    /** Test {@link TestAddressUtil#randomZip()}. */
    @Test
    public void randomZip()
    {
        assertEquals(INT_05, TestAddressUtil.randomZip().length());
    }

    /** Test {@link TestAddressUtil#randomZip(String)}. */
    @Test
    public void randomZipInState()
    {
        assertEquals(INT_05, TestAddressUtil.randomZip(TestAddressUtil.randomState()).length());
    }
}

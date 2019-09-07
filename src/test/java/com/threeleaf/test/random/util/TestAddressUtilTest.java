package com.threeleaf.test.random.util;

import com.threeleaf.test.random.model.Address;
import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestPrimitive.INT_02;
import static com.threeleaf.test.random.TestPrimitive.INT_05;
import static org.junit.Assert.*;

/** Test {@link TestAddressUtil}. */
public class TestAddressUtilTest
{

    /** Test {@link TestAddressUtil} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestAddressUtil> constructor = TestAddressUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try
        {
            constructor.newInstance();
        }
        catch (Exception e)
        {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestAddressUtil#findCapital(String)}. */
    @Test
    public void findCapital()
    {
        assertNotNull(TestAddressUtil.findCapital(TestAddressUtil.randomState()));
    }

    /** Test {@link TestAddressUtil#findCapitalZip(String)}. */
    @Test
    public void findCapitalZip()
    {
        assertEquals(INT_05, TestAddressUtil.findCapitalZip(TestAddressUtil.randomState()).length());
    }

    /** Test {@link TestAddressUtil#randomAddress()}. */
    @Test
    public void randomAddress()
    {
        final Address address = TestAddressUtil.randomAddress();

        assertNotNull(address);
        assertNotNull(address.getState());
        assertNotNull(address.getCity());
        assertNotNull(address.getNameResident());
        assertNotNull(address.getStreetAddress());
        assertNotNull(address.getZipCode());
    }

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

    /** Test {@link TestAddressUtil#randomStreetName()}. */
    @Test
    public void randomStreetName()
    {
        assertNotNull(TestAddressUtil.randomStreetName());
    }

    /** Test {@link TestAddressUtil#randomStreetSuffix()}. */
    @Test
    public void randomStreetSuffix()
    {
        assertNotNull(TestAddressUtil.randomStreetSuffix());
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

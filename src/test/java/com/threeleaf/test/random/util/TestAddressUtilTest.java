package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.INT_02;
import static com.threeleaf.test.random.TestInteger.INT_05;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;

import com.threeleaf.test.random.model.Address;
import org.junit.jupiter.api.Test;

/** Test {@link TestAddressUtil}. */
class TestAddressUtilTest {

    /** Test {@link TestAddressUtil} constructor. */
    @Test
    void constructor() throws Exception {
        Constructor<TestAddressUtil> constructor = TestAddressUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestAddressUtil#findCapital(String)}. */
    @Test
    void findCapital() {
        assertNotNull(TestAddressUtil.findCapital(TestAddressUtil.randomState()));
    }

    /** Test {@link TestAddressUtil#findCapitalZip(String)}. */
    @Test
    void findCapitalZip() {
        assertEquals(INT_05,
                TestAddressUtil.findCapitalZip(TestAddressUtil.randomState()).length());
    }

    /** Test {@link TestAddressUtil#randomAddress()}. */
    @Test
    void randomAddress() {
        Address address = TestAddressUtil.randomAddress();

        assertNotNull(address);
        assertNotNull(address.getState());
        assertNotNull(address.getCity());
        assertNotNull(address.getNameResident());
        assertNotNull(address.getStreetAddress());
        assertNotNull(address.getZipCode());
    }

    /** Test {@link TestAddressUtil#randomState()}. */
    @Test
    void randomState() {
        assertEquals(INT_02, TestAddressUtil.randomState().length());
    }

    /** Test {@link TestAddressUtil#randomStateName()}. */
    @Test
    void randomStateName() {
        assertNotNull(TestAddressUtil.randomStateName());
    }

    /** Test {@link TestAddressUtil#randomStreetName()}. */
    @Test
    void randomStreetName() {
        assertNotNull(TestAddressUtil.randomStreetName());
    }

    /** Test {@link TestAddressUtil#randomStreetSuffix()}. */
    @Test
    void randomStreetSuffix() {
        assertNotNull(TestAddressUtil.randomStreetSuffix());
    }

    /** Test {@link TestAddressUtil#randomZip()}. */
    @Test
    void randomZip() {
        assertEquals(INT_05, TestAddressUtil.randomZip().length());
    }

    /** Test {@link TestAddressUtil#randomZip(String)}. */
    @Test
    void randomZipInState() {
        assertEquals(INT_05, TestAddressUtil.randomZip(TestAddressUtil.randomState()).length());
    }
}

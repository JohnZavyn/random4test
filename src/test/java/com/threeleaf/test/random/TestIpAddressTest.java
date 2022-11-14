/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestString.STRING_ARRAY;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.validator.routines.InetAddressValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link TestIpAddress}. */
class TestIpAddressTest {

    /** The test {@link TestIpAddress}. */
    private TestIpAddress testIpAddress;

    /** Test {@link TestIpAddress#random()}. */
    @Test
    void random() {
        assertTrue(InetAddressValidator.getInstance().isValid(testIpAddress.random()));
    }

    /** Test {@link TestIpAddress#random(String...)}. */
    @Test
    void randomFieldsExcluded() {
        assertTrue(InetAddressValidator.getInstance().isValid(testIpAddress.random(STRING_ARRAY)));
    }

    /** Test {@link TestIpAddress#randomIpAddress()}. */
    @Test
    void randomIpAddress() {
        assertTrue(InetAddressValidator.getInstance().isValid(TestIpAddress.IP_ADDRESS));
        assertTrue(InetAddressValidator.getInstance().isValid(TestIpAddress.randomIpAddress()));
    }

    /** Test {@link TestIpAddress#randomIpV4Address()}. */
    @Test
    void randomIpV4Address() {
        assertTrue(InetAddressValidator.getInstance()
                       .isValidInet4Address(TestIpAddress.randomIpV4Address()));
    }

    /** Test {@link TestIpAddress#randomIpV6Address()}. */
    @Test
    void randomIpV6Address() {
        assertTrue(InetAddressValidator.getInstance()
                       .isValidInet6Address(TestIpAddress.randomIpV6Address()));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        testIpAddress = new TestIpAddress();
    }
}

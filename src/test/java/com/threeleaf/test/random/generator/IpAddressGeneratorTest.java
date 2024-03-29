/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestIntegerTest.LOOP_COUNT_MIN;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.validator.routines.InetAddressValidator;
import org.junit.jupiter.api.*;

/** Test {@link IpAddressGenerator}. */
class IpAddressGeneratorTest {

    /** The test {@link IpAddressGenerator}. */
    private IpAddressGenerator ipAddressGenerator;

    /** Test {@link IpAddressGenerator#randomIpAddress()}. */
    @RepeatedTest(LOOP_COUNT_MIN)
    void randomIpAddress() {
        assertTrue(
            InetAddressValidator.getInstance().isValid(ipAddressGenerator.randomIpAddress()));
    }

    /** Test {@link IpAddressGenerator#randomIpV4Address()}. */
    @Test
    void randomIpV4Address() {
        assertTrue(
            InetAddressValidator.getInstance()
                .isValidInet4Address(ipAddressGenerator.randomIpV4Address()));
    }

    /** Test {@link IpAddressGenerator#randomIpV6Address()}. */
    @Test
    void randomIpV6Address() {
        assertTrue(
            InetAddressValidator.getInstance()
                .isValidInet6Address(ipAddressGenerator.randomIpV6Address()));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        ipAddressGenerator = new IpAddressGenerator();
    }
}

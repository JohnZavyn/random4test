package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestBoolean.randomBoolean;
import static com.threeleaf.test.random.TestString.COLON;
import static com.threeleaf.test.random.util.TestArrayUtil.chooseOneFrom;

import com.threeleaf.test.random.TestByte;
import com.threeleaf.test.random.TestShort;

/** Class used to generate randomized IPv4 and IPv6 addresses. */
public class IpAddressGenerator {

    /** The first three octets of an example IPv4 address, test range 1. */
    public static final String IPV4_TEST_NET_1_PREFIX = "192.0.2.";

    /** The first three octets of an example IPv4 address, test range 2. */
    public static final String IPV4_TEST_NET_2_PREFIX = "198.51.100.";

    /** The first three octets of an example IPv4 address, test range 3. */
    public static final String IPV4_TEST_NET_3_PREFIX = "203.0.113.";

    /** The first two hextets of an example IP64 address. */
    public static final String IPV6_TEST_PREFIX = "2001:db8:";

    /**
     * Generate a random IP address in the official example/documentation range.
     *
     * @return a random IPv4 or IPv6 address
     */
    public String randomIpAddress() {
        return randomBoolean() ? randomIpV4Address() : randomIpV6Address();
    }

    /**
     * Generate a random IPv4 address in one of the official example/documentation ranges.
     *
     * @return a random IPv4 address
     */
    public String randomIpV4Address() {
        return chooseOneFrom(IPV4_TEST_NET_1_PREFIX, IPV4_TEST_NET_2_PREFIX, IPV4_TEST_NET_3_PREFIX)
            + TestByte.randomUnsigned();
    }

    /**
     * Generate a random IPv6 address in the official example/documentation range.
     *
     * @return a random IPv6 address
     */
    public String randomIpV6Address() {
        return IPV6_TEST_PREFIX + TestShort.randomHex() + COLON + TestShort.randomHex() + COLON
            + TestShort.randomHex() + COLON + TestShort.randomHex() + COLON + TestShort
            .randomHex() + COLON + TestShort.randomHex();
    }
}

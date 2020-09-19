package com.threeleaf.test.random;

import com.threeleaf.test.random.generator.IpAddressGenerator;

/** Test IP addresses for use in JUnit tests. */
public class TestIpAddress extends AbstractRandom<String> {

    /** The instance of {@link TestIpAddress}. */
    public static final TestIpAddress INSTANCE = new TestIpAddress();

    /** A standard IP address generator. */
    public static final IpAddressGenerator IP_GENERATOR = new IpAddressGenerator();

    /** A random IP address. */
    public static final String IP_ADDRESS = randomIpAddress();

    /** Instantiate a test IP address generator. */
    public TestIpAddress() {
        super(String.class);
    }

    /**
     * Generate a random IP address.
     *
     * @return an IP address
     */
    public static String randomIpAddress() {
        return INSTANCE.random();
    }

    /**
     * Generate a random IPv4 address.
     *
     * @return a version 4 IP address
     */
    public static String randomIpV4Address() {
        return IP_GENERATOR.randomIpV4Address();
    }

    /**
     * Generate a random IPv6 address.
     *
     * @return a version 6 IP address
     */
    public static String randomIpV6Address() {
        return IP_GENERATOR.randomIpV6Address();
    }

    /**
     * Get a random IP address.
     *
     * @return an IP address
     */
    @Override
    public String random() {
        return IP_GENERATOR.randomIpAddress();
    }

    /**
     * Get a random IP address.
     *
     * @return a friendly IP address
     */
    @Override
    public String random(final String... fieldsExcluded) {
        /* Since this is a String type, there are no fields to exclude. */
        return IP_GENERATOR.randomIpV4Address();
    }
}

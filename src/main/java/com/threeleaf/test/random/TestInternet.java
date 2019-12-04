package com.threeleaf.test.random;

import static com.threeleaf.test.random.util.TestInternetUtil.*;

/** Internet constants to be used in JUnit tests. */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestInternet
{

    /* A bogus e-mail address. */
    public static final String EMAIL = randomEmail();

    /** The HTTPS protocol. */
    public static final String HTTPS_PROTOCOL = "https";

    /** The HTTP protocol. */
    public static final String HTTP_PROTOCOL = "http";

    /** The first three octets of a example IPv4 address, test range 1. */
    public static final String IPV4_TEST_NET_1_PREFIX = "192.0.2.";

    /** The first three octets of a example IPv4 address, test range 2. */
    public static final String IPV4_TEST_NET_2_PREFIX = "198.51.100.";

    /** The first three octets of a example IPv4 address, test range 3. */
    public static final String IPV4_TEST_NET_3_PREFIX = "203.0.113.";

    public static final String IPV6_TEST_PREFIX = "2001:db8:";

    /** A URL for a home page using HTTP protocol. */
    public static final String URL = randomUrl();

    /** A URL for a home page using HTTPS protocol. */
    public static final String URL_SSL = randomUrlSecure();
}

package com.threeleaf.test.random.util;

import com.threeleaf.test.random.TestByte;
import com.threeleaf.test.random.TestShort;
import lombok.experimental.UtilityClass;

import static com.threeleaf.test.random.TestBoolean.randomBoolean;
import static com.threeleaf.test.random.TestInternet.*;
import static com.threeleaf.test.random.TestString.COLON;
import static com.threeleaf.test.random.util.TestArrayUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestNameUtil.randomNameFirst;
import static com.threeleaf.test.random.util.TestNameUtil.randomNameLast;
import static com.threeleaf.test.random.util.TestStringUtil.randomUuid;

/** Test internet utilities. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestInternetUtil
{

    /**
     * Return a random e-mail address for testing. The the username prefixed with "TEST~" for easy identification in the database,
     * and the domain complies with RFC 2606 (Reserved Top Level DNS Names).
     *
     * @return the string
     */
    public static String randomEmail()
    {
        return randomNameFirst() + '.' + randomNameLast() + '@' + randomDomain();
    }

    /**
     * A URL for a home page using HTTP protocol.
     *
     * @return a url
     */
    public static String randomUrl()
    {
        return HTTP_PROTOCOL + "://" + randomDomain();
    }

    /**
     * A URL for a home page using HTTP protocol.
     *
     * @return a secure url
     */
    public static String randomUrlSecure()
    {
        return HTTPS_PROTOCOL + "://" + randomDomain();
    }

    /**
     * A random domain name.
     *
     * @return a domain name
     */
    public static String randomDomain()
    {
        return "test." + randomUuid() + ".example.com";
    }

    /**
     * Generate a random IPv4 address in one of the official example/documentation ranges.
     *
     * @return a random IPv4 address
     */
    public static String randomIpV4()
    {
        return chooseOneFrom(IPV4_TEST_NET_1_PREFIX, IPV4_TEST_NET_2_PREFIX, IPV4_TEST_NET_3_PREFIX) + TestByte.randomUnsigned();
    }

    /**
     * Generate a random IPv6 address in the official example/documentation range.
     *
     * @return a random IPv6 address
     */
    public static String randomIpV6()
    {
        return IPV6_TEST_PREFIX + TestShort.randomHex() + COLON + TestShort.randomHex() + COLON + TestShort.randomHex() + COLON + TestShort.randomHex() + COLON + TestShort.randomHex() + COLON + TestShort.randomHex();
    }

    /**
     * Generate a random IP address in the official example/documentation range.
     *
     * @return a random IPv4 or IPv6 address
     */
    public static String randomIpAddress()
    {
        return randomBoolean() ? randomIpV4() : randomIpV6();
    }
}

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestBoolean.randomBoolean;
import static com.threeleaf.test.random.TestInternet.*;
import static com.threeleaf.test.random.TestString.COLON;
import static com.threeleaf.test.random.TestString.EXAMPLE;
import static com.threeleaf.test.random.util.TestArrayUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestNameUtil.randomNameFirst;
import static com.threeleaf.test.random.util.TestNameUtil.randomNameLast;
import static com.threeleaf.test.random.util.TestStringUtil.randomUuid;
import static lombok.AccessLevel.PRIVATE;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.threeleaf.test.random.TestByte;
import com.threeleaf.test.random.TestShort;
import lombok.NoArgsConstructor;

/** Test internet utilities. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings("WeakerAccess")
public final class TestInternetUtil {

    /** A list of some common top level domains. */
    public static final List<String> TOP_LEVEL_DOMAINS = ImmutableList.of(
        DOT_BIZ,
        DOT_COM,
        DOT_DESIGN,
        DOT_EDU,
        DOT_GG,
        DOT_GOV,
        DOT_INT,
        DOT_LIFE,
        DOT_MIL,
        DOT_NET,
        DOT_ORG,
        DOT_SHOP
    );

    /**
     * A random domain name.
     *
     * @return a domain name
     */
    public static String randomDomain() {
        return randomUuid() + DOT + EXAMPLE + randomTopLevelDomain();
    }

    /**
     * Return a random e-mail address for testing.
     * The domain complies with RFC 2606 (Reserved Top Level DNS Names).
     *
     * @return the email address
     */
    public static String randomEmail() {
        return randomNameFirst() + DOT + randomNameLast() + AT_SIGN + randomDomain();
    }

    /**
     * Generate a random IP address in the official example/documentation range.
     *
     * @return a random IPv4 or IPv6 address
     */
    public static String randomIpAddress() {
        return randomBoolean() ? randomIpV4() : randomIpV6();
    }

    /**
     * Generate a random IPv4 address in one of the official example/documentation ranges.
     *
     * @return a random IPv4 address
     */
    public static String randomIpV4() {
        return chooseOneFrom(IPV4_TEST_NET_1_PREFIX, IPV4_TEST_NET_2_PREFIX, IPV4_TEST_NET_3_PREFIX)
            + TestByte.randomUnsigned();
    }

    /**
     * Generate a random IPv6 address in the official example/documentation range.
     *
     * @return a random IPv6 address
     */
    public static String randomIpV6() {
        return IPV6_TEST_PREFIX + TestShort.randomHex() + COLON + TestShort.randomHex() + COLON
            + TestShort.randomHex() + COLON + TestShort.randomHex() + COLON + TestShort
            .randomHex() + COLON + TestShort.randomHex();
    }

    /**
     * Choose a random top-level domain name.
     *
     * @return a top-level domain name
     */
    public static String randomTopLevelDomain() {
        return TestCollectionUtil.chooseOneFrom(TOP_LEVEL_DOMAINS);
    }

    /**
     * A URL for a home page using HTTP protocol.
     *
     * @return a url
     */
    public static String randomUrl() {
        return HTTP_PROTOCOL + "://" + (randomBoolean() ? randomDomain() : randomIpV4());
    }

    /**
     * A URL for a home page using HTTP protocol.
     *
     * @return a secure url
     */
    public static String randomUrlSecure() {
        return HTTPS_PROTOCOL + "://" + (randomBoolean() ? randomDomain() : randomIpV4());
    }
}

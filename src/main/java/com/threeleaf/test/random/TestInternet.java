package com.threeleaf.test.random;

import static com.threeleaf.test.random.util.TestInternetUtil.*;
import static lombok.AccessLevel.PRIVATE;

import lombok.NoArgsConstructor;

/** Internet constants to be used in JUnit tests. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings({"WeakerAccess", "unused", "PMD.FinalFieldCouldBeStatic"})
public class TestInternet {

    /** The at sign. */
    public static final String AT_SIGN = "@";

    /** The dot separator. */
    public static final String DOT = ".";

    /** The top-level domain name ".biz" (business). */
    public static final String DOT_BIZ = ".biz";

    /** The top-level domain name ".com". */
    public static final String DOT_COM = ".com";

    /** The top-level domain name ".design". */
    public static final String DOT_DESIGN = ".design";

    /** The top-level domain name ".edu" (education). */
    public static final String DOT_EDU = ".edu";

    /** The top-level domain name ".gg" (gaming). */
    public static final String DOT_GG = ".gg";

    /** The top-level domain name ".gov" (government). */
    public static final String DOT_GOV = ".gov";

    /** The top-level domain name ".int" (international). */
    public static final String DOT_INT = ".int";

    /** The top-level domain name ".life". */
    public static final String DOT_LIFE = ".life";

    /** The top-level domain name ".mil" (military). */
    public static final String DOT_MIL = ".mil";

    /** The top-level domain name ".net". */
    public static final String DOT_NET = ".net";

    /** The top-level domain name ".org" (non-profit organization). */
    public static final String DOT_ORG = ".org";

    /** The top-level domain name ".shop". */
    public static final String DOT_SHOP = ".shop";

    /** The top-level domain name ".site". */
    public static final String DOT_SITE = ".site";

    /** The top-level domain name ".wine". */
    public static final String DOT_WINE = ".wine";

    /* A bogus e-mail address. */
    public static final String EMAIL = randomEmail();

    /** The HTTPS protocol. */
    public static final String HTTPS_PROTOCOL = "https";

    /** The HTTP protocol. */
    public static final String HTTP_PROTOCOL = "http";

    /** The first three octets of an example IPv4 address, test range 1. */
    public static final String IPV4_TEST_NET_1_PREFIX = "192.0.2.";

    /** The first three octets of an example IPv4 address, test range 2. */
    public static final String IPV4_TEST_NET_2_PREFIX = "198.51.100.";

    /** The first three octets of an example IPv4 address, test range 3. */
    public static final String IPV4_TEST_NET_3_PREFIX = "203.0.113.";

    /** The first two hextets of an example IP64 address. */
    public static final String IPV6_TEST_PREFIX = "2001:db8:";

    /** A URL for a home page using HTTP protocol. */
    public static final String URL = randomUrl();

    /** A URL for a home page using HTTPS protocol. */
    public static final String URL_SSL = randomUrlSecure();
}

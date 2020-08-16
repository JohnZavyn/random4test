package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestDomain.*;
import static com.threeleaf.test.random.TestString.EXAMPLE;
import static com.threeleaf.test.random.util.TestStringUtil.randomUuid;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.threeleaf.test.random.util.TestCollectionUtil;

/** Class used to generate randomized domain names. */
public final class DomainGenerator {

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
    public String randomDomain() {
        return randomUuid() + DOT + EXAMPLE + randomTopLevelDomain();
    }

    /**
     * Choose a random top-level domain name.
     *
     * @return a top-level domain name
     */
    public String randomTopLevelDomain() {
        return TestCollectionUtil.chooseOneFrom(TOP_LEVEL_DOMAINS);
    }
}

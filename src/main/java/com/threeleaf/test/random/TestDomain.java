package com.threeleaf.test.random;

import com.threeleaf.test.random.generator.DomainGenerator;

/** Test domains for use in JUnit tests. */
public class TestDomain extends AbstractRandom<String> {

    /** A standard domain generator. */
    public static final DomainGenerator DOMAIN_GENERATOR = new DomainGenerator();

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

    /** The instance of {@link TestDomain}. */
    public static final TestDomain INSTANCE = new TestDomain();

    /** A random domain. */
    public static final String DOMAIN = randomDomain();

    /** Instantiate a test domain generator. */
    public TestDomain() {
        super(String.class);
    }

    /**
     * Generate a random domain. *
     *
     * @return a random domain name
     */
    public static String randomDomain() {
        return INSTANCE.random();
    }

    /**
     * Get a random domain.
     *
     * @return a domain
     */
    @Override
    public String random() {
        return DOMAIN_GENERATOR.randomDomain();
    }

    /**
     * Get a random domain.
     *
     * @return a friendly domain
     */
    @Override
    public String random(String... fieldsExcluded) {
        /* Since this is a String type, there are no fields to exclude. */
        return DOMAIN_GENERATOR.randomDomain();
    }
}

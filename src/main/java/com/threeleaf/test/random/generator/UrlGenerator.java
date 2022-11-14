/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestBoolean.randomBoolean;
import static com.threeleaf.test.random.TestDomain.randomDomain;
import static com.threeleaf.test.random.TestIpAddress.randomIpV4Address;
import static com.threeleaf.test.random.TestUrl.HTTPS_PROTOCOL;
import static com.threeleaf.test.random.TestUrl.HTTP_PROTOCOL;

/** Class used to generate randomized url addresses. */
public final class UrlGenerator {

    /**
     * A URL for a home page using HTTP protocol.
     *
     * @return a URL
     */
    public String randomUrl() {
        return HTTP_PROTOCOL + "://" + (randomBoolean() ? randomDomain() : randomIpV4Address());
    }

    /**
     * A URL for a home page using HTTP protocol.
     *
     * @return a secure URL
     */
    public String randomUrlSecure() {
        return HTTPS_PROTOCOL + "://" + (randomBoolean() ? randomDomain() : randomIpV4Address());
    }
}

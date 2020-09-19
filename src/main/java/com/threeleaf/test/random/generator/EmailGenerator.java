package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestDomain.DOT;
import static com.threeleaf.test.random.TestDomain.randomDomain;
import static com.threeleaf.test.random.TestEmail.AT_SIGN;
import static com.threeleaf.test.random.util.TestNameUtil.randomNameFirst;
import static com.threeleaf.test.random.util.TestNameUtil.randomNameLast;

/** Class used to generate randomized e-mail addresses. */
public final class EmailGenerator {

    /**
     * Return a random e-mail address for testing.
     * The domain complies with RFC 2606 (Reserved Top Level DNS Names).
     *
     * @return the email address
     */
    public String randomEmail() {
        return randomNameFirst() + DOT + randomNameLast() + AT_SIGN + randomDomain();
    }
}

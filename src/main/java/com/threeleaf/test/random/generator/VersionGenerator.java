package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestBoolean.oneOutOf;
import static com.threeleaf.test.random.TestDomain.DOT;
import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestString.EMPTY;
import static com.threeleaf.test.random.TestString.UUID;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestStringUtil.randomString;

import java.util.List;

import com.google.common.collect.ImmutableList;

/** Class used to generate randomized semantic version numbers (See https://semver.org/). */
public final class VersionGenerator {

    private static final List<String> preReleaseIdentifiers = ImmutableList.of(
        "alpha",
        "beta",
        "RC",
        "RC-" + random1to10(),
        "M-" + random1to10(),
        "SNAPSHOT",
        randomString(),
        UUID
    );

    /**
     * A random version number.
     *
     * @return a version number
     */
    public String randomVersion() {
        return EMPTY + random0to10() + DOT + random0to10() + DOT + random0to10()
            + (oneOutOf(INT_10) ? "-" + chooseOneFrom(preReleaseIdentifiers) : EMPTY)
            + (oneOutOf(INT_10) ? "+" + randomString() : EMPTY)
            ;
    }
}

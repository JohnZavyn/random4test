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

/**
 * <p>Class used to generate randomized semantic version numbers in the format of</p>
 * <p>{@code <major>.<minor>.<patch>-<pre-release-identifier>+<build-identifier>}</p>
 * <p>(See https://semver.org/).</p>
 */
public final class VersionGenerator {

    /** Pre-release identifiers. */
    private static final List<String> PRE_RELEASE_IDENTIFIERS = ImmutableList.of(
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
            + (oneOutOf(INT_10) ? "-" + chooseOneFrom(PRE_RELEASE_IDENTIFIERS) : EMPTY)
            + (oneOutOf(INT_10) ? "+" + randomString() : EMPTY)
            ;
    }
}

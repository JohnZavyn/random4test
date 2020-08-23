package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestBoolean.coinFlip;
import static com.threeleaf.test.random.TestBoolean.oneOutOf;
import static com.threeleaf.test.random.TestDomain.DOT;
import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestString.EMPTY;
import static com.threeleaf.test.random.TestString.UUID;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestStringUtil.randomString;

import java.util.List;

import com.google.common.collect.ImmutableList;

/** Generate randomized version numbers for applications. */
public final class VersionGenerator {

    /**
     * Semantic pre-release identifiers. These can be anything, but I have included a few common
     * identifiers.
     */
    private static final List<String> PRE_RELEASE_IDENTIFIERS = ImmutableList.of(
        "alpha",
        "beta",
        "pre",
        "GA", /* General Availability */
        "RC", /* Release Candidate */
        "RC-" + random1to10(), /* Milestone */
        "M-" + random1to10(),
        "SNAPSHOT",
        randomString(),
        UUID
    );

    /** Spring release types. */
    private static final List<String> SPRING_RELEASE_TYPE = ImmutableList.of(
        "BUILD-SNAPSHOT", /* Spring Snapshot */
        "M" + random1to10(), /* Milestone */
        "RELEASE", /* Spring Release */
        "RC" + random1to10() /* Release Candidate */
    );

    /**
     * <p>Generate randomized semantic version numbers in the format of</p>
     * <p>{@code <major>.<minor>.<patch>-<pre-release-identifier>+<build-identifier>}.</p>
     *
     * @return a semantic version number
     *
     * @see <a href="https://semver.org/">Semantic Versioning</a>
     */
    public String randomSemanticVersion() {
        return EMPTY + random0to10() + DOT + random0to10() + DOT + random0to10()
            + (oneOutOf(INT_10) ? "-" + chooseOneFrom(PRE_RELEASE_IDENTIFIERS) : EMPTY)
            + (oneOutOf(INT_10) ? "+" + randomString() : EMPTY)
            ;
    }

    /**
     * <p>Generate randomized Spring version numbers in the format of</p>
     * <p>{@code <major>.<minor>.<patch>.<release-type>}.</p>
     *
     * @return a Spring version number
     *
     * @see
     * <a href="https://github.com/spring-projects/spring-build-gradle/wiki/Spring-project-versioning">Spring
     *     project versioning</a>
     */
    public String randomSpringVersion() {
        return EMPTY + random0to10() + DOT + random0to10() + DOT + random0to10() + DOT
            + chooseOneFrom(SPRING_RELEASE_TYPE)
            ;
    }

    /**
     * A random version number.
     *
     * @return a version number
     */
    public String randomVersion() {
        return coinFlip() ? randomSemanticVersion() : randomSpringVersion();
    }
}

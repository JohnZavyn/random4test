/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestString.STRING;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.validator.routines.DomainValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link TestDomain}. */
@SuppressWarnings("squid:S5786"/* Sharing constants */)
public class TestDomainTest {

    /** The test {@link TestDomain}. */
    private TestDomain testDomain;

    /** Test {@link TestDomain#DOMAIN}. */
    @Test
    void domain() {
        assertTrue(DomainValidator.getInstance().isValid(TestDomain.DOMAIN));
    }

    /** Test {@link TestDomain#random()}. */
    @Test
    void random() {
        assertTrue(DomainValidator.getInstance().isValid(testDomain.random()));
    }

    /** Test {@link TestDomain#randomDomain()}. */
    @Test
    void randomDomain() {
        assertTrue(DomainValidator.getInstance().isValid(TestDomain.randomDomain()));
    }

    /** Test {@link TestDomain#random(String...)}. */
    @Test
    void randomFieldsExcluded() {
        assertTrue(DomainValidator.getInstance().isValid(testDomain.random(STRING)));
    }

    /** Test {@link AbstractRandom#randomSetSingle(String...)}. */
    @Test
    void randomSetSingle() {
        assertTrue(
            DomainValidator.getInstance().isValid(testDomain.randomSetSingle().iterator().next()));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        testDomain = new TestDomain();
    }
}

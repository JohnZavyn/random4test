/*
 * Copyright 2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestString.STRING_ARRAY;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.validator.routines.EmailValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link TestEmail}. */
class TestEmailTest {

    /** The test {@link TestEmail}. */
    private TestEmail testEmail;

    /** Test {@link TestEmail#random()}. */
    @Test
    void random() {
        assertTrue(EmailValidator.getInstance().isValid(testEmail.random()));
    }

    /** Test {@link TestEmail#randomEmail()}. */
    @Test
    void randomEmail() {
        assertTrue(EmailValidator.getInstance().isValid(TestEmail.EMAIL));
        assertTrue(EmailValidator.getInstance().isValid(TestEmail.randomEmail()));
    }

    /** Test {@link TestEmail#random(String...)}. */
    @Test
    void randomFieldsExcluded() {
        assertTrue(EmailValidator.getInstance().isValid(testEmail.random(STRING_ARRAY)));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        testEmail = new TestEmail();
    }
}

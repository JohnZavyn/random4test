package com.threeleaf.test.random.generator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.validator.routines.EmailValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link EmailGenerator}. */
class EmailGeneratorTest {

    /** The test {@link EmailGenerator}. */
    private EmailGenerator emailGenerator;

    /** Test {@link EmailGenerator#randomEmail()}. */
    @Test
    void randomEmail() {
        assertTrue(EmailValidator.getInstance().isValid(emailGenerator.randomEmail()));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        emailGenerator = new EmailGenerator();
    }
}

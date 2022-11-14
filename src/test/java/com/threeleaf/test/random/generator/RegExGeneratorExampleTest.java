/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/** Test {@link RegExGenerator#random()} for specific examples. */
public class RegExGeneratorExampleTest {

    /** Test {@link RegExGenerator#random()} for dates. */
    @Test
    void dates() {
        /* In a situation where you want to validate a yyyy-MM-dd format,
         * you might typically use a regular expression like this */
        final String dateYyyyMmDdRegEx = "^((19|20)\\d{2})-([0]?[1-9]|1[012])-([0]?[1-9]|[1-2]\\d|3[01])$";
        final RegExGenerator dateYyyyMmDdGenerator = new RegExGenerator(dateYyyyMmDdRegEx);

        /* A string matching this format will be generated */
        final String dateString = dateYyyyMmDdGenerator.random();

        /* But at this point, the "valid format" does not guarantee it
         * is a valid date. In a real application, you would want to
         * be able to gracefully handle this kind of situation.
         * A test using random dates like this can help determine
         * if the code is set up to do so. */
        final LocalDate date;
        try {
            date = LocalDate.parse(dateString);
            assertTrue(date.getYear() > 1899);
        } catch (final Exception ignored) {
            /* Ignoring possible invalid dates like "1962-11-31" */
        }
    }

    /** Test {@link RegExGenerator#random()} for complex expressions. */
    @Test
    void password() {
        /* If you have developed a password complexity regular expression like the following,
         * it might be tedious to generate one or many of them for your tests. */
        final String passwordRegEx = "(?=(.*[0-9]))(?=.*[\\!@#$%^&*()\\[\\]{}\\-_+=~`|:;\"'<>,.\\/?])(?=.*[a-z])(?=(.*[A-Z]))(?=(.*)).{8,}";
        final RegExGenerator passwordGenerator = new RegExGenerator(passwordRegEx);
        final String password = passwordGenerator.random();
        /* Note that a generator can be instantiated once and used many times. */
        final String password2 = passwordGenerator.random();

        assertNotEquals(password, password2);
    }

}

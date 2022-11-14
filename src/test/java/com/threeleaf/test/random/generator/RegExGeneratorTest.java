/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.util.VersionValidator.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.threeleaf.test.random.generator.regex.RegExRandomStringFactory;
import com.threeleaf.test.random.util.StringFormatSupplier;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

/** Test {@link RegExRandomStringFactory}. */
@Slf4j
class RegExGeneratorTest {

    @ParameterizedTest
    @CsvSource(value = {
        MAVEN_VERSION_REGEX + ",MAVEN_VERSION_REGEX",
        SEMANTIC_VERSION_REGEX + ",SEMANTIC_VERSION_REGEX",
        SPRING_VERSION_REGEX + ",SPRING_VERSION_REGEX"
    })
    @CsvFileSource(resources = "/RegExGeneratorTests.csv", numLinesToSkip = 1)
    void random(final String regularExpression, final String purpose) {
        final RegExGenerator regExGenerator = new RegExGenerator(regularExpression);

        final String value = regExGenerator.random();

        final Pattern p = Pattern.compile(regularExpression);
        final Matcher m = p.matcher(value);
        final boolean found = m.find();
        final boolean matches = m.matches();

        final StringFormatSupplier messageSupplier = new StringFormatSupplier(
            "RegEx: `%s`, value: `%s`, Found: %b, Matches: %b, Purpose: `%s`",
            regularExpression,
            value,
            found,
            matches,
            purpose
        );

        final String message = messageSupplier.get();
        if (found && matches) {
            log.info(message);
        } else if (found ^ matches) {
            log.warn(message);
        } else {
            log.error(message);
        }

        assertTrue(found || matches, messageSupplier);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/RegExGeneratorNewTest.csv", numLinesToSkip = 1)
    void testPatterns(final String regularExpression, final String purpose) {
        random(regularExpression, purpose);
    }

    //@ParameterizedTest
    @CsvFileSource(resources = "/RegExBrokenTests.csv", numLinesToSkip = 1)
    void zBrokenPatterns(final String regularExpression, final String purpose) {
        random(regularExpression, purpose);
    }
}

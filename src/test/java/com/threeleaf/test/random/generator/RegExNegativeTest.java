/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator;

import static org.junit.jupiter.api.Assertions.fail;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@Slf4j
class RegExNegativeTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/RegExNegativeNewTest.csv", numLinesToSkip = 1)
    void testNegativeNewPatterns(final String regularExpression, final String purpose) {
        testNegativePattern(regularExpression, purpose);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/RegExNegativeTests.csv", numLinesToSkip = 1)
    void testNegativePattern(final String regularExpression, final String purpose) {

        try {
            new RegExGenerator(regularExpression);
            fail("Expected exception for `" + regularExpression + "` to test `" + purpose + '`');
        } catch (final RuntimeException e) {
            log.info("Correctly failed with message `{}`", e.getMessage());
        }
    }
}

package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.generator.DomainGenerator.TOP_LEVEL_DOMAINS;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.validator.routines.DomainValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link DomainGenerator}. */
class DomainGeneratorTest {

    /** The test {@link DomainGenerator}. */
    private DomainGenerator domainGeneratorUnderTest;

    /** Test {@link DomainGenerator#randomDomain()}. */
    @Test
    void randomDomain() {
        String result = domainGeneratorUnderTest.randomDomain();

        assertTrue(DomainValidator.getInstance().isValid(result));
    }

    /** Test {@link DomainGenerator#randomTopLevelDomain()}. */
    @Test
    void randomTopLevelDomain() {
        String result = domainGeneratorUnderTest.randomTopLevelDomain();

        assertTrue(TOP_LEVEL_DOMAINS.contains(result));
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        domainGeneratorUnderTest = new DomainGenerator();
    }
}

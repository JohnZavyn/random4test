/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.threeleaf.test.random.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link TestPerson}. */
class TestPersonTest {

    /** The test {@link TestPerson}. */
    private TestPerson testPerson;

    /** Test {@link TestPerson#random()}. */
    @Test
    void random() {
        final Person result = testPerson.random();

        assertNotNull(result.getGender());
    }

    /** Set up test. */
    @BeforeEach
    void setUp() {
        testPerson = new TestPerson();
    }
}

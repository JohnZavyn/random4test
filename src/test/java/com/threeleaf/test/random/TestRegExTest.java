/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestStringUtil.chooseOneFrom;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link TestRegEx}. */
class TestRegExTest {

    /** The test regular expression. */
    private String regex;

    /** The test {@link TestRegEx}. */
    private TestRegEx testRegEx;

    /** Test {@link TestRegEx#random()}. */
    @Test
    void random() {
        assertEquals(regex, testRegEx.getRegExGenerator().getRegExRandomStringFactory().toString());
        assertEquals(regex, testRegEx.random());
    }

    /** Test {@link TestRegEx#random(String...)}. */
    @Test
    void random2() {
        assertEquals(regex, testRegEx.random(STRING_ARRAY));
    }

    /** Test {@link TestRegEx#random(String)}. */
    @Test
    void randomOneTime() {
        final String regex2 = chooseOneFrom(NUMBERS);

        assertEquals(regex, testRegEx.random());
        assertEquals(regex2, TestRegEx.random(regex2));
        assertEquals(regex, testRegEx.random());
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        regex = chooseOneFrom(ALPHABET);
        testRegEx = new TestRegEx(regex);
    }
}

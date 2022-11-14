/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.threeleaf.test.random.TestGeneric;
import org.junit.jupiter.api.Test;

/** Test {@link TestGeneric}. */
class TestUtilTest {

    /** Test {@link TestGeneric#TestGeneric(Class)}. */
    @Test
    void constructor() {
        final TestGeneric<String> testGeneric = new TestGeneric<>(String.class);

        assertEquals(String.class, testGeneric.getType());
    }
}

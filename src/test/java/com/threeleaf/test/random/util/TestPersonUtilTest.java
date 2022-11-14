/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.INT_10;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.RepeatedTest;

class TestPersonUtilTest {

    @RepeatedTest(INT_10)
    void testRandomPerson() {

        assertNotNull(TestPersonUtil.randomPerson());
    }
}

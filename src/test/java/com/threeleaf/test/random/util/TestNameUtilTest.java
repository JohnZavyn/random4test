/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestIntegerTest.LOOP_COUNT_MIN;
import static com.threeleaf.test.random.util.TestNameUtil.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/** Test {@link TestNameUtil}. */
class TestNameUtilTest {

    /** Test {@link TestNameUtil} constructor. */
    @Test
    void constructor() throws Exception {
        final Constructor<TestNameUtil> constructor = TestNameUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (final Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestNameUtil#randomName()}. */
    @Test
    void randomName() {
        assertNotNull(TestNameUtil.randomName());
    }

    /** Test {@link TestNameUtil#randomNameFirst()}. */
    @RepeatedTest(LOOP_COUNT_MIN)
    void randomNameFirst() {
        assertNotNull(TestNameUtil.randomName());
    }

    /** Test {@link TestNameUtil#randomNameFirstFemale()}. */
    @Test
    void randomNameFirstFemale() {
        assertTrue(NAMES_FIRST_FEMALE.contains(TestNameUtil.randomNameFirstFemale()));
    }

    /** Test {@link TestNameUtil#randomNameFirstMale()}. */
    @Test
    void randomNameFirstMale() {
        assertTrue(NAMES_FIRST_MALE.contains(TestNameUtil.randomNameFirstMale()));
    }

    /** Test {@link TestNameUtil#randomNameLast()}. */
    @Test
    void randomNameLast() {
        assertTrue(NAMES_LAST.contains(TestNameUtil.randomNameLast()));
    }
}

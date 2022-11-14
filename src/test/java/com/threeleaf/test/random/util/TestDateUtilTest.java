/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestDateUtil}. */
class TestDateUtilTest {

    /** Test {@link TestDateUtil} constructor. */
    @Test
    void constructor() throws Exception {
        final Constructor<TestDateUtil> constructor = TestDateUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (final Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }
}

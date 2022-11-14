/*
 * Copyright 2019-2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.INTEGER_SMALL;
import static com.threeleaf.test.random.TestInteger.INT_01;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestSetUtil}. */
class TestSetUtilTest {

    /** Test {@link TestSetUtil} constructor. */
    @Test
    void constructor() throws Exception {
        final Constructor<TestSetUtil> constructor = TestSetUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (final Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestSetUtil#randomHashSetOf(Class, String...)}. */
    @Test
    void randomHashSetOf() {
        assertFalse(TestSetUtil.randomHashSetOf(Byte.class).isEmpty());
    }

    /** Test {@link TestSetUtil#randomHashSetSingleOf(Class, String...)}. */
    @Test
    void randomHashSetSingleOf() {
        assertEquals(INT_01, TestSetUtil.randomHashSetSingleOf(Byte.class).size());
    }

    /** Test {@link TestSetUtil#randomLinkedHashSetOf(Class, String...)}. */
    @Test
    void randomLinkedHashSetOf() {
        assertFalse(TestSetUtil.randomLinkedHashSetOf(Character.class).isEmpty());
    }

    /** Test {@link TestSetUtil#randomLinkedHashSetSingleOf(Class, String...)}. */
    @Test
    void randomLinkedHashSetSingleOf() {
        assertEquals(INT_01, TestSetUtil.randomLinkedHashSetSingleOf(Character.class).size());
    }

    /** Test {@link TestSetUtil#randomSetOf(Class, String...)}. */
    @Test
    void randomSetOf() {
        assertFalse(TestSetUtil.randomSetOf(Boolean.class).isEmpty());
    }

    /** Test {@link TestSetUtil#randomSetSingleOf(Class, String...)}. */
    @Test
    void randomSetSingleOf() {
        assertEquals(INT_01, TestSetUtil.randomSetSingleOf(Boolean.class).size());
    }

    /** Test {@link TestSetUtil#randomSortedSetOf(Class, String...)}. */
    @Test
    void randomSortedSetOf() {
        assertFalse(TestSetUtil.randomSortedSetOf(Short.class).isEmpty());
    }

    /** Test {@link TestSetUtil#randomSortedSetSingleOf(Class, String...)}. */
    @Test
    void randomSortedSetSingleOf() {
        assertEquals(INT_01, TestSetUtil.randomSortedSetSingleOf(Short.class).size());
    }

    /** Test {@link TestSetUtil#randomTreeSetOf(int, Class, String...)}. */
    @Test
    void randomTreeSetOf() {
        assertFalse(TestSetUtil.randomTreeSetOf(Object.class).isEmpty());
        assertEquals(
            (int) INTEGER_SMALL,
            TestSetUtil.randomTreeSetOf(INTEGER_SMALL, Object.class).size()
        );
    }

    /** Test {@link TestSetUtil#randomTreeSetSingleOf(Class, String...)}. */
    @Test
    void randomTreeSetSingleOf() {
        assertEquals(INT_01, TestSetUtil.randomTreeSetSingleOf(Object.class).size());
    }
}

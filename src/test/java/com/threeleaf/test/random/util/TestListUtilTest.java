/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.INT_01;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestListUtil}. */
class TestListUtilTest {

    /** Test {@link TestListUtil} constructor. */
    @Test
    void constructor() throws Exception {
        final Constructor<TestListUtil> constructor = TestListUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (final Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestListUtil#randomArrayListOf(Class, String...)}. */
    @Test
    void randomArrayListOf() {
        assertFalse(TestListUtil.randomArrayListOf(Byte.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomArrayListSingleOf(Class, String...)}. */
    @Test
    void randomArrayListSingleOf() {
        assertEquals(INT_01, TestListUtil.randomArrayListSingleOf(Byte.class).size());
    }

    /** Test {@link TestListUtil#randomLinkedListOf(Class, String...)}. */
    @Test
    void randomLinkedListOf() {
        assertFalse(TestListUtil.randomLinkedListOf(Character.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomLinkedListSingleOf(Class, String...)}. */
    @Test
    void randomLinkedListSingleOf() {
        assertEquals(INT_01, TestListUtil.randomLinkedListSingleOf(Character.class).size());
    }

    /** Test {@link TestListUtil#randomListOf(Class, String...)}. */
    @Test
    void randomListOf() {
        assertFalse(TestListUtil.randomListOf(Boolean.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomListSingleOf(Class, String...)}. */
    @Test
    void randomListSingleOf() {
        assertEquals(INT_01, TestListUtil.randomListSingleOf(Boolean.class).size());
    }

    /** Test {@link TestListUtil#randomVectorOf(Class, String...)}. */
    @Test
    void randomVectorOf() {
        assertFalse(TestListUtil.randomVectorOf(Short.class).isEmpty());
    }

    /** Test {@link TestListUtil#randomVectorSingleOf(Class, String...)}. */
    @Test
    void randomVectorSingleOf() {
        assertEquals(INT_01, TestListUtil.randomVectorSingleOf(Short.class).size());
    }
}

/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestCharacter.CHARACTER_126;
import static com.threeleaf.test.random.TestCharacter.CHARACTER_13;
import static com.threeleaf.test.random.TestInteger.random1to10;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestStringUtil.*;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;

import org.apache.commons.validator.routines.CodeValidator;
import org.junit.jupiter.api.Test;

/** Test {@link TestStringUtil}. */
class TestStringUtilTest {

    /** Test {@link TestStringUtil#capitalize(String)}. */
    @Test
    void capitalize() {
        final String expectedResult = "String";

        final String result = TestStringUtil.capitalize("string");

        assertEquals(expectedResult, result);
        assertNull(TestStringUtil.capitalize(STRING_NULL));
        assertEquals(WHITESPACE, TestStringUtil.capitalize(WHITESPACE));
    }

    /** Test {@link TestStringUtil} constructor. */
    @Test
    void constructor() throws Exception {
        final Constructor<TestStringUtil> constructor =
            TestStringUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (final Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestStringUtil#contains(String, char)}. */
    @Test
    void contains() {
        assertTrue(TestStringUtil.contains(TEST_PREFIX, CHARACTER_126));
        assertFalse(TestStringUtil.contains(TEST_PREFIX, CHARACTER_13));
    }

    /** Test {@link TestStringUtil#extractSuffix(String)}. */
    @Test
    void extractSuffix() {
        final String string = STRING_05 + '_' + STRING_32;

        final String result = TestStringUtil.extractSuffix(string);

        assertEquals(STRING_32, result);
        assertEquals(STRING_08, TestStringUtil.extractSuffix(STRING_99 + '~' + STRING_08));
    }

    /** Test {@link TestStringUtil#isBlank(CharSequence)}. */
    @Test
    void isBlank() {
        assertTrue(TestStringUtil.isBlank(STRING_NULL));
        assertTrue(TestStringUtil.isBlank(EMPTY));
        assertTrue(TestStringUtil.isBlank(WHITESPACE));
        assertFalse(TestStringUtil.isBlank(STRING_05));
    }

    /** Test {@link TestStringUtil#isEmpty(CharSequence)}. */
    @Test
    void isEmpty() {
        assertTrue(TestStringUtil.isEmpty(STRING_NULL));
        assertTrue(TestStringUtil.isEmpty(EMPTY));
        assertFalse(TestStringUtil.isEmpty(SPACE));
    }

    /** Test {@link TestStringUtil#randomLetter()}. */
    @Test
    void randomLetter() {
        assertEquals(1, TestStringUtil.randomLetter().length());
    }

    /** Test {@link TestStringUtil#randomString()}. */
    @Test
    void randomString() {
        final String result = TestStringUtil.randomString();

        assertTrue(result.length() >= STRING_LENGTH_MIN);
        assertTrue(result.length() <= STRING_LENGTH_MAX);
    }

    /** Test {@link TestStringUtil#randomString(int)}. */
    @Test
    void randomStringLength() {
        final int length = random1to10();

        final String result = TestStringUtil.randomString(length);

        assertEquals(length, result.length());
    }

    /** Test {@link TestStringUtil#randomTest(String)}. */
    @Test
    void randomTest() {
        assertTrue(TestStringUtil.randomTest(STRING_05).startsWith(TEST_PREFIX + STRING_05));
    }

    /** Test {@link TestStringUtil#randomTest(String)}. */
    @Test
    void randomTestBlank() {
        final String testEntity = TestStringUtil.randomTest(WHITESPACE);

        assertTrue(testEntity.startsWith(TEST_PREFIX));
        assertFalse(testEntity.contains(WHITESPACE));
    }

    /** Test {@link TestStringUtil#randomUuid()}. */
    @Test
    void randomUuid() {
        assertTrue(new CodeValidator(
            "[0-9a-fA-F]{8}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{12}",
            null
        ).isValid(TestStringUtil.randomUuid()));
    }

    /** Test {@link TestStringUtil#safeString(String)}. */
    @Test
    void safeString() {
        assertEquals(EMPTY, TestStringUtil.safeString(EMPTY));
        assertEquals(EMPTY, TestStringUtil.safeString(STRING_NULL));
        assertEquals(STRING_10, TestStringUtil.safeString(STRING_10));
    }

    /** Test {@link TestStringUtil#safeString(String, String)}. */
    @Test
    void safeStringDefault() {
        assertEquals(STRING_05, TestStringUtil.safeString(EMPTY, STRING_05));
        assertEquals(STRING_05, TestStringUtil.safeString(null, STRING_05));
        assertEquals(STRING_10, TestStringUtil.safeString(STRING_10, STRING_05));
    }

    /** Test {@link TestStringUtil#shuffle(String)}. */
    @Test
    void shuffle() {
        assertNotEquals(ALPHABET, TestStringUtil.shuffle(ALPHABET));
    }

    /** Test {@link TestStringUtil#test(String)}. */
    @Test
    void test() {
        final String testName = TestStringUtil.test(STRING_05);
        assertTrue(testName.startsWith(TEST_PREFIX));
        assertTrue(testName.endsWith(STRING_05));
    }

    /** Test {@link TestStringUtil#test(String)}. */
    @Test
    void testBlank() {
        final String testName = TestStringUtil.test(WHITESPACE);

        assertTrue(testName.startsWith(TEST_PREFIX));
        assertFalse(testName.contains(WHITESPACE));
    }
}

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.random1to10;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestStringUtil.STRING_LENGTH_MAX;
import static com.threeleaf.test.random.util.TestStringUtil.STRING_LENGTH_MIN;
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

        String result = TestStringUtil.capitalize("string");

        assertEquals(expectedResult, result);
        assertNull(TestStringUtil.capitalize(null));
        assertEquals(WHITESPACE, TestStringUtil.capitalize(WHITESPACE));
    }

    /** Test {@link TestStringUtil} constructor. */
    @Test
    void constructor() throws Exception {
        Constructor<TestStringUtil> constructor = TestStringUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestStringUtil#extractSuffix(String)}. */
    @Test
    void extractSuffix() {
        String string = STRING_05 + '_' + STRING_32;

        String result = TestStringUtil.extractSuffix(string);

        assertEquals(STRING_32, result);
        assertEquals(STRING_08, TestStringUtil.extractSuffix(STRING_99 + '~' + STRING_08));
    }

    /** Test {@link TestStringUtil#isBlank(CharSequence)}. */
    @Test
    void isBlank() {
        assertTrue(TestStringUtil.isBlank(null));
        assertTrue(TestStringUtil.isBlank(EMPTY));
        assertTrue(TestStringUtil.isBlank(WHITESPACE));
        assertFalse(TestStringUtil.isBlank(STRING_05));
    }

    /** Test {@link TestStringUtil#isEmpty(CharSequence)}. */
    @Test
    void isEmpty() {
        assertTrue(TestStringUtil.isEmpty(null));
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
        String result = TestStringUtil.randomString();

        assertTrue(result.length() >= STRING_LENGTH_MIN);
        assertTrue(result.length() <= STRING_LENGTH_MAX);
    }

    /** Test {@link TestStringUtil#randomString(int)}. */
    @Test
    void randomStringLength() {
        int length = random1to10();

        String result = TestStringUtil.randomString(length);

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
        String testEntity = TestStringUtil.randomTest(WHITESPACE);

        assertTrue(testEntity.startsWith(TEST_PREFIX));
        assertFalse(testEntity.contains(WHITESPACE));
    }

    /** Test {@link TestStringUtil#randomUuid()}. */
    @Test
    void randomUuid() {
        assertTrue(new CodeValidator(
            "[0-9a-fA-F]{8}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{12}",
            null).isValid(TestStringUtil.randomUuid()));
    }

    /** Test {@link TestStringUtil#safeString(String)}. */
    @Test
    void safeString() {
        assertEquals(EMPTY, TestStringUtil.safeString(EMPTY));
        assertEquals(EMPTY, TestStringUtil.safeString(null));
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
        String testName = TestStringUtil.test(STRING_05);
        assertTrue(testName.startsWith(TEST_PREFIX));
        assertTrue(testName.endsWith(STRING_05));
    }

    /** Test {@link TestStringUtil#test(String)}. */
    @Test
    void testBlank() {
        String testName = TestStringUtil.test(WHITESPACE);

        assertTrue(testName.startsWith(TEST_PREFIX));
        assertFalse(testName.contains(WHITESPACE));
    }
}

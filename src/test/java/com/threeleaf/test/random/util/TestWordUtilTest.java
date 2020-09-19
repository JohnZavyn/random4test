package com.threeleaf.test.random.util;

import static com.google.common.collect.Lists.newArrayList;
import static com.threeleaf.test.random.TestInteger.INT_04;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestStringUtil.isBlank;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;
import java.util.List;

import org.junit.jupiter.api.Test;

/** Test {@link TestWordUtil}. */
class TestWordUtilTest {

    /** Test {@link TestWordUtil} constructor. */
    @Test
    void constructor() throws Exception {
        final Constructor<TestWordUtil> constructor = TestWordUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (final Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestWordUtil#parseWords(String)}. */
    @Test
    void getAllWords() {
        final List<String> testWords = newArrayList(STRING_01, STRING_10, STRING_05);

        assertTrue(testWords.containsAll(
            TestWordUtil.parseWords(String.join(PUNCTUATION, testWords)))
        );

        assertTrue(testWords.containsAll(
            TestWordUtil.parseWords(String.join(WHITESPACE, testWords)))
        );
    }

    /** Test {@link TestWordUtil#randomAdjective()}. */
    @Test
    void randomAdjective() {
        assertFalse(isBlank(TestWordUtil.randomAdjective()));
    }

    /** Test {@link TestWordUtil#randomAdverb()}. */
    @Test
    void randomAdverb() {
        assertFalse(isBlank(TestWordUtil.randomAdverb()));
    }

    /** Test {@link TestWordUtil#randomColor()}. */
    @Test
    void randomColor() {
        final String color = TestWordUtil.randomColor();
        assertFalse(isBlank(color));
        assertFalse(color.startsWith("#"));
    }

    /** Test {@link TestWordUtil#randomColorHex()}. */
    @Test
    void randomColorHex() {
        assertTrue(TestWordUtil.randomColorHex().startsWith("#"));
    }

    /** Test {@link TestWordUtil#randomNoun()}. */
    @Test
    void randomNoun() {
        assertFalse(isBlank(TestWordUtil.randomNoun()));
    }

    /** Test {@link TestWordUtil#randomPhoneticNato()}. */
    @Test
    void randomPhoneticNato() {
        assertFalse(isBlank(TestWordUtil.randomPhoneticNato()));
    }

    /** Test {@link TestWordUtil#randomPhrase()}. */
    @Test
    void randomPhrase() {
        assertEquals(INT_04, TestWordUtil.randomPhrase().split(SPACE).length);
    }

    /** Test {@link TestWordUtil#randomVerb()}. */
    @Test
    void randomVerb() {
        assertFalse(isBlank(TestWordUtil.randomVerb()));
    }
}

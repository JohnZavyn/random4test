package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.INT_04;
import static com.threeleaf.test.random.TestString.SPACE;
import static com.threeleaf.test.random.util.TestStringUtil.isBlank;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestWordUtil}. */
class TestWordUtilTest {

    /** Test {@link TestWordUtil} constructor. */
    @Test
    void constructor() throws Exception {
        Constructor<TestWordUtil> constructor = TestWordUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
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
        String color = TestWordUtil.randomColor();
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

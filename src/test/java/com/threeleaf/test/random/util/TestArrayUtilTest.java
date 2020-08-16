package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestIntegerTest.LOOP_COUNT_MAX;
import static com.threeleaf.test.random.TestString.*;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;
import java.util.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestArrayUtil}. */
class TestArrayUtilTest {

    /** Test {@link TestArrayUtil#chooseOneFrom(Object[])}. */
    @Test
    void chooseOneFrom() {
        Object[] array = new Object[]{STRING_10, STRING_16, STRING_32, STRING_99};
        Set<String> results = new HashSet<>();
        boolean allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++) {
            results.add((String) TestArrayUtil.chooseOneFrom(array));
            if (results.size() == array.length) {
                allPossibilitiesFound = true;
                break;
            }
        }
        if (!allPossibilitiesFound) {
            fail("Expected all possible results, but only found " + results);
        }
    }

    /** Test {@link TestArrayUtil} constructor. */
    @Test
    void constructor() throws Exception {
        Constructor<TestArrayUtil> constructor = TestArrayUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestArrayUtil#randomArrayOf(Class, String...)}. */
    @Test
    void randomArrayOf() {
        String[] strings = TestArrayUtil.randomArrayOf(String.class);
        Long[] longs = TestArrayUtil.randomArrayOf(Long.class);
        Integer[] integers = TestArrayUtil.randomArrayOf(Integer.class);
        Object[] objects = TestArrayUtil.randomArrayOf(Object.class);
        assertTrue(strings.length > 0);
        assertTrue(longs.length > 0);
        assertTrue(integers.length > 0);
        assertTrue(objects.length > 0);
    }

    /** Test {@link TestArrayUtil#randomArraySingleOf(Class, String...)}. */
    @Test
    void randomArraySingleOf() {
        Double[] doubles = TestArrayUtil.randomArraySingleOf(Double.class);

        assertEquals(INT_01, doubles.length);
    }

    @Test
    void toArray() {
        String[] result = TestArrayUtil.toArray(STRING_LIST);

        assertEquals(STRING_LIST.size(), result.length);
    }

    @Test
    void toArrayEmpty() {
        Object[] result = TestArrayUtil.toArray(new ArrayList<>());

        assertEquals(INT_00, result.length);
    }
}

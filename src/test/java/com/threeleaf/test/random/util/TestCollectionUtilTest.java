package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestInteger.INT_10;
import static com.threeleaf.test.random.TestIntegerTest.LOOP_COUNT_MAX;
import static com.threeleaf.test.random.TestString.*;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;
import java.util.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestCollectionUtil}. */
class TestCollectionUtilTest {

    /** Test {@link TestCollectionUtil#chooseOneFrom(Collection)}. */
    @Test
    void chooseOneFrom() {
        List<String> collection = asList(STRING_05, STRING_08, STRING_10, STRING_16);
        Set<String> results = new HashSet<>();
        boolean allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++) {
            results.add(TestCollectionUtil.chooseOneFrom(collection));
            if (results.size() == collection.size()) {
                allPossibilitiesFound = true;
                break;
            }
        }
        if (!allPossibilitiesFound) {
            fail("Expected all possible results, but only found " + results);
        }
    }

    /** Test {@link TestCollectionUtil#chooseOneFrom(Object[])}. */
    @Test
    void chooseOneFromArray() {
        Object[] array = new Object[]{STRING_10, STRING_16, STRING_32, STRING_99};
        Set<String> results = new HashSet<>();
        boolean allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++) {
            results.add((String) TestCollectionUtil.chooseOneFrom(array));
            if (results.size() == array.length) {
                allPossibilitiesFound = true;
                break;
            }
        }
        if (!allPossibilitiesFound) {
            fail("Expected all possible results, but only found " + results);
        }
    }

    /** Test {@link TestCollectionUtil} constructor. */
    @Test
    void constructor() throws Exception {
        Constructor<TestCollectionUtil> constructor =
            TestCollectionUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestCollectionUtil#randomCollectionOf(Class, String...)}. */
    @Test
    void randomCollectionOf() {
        for (int counter = 0; counter < INT_10; counter++) {
            Collection<Long> result = TestCollectionUtil.randomCollectionOf(Long.class);

            assertFalse(result.isEmpty());
        }
    }

    /** Test {@link TestCollectionUtil#randomCollectionSingleOf(Class, String...)}. */
    @Test
    void testRandomCollectionSingleOf() {
        assertEquals(INT_01, TestCollectionUtil.randomCollectionSingleOf(Object.class).size());
    }
}

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestIntegerTest.LOOP_COUNT_MAX;
import static com.threeleaf.test.random.TestLong.*;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

/** Test {@link TestLong}. */
class TestLongTest {

    /** Test {@link TestLong} constants. */
    @Test
    void constants() {
        assertNotEquals(INT_00, LONG_ARRAY.length);
        assertEquals(INT_01, LONG_ARRAY_SINGLE.length);
        assertNotEquals(INT_00, LONG_COLLECTION.size());
        assertEquals(INT_01, LONG_COLLECTION_SINGLE.size());
        assertFalse(LONG_LIST.isEmpty());
        assertEquals(INT_01, LONG_LIST_SINGLE.size());
        assertFalse(LONG_MAP.isEmpty());
        assertFalse(TestString.STRING_MAP_LONG.isEmpty());
        assertEquals(INT_01, LONG_MAP_SINGLE.size());
        assertEquals(INT_01, TestString.STRING_MAP_LONG_SINGLE.size());
        assertFalse(LONG_SET.isEmpty());
        assertEquals(INT_01, LONG_SET_SINGLE.size());
    }

    /** Test {@link TestLong#randomBetween(long, long)}. */
    @Test
    void randomBetweenLong() {
        final Set<Long> results = new HashSet<>();
        boolean allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++) {
            results.add(randomBetween(L_05, L_10));
            if (results.size() == 6) {
                allPossibilitiesFound = true;
                break;
            }
        }
        if (!allPossibilitiesFound) {
            fail("Expected all possible results, but only found " + results);
        }
    }

    /** Test {@link TestLong#randomBetween(long, long)}. */
    @Test
    void randomBetweenMax() {
        assertDoesNotThrow(() -> TestLong.randomBetween(MIN_VALUE, MAX_VALUE));
    }
}

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.*;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/** Test {@link TestInteger}. */
@SuppressWarnings("squid:S5786"/* Want LOOP_COUNT_MAX sharable */)
public class TestIntegerTest {

    /**
     * The maximum number of times to loop through a test call.
     * Testing randomness is difficult, so we want to have an upper
     * boundary for failure in a loop where we are tying to collect
     * some kind of statistics.
     */
    public static final int LOOP_COUNT_MAX = INT_100;

    /** Test {@link TestInteger} constants. */
    @Test
    void constants() {
        assertNotEquals(INT_00, INTEGER_ARRAY.length);
        assertEquals(INT_01, INTEGER_ARRAY_SINGLE.length);
        assertNotEquals(INT_00, INTEGER_COLLECTION.size());
        assertEquals(INT_01, INTEGER_COLLECTION_SINGLE.size());
        assertFalse(INTEGER_LIST.isEmpty());
        assertEquals(INT_01, INTEGER_LIST_SINGLE.size());
        assertFalse(INTEGER_MAP.isEmpty());
        assertFalse(TestString.STRING_MAP_INTEGER.isEmpty());
        assertEquals(INT_01, INTEGER_MAP_SINGLE.size());
        assertEquals(INT_01, TestString.STRING_MAP_INTEGER_SINGLE.size());
        assertFalse(INTEGER_SET.isEmpty());
        assertEquals(INT_01, INTEGER_SET_SINGLE.size());
    }

    /** Test {@link TestInteger#random0to10()}. */
    @RepeatedTest(LOOP_COUNT_MAX)
    void random0to10() {
        int number = TestInteger.random0to10();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_10);
    }

    /** Test {@link TestInteger#randomPercent()}}. */
    @RepeatedTest(LOOP_COUNT_MAX)
    void random0to100() {
        int number = TestInteger.randomPercent();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_100);
    }

    /** Test {@link TestInteger#random1to10()}. */
    @RepeatedTest(LOOP_COUNT_MAX)
    void random1to10() {
        int number = TestInteger.random1to10();

        assertTrue(number >= INT_01);
        assertTrue(number <= INT_10);
    }

    /** Test {@link TestInteger#random1to100()}. */
    @RepeatedTest(LOOP_COUNT_MAX)
    void random1to100() {
        int number = TestInteger.random1to100();

        assertTrue(number >= INT_01);
        assertTrue(number <= INT_100);
    }

    /** Test {@link TestInteger#randomBetween(int, int)}. */
    @Test
    void randomBetween() {
        Set<Integer> results = new HashSet<>();
        boolean allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++) {
            results.add(TestInteger.randomBetween(INT_05, INT_10));
            if (results.size() == 6) {
                allPossibilitiesFound = true;
                break;
            }
        }
        if (!allPossibilitiesFound) {
            fail("Expected all possible results, but only found " + results);
        }
    }

    /** Test {@link TestInteger#randomBetween(int, int)} with max values. */
    @RepeatedTest(LOOP_COUNT_MAX)
    void randomBetweenMax() {
        assertDoesNotThrow(() -> TestInteger.randomBetween(MIN_VALUE, MAX_VALUE));
    }

    /** Test {@link TestInteger#randomDigit()}. */
    @RepeatedTest(LOOP_COUNT_MAX)
    void randomDigit() {
        int number = TestInteger.randomDigit();

        assertTrue(number >= INT_00);
        assertTrue(number <= INT_09);
    }

    /** Test {@link TestInteger#randomHex()}. */
    @RepeatedTest(LOOP_COUNT_MAX)
    void randomHex() {
        long unsigned = Long.parseLong(TestInteger.randomHex(), INT_16);
        assertTrue(unsigned <= INTEGER_UNSIGNED_MAX);
        assertTrue(unsigned >= INT_00);
    }

    /** Test constant unmodifiable. */
    @Test
    @SuppressWarnings("ConstantConditions" /* Intentionally testing unmodifiable set.  */)
    void unmodifiable() {
        assertThrows(UnsupportedOperationException.class, () -> INTEGER_SET.add(INTEGER));
    }
}

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestIntegerTest.LOOP_COUNT_MAX;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/** Test {@link TestBoolean}. */
class TestBooleanTest {

    /** Test {@link TestBoolean#coinFlip()}. */
    @Test
    void coinFlip() {
        Set<Boolean> results = new HashSet<>();
        boolean allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++) {
            results.add(TestBoolean.coinFlip());
            if (results.size() == 2) {
                allPossibilitiesFound = true;
                break;
            }
        }
        if (!allPossibilitiesFound) {
            fail("Expected all possible results, but only found " + results);
        }
    }

    /** Test {@link TestBoolean#oneOutOf(int)}. */
    @Test
    void oneOutOf() {
        final int number = 10;
        Set<Boolean> results = new HashSet<>();
        boolean allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++) {
            results.add(TestBoolean.oneOutOf(number));
            if (results.size() == 2) {
                allPossibilitiesFound = true;
                break;
            }
        }
        if (!allPossibilitiesFound) {
            fail("Expected all possible results, but only found " + results);
        }
    }

    /** Test {@link TestBoolean#oneOutOf(int)} when an exception occurs. */
    @RepeatedTest(LOOP_COUNT_MAX)
    void oneOutOfException() {
        int numberNegative = -TestInteger.random0to10();
        assertThrows(IllegalArgumentException.class, () -> TestBoolean.oneOutOf(numberNegative));
    }

    /** Test {@link TestBoolean#randomBoolean()}. */
    @Test
    void randomBoolean() {
        Set<Boolean> results = new HashSet<>();
        boolean allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++) {
            results.add(TestBoolean.randomBoolean());
            if (results.size() == 2) {
                allPossibilitiesFound = true;
                break;
            }
        }
        if (!allPossibilitiesFound) {
            fail("Expected all possible results, but only found " + results);
        }
    }
}

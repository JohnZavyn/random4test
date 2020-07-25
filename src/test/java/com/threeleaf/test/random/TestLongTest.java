package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestLong.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestLong}. */
public class TestLongTest {

    /** Test {@link TestLong} constants. */
    @Test
    public void constants() {
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
    public void randomBetweenLong() {
        final long number = randomBetween(LONG_10, LONG_05);

        assertTrue(number >= LONG_05);
        assertTrue(number <= LONG_10);
    }
}

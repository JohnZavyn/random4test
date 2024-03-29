/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestString.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestString}. */
class TestStringTest {

    /** Test {@link TestString} constants. */
    @Test
    void constants() {
        assertNotEquals(INT_00, STRING_ARRAY.length);
        assertEquals(INT_01, STRING_ARRAY_SINGLE.length);
        assertNotEquals(INT_00, STRING_COLLECTION.size());
        assertEquals(INT_01, STRING_COLLECTION_SINGLE.size());
        assertFalse(STRING_LIST.isEmpty());
        assertEquals(INT_01, STRING_LIST_SINGLE.size());
        assertFalse(STRING_MAP.isEmpty());
        assertEquals(INT_01, STRING_MAP_SINGLE.size());
        assertFalse(STRING_SET.isEmpty());
        assertEquals(INT_01, STRING_SET_SINGLE.size());
    }

}

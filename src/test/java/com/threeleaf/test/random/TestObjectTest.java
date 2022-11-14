/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestObject.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestObject}. */
class TestObjectTest {

    /** Test {@link TestObject} constants. */
    @Test
    void constants() {
        assertNotEquals(INT_00, OBJECT_ARRAY.length);
        assertEquals(INT_01, OBJECT_ARRAY_SINGLE.length);
        assertNotEquals(INT_00, OBJECT_COLLECTION.size());
        assertEquals(INT_01, OBJECT_COLLECTION_SINGLE.size());
        assertFalse(OBJECT_LIST.isEmpty());
        assertEquals(INT_01, OBJECT_LIST_SINGLE.size());
        assertFalse(OBJECT_MAP.isEmpty());
        assertEquals(INT_01, OBJECT_MAP_SINGLE.size());
        assertFalse(OBJECT_SET.isEmpty());
        assertEquals(INT_01, OBJECT_SET_SINGLE.size());
    }
}

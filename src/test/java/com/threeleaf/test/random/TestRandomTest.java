package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestObject.OBJECT;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.management.MemoryNotificationInfo;
import java.lang.reflect.*;
import java.security.KeyPair;

import org.junit.jupiter.api.Test;

/** Test {@link TestRandom}. */
class TestRandomTest {

    /** Test {@link TestRandom} constructor. */
    @Test
    void constructor() throws Exception {
        Constructor<TestRandom> constructor = TestRandom.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestRandom#random(Class, String...)}. */
    @Test
    void random() {
        /* Excludes all fields (interface types can't be initialized). */
        KeyPair keyPair = TestRandom.random(KeyPair.class, "publicKey", "privateKey");

        assertNull(keyPair.getPrivate());
        assertNull(keyPair.getPublic());

        /* Verify single field not initialized */
        MemoryNotificationInfo memoryNotificationInfo =
            TestRandom.random(MemoryNotificationInfo.class, "poolName");
        assertNull(memoryNotificationInfo.getPoolName());
        assertNotEquals(0L, memoryNotificationInfo.getCount());
        assertNotNull(memoryNotificationInfo.getUsage());

        /* Verify that field can be initialized and others excluded. */
        memoryNotificationInfo = TestRandom.random(MemoryNotificationInfo.class, "count", "usage");
        assertNotNull(memoryNotificationInfo.getPoolName());
        assertEquals(0L, memoryNotificationInfo.getCount());
        assertNull(memoryNotificationInfo.getUsage());
    }

    /** Test {@link TestObject#OBJECT}. */
    @Test
    void randomObject() {
        assertNotNull(OBJECT);
    }
}

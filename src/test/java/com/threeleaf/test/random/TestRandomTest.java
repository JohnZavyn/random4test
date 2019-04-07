package com.threeleaf.test.random;

import org.junit.Test;

import java.lang.management.MemoryNotificationInfo;
import java.lang.reflect.*;
import java.security.KeyPair;

import static com.threeleaf.test.random.TestRandom.OBJECT;
import static org.junit.Assert.*;

/** Test {@link TestRandom}. */
public class TestRandomTest
{

    /** Test {@link TestRandom#random(Class, String...)}. */
    @Test
    public void random()
    {
        /* Excludes all fields (interface types can't be initialized). */
        final KeyPair keyPair = TestRandom.random(KeyPair.class, "publicKey", "privateKey");

        assertNull(keyPair.getPrivate());
        assertNull(keyPair.getPublic());

        /* Verify single field not initialized */
        MemoryNotificationInfo memoryNotificationInfo = TestRandom.random(MemoryNotificationInfo.class, "poolName");
        assertNull(memoryNotificationInfo.getPoolName());
        assertNotEquals(0L, memoryNotificationInfo.getCount());
        assertNotNull(memoryNotificationInfo.getUsage());

        /* Verify that field can be initialized and others excluded. */
        memoryNotificationInfo = TestRandom.random(MemoryNotificationInfo.class, "count", "usage");
        assertNotNull(memoryNotificationInfo.getPoolName());
        assertEquals(0L, memoryNotificationInfo.getCount());
        assertNull(memoryNotificationInfo.getUsage());
    }

    /** Test {@link TestRandom#OBJECT}. */
    @Test
    public void randomObject()
    {
        assertNotNull(OBJECT);
    }

    /** Test {@link TestRandom} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestRandom> constructor = TestRandom.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try
        {
            constructor.newInstance();
        }
        catch (Exception e)
        {
            assertTrue(e instanceof InvocationTargetException);
        }
    }
}

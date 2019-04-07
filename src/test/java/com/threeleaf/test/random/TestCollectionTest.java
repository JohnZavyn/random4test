package com.threeleaf.test.random;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestCollection.*;
import static com.threeleaf.test.random.TestPrimitive.INT_00;
import static com.threeleaf.test.random.TestPrimitive.INT_01;
import static org.junit.Assert.*;

/** Test {@link TestCollection}. */
public class TestCollectionTest
{

    /** Test {@link TestCollection} constants. */
    @Test
    public void constants()
    {
        assertNotEquals(INT_00, COLLECTION_INTEGER.size());
        assertNotEquals(INT_00, COLLECTION_LONG.size());
        assertNotEquals(INT_00, COLLECTION_OBJECT.size());
        assertNotEquals(INT_00, COLLECTION_STRING.size());
        assertEquals(INT_01, COLLECTION_INTEGER_SINGLE.size());
        assertEquals(INT_01, COLLECTION_LONG_SINGLE.size());
        assertEquals(INT_01, COLLECTION_OBJECT_SINGLE.size());
        assertEquals(INT_01, COLLECTION_STRING_SINGLE.size());
    }

    /** Test {@link TestCollection} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestCollection> constructor = TestCollection.class.getDeclaredConstructor();
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

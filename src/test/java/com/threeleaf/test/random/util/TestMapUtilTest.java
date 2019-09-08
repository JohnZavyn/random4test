package com.threeleaf.test.random.util;

import org.junit.Test;

import java.lang.reflect.*;
import java.util.*;

import static com.threeleaf.test.random.TestPrimitive.INT_01;
import static com.threeleaf.test.random.TestPrimitive.INT_10;
import static com.threeleaf.test.random.util.TestBooleanUtilTest.LOOP_COUNT_MAX;
import static org.junit.Assert.*;

/** Test {@link TestMapUtil} */
public class TestMapUtilTest
{

    /** Test {@link TestMapUtil#chooseOneKeyFrom(Map)}. */
    @Test
    public void chooseOneKeyFrom()
    {
        final Map<Short, Long> map                   = TestMapUtil.randomMapOf(Short.class, Long.class);
        final Set<Short>       results               = new HashSet<>();
        boolean                allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++)
        {
            results.add(TestMapUtil.chooseOneKeyFrom(map));
            if (results.size() == map.size())
            {
                allPossibilitiesFound = true;
                break;
            }
        }
        if (!allPossibilitiesFound)
        {
            fail("Expected all possible results, but only found " + results);
        }
    }

    /** Test {@link TestMapUtil#chooseOneValueFrom(Map)}. */
    @Test
    public void chooseOneValueFrom()
    {
        final Map<Integer, String> map                   = TestMapUtil.randomMapOf(Integer.class, String.class);
        final Set<String>          results               = new HashSet<>();
        boolean                    allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++)
        {
            results.add(TestMapUtil.chooseOneValueFrom(map));
            if (results.size() == map.size())
            {
                allPossibilitiesFound = true;
                break;
            }
        }
        if (!allPossibilitiesFound)
        {
            fail("Expected all in" + map + ", but only found " + results);
        }
    }

    /** Test {@link TestMapUtil} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestMapUtil> constructor = TestMapUtil.class.getDeclaredConstructor();
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

    /** Test {@link TestMapUtil#randomHashMapOf(Class, Class)}. */
    @Test
    public void randomHashMapOf()
    {
        assertFalse(TestMapUtil.randomHashMapOf(Long.class, String.class).isEmpty());
    }

    /** Test {@link TestMapUtil#randomHashMapSingleOf(Class, Class)}. */
    @Test
    public void randomHashMapSingleOf()
    {
        assertEquals(INT_01, TestMapUtil.randomHashMapSingleOf(Long.class, String.class).size());
    }

    /** Test {@link TestMapUtil#randomLinkedHashMapOf(Class, Class)}. */
    @Test
    public void randomLinkedHashMapOf()
    {
        assertFalse(TestMapUtil.randomLinkedHashMapOf(Long.class, String.class).isEmpty());
    }

    /** Test {@link TestMapUtil#randomLinkedHashMapSingleOf(Class, Class)}. */
    @Test
    public void randomLinkedHashMapSingleOf()
    {
        assertEquals(INT_01, TestMapUtil.randomLinkedHashMapSingleOf(Long.class, String.class).size());
    }

    /** Test {@link TestMapUtil#randomMapOf(Class, Class)}. */
    @Test
    public void randomMapOf()
    {
        for (int counter = 0; counter < INT_10; counter++)
        {
            assertFalse(TestMapUtil.randomMapOf(Integer.class, Double.class).isEmpty());
        }
    }

    /** Test {@link TestMapUtil#randomMapSingleOf(Class, Class)}. */
    @Test
    public void randomMapSingleOf()
    {
        for (int counter = 0; counter < INT_10; counter++)
        {
            assertEquals(INT_01, TestMapUtil.randomMapSingleOf(Integer.class, Double.class).size());
        }
    }

    /** Test {@link TestMapUtil#randomTreeMapOf(Class, Class)}. */
    @Test
    public void randomTreeMapOf()
    {
        assertFalse(TestMapUtil.randomTreeMapOf(Integer.class, Float.class).isEmpty());
        assertFalse(TestMapUtil.randomTreeMapOf(Object.class, Object.class).isEmpty());
    }

    /** Test {@link TestMapUtil#randomTreeMapSingleOf(Class, Class)}. */
    @Test
    public void randomTreeMapSingleOf()
    {
        assertEquals(INT_01, TestMapUtil.randomTreeMapSingleOf(Integer.class, Float.class).size());
    }
}

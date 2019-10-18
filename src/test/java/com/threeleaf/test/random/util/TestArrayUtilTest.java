package com.threeleaf.test.random.util;

import org.junit.Test;

import java.lang.reflect.*;
import java.util.HashSet;
import java.util.Set;

import static com.threeleaf.test.random.TestBooleanTest.LOOP_COUNT_MAX;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestArrayUtil.randomArrayOf;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/** Test {@link TestArrayUtil}. */
public class TestArrayUtilTest
{

    /** Test {@link TestArrayUtil#chooseOneFrom(Object[])}. */
    @Test
    public void chooseOneFrom()
    {
        final Object[]    array                 = new Object[]{STRING_10, STRING_16, STRING_32, STRING_99};
        final Set<String> results               = new HashSet<>();
        boolean           allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++)
        {
            results.add((String) TestArrayUtil.chooseOneFrom(array));
            if (results.size() == array.length)
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

    /** Test {@link TestArrayUtil} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestArrayUtil> constructor = TestArrayUtil.class.getDeclaredConstructor();
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

    /** Test {@link TestArrayUtil#randomArrayOf(Class, String...)}. */
    @Test
    public void testRandomArrayOf()
    {
        String[]  strings  = randomArrayOf(String.class);
        Long[]    longs    = randomArrayOf(Long.class);
        Integer[] integers = randomArrayOf(Integer.class);
        Object[]  objects  = randomArrayOf(Object.class);
        assertTrue(strings.length > 0);
        assertTrue(longs.length > 0);
        assertTrue(integers.length > 0);
        assertTrue(objects.length > 0);
    }
}

package com.threeleaf.test.random.util;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestPrimitive.INT_04;
import static com.threeleaf.test.random.TestString.SPACE;
import static com.threeleaf.test.random.util.TestStringUtil.isBlank;
import static org.junit.Assert.*;

/** Test {@link TestWordUtil}. */
public class TestWordUtilTest
{

    /** Test {@link TestWordUtil} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestWordUtil> constructor = TestWordUtil.class.getDeclaredConstructor();
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

    /** Test {@link TestWordUtil#randomAdjective()}. */
    @Test
    public void randomAdjective()
    {
        assertFalse(isBlank(TestWordUtil.randomAdjective()));
    }

    /** Test {@link TestWordUtil#randomAdverb()}. */
    @Test
    public void randomAdverb()
    {
        assertFalse(isBlank(TestWordUtil.randomAdverb()));
    }

    /** Test {@link TestWordUtil#randomNoun()}. */
    @Test
    public void randomNoun()
    {
        assertFalse(isBlank(TestWordUtil.randomNoun()));
    }

    /** Test {@link TestWordUtil#randomPhrase()}. */
    @Test
    public void randomPhrase()
    {
        assertEquals(INT_04, TestWordUtil.randomPhrase().split(SPACE).length);
    }

    /** Test {@link TestWordUtil#randomVerb()}. */
    @Test
    public void randomVerb()
    {
        assertFalse(isBlank(TestWordUtil.randomVerb()));
    }
}

package com.threeleaf.test.random.util;

import org.junit.Test;

import static com.threeleaf.test.random.TestPrimitive.INT_04;
import static com.threeleaf.test.random.TestString.SPACE;
import static com.threeleaf.test.random.util.TestStringUtil.isBlank;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/** Test {@link TestWordUtil}. */
public class TestWordUtilTest
{

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

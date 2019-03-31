package com.threeleaf.test.random.util;

import org.junit.Test;

import static com.threeleaf.test.random.util.TestNameUtil.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/** Test {@link TestNameUtil}. */
public class TestNameUtilTest
{

    /** Test {@link TestNameUtil#randomName()}. */
    @Test
    public void randomName()
    {
        assertNotNull(TestNameUtil.randomName());
    }

    /** Test {@link TestNameUtil#randomNameFirst()}. */
    @Test
    public void randomNameFirst()
    {
        assertNotNull(TestNameUtil.randomName());
    }

    /** Test {@link TestNameUtil#randomNameFirstMale()}. */
    @Test
    public void randomNameFirstMale()
    {
        assertTrue(NAMES_FIRST_MALE.contains(TestNameUtil.randomNameFirstMale()));
    }

    /** Test {@link TestNameUtil#randomNameFirstFemale()}. */
    @Test
    public void testRandomNameFirstFemale()
    {
        assertTrue(NAMES_FIRST_FEMALE.contains(TestNameUtil.randomNameFirstFemale()));
    }

    /** Test {@link TestNameUtil#randomNameLast()}. */
    @Test
    public void testRandomNameLast()
    {
        assertTrue(NAMES_LAST.contains(TestNameUtil.randomNameLast()));
    }
}

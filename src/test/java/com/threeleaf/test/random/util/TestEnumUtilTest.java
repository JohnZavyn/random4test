package com.threeleaf.test.random.util;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static com.threeleaf.test.random.util.TestBooleanUtilTest.LOOP_COUNT_MAX;
import static org.junit.Assert.fail;

/** Test {@link TestEnumUtil} */
public class TestEnumUtilTest
{

    /** Test {@link TestEnumUtil#chooseOneFrom(Class)}. */
    @Test
    public void chooseOneFrom()
    {
        final Set<TestEnum> results               = new HashSet<>();
        boolean             allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++)
        {
            results.add(TestEnumUtil.chooseOneFrom(TestEnum.class));
            if (results.size() == TestEnum.values().length)
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

    /** An enum for this test. */
    private enum TestEnum
    {FIRST, SECOND, THIRD}
}
package com.threeleaf.test.random.util;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.fail;

/** Test {@link TestBooleanUtil} */
@SuppressWarnings("WeakerAccess")
public class TestBooleanUtilTest
{

    /**
     * The maximum number of times to loop through a test call.
     * Testing randomness is difficult, so we want to have an upper
     * boundary for failure in a loop where we are tying to collect
     * some kind of statistics.
     */
    public static final int LOOP_COUNT_MAX = 100;

    /** Test {@link TestBooleanUtil#coinFlip()}. */
    @Test
    public void coinFlip()
    {
        final Set<Boolean> results               = new HashSet<>();
        boolean            allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++)
        {
            results.add(TestBooleanUtil.coinFlip());
            if (results.size() == 2)
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

    /** Test {@link TestBooleanUtil#oneOutOf(int)}. */
    @Test
    public void oneOutOf()
    {
        final int          number                = 10;
        final Set<Boolean> results               = new HashSet<>();
        boolean            allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++)
        {
            results.add(TestBooleanUtil.oneOutOf(number));
            if (results.size() == 2)
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
}

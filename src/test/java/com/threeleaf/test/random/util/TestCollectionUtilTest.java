package com.threeleaf.test.random.util;

import org.junit.Test;

import java.util.*;

import static com.threeleaf.test.random.TestNumber.INT_10;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestBooleanUtilTest.LOOP_COUNT_MAX;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

/** Test {@link TestCollectionUtil} */
public class TestCollectionUtilTest
{

    /** Test {@link TestCollectionUtil#chooseOneFrom(Collection)}. */
    @Test
    public void chooseOneFrom()
    {
        final List<String> collection            = asList(CHAR_05, CHAR_08, CHAR_10, CHAR_16);
        final Set<String>  results               = new HashSet<>();
        boolean            allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++)
        {
            results.add(TestCollectionUtil.chooseOneFrom(collection));
            if (results.size() == collection.size())
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

    /** Test {@link TestCollectionUtil#chooseOneFrom(Object[])}. */
    @Test
    public void chooseOneFromArray()
    {
        final Object[]    array                 = new Object[]{CHAR_10, CHAR_16, CHAR_32, CHAR_99};
        final Set<String> results               = new HashSet<>();
        boolean           allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++)
        {
            results.add((String) TestCollectionUtil.chooseOneFrom(array));
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

    /** Test {@link TestCollectionUtil#randomCollectionOf(Class, String...)}. */
    @Test
    public void randomCollectionOf()
    {
        for (int counter = 0; counter < INT_10; counter++)
        {
            final Collection<Long> result = TestCollectionUtil.randomCollectionOf(Long.class);

            assertFalse(result.isEmpty());
        }
    }
}

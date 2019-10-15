package com.threeleaf.test.random;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertTrue;

/** Test {@link TestDate}. */
public class TestDateTest
{

    /** Test {@link TestDate#randomFuture()}. */
    @Test
    public void randomFuture()
    {
        assertTrue(TestDate.randomFuture().getTime() > TestDate.TODAY.getTime());
    }

    /** Test {@link TestDate#randomPast()}. */
    @Test
    public void randomPast()
    {
        assertTrue(TestDate.randomPast().getTime() < TestDate.TODAY.getTime());
    }

    /** Test {@link TestDate#randomRecent()}. */
    @Test
    public void randomRecent()
    {
        final Date randomDate = TestDate.randomRecent();

        assertTrue(randomDate.getTime() > TestDate.YEAR_LAST.getTime() - 1);
        assertTrue(randomDate.getTime() < TestDate.YEAR_NEXT.getTime() + 1);
    }
}

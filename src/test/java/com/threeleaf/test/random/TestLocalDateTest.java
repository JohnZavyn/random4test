package com.threeleaf.test.random;

import org.junit.Test;

import java.time.LocalDate;

import static com.threeleaf.test.random.TestLocalDate.TOMORROW;
import static com.threeleaf.test.random.TestLocalDate.YESTERDAY;
import static org.junit.Assert.assertNotNull;

/** Test {@link TestLocalDate}. */
public class TestLocalDateTest
{

    /** Test {@link TestLocalDate#randomBetween(LocalDate, LocalDate)}. */
    @Test
    public void randomBetween()
    {
        assertNotNull(TestLocalDate.randomBetween(YESTERDAY, TOMORROW));
    }

    /** Test {@link TestLocalDate#randomFuture()}. */
    @Test
    public void randomFuture()
    {
        assertNotNull(TestLocalDate.randomFuture());
    }

    /** Test {@link TestLocalDate#randomPast()}. */
    @Test
    public void randomPast()
    {
        assertNotNull(TestLocalDate.randomPast());
    }

    /** Test {@link TestLocalDate#randomRecent()}. */
    @Test
    public void randomRecent()
    {
        assertNotNull(TestLocalDate.randomRecent());
    }
}

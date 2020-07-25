package com.threeleaf.test.random;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

/** Test {@link TestJodaLocalDate}. */
public class TestJodaLocalDateTest {

    /** Test {@link TestJodaLocalDate#randomFuture()}. */
    @Test
    public void randomFuture() {
        assertTrue(TestJodaLocalDate.randomFuture().isAfter(TestJodaLocalDate.TODAY));
    }

    /** Test {@link TestJodaLocalDate#randomPast()}. */
    @Test
    public void randomPast() {
        assertTrue(TestJodaLocalDate.randomPast().isBefore(TestJodaLocalDate.TODAY));
    }

    /** Test {@link TestJodaLocalDate#randomRecent()}. */
    @Test
    public void randomRecent() {
        final LocalDate randomDate = TestJodaLocalDate.randomRecent();

        assertTrue(randomDate.isAfter(TestJodaLocalDate.YEAR_LAST.minusDays(1)));
        assertTrue(randomDate.isBefore(TestJodaLocalDate.YEAR_NEXT.plusDays(1)));
    }
}

package com.threeleaf.test.random;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.joda.time.LocalDateTime;
import org.junit.jupiter.api.Test;

/** Test {@link TestJodaLocalDateTime}. */
public class TestJodaLocalDateTimeTest {

    /** Test {@link TestJodaLocalDateTime#randomFuture()}. */
    @Test
    public void randomFuture() {
        assertTrue(TestJodaLocalDateTime.randomFuture().isAfter(TestJodaLocalDateTime.TODAY));
    }

    /** Test {@link TestJodaLocalDateTime#randomPast()}. */
    @Test
    public void randomPast() {
        assertTrue(TestJodaLocalDateTime.randomPast().isBefore(TestJodaLocalDateTime.TODAY));
    }

    /** Test {@link TestJodaLocalDateTime#randomRecent()}. */
    @Test
    public void randomRecent() {
        final LocalDateTime randomDate = TestJodaLocalDateTime.randomRecent();

        assertTrue(randomDate.isAfter(TestJodaLocalDateTime.YEAR_LAST.minusDays(1)));
        assertTrue(randomDate.isBefore(TestJodaLocalDateTime.YEAR_NEXT.plusDays(1)));
    }
}

package com.threeleaf.test.random;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

/** Test {@link TestLocalDateTime}. */
public class TestLocalDateTimeTest {

    /** Test {@link TestLocalDateTime#randomFuture()}. */
    @Test
    public void randomFuture() {
        assertTrue(TestLocalDateTime.randomFuture().isAfter(TestLocalDateTime.TODAY));
    }

    /** Test {@link TestLocalDateTime#randomPast()}. */
    @Test
    public void randomPast() {
        assertTrue(TestLocalDateTime.randomPast().isBefore(TestLocalDateTime.TODAY));
    }

    /** Test {@link TestLocalDateTime#randomRecent()}. */
    @Test
    public void randomRecent() {
        final LocalDateTime randomDate = TestLocalDateTime.randomRecent();

        assertTrue(randomDate.isAfter(TestLocalDateTime.YEAR_LAST.minusDays(1)));
        assertTrue(randomDate.isBefore(TestLocalDateTime.YEAR_NEXT.plusDays(1)));
    }
}

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestDate.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.apache.commons.validator.routines.DateValidator;
import org.junit.jupiter.api.Test;

/** Test {@link TestDate}. */
class TestDateTest {

    /** The {@link DateValidator}. */
    final DateValidator dateValidator = DateValidator.getInstance();

    /** Test {@link TestDate} constants. */
    @Test
    void constructor() {
        assertNotNull(INSTANCE);
    }

    /** Test {@link TestDate} constants. */
    @Test
    void months() {
        assertEquals(-1, dateValidator.compareMonths(MONTH_LAST, TODAY, TIME_ZONE));
        assertEquals(1, dateValidator.compareMonths(MONTH_NEXT, TODAY, TIME_ZONE));
    }

    /** Test {@link TestDate#randomFuture()}. */
    @Test
    void randomFuture() {
        assertTrue(TestDate.randomFuture().getTime() > TestDate.TODAY.getTime());
    }

    /** Test {@link TestDate#randomPast()}. */
    @Test
    void randomPast() {
        assertTrue(TestDate.randomPast().getTime() < TestDate.TODAY.getTime());
    }

    /** Test {@link TestDate#randomRecent()}. */
    @Test
    void randomRecent() {
        final Date randomDate = TestDate.randomRecent();

        assertTrue(randomDate.getTime() > TestDate.YEAR_LAST.getTime() - 1);
        assertTrue(randomDate.getTime() < TestDate.YEAR_NEXT.getTime() + 1);
    }

    /** Test {@link TestDate} constants. */
    @Test
    void timestamp() {
        assertTrue(TIMESTAMP.contains(String.valueOf(YEAR)));
    }

    /** Test {@link TestDate} constants. */
    @Test
    void weeks() {
        assertEquals(-1, dateValidator.compareWeeks(WEEK_LAST, TODAY, TIME_ZONE));
        assertEquals(1, dateValidator.compareWeeks(WEEK_NEXT, TODAY, TIME_ZONE));
    }

    /** Test {@link TestDate} constants. */
    @Test
    void years() {
        assertEquals(-1, dateValidator.compareYears(YEAR_LAST, TODAY, TIME_ZONE));
        assertEquals(1, dateValidator.compareYears(YEAR_NEXT, TODAY, TIME_ZONE));
    }
}

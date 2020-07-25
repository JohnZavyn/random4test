package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestLong.L_01;
import static com.threeleaf.test.random.util.TestDateUtil.toDate;
import static com.threeleaf.test.random.util.TestDateUtil.toLocalDateTime;
import static java.time.LocalDateTime.now;

import java.time.LocalDateTime;
import java.util.TimeZone;

/** Utilities for random {@link LocalDateTime} creation. */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestLocalDateTime extends AbstractTest<LocalDateTime> {

    /** The day of the month. */
    public static final int DAY = TestLocalDate.DAY;

    /** The instance of {@link TestLocalDateTime}. */
    public static final TestLocalDateTime INSTANCE = new TestLocalDateTime();

    /** The current month number. */
    public static final int MONTH = TestLocalDate.MONTH;

    /** Date from last month. */
    public static final LocalDateTime MONTH_LAST = now().minusMonths(L_01);

    /** Date for next month. */
    public static final LocalDateTime MONTH_NEXT = now().plusMonths(L_01);

    /**
     * The time zone
     */
    public static final TimeZone TIME_ZONE = TestLocalDate.TIME_ZONE;

    /** Today's date. */
    public static final LocalDateTime TODAY = now();

    /** Tomorrow's date. */
    public static final LocalDateTime TOMORROW = now().plusDays(L_01);

    /** The week number. */
    public static final int WEEK = TestLocalDate.WEEK;

    /** Date from last week. */
    public static final LocalDateTime WEEK_LAST = now().minusWeeks(L_01);

    /** Date for next week. */
    public static final LocalDateTime WEEK_NEXT = now().plusWeeks(L_01);

    /** The current year. */
    public static final int YEAR = TestLocalDate.YEAR;

    /** Date from last year. */
    public static final LocalDateTime YEAR_LAST = now().minusYears(L_01);

    /** Date for next year. */
    public static final LocalDateTime YEAR_NEXT = now().plusYears(L_01);

    /** Yesterday's date. */
    public static final LocalDateTime YESTERDAY = now().minusDays(L_01);

    /** Instantiate a utility to produce randomized Java {@link LocalDateTime} objects. */
    public TestLocalDateTime() {
        super(LocalDateTime.class);
    }

    /**
     * Get a random {@link LocalDateTime} between the two given dates.
     *
     * @param date1 the first date
     * @param date2 the second date
     *
     * @return a date in between
     */
    public static LocalDateTime randomBetween(final LocalDateTime date1,
            final LocalDateTime date2) {
        return toLocalDateTime(TestDate.randomBetween(toDate(date1), toDate(date2)));
    }

    /**
     * Get a random {@link LocalDateTime} somewhere between tomorrow and next year.
     *
     * @return the date
     */
    public static LocalDateTime randomFuture() {
        return randomBetween(TOMORROW, YEAR_NEXT);
    }

    /**
     * Get a random {@link LocalDateTime} somewhere between last year and yesterday.
     *
     * @return the date
     */
    public static LocalDateTime randomPast() {
        return randomBetween(YESTERDAY, YEAR_LAST);
    }

    /**
     * Get a random {@link LocalDateTime} somewhere between last year and next year.
     *
     * @return the date
     */
    public static LocalDateTime randomRecent() {
        return randomBetween(YEAR_LAST, YEAR_NEXT);
    }
}

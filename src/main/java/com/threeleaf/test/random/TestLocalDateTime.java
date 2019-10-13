package com.threeleaf.test.random;

import java.time.LocalDateTime;
import java.util.TimeZone;

import static com.threeleaf.test.random.TestLong.L_01;
import static com.threeleaf.test.random.util.TestDateUtil.toDate;
import static com.threeleaf.test.random.util.TestDateUtil.toLocalDateTime;
import static java.time.LocalDateTime.now;

/** Utilities for random {@link LocalDateTime} creation */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestLocalDateTime extends AbstractTest<LocalDateTime>
{

    /** The day of the month. */
    public final static int DAY = TestLocalDate.DAY;

    /** The instance of {@link TestLocalDateTime}. */
    public static final TestLocalDateTime INSTANCE = new TestLocalDateTime();

    /** The current month number. */
    public final static int MONTH = TestLocalDate.MONTH;

    /** Date from last month. */
    public final static LocalDateTime MONTH_LAST = now().minusMonths(L_01);

    /** Date for next month. */
    public final static LocalDateTime MONTH_NEXT = now().plusMonths(L_01);

    /** The time zone */
    public static final TimeZone TIME_ZONE = TestLocalDate.TIME_ZONE;

    /** Today's date. */
    public final static LocalDateTime TODAY = now();

    /** Tomorrow's date. */
    public final static LocalDateTime TOMORROW = now().plusDays(L_01);

    /** The week number. */
    public final static int WEEK = TestLocalDate.WEEK;

    /** Date from last week. */
    public final static LocalDateTime WEEK_LAST = now().minusWeeks(L_01);

    /** Date for next week. */
    public final static LocalDateTime WEEK_NEXT = now().plusWeeks(L_01);

    /** The current year. */
    public final static int YEAR = TestLocalDate.YEAR;

    /** Date from last year. */
    public final static LocalDateTime YEAR_LAST = now().minusYears(L_01);

    /** Date for next year. */
    public final static LocalDateTime YEAR_NEXT = now().plusYears(L_01);

    /** Yesterday's date. */
    public final static LocalDateTime YESTERDAY = now().minusDays(L_01);

    /** Instantiate a utility to produce randomized Java {@link LocalDateTime} objects. */
    public TestLocalDateTime()
    {
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
    public static LocalDateTime randomBetween(final LocalDateTime date1, final LocalDateTime date2)
    {
        return toLocalDateTime(TestDate.randomBetween(toDate(date1), toDate(date2)));
    }

    /**
     * Get a random {@link LocalDateTime} somewhere between tomorrow and next year.
     *
     * @return the date
     */
    public static LocalDateTime randomFuture()
    {
        return randomBetween(TOMORROW, YEAR_NEXT);
    }

    /**
     * Get a random {@link LocalDateTime} somewhere between last year and yesterday.
     *
     * @return the date
     */
    public static LocalDateTime randomPast()
    {
        return randomBetween(YESTERDAY, YEAR_LAST);
    }

    /**
     * Get a random {@link LocalDateTime} somewhere between last year and next year.
     *
     * @return the date
     */
    public static LocalDateTime randomRecent()
    {
        return randomBetween(YEAR_LAST, YEAR_NEXT);
    }
}

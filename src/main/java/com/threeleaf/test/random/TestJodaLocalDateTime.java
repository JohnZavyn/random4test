package com.threeleaf.test.random;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

import static com.threeleaf.test.random.TestInteger.INT_01;
import static org.joda.time.LocalDateTime.now;

/** Utilities for random {@link LocalDateTime} creation */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestJodaLocalDateTime extends AbstractTest<LocalDateTime>
{

    /** The day of the month. */
    public final static int DAY = TestLocalDate.DAY;

    /** The instance of {@link TestJodaLocalDateTime}. */
    public static final TestJodaLocalDateTime INSTANCE = new TestJodaLocalDateTime();

    /** The current month number. */
    public final static int MONTH = TestLocalDate.MONTH;

    /** Date from last month. */
    public final static LocalDateTime MONTH_LAST = now().minusMonths(INT_01);

    /** Date for next month. */
    public final static LocalDateTime MONTH_NEXT = now().plusMonths(INT_01);

    /** The time zone */
    public static final DateTimeZone TIME_ZONE = TestJodaLocalDate.TIME_ZONE;

    /** Today's date. */
    public final static LocalDateTime TODAY = now();

    /** Tomorrow's date. */
    public final static LocalDateTime TOMORROW = now().plusDays(INT_01);

    /** The week number. */
    public final static int WEEK = TestLocalDate.WEEK;

    /** Date from last week. */
    public final static LocalDateTime WEEK_LAST = now().minusWeeks(INT_01);

    /** Date for next week. */
    public final static LocalDateTime WEEK_NEXT = now().plusWeeks(INT_01);

    /** The current year. */
    public final static int YEAR = TestLocalDate.YEAR;

    /** Date from last year. */
    public final static LocalDateTime YEAR_LAST = now().minusYears(INT_01);

    /** Date for next year. */
    public final static LocalDateTime YEAR_NEXT = now().plusYears(INT_01);

    /** Yesterday's date. */
    public final static LocalDateTime YESTERDAY = now().minusDays(INT_01);

    /** Instantiate a utility to produce randomized objects of the given type. */
    public TestJodaLocalDateTime()
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
        return new LocalDateTime(TestDate.randomBetween(date1.toDate(), date2.toDate()));
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
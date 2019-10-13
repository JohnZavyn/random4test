package com.threeleaf.test.random;

import java.util.Date;
import java.util.TimeZone;

import static com.threeleaf.test.random.util.TestDateUtil.getTimestamp;

/** Date constants to be used in JUnit tests. */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestDate extends AbstractTest<Date>
{

    /** The instance of {@link TestDate}. */
    public static final TestDate INSTANCE = new TestDate();

    /** Date from last month. */
    public static final Date MONTH_LAST = new Date(TestLocalDate.MONTH_LAST.toEpochDay());

    /** Date for next month. */
    public static final Date MONTH_NEXT = new Date(TestLocalDate.MONTH_NEXT.toEpochDay());

    /** Timestamp */
    public static final String TIMESTAMP = getTimestamp();

    /** The time zone */
    public static final TimeZone TIME_ZONE = TimeZone.getDefault();

    /** Today's date. */
    public static final Date TODAY = new Date(TestLocalDate.TODAY.toEpochDay());

    /** Tomorrow's date. */
    public static final Date TOMORROW = new Date(TestLocalDate.TOMORROW.toEpochDay());

    /** Date from last week. */
    public static final Date WEEK_LAST = new Date(TestLocalDate.WEEK_LAST.toEpochDay());

    /** Date for next week. */
    public static final Date WEEK_NEXT = new Date(TestLocalDate.WEEK_NEXT.toEpochDay());

    /** The current year. */
    public static final int YEAR = TestLocalDate.YEAR;

    /** Date from last year. */
    public static final Date YEAR_LAST = new Date(TestLocalDate.YEAR_LAST.toEpochDay());

    /** Date for next year. */
    public static final Date YEAR_NEXT = new Date(TestLocalDate.YEAR_NEXT.toEpochDay());

    /** Yesterday's date. */
    public static final Date YESTERDAY = new Date(TestLocalDate.YESTERDAY.toEpochDay());

    /** Instantiate a utility to produce randomized objects of the given type. */
    public TestDate()
    {
        super(Date.class);
    }

    /**
     * Get a random {@link Date} between the two given dates (includes time).
     *
     * @param date1 the first date
     * @param date2 the second date
     *
     * @return a date in between
     */
    public static Date randomBetween(final Date date1, final Date date2)
    {
        return new Date(TestLong.randomBetween(date1.getTime(), date2.getTime()));
    }

    /**
     * Get a random {@link Date} somewhere between tomorrow and next year.
     *
     * @return the date
     */
    public static Date randomFuture()
    {
        return randomBetween(TOMORROW, YEAR_NEXT);
    }

    /**
     * Get a random {@link Date} somewhere between last year and yesterday.
     *
     * @return the date
     */
    public static Date randomPast()
    {
        return randomBetween(YESTERDAY, YEAR_LAST);
    }

    /**
     * Get a random {@link Date} somewhere between last year and next year.
     *
     * @return the date
     */
    public static Date randomRecent()
    {
        return randomBetween(YEAR_LAST, YEAR_NEXT);
    }
}

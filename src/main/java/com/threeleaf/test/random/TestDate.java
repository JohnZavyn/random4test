package com.threeleaf.test.random;

import static com.threeleaf.test.random.util.TestDateUtil.getTimestamp;
import static com.threeleaf.test.random.util.TestDateUtil.toDate;

import java.util.Date;
import java.util.TimeZone;

/** Date constants to be used in JUnit tests. */
@SuppressWarnings({"WeakerAccess", "unused", "squid:S2386" /* Dates are mutable */})
public class TestDate extends AbstractTest<Date> {

    /** The instance of {@link TestDate}. */
    public static final TestDate INSTANCE = new TestDate();

    /** Date from last month. */
    public static final Date MONTH_LAST = toDate(TestLocalDate.MONTH_LAST);

    /** Date for next month. */
    public static final Date MONTH_NEXT = toDate(TestLocalDate.MONTH_NEXT);

    /** Timestamp. */
    public static final String TIMESTAMP = getTimestamp();

    /** The time zone. */
    public static final TimeZone TIME_ZONE = TimeZone.getDefault();

    /** Today's date. */
    public static final Date TODAY = toDate(TestLocalDate.TODAY);

    /** Tomorrow's date. */
    public static final Date TOMORROW = toDate(TestLocalDate.TOMORROW);

    /** Date from last week. */
    public static final Date WEEK_LAST = toDate(TestLocalDate.WEEK_LAST);

    /** Date for next week. */
    public static final Date WEEK_NEXT = toDate(TestLocalDate.WEEK_NEXT);

    /** The current year. */
    public static final int YEAR = TestLocalDate.YEAR;

    /** Date from last year. */
    public static final Date YEAR_LAST = toDate(TestLocalDate.YEAR_LAST);

    /** Date for next year. */
    public static final Date YEAR_NEXT = toDate(TestLocalDate.YEAR_NEXT);

    /** Yesterday's date. */
    public static final Date YESTERDAY = toDate(TestLocalDate.YESTERDAY);

    /** Instantiate a utility to produce randomized objects of the given type. */
    public TestDate() {
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
    public static Date randomBetween(Date date1, Date date2) {
        return new Date(TestLong.randomBetween(date1.getTime(), date2.getTime()));
    }

    /**
     * Get a random {@link Date} somewhere between tomorrow and next year.
     *
     * @return the date
     */
    public static Date randomFuture() {
        return randomBetween(TOMORROW, YEAR_NEXT);
    }

    /**
     * Get a random {@link Date} somewhere between last year and yesterday.
     *
     * @return the date
     */
    public static Date randomPast() {
        return randomBetween(YESTERDAY, YEAR_LAST);
    }

    /**
     * Get a random {@link Date} somewhere between last year and next year.
     *
     * @return the date
     */
    public static Date randomRecent() {
        return randomBetween(YEAR_LAST, YEAR_NEXT);
    }
}

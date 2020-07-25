package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestInteger.INT_01;
import static org.joda.time.LocalDate.now;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

/** Utilities for random {@link LocalDate} creation. */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestJodaLocalDate extends AbstractTest<LocalDate> {

    /** The day of the month. */
    public final static int DAY = TestLocalDate.DAY;

    /** The instance of {@link TestJodaLocalDate}. */
    public static final TestJodaLocalDate INSTANCE = new TestJodaLocalDate();

    /** The current month number. */
    public final static int MONTH = TestLocalDate.MONTH;

    /** Date from last month. */
    public final static LocalDate MONTH_LAST = now().minusMonths(INT_01);

    /** Date for next month. */
    public final static LocalDate MONTH_NEXT = now().plusMonths(INT_01);

    /**
     * The time zone
     */
    public static final DateTimeZone TIME_ZONE = DateTimeZone.getDefault();

    /** Today's date. */
    public final static LocalDate TODAY = now();

    /** Tomorrow's date. */
    public final static LocalDate TOMORROW = now().plusDays(INT_01);

    /** The week number. */
    public final static int WEEK = TestLocalDate.WEEK;

    /** Date from last week. */
    public final static LocalDate WEEK_LAST = now().minusWeeks(INT_01);

    /** Date for next week. */
    public final static LocalDate WEEK_NEXT = now().plusWeeks(INT_01);

    /** The current year. */
    public final static int YEAR = TestLocalDate.YEAR;

    /** Date from last year. */
    public final static LocalDate YEAR_LAST = now().minusYears(INT_01);

    /** Date for next year. */
    public final static LocalDate YEAR_NEXT = now().plusYears(INT_01);

    /** Yesterday's date. */
    public final static LocalDate YESTERDAY = now().minusDays(INT_01);

    /** Instantiate a utility to produce randomized objects of the given type. */
    public TestJodaLocalDate() {
        super(LocalDate.class);
    }

    /**
     * Get a random {@link LocalDate} between the two given dates.
     *
     * @param date1 the first date
     * @param date2 the second date
     *
     * @return a date in between
     */
    public static LocalDate randomBetween(final LocalDate date1, final LocalDate date2) {
        return new LocalDate(TestDate.randomBetween(date1.toDate(), date2.toDate()));
    }

    /**
     * Get a random {@link LocalDate} somewhere between tomorrow and next year.
     *
     * @return the date
     */
    public static LocalDate randomFuture() {
        return randomBetween(TOMORROW, YEAR_NEXT);
    }

    /**
     * Get a random {@link LocalDate} somewhere between last year and yesterday.
     *
     * @return the date
     */
    public static LocalDate randomPast() {
        return randomBetween(YESTERDAY, YEAR_LAST);
    }

    /**
     * Get a random {@link LocalDate} somewhere between last year and next year.
     *
     * @return the date
     */
    public static LocalDate randomRecent() {
        return randomBetween(YEAR_LAST, YEAR_NEXT);
    }
}

/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestLong.L_01;
import static com.threeleaf.test.random.util.TestDateUtil.toDate;
import static com.threeleaf.test.random.util.TestDateUtil.toLocalDate;
import static java.time.LocalDate.now;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.TimeZone;

/** Utilities for random {@link LocalDate} creation. */
@SuppressWarnings({"WeakerAccess", "unused", "RedundantSuppression"})
public class TestLocalDate extends AbstractRandom<LocalDate> {

    /** The day of the month. */
    public static final int DAY = now().getDayOfMonth();

    /** The instance of {@link TestLocalDate}. */
    public static final TestLocalDate INSTANCE = new TestLocalDate();

    /** The current month number. */
    public static final int MONTH = now().getMonthValue();

    /** Date from last month. */
    public static final LocalDate MONTH_LAST = now().minusMonths(L_01);

    /** Date for next month. */
    public static final LocalDate MONTH_NEXT = now().plusMonths(L_01);

    /**
     * The time zone.
     */
    public static final TimeZone TIME_ZONE = TimeZone.getDefault();

    /** Today's date. */
    public static final LocalDate TODAY = now();

    /** Tomorrow's date. */
    public static final LocalDate TOMORROW = now().plusDays(L_01);

    /** The week number. */
    public static final int WEEK = now().get(WeekFields.SUNDAY_START.weekOfWeekBasedYear());

    /** Date from last week. */
    public static final LocalDate WEEK_LAST = now().minusWeeks(L_01);

    /** Date for next week. */
    public static final LocalDate WEEK_NEXT = now().plusWeeks(L_01);

    /** The current year. */
    public static final int YEAR = now().getYear();

    /** Date from last year. */
    public static final LocalDate YEAR_LAST = now().minusYears(L_01);

    /** Date for next year. */
    public static final LocalDate YEAR_NEXT = now().plusYears(L_01);

    /** Yesterday's date. */
    public static final LocalDate YESTERDAY = now().minusDays(L_01);

    /** Instantiate a utility to produce randomized Java {@link LocalDate} objects. */
    public TestLocalDate() {
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
        return toLocalDate(TestDate.randomBetween(toDate(date1), toDate(date2)));
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

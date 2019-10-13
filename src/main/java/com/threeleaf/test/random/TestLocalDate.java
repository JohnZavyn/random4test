package com.threeleaf.test.random;

import java.time.LocalDate;
import java.time.temporal.WeekFields;

import static com.threeleaf.test.random.TestLong.L_01;
import static java.time.LocalDate.now;
import static java.time.LocalDate.ofEpochDay;

/** Utilities for random {@link LocalDate} creation */
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestLocalDate extends AbstractTestUtil<LocalDate>
{

    public final static int DAY = now().getDayOfMonth();

    /** The instance of {@link TestLocalDate}. */
    public static final TestLocalDate INSTANCE = new TestLocalDate();

    public final static int MONTH = now().getMonthValue();

    public final static LocalDate MONTH_LAST = now().plusMonths(L_01);

    public final static LocalDate MONTH_NEXT = now().minusMonths(L_01);

    public final static LocalDate NOW = now();

    public final static LocalDate TODAY = now();

    public final static LocalDate TOMORROW = now().plusDays(L_01);

    public final static int WEEK = now().get(WeekFields.SUNDAY_START.weekOfWeekBasedYear());

    public final static LocalDate WEEK_LAST = now().plusWeeks(L_01);

    public final static LocalDate WEEK_NEXT = now().minusWeeks(L_01);

    public final static int YEAR = now().getYear();

    public final static LocalDate YEAR_LAST = now().plusYears(L_01);

    public final static LocalDate YEAR_NEXT = now().minusYears(L_01);

    public final static LocalDate YESTERDAY = now().minusDays(L_01);

    /** Instantiate a utility to produce randomized Java {@link LocalDate} objects. */
    public TestLocalDate()
    {
        super(LocalDate.class);
    }

    public static LocalDate randomBetween(final LocalDate date1, final LocalDate date2)
    {
        return ofEpochDay(TestLong.randomBetween(date1.toEpochDay(), date2.toEpochDay()));
    }

    /**
     * Get a random {@link LocalDate} somewhere between tomorrow and next year.
     *
     * @return the date
     */
    public static LocalDate randomFuture()
    {
        return randomBetween(TOMORROW, YEAR_NEXT);
    }

    /**
     * Get a random {@link LocalDate} somewhere between last year and yesterday.
     *
     * @return the date
     */
    public static LocalDate randomPast()
    {
        return randomBetween(YESTERDAY, YEAR_LAST);
    }

    /**
     * Get a random {@link LocalDate} somewhere between last year and next year.
     *
     * @return the date
     */
    public static LocalDate randomRecent()
    {
        return randomBetween(YEAR_LAST, YEAR_NEXT);
    }
}

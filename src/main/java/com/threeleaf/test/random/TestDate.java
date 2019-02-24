package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;
import java.util.Locale;

/** Date constants to be used in JUnit tests. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public final class TestDate
{

    /** Joda date-time object. */
    public static final DateTime DATE_TIME = new DateTime();

    /** Yesterday's date. */
    public static final Date LAST_MONTH = DATE_TIME.minusMonths(1).toDate();

    /** Date from last week. */
    public static final Date LAST_WEEK = DATE_TIME.minusWeeks(1).toDate();

    /** Date format to use at top of page. */
    public static final DateTimeFormatter LONGER_DATE_FORMAT = DateTimeFormat.forPattern("MMM d, yyyy");

    /** The current date. */
    public static final Date NOW = DATE_TIME.toDate();

    /** Tomorrow's date. */
    public static final Date TOMORROW = DATE_TIME.plusDays(1).toDate();

    /** The current year. */
    public static final int YEAR = DATE_TIME.getYear();

    /** Yesterday's date. */
    public static final Date YESTERDAY = DATE_TIME.minusDays(1).toDate();


    /**
     * Gets the long date now string.
     *
     * @return the long date now string
     */
    public static String getLongDateNowString()
    {
        return LONGER_DATE_FORMAT.print(DATE_TIME);
    }

    /**
     * Gets the short date now string.
     *
     * @return the short date now string
     */
    public static String getShortDateNowString()
    {
        return getShortDateNowString(NOW);
    }

    /**
     * Gets the short date now string.
     *
     * @param date the date
     *
     * @return the short date now string
     */
    public static String getShortDateNowString(final Date date)
    {
        return new DateTime(date).toString(DateTimeFormat.patternForStyle("S-", Locale.US));
    }
}

package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

import static com.threeleaf.test.random.util.TestDateUtil.getDateTime;
import static com.threeleaf.test.random.util.TestDateUtil.getTimestamp;
import static java.util.Locale.US;
import static org.joda.time.format.DateTimeFormat.forPattern;

/** Date constants to be used in JUnit tests. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestDate
{

    /** The timestamp format string. */
    public static final String TIMESTAMP_FORMAT = "yyyyMMddHHmmssSSS";

    /** Timestamp format including milliseconds. */
    public static final DateTimeFormatter TIMESTAMP_FORMATTER = forPattern(TIMESTAMP_FORMAT).withLocale(US);

    /** The time zone */
    public static final DateTimeZone TIME_ZONE = DateTimeZone.forID("America/New_York");

    /** Joda date-time object. */
    public static final DateTime DATE_TIME = getDateTime();

    /** Date from last month. */
    public static final Date MONTH_LAST = getDateTime().minusMonths(1).toDate();

    /** Date for next month. */
    public static final Date MONTH_NEXT = getDateTime().plusMonths(1).toDate();

    /** Timestamp */
    public static final String TIMESTAMP = getTimestamp();

    /** Today's date. */
    public static final Date TODAY = DATE_TIME.toDate();

    /** Tomorrow's date. */
    public static final Date TOMORROW = DATE_TIME.plusDays(1).toDate();

    /** Date from last week. */
    public static final Date WEEK_LAST = getDateTime().minusWeeks(1).toDate();

    /** Date for next week. */
    public static final Date WEEK_NEXT = getDateTime().plusWeeks(1).toDate();

    /** The current year. */
    public static final int YEAR = DATE_TIME.getYear();

    /** Yesterday's date. */
    public static final Date YESTERDAY = DATE_TIME.minusDays(1).toDate();
}

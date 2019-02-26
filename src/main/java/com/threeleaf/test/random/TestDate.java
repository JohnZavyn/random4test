package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

import static com.threeleaf.test.random.util.TestDateUtil.getDateTime;
import static com.threeleaf.test.random.util.TestDateUtil.getTimestamp;
import static java.util.Locale.US;
import static org.joda.time.format.DateTimeFormat.forPattern;

/** Date constants to be used in JUnit tests. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestDate
{

    /** Joda date-time object. */
    public static final DateTime DATE_TIME = getDateTime();

    /** Date from last month. */
    public static final Date LAST_MONTH = DATE_TIME.minusMonths(1).toDate();

    /** Date from last week. */
    public static final Date LAST_WEEK = DATE_TIME.minusWeeks(1).toDate();

    /** Date for next month. */
    public static final Date NEXT_MONTH = DATE_TIME.plusMonths(1).toDate();

    /** Date for next week. */
    public static final Date NEXT_WEEK = DATE_TIME.plusWeeks(1).toDate();

    /** Timestamp format including milliseconds. */
    public static final DateTimeFormatter TIMESTAMP_FORMAT = forPattern("yyyyMMddHHmmssSSS").withLocale(US);

    /** Timestamp */
    public static final String TIMESTAMP = getTimestamp();

    /** Today's date. */
    public static final Date TODAY = DATE_TIME.toDate();

    /** Tomorrow's date. */
    public static final Date TOMORROW = DATE_TIME.plusDays(1).toDate();

    /** The current year. */
    public static final int YEAR = DATE_TIME.getYear();

    /** Yesterday's date. */
    public static final Date YESTERDAY = DATE_TIME.minusDays(1).toDate();
}

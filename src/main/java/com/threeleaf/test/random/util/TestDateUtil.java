package com.threeleaf.test.random.util;

import lombok.experimental.UtilityClass;
import org.joda.time.*;

import java.util.Date;

import static com.threeleaf.test.random.TestDate.TIMESTAMP_FORMATTER;

/** Date and time utilities. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestDateUtil
{

    /**
     * Get the current DateTime object.
     *
     * @return the DateTime
     */
    public static DateTime getDateTime()
    {
        return getLocalDateTime().toDateTime();
    }

    /**
     * Get the current LocalDate object.
     *
     * @return the LocalDate
     */
    public static LocalDate getLocalDate()
    {
        return new LocalDate();
    }

    /**
     * Get the LocalDateTime object.
     *
     * @return the LocalDateTime
     */
    public static LocalDateTime getLocalDateTime()
    {
        return new LocalDateTime();
    }

    /**
     * Get the current timestamp, including milliseconds.
     *
     * @return the timestamp
     */
    public static String getTimestamp()
    {
        return getLocalDateTime().toString(TIMESTAMP_FORMATTER);
    }

    /**
     * Get a random {@link Date} between the two given dates (includes time).
     *
     * @param date1 the first date
     * @param date2 the second date
     *
     * @return a date in between
     */
    public Date randomBetween(final Date date1, final Date date2)
    {
        return new Date(TestNumberUtil.randomBetween(date1.getTime(), date2.getTime()));
    }

    /**
     * Get a random LocalDateTime from a range.
     *
     * @param date1 one date and time
     * @param date2 another date and time
     *
     * @return a date time in between
     */
    public LocalDateTime randomBetween(final LocalDateTime date1, final LocalDateTime date2)
    {
        return LocalDateTime.fromDateFields(randomBetween(date1.toDate(), date2.toDate()));
    }

    /**
     * Get a random LocalDate from a range.
     *
     * @param date1 one date
     * @param date2 another date
     *
     * @return a date  in between
     */
    public LocalDate randomBetween(final LocalDate date1, final LocalDate date2)
    {
        return LocalDate.fromDateFields(randomBetween(date1.toDate(), date2.toDate()));
    }
}

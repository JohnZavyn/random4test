package com.threeleaf.test.random.util;

import lombok.experimental.UtilityClass;
import org.joda.time.format.DateTimeFormatter;

import java.time.*;
import java.util.Date;

import static java.util.Locale.US;
import static org.joda.time.LocalDateTime.now;
import static org.joda.time.format.DateTimeFormat.forPattern;

/** Date and time utilities. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestDateUtil
{

    /** The timestamp format string. */
    public static final String TIMESTAMP_FORMAT = "yyyyMMddHHmmssSSS";

    /** Timestamp format including milliseconds. */
    public static final DateTimeFormatter TIMESTAMP_FORMATTER = forPattern(TIMESTAMP_FORMAT).withLocale(US);

    /**
     * Get the current timestamp, including milliseconds.
     *
     * @return the timestamp
     */
    public static String getTimestamp()
    {
        return now().toString(TIMESTAMP_FORMATTER);
    }

    /**
     * Convert  {@link LocalDate} to {@link Date}.
     *
     * @param localDate the {@link LocalDate}
     *
     * @return the {@link Date}
     */
    public static Date toDate(LocalDate localDate)
    {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Convert  {@link LocalDateTime} to {@link Date}.
     *
     * @param localDateTime the {@link LocalDateTime}
     *
     * @return the {@link Date}
     */
    public static Date toDate(LocalDateTime localDateTime)
    {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Convert {@link Date} to {@link LocalDate}.
     *
     * @param date the {@link Date}
     *
     * @return the {@link LocalDate}
     */
    public static LocalDate toLocalDate(Date date)
    {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * Convert {@link Date} to {@link LocalDateTime}.
     *
     * @param date the {@link Date}
     *
     * @return the {@link LocalDateTime}
     */
    public static LocalDateTime toLocalDateTime(Date date)
    {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}

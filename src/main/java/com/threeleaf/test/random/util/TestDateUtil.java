/*
 * Copyright 2019-2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.SECONDS;
import static java.util.Locale.US;
import static lombok.AccessLevel.PRIVATE;
import static org.joda.time.LocalDateTime.now;
import static org.joda.time.format.DateTimeFormat.forPattern;

import java.time.*;
import java.time.temporal.Temporal;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Date;

import lombok.NoArgsConstructor;
import org.joda.time.format.DateTimeFormatter;

/** Date and time utilities. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings({"WeakerAccess", "PMD.FinalFieldCouldBeStatic"})
public final class TestDateUtil {

    /** The average number of days per year, based on the Gregorian calendar. */
    public static final double DAYS_PER_YEAR = 365.2425D;

    /** The average number of seconds per year, based on the Gregorian calendar. */
    public static final long SECONDS_PER_YEAR = 31556952L;

    /** The timestamp format string. */
    public static final String TIMESTAMP_FORMAT = "yyyyMMddHHmmssSSS";

    /** Timestamp format including milliseconds. */
    public static final DateTimeFormatter TIMESTAMP_FORMATTER =
        forPattern(TIMESTAMP_FORMAT).withLocale(US);

    /**
     * Add the number of years to the provided date time.
     *
     * @param time  the starting date time
     * @param years the years to add (can be negative)
     *
     * @return the updated date time
     */
    public static Temporal addFractionalYears(final Temporal time, final double years) {
        Temporal updatedTime;
        try {
            updatedTime = time.plus((long) years * SECONDS_PER_YEAR, SECONDS);
        } catch (final UnsupportedTemporalTypeException e) {
            updatedTime = time.plus((long) (years * DAYS_PER_YEAR), DAYS);
        }

        return updatedTime;
    }

    /**
     * Get the current timestamp, including milliseconds.
     *
     * @return the timestamp
     */
    public static String getTimestamp() {
        return now().toString(TIMESTAMP_FORMATTER);
    }

    /**
     * Convert  {@link LocalDateTime} to {@link Date}.
     *
     * @param localDateTime the {@link LocalDateTime}
     *
     * @return the {@link Date}
     */
    public static Date toDate(final LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Convert  {@link LocalDate} to {@link Date}.
     *
     * @param localDate the {@link LocalDate}
     *
     * @return the {@link Date}
     */
    public static Date toDate(final LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Convert {@link Date} to {@link LocalDate}.
     *
     * @param date the {@link Date}
     *
     * @return the {@link LocalDate}
     */
    public static LocalDate toLocalDate(final Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * Convert {@link Date} to {@link LocalDateTime}.
     *
     * @param date the {@link Date}
     *
     * @return the {@link LocalDateTime}
     */
    public static LocalDateTime toLocalDateTime(final Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault())
            .toLocalDateTime();
    }

    /**
     * Calculate the fractional number of years (age) between two dates. Calculation is based on the
     * average number of seconds per year.
     *
     * @param time1 the initial date time
     * @param time2 the final date time
     *
     * @return positive value if time1 &lt; time2 (years accumulated after date1)
     */
    public static double yearsBetweenFractional(final Temporal time1, final Temporal time2) {
        double years;
        try {
            years = (double) SECONDS.between(time1, time2) / SECONDS_PER_YEAR;
        } catch (final UnsupportedTemporalTypeException e) {
            years = DAYS.between(time1, time2) / DAYS_PER_YEAR;
        }

        return years;
    }
}

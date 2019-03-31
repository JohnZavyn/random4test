package com.threeleaf.test.random.util;

import lombok.experimental.UtilityClass;
import org.joda.time.DateTime;

import static com.threeleaf.test.random.TestDate.TIMESTAMP_FORMATTER;
import static com.threeleaf.test.random.TestDate.TIME_ZONE;

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
        return new DateTime(TIME_ZONE);
    }

    /**
     * Get the current timestamp, including milliseconds.
     *
     * @return the timestamp
     */
    public static String getTimestamp()
    {
        return getDateTime().toString(TIMESTAMP_FORMATTER);
    }
}

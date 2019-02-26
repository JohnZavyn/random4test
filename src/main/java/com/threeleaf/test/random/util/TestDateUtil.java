package com.threeleaf.test.random.util;

import lombok.experimental.UtilityClass;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import static com.threeleaf.test.random.TestDate.TIMESTAMP_FORMAT;

/** Date and time utilities. */
@UtilityClass
@SuppressWarnings({"WeakerAccess"})
public class TestDateUtil
{

    /**
     * Get the current DateTime object.
     *
     * @return the DateTime
     */
    public DateTime getDateTime()
    {
        return new DateTime(DateTimeZone.forID("America/New_York"));
    }

    /**
     * Get the current timestamp, including milliseconds.
     *
     * @return the timestamp
     */
    public String getTimestamp()
    {
        return getDateTime().toString(TIMESTAMP_FORMAT);
    }
}

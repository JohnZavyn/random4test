package com.threeleaf.test.random.util;

import org.joda.time.*;
import org.junit.Test;

import java.lang.reflect.*;
import java.util.Date;

import static com.threeleaf.test.random.TestDate.*;
import static com.threeleaf.test.random.TestRandom.random;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static org.junit.Assert.*;

/** Test {@link TestDateUtil} */
public class TestDateUtilRandomUtil
{

    /** Test {@link TestDateUtil} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestDateUtil> constructor = TestDateUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try
        {
            constructor.newInstance();
        }
        catch (Exception e)
        {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestDateUtil#getDateTime()}. */
    @Test
    public void getDateTime()
    {
        final DateTime result = TestDateUtil.getDateTime();

        assertNotNull(result);
    }

    /** Test {@link TestDateUtil#getLocalDate()}. */
    @Test
    public void getLocalDate()
    {
        final LocalDate result = TestDateUtil.getLocalDate();

        assertNotNull(result);
    }

    /** Test {@link TestDateUtil#getLocalDateTime()}. */
    @Test
    public void getLocalDateTime()
    {
        final LocalDateTime result = TestDateUtil.getLocalDateTime();

        assertNotNull(result);
    }

    /** Test {@link TestDateUtil#getTimestamp()}. */
    @Test
    public void getTimestamp()
    {
        assertEquals(TIMESTAMP_FORMAT.length(), TestDateUtil.getTimestamp().length());
    }

    /** Test {@link TestDateUtil#randomBetween(Date, Date)}. */
    @Test
    public void randomBetween()
    {
        final Date date1 = random(Date.class);
        final Date date2 = random(Date.class);

        final Date result = TestDateUtil.randomBetween(date1, date2);

        assertTrue(result.getTime() <= max(date1.getTime(), date2.getTime()));
        assertTrue(result.getTime() >= min(date1.getTime(), date2.getTime()));
    }

    /** Test {@link TestDateUtil#randomBetween(LocalDate, LocalDate)}. */
    @Test
    public void randomBetweenLocalDate()
    {
        final LocalDate date1 = random(LocalDate.class);
        final LocalDate date2 = random(LocalDate.class);

        final LocalDate result = TestDateUtil.randomBetween(date1, date2);

        assertTrue(result.toDate().getTime() <= max(date1.toDate().getTime(), date2.toDate().getTime()));
        assertTrue(result.toDate().getTime() >= min(date1.toDate().getTime(), date2.toDate().getTime()));
    }

    /** Test {@link TestDateUtil#randomBetween(LocalDateTime, LocalDateTime)}. */
    @Test
    public void randomBetweenLocalDateTime()
    {
        final LocalDateTime date1 = random(LocalDateTime.class);
        final LocalDateTime date2 = random(LocalDateTime.class);

        final LocalDateTime result = TestDateUtil.randomBetween(date1, date2);

        assertTrue(result.toDate().getTime() <= max(date1.toDate().getTime(), date2.toDate().getTime()));
        assertTrue(result.toDate().getTime() >= min(date1.toDate().getTime(), date2.toDate().getTime()));
    }

    /** Test {@link TestDateUtil#randomDate()}. */
    @Test
    public void randomDate()
    {
        final Date result = TestDateUtil.randomDate();

        assertNotNull(result);
    }

    /** Test {@link TestDateUtil#randomDateFuture()}. */
    @Test
    public void randomDateFuture()
    {
        final Date result = TestDateUtil.randomDateFuture();

        assertTrue(result.getTime() <= YEAR_NEXT.getTime());
        assertTrue(result.getTime() >= TOMORROW.getTime());
    }

    /** Test {@link TestDateUtil#randomDatePast()}. */
    @Test
    public void randomDatePast()
    {
        final Date result = TestDateUtil.randomDatePast();

        assertTrue(result.getTime() <= YESTERDAY.getTime());
        assertTrue(result.getTime() >= YEAR_LAST.getTime());
    }

    /** Test {@link TestDateUtil#randomLocalDate()}. */
    @Test
    public void randomLocalDate()
    {
        final LocalDate result = TestDateUtil.randomLocalDate();

        assertNotNull(result);
    }

    /** Test {@link TestDateUtil#randomLocalDateFuture()}. */
    @Test
    public void randomLocalDateFuture()
    {
        final LocalDate result = TestDateUtil.randomLocalDateFuture();

        assertTrue(result.toDate().getTime() <= YEAR_NEXT.getTime());
        assertTrue(result.toDate().getTime() >= TOMORROW.getTime());
    }

    /** Test {@link TestDateUtil#randomLocalDatePaste()}. */
    @Test
    public void randomLocalDatePaste()
    {
        final LocalDate result = TestDateUtil.randomLocalDatePaste();

        assertTrue(result.toDate().getTime() <= YESTERDAY.getTime());
        assertTrue(result.toDate().getTime() >= YEAR_LAST.getTime());
    }

    /** Test {@link TestDateUtil#randomLocalDateTime()}. */
    @Test
    public void randomLocalDateTime()
    {
        final LocalDateTime result = TestDateUtil.randomLocalDateTime();

        assertNotNull(result);
    }

    /** Test {@link TestDateUtil#randomLocalDateTimeFuture()}. */
    @Test
    public void randomLocalDateTimeFuture()
    {
        final LocalDateTime result = TestDateUtil.randomLocalDateTimeFuture();

        assertTrue(result.toDate().getTime() <= YEAR_NEXT.getTime());
        assertTrue(result.toDate().getTime() >= TOMORROW.getTime());
    }

    /** Test {@link TestDateUtil#randomLocalDateTimePast()}. */
    @Test
    public void randomLocalDateTimePast()
    {
        final LocalDateTime result = TestDateUtil.randomLocalDateTimePast();

        assertTrue(result.toDate().getTime() <= YESTERDAY.getTime());
        assertTrue(result.toDate().getTime() >= YEAR_LAST.getTime());
    }
}

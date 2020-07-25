package com.threeleaf.test.random;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

/** Test {@link TestDate}. */
class TestDateTest {

    /** Test {@link TestDate#randomFuture()}. */
    @Test
    void randomFuture() {
        assertTrue(TestDate.randomFuture().getTime() > TestDate.TODAY.getTime());
    }

    /** Test {@link TestDate#randomPast()}. */
    @Test
    void randomPast() {
        assertTrue(TestDate.randomPast().getTime() < TestDate.TODAY.getTime());
    }

    /** Test {@link TestDate#randomRecent()}. */
    @Test
    void randomRecent() {
        Date randomDate = TestDate.randomRecent();

        assertTrue(randomDate.getTime() > TestDate.YEAR_LAST.getTime() - 1);
        assertTrue(randomDate.getTime() < TestDate.YEAR_NEXT.getTime() + 1);
    }
}

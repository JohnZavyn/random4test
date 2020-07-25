package com.threeleaf.test.random;

import static com.threeleaf.test.random.TestLocalDate.TOMORROW;
import static com.threeleaf.test.random.TestLocalDate.YESTERDAY;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/** Test {@link TestLocalDate}. */
class TestLocalDateTest {

    /** Test {@link TestLocalDate#randomBetween(LocalDate, LocalDate)}. */
    @Test
    void randomBetween() {
        assertNotNull(TestLocalDate.randomBetween(YESTERDAY, TOMORROW));
    }

    /** Test {@link TestLocalDate#randomFuture()}. */
    @Test
    void randomFuture() {
        assertNotNull(TestLocalDate.randomFuture());
    }

    /** Test {@link TestLocalDate#randomPast()}. */
    @Test
    void randomPast() {
        assertNotNull(TestLocalDate.randomPast());
    }

    /** Test {@link TestLocalDate#randomRecent()}. */
    @Test
    void randomRecent() {
        assertNotNull(TestLocalDate.randomRecent());
    }
}

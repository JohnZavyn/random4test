package com.threeleaf.test.random.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.threeleaf.test.random.TestGeneric;
import org.junit.jupiter.api.Test;

/** Test {@link TestGeneric}. */
public class TestUtilTest {

    /** Test {@link TestGeneric#TestGeneric(Class)}. */
    @Test
    public void constructor() {
        final TestGeneric<String> testGeneric = new TestGeneric<>(String.class);

        assertEquals(String.class, testGeneric.getType());
    }
}

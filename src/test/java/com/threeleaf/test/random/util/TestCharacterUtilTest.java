package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestString.STRING;
import static com.threeleaf.test.random.util.TestStringUtil.contains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** Test {@link TestCharacterUtil}. */
class TestCharacterUtilTest {

    /** Test {@link TestCharacterUtil#chooseOneFrom(String)}. */
    @Test
    void chooseOneFrom() {
        char character = TestCharacterUtil.chooseOneFrom(STRING);

        assertTrue(contains(STRING, character));
    }
}

/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.LINE_FEED;
import static com.threeleaf.test.random.TestString.STRING;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.threeleaf.test.random.generator.RegExGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PatternSyntaxExceptionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetMessage() {
        final PatternSyntaxException patternSyntaxExceptionUnderTest = new PatternSyntaxException(STRING, null, -1);

        final String result = patternSyntaxExceptionUnderTest.getMessage();

        assertEquals(STRING + LINE_FEED + "null", result);
    }

    @Test
    void unknownLookbehind() {
        final PatternSyntaxException exception = assertThrows(PatternSyntaxException.class, () -> {
            new RegExGenerator("(?<<a)");
        });

        assertEquals("Unknown lookbehind group near index 4\n"
                         + "(?<<a)\n"
                         + "    ^", exception.getMessage());
    }
}

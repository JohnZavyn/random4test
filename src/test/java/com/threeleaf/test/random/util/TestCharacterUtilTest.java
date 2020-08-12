package com.threeleaf.test.random.util;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import static com.threeleaf.test.random.TestString.STRING;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Test {@link TestCharacterUtil}. */
class TestCharacterUtilTest
{

    /** Test {@link TestCharacterUtil#toCharacterList(String)}. */
    @Test
    void toCharacterList()
    {
        ImmutableList<Character> result = TestCharacterUtil.toCharacterList(STRING);

        assertEquals(STRING.length(), result.size());
    }
}

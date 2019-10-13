package com.threeleaf.test.random.util;

import com.threeleaf.test.random.TestGeneric;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** Test {@link TestGeneric}. */
public class TestUtilTest
{

    /** Test {@link TestGeneric#TestGeneric(Class)}. */
    @Test
    public void constructor()
    {
        final TestGeneric<String> testGeneric = new TestGeneric<>(String.class);

        assertEquals(String.class, testGeneric.getType());
    }
}

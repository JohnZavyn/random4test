package com.threeleaf.test.random.util;

import org.apache.commons.validator.routines.CodeValidator;
import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestInteger.random1to10;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestStringUtil.STRING_LENGTH_MAX;
import static com.threeleaf.test.random.util.TestStringUtil.STRING_LENGTH_MIN;
import static org.junit.Assert.*;

/** Test {@link TestStringUtil} */
public class TestStringUtilTest
{

    /** Test {@link TestStringUtil#capitalize(String)}. */
    @Test
    public void capitalize()
    {
        final String expectedResult = "String";

        final String result = TestStringUtil.capitalize("string");

        assertEquals(expectedResult, result);
    }

    /** Test {@link TestStringUtil#randomPunctuationTerminal()}. */
    @Test
    public void randomPunctuationTerminal()
    {
        final String result = TestStringUtil.randomPunctuationTerminal();

        assertTrue(".".equals(result) || "?".equals(result) || "!".equals(result));
    }

    /** Test {@link TestStringUtil#randomUuid()}. */
    @Test
    public void randomUuid()
    {
        new CodeValidator("[0-9a-fA-F]{8}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{12}", null).isValid(TestStringUtil.randomUuid());
    }

    /** Test {@link TestStringUtil} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestStringUtil> constructor = TestStringUtil.class.getDeclaredConstructor();
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

    /** Test {@link TestStringUtil#extractSuffix(String)}. */
    @Test
    public void extractSuffix()
    {
        final String string = STRING_05 + '_' + STRING_32;

        final String result = TestStringUtil.extractSuffix(string);

        assertEquals(STRING_32, result);
        assertEquals(STRING_08, TestStringUtil.extractSuffix(STRING_99 + '~' + STRING_08));
    }

    /** Test {@link TestStringUtil#isBlank(CharSequence)}. */
    @Test
    public void isBlank()
    {
        assertTrue(TestStringUtil.isBlank(null));
        assertTrue(TestStringUtil.isBlank(EMPTY));
        assertTrue(TestStringUtil.isBlank(WHITESPACE));
        assertFalse(TestStringUtil.isBlank(STRING_05));
    }

    /** Test {@link TestStringUtil#isEmpty(CharSequence)}. */
    @Test
    public void isEmpty()
    {
        assertTrue(TestStringUtil.isEmpty(null));
        assertTrue(TestStringUtil.isEmpty(EMPTY));
        assertFalse(TestStringUtil.isEmpty(SPACE));
    }


    /** Test {@link TestStringUtil#randomLetter()}. */
    @Test
    public void randomLetter()
    {
        assertEquals(1, TestStringUtil.randomLetter().length());
    }

    /** Test {@link TestStringUtil#test(String)}. */
    @Test
    public void randomName()
    {
        assertTrue(TestStringUtil.test(STRING_05).startsWith(TEST_PREFIX));
    }

    /** Test {@link TestStringUtil#randomTest(String)}. */
    @Test
    public void randomNameCustom()
    {
        assertTrue(TestStringUtil.randomTest(STRING_05).startsWith(TEST_PREFIX + STRING_05));
    }

    /** Test {@link TestStringUtil#randomString()}. */
    @Test
    public void randomString()
    {
        final String result = TestStringUtil.randomString();

        assertTrue(result.length() >= STRING_LENGTH_MIN);
        assertTrue(result.length() <= STRING_LENGTH_MAX);
    }

    /** Test {@link TestStringUtil#randomString(int)}. */
    @Test
    public void randomStringLength()
    {
        final int length = random1to10();

        final String result = TestStringUtil.randomString(length);

        assertEquals(length, result.length());
    }

    /** Test {@link TestStringUtil#safeString(String)}. */
    @Test
    public void safeString()
    {
        assertEquals(EMPTY, TestStringUtil.safeString(EMPTY));
        assertEquals(EMPTY, TestStringUtil.safeString(null));
        assertEquals(STRING_10, TestStringUtil.safeString(STRING_10));
    }

    /** Test {@link TestStringUtil#safeString(String, String)}. */
    @Test
    public void safeStringDefault()
    {
        assertEquals(STRING_05, TestStringUtil.safeString(EMPTY, STRING_05));
        assertEquals(STRING_05, TestStringUtil.safeString(null, STRING_05));
        assertEquals(STRING_10, TestStringUtil.safeString(STRING_10, STRING_05));
    }

    /** Test {@link TestStringUtil#shuffle(String)}. */
    @Test
    public void shuffle()
    {
        assertNotEquals(ALPHABET, TestStringUtil.shuffle(ALPHABET));
    }
}

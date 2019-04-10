package com.threeleaf.test.random.util;

import org.junit.Test;

import java.lang.reflect.*;

import static com.threeleaf.test.random.TestPrimitive.INT_10;
import static com.threeleaf.test.random.TestString.SPACE;
import static com.threeleaf.test.random.util.TestNumberUtil.random1to10;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** Test {@link TestLoremIpsumUtil}. */
public class TestLoremIpsumUtilTest
{

    /** Test {@link TestLoremIpsumUtil} constructor. */
    @Test
    public void constructor() throws Exception
    {
        Constructor<TestLoremIpsumUtil> constructor = TestLoremIpsumUtil.class.getDeclaredConstructor();
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

    /** Test {@link TestLoremIpsumUtil# generateChapter()}. */
    @Test
    public void generateChapter()
    {
        final String result = TestLoremIpsumUtil.generateChapter();

        assertTrue(result.length() > INT_10);
    }

    /** Test {@link TestLoremIpsumUtil# generateChapter(int)}. */
    @Test
    public void generateChapterParagraphs()
    {
        final int paragraphCount = random1to10();

        final String result = TestLoremIpsumUtil.generateChapter(paragraphCount);

        assertEquals(paragraphCount, result.split("\n").length);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    public void generateParagraph()
    {
        assertTrue(TestLoremIpsumUtil.generateParagraph().length() > INT_10);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    public void generateParagraphSentences()
    {
        final int sentenceCount = random1to10();

        final String result = TestLoremIpsumUtil.generateParagraph(sentenceCount);

        assertEquals(sentenceCount, result.split("[.?!]").length);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    public void generateSentence()
    {
        assertTrue(TestLoremIpsumUtil.generateSentence().length() > INT_10);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    public void generateSentenceWords()
    {
        final int wordCount = random1to10();

        final String result = TestLoremIpsumUtil.generateSentence(wordCount);

        assertEquals(wordCount, result.split(SPACE).length);
    }
}

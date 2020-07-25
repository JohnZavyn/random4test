package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.INT_10;
import static com.threeleaf.test.random.TestInteger.random1to10;
import static com.threeleaf.test.random.TestString.SPACE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestLoremIpsumUtil}. */
public class TestLoremIpsumUtilTest {

    /** Test {@link TestLoremIpsumUtil} constructor. */
    @Test
    public void constructor() throws Exception {
        Constructor<TestLoremIpsumUtil> constructor =
                TestLoremIpsumUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestLoremIpsumUtil# randomChapter()}. */
    @Test
    public void randomChapter() {
        final String result = TestLoremIpsumUtil.randomChapter();

        assertTrue(result.length() > INT_10);
    }

    /** Test {@link TestLoremIpsumUtil# randomChapter(int)}. */
    @Test
    public void randomChapterParagraphs() {
        final int paragraphCount = random1to10();

        final String result = TestLoremIpsumUtil.randomChapter(paragraphCount);

        assertEquals(paragraphCount, result.split("\n").length);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    public void randomParagraph() {
        assertTrue(TestLoremIpsumUtil.randomParagraph().length() > INT_10);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    public void randomParagraphSentences() {
        final int sentenceCount = random1to10();

        final String result = TestLoremIpsumUtil.randomParagraph(sentenceCount);

        assertEquals(sentenceCount, result.split("[.?!]").length);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    public void randomSentence() {
        assertTrue(TestLoremIpsumUtil.randomSentence().length() > INT_10);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    public void randomSentenceWords() {
        final int wordCount = random1to10();

        final String result = TestLoremIpsumUtil.randomSentence(wordCount);

        assertEquals(wordCount, result.split(SPACE).length);
    }
}

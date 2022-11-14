/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.INT_10;
import static com.threeleaf.test.random.TestInteger.random1to10;
import static com.threeleaf.test.random.TestString.SPACE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestLoremIpsumUtil}. */
class TestLoremIpsumUtilTest {

    /** Test {@link TestLoremIpsumUtil} constructor. */
    @Test
    void constructor() throws Exception {
        final Constructor<TestLoremIpsumUtil> constructor =
            TestLoremIpsumUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (final Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestLoremIpsumUtil#randomChapter()}. */
    @Test
    void randomChapter() {
        final String result = TestLoremIpsumUtil.randomChapter();

        assertTrue(result.length() > INT_10);
    }

    /** Test {@link TestLoremIpsumUtil#randomChapter(int)}. */
    @Test
    void randomChapterParagraphs() {
        final int paragraphCount = random1to10();

        final String result = TestLoremIpsumUtil.randomChapter(paragraphCount);

        assertEquals(paragraphCount, result.split("\n").length);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    void randomParagraph() {
        assertTrue(TestLoremIpsumUtil.randomParagraph().length() > INT_10);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    void randomParagraphSentences() {
        final int sentenceCount = random1to10();

        final String result = TestLoremIpsumUtil.randomParagraph(sentenceCount);

        assertEquals(sentenceCount, result.split("[.?!]").length);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    void randomSentence() {
        assertTrue(TestLoremIpsumUtil.randomSentence().length() > INT_10);
    }

    /** Test {@link TestLoremIpsumUtil}. */
    @Test
    void randomSentenceWords() {
        final int wordCount = random1to10();

        final String result = TestLoremIpsumUtil.randomSentence(wordCount);

        assertEquals(wordCount, result.split(SPACE).length);
    }
}

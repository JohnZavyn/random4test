package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestInteger.INT_10;
import static com.threeleaf.test.random.TestInteger.random1to10;
import static com.threeleaf.test.random.TestString.SPACE;
import static com.threeleaf.test.random.util.TestLoremIpsumUtil.WORDS_DE_FINIBUS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link ParagraphGenerator}. */
class ParagraphGeneratorTest {

    /** The test {@link ParagraphGenerator}. */
    private ParagraphGenerator paragraphGenerator;

    /** Test {@link ParagraphGenerator#randomChapter()}. */
    @Test
    void randomChapter() {
        String result = paragraphGenerator.randomChapter();

        assertTrue(result.length() > INT_10);
    }

    /** Test {@link ParagraphGenerator#randomChapter(int)}. */
    @Test
    void randomChapterParagraphs() {
        int paragraphCount = random1to10();

        String result = paragraphGenerator.randomChapter(paragraphCount);

        assertEquals(paragraphCount, result.split("\n").length);
    }

    /** Test {@link ParagraphGenerator#randomParagraph()}. */
    @Test
    void randomParagraph() {
        assertTrue(paragraphGenerator.randomParagraph().length() > INT_10);
    }

    /** Test {@link ParagraphGenerator#randomParagraph(int)}. */
    @Test
    void randomParagraphSentences() {
        int sentenceCount = random1to10();

        String result = paragraphGenerator.randomParagraph(sentenceCount);

        assertEquals(sentenceCount, result.split("[.?!]").length);
    }

    /** Test {@link ParagraphGenerator#randomPunctuationTerminal()}. */
    @Test
    void randomPunctuationTerminal() {
        String result = paragraphGenerator.randomPunctuationTerminal();

        assertTrue(".".equals(result) || "?".equals(result) || "!".equals(result));
    }

    /** Test {@link ParagraphGenerator#randomSentence()}. */
    @Test
    void randomSentence() {
        assertTrue(paragraphGenerator.randomSentence().length() > INT_10);
    }

    /** Test {@link ParagraphGenerator#randomSentence(int)}. */
    @Test
    void randomSentenceWords() {
        int wordCount = random1to10();

        String result = paragraphGenerator.randomSentence(wordCount);

        assertEquals(wordCount, result.split(SPACE).length);
    }

    /** Initialize before each test. */
    @BeforeEach
    void setUp() {
        paragraphGenerator = new ParagraphGenerator(WORDS_DE_FINIBUS);
    }
}

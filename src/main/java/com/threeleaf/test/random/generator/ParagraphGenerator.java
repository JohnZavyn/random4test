package com.threeleaf.test.random.generator;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestStringUtil.capitalize;
import static com.threeleaf.test.random.util.TestWordUtil.parseWords;

import java.util.Set;

import com.threeleaf.test.random.util.TestStringUtil;
import lombok.Getter;

/**
 * Generate sentences, paragraphs, and chapters. Useful when you need longer randomized
 * Strings.
 */
@SuppressWarnings("WeakerAccess")
@Getter
public class ParagraphGenerator {

    /** Punctuation marks to be used at the end of sentences. Duplicates to simulate usage. */
    public static final String PUNCTUATION_TERMINALS = "...??!";

    private final Set<String> wordSet;

    /**
     * Instantiate a paragraph generator with the provided words.
     *
     * @param wordString words separated by spaces or punctuation
     */
    public ParagraphGenerator(String wordString) {
        super();
        wordSet = parseWords(wordString);
    }

    /**
     * Generate a chapter of text with 2-10 paragraphs.
     *
     * @return the chapter
     */
    public String randomChapter() {
        return randomChapter(randomBetween(INT_02, INT_10));
    }

    /**
     * Generate chapter of text with the number of paragraphs specified.
     *
     * @param paragraphCount the number of paragraphs
     *
     * @return the chapter
     */
    public String randomChapter(int paragraphCount) {
        StringBuilder chapter = new StringBuilder(randomParagraph());
        for (int count = 1; count < paragraphCount; count++) {
            chapter.append("\n").append(randomParagraph());
        }

        return chapter.toString();
    }

    /**
     * Generate a paragraph with the specified number of sentences.
     *
     * @param sentenceCount the number of sentences
     *
     * @return the paragraph
     */
    public String randomParagraph(int sentenceCount) {
        StringBuilder paragraph = new StringBuilder(randomSentence());
        for (int count = 1; count < sentenceCount; count++) {
            paragraph.append(' ').append(randomSentence());
        }

        return paragraph.toString();
    }

    /**
     * Generate a paragraph of text with 2-10 sentences.
     *
     * @return the paragraph
     */
    public String randomParagraph() {
        return randomParagraph(randomBetween(INT_02, INT_10));
    }

    /**
     * Return a random terminal (end of sentence) punctuation mark.
     *
     * @return the punctuation mark
     */
    public String randomPunctuationTerminal() {
        return TestStringUtil.chooseOneFrom(PUNCTUATION_TERMINALS);
    }

    /**
     * Generate a sentence with the specified number of words.
     *
     * @param wordCount the number of words
     *
     * @return the sentence
     */
    public String randomSentence(int wordCount) {
        StringBuilder sentence =
            new StringBuilder(capitalize(chooseOneFrom(wordSet)));
        for (int count = 1; count < wordCount; count++) {
            sentence.append(' ').append(chooseOneFrom(wordSet));
        }
        sentence.append(randomPunctuationTerminal());

        return sentence.toString();
    }

    /**
     * Generate a sentence with 5-10 words.
     *
     * @return the sentence
     */
    public String randomSentence() {
        return randomSentence(randomBetween(INT_05, INT_10));
    }
}

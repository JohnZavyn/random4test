package com.threeleaf.test.random.util;

import static lombok.AccessLevel.PRIVATE;

import com.threeleaf.test.random.generator.ParagraphGenerator;
import lombok.NoArgsConstructor;

/** Utilities to generate greeking text. Useful when you need longer randomized Strings. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings("WeakerAccess")
public final class TestLoremIpsumUtil {

    /**
     * The unique words from Sections 1.10.32-33 of Cicero's
     * <em>De finibus bonorum et malorum</em>.
     * See https://en.wikipedia.org/wiki/Lorem_ipsum.
     */
    public static final String WORDS_DE_FINIBUS =
        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium doloremque "
            + "laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis et "
            + "quasi architecto beatae vitae dicta sunt, explicabo. Nemo enim ipsam voluptatem, "
            + "quia voluptas sit, aspernatur aut odit aut fugit, sed quia consequuntur magni "
            + "dolores eos, qui ratione voluptatem sequi nesciunt, neque porro quisquam est, qui "
            + "dolorem ipsum, quia dolor sit amet consectetur adipiscing velit, sed quia "
            + "non-numquam  do eius modi tempora incididunt, ut labore et dolore magnam aliquam "
            + "quaerat voluptatem. Ut enim ad minima veniam, quis nostrum d exercitationem ullam "
            + "corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis "
            + "autem vel eum iure reprehenderit, qui in ea voluptate velit esse, quam nihil "
            + "molestiae consequatur, vel illum, qui dolorem eum fugiat, quo voluptas nulla "
            + "pariatur? At vero eos et accusamus et iusto odio dignissimos ducimus, qui "
            + "blanditiis praesentium voluptatum deleniti atque corrupti, quos dolores et quas "
            + "molestias excepturi sint, obcaecati cupiditate non-provident, similique sunt in "
            + "culpa, qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et "
            + "harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum "
            + "soluta nobis est eligendi optio, cumque nihil impedit, quo minus id, quod maxime "
            + "placeat, facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. "
            + "Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe "
            + "eveniet, ut et voluptates repudiandae sint et molestiae non-recusandae. Itaque "
            + "earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus "
            + "maiores alias consequatur aut perferendis doloribus asperiores repellat";

    public static final ParagraphGenerator PARAGRAPH_GENERATOR =
        new ParagraphGenerator(WORDS_DE_FINIBUS);

    /**
     * Generate a chapter of text with 2-10 paragraphs.
     *
     * @return the chapter
     */
    public static String randomChapter() {
        return PARAGRAPH_GENERATOR.randomChapter();
    }

    /**
     * Generate chapter of text with the number of paragraphs specified.
     *
     * @param paragraphCount the number of paragraphs
     *
     * @return the chapter
     */
    public static String randomChapter(int paragraphCount) {
        return PARAGRAPH_GENERATOR.randomChapter(paragraphCount);
    }

    /**
     * Generate a paragraph of text with 2-10 sentences.
     *
     * @return the paragraph
     */
    public static String randomParagraph() {
        return PARAGRAPH_GENERATOR.randomParagraph();
    }

    /**
     * Generate a paragraph with the specified number of sentences.
     *
     * @param sentenceCount the number of sentences
     *
     * @return the paragraph
     */
    public static String randomParagraph(int sentenceCount) {
        return PARAGRAPH_GENERATOR.randomParagraph(sentenceCount);
    }

    /**
     * Generate a sentence with the specified number of words.
     *
     * @param wordCount the number of words
     *
     * @return the sentence
     */
    public static String randomSentence(int wordCount) {
        return PARAGRAPH_GENERATOR.randomSentence(wordCount);
    }

    /**
     * Generate a sentence with 5-10 words.
     *
     * @return the sentence
     */
    public static String randomSentence() {
        return PARAGRAPH_GENERATOR.randomSentence();
    }
}

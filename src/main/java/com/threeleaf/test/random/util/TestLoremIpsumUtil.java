package com.threeleaf.test.random.util;

import static com.google.common.collect.Sets.newHashSet;
import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestStringUtil.capitalize;
import static com.threeleaf.test.random.util.TestStringUtil.randomPunctuationTerminal;

import java.util.Set;

import lombok.experimental.UtilityClass;

/** Utilities to generate greeking text. Useful when you need longer randomized Strings. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestLoremIpsumUtil {

    /**
     * The unique words from Sections 1.10.32-33 of Cicero's
     * <em>De finibus bonorum et malorum</em>.
     * See https://en.wikipedia.org/wiki/Lorem_ipsum.
     */
    public final Set<String> WORDS_DE_FINIBUS = newHashSet(( // @formatter:off //
        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium " +
        "doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore " +
        "veritatis et quasi architecto beatae vitae dicta sunt, explicabo. Nemo enim " +
        "ipsam voluptatem, quia voluptas sit, aspernatur aut odit aut fugit, sed quia " +
        "consequuntur magni dolores eos, qui ratione voluptatem sequi nesciunt, neque " +
        "porro quisquam est, qui dolorem ipsum, quia dolor sit amet consectetur " +
        "adipiscing velit, sed quia non-numquam  do eius modi tempora incididunt, ut " +
        "labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, " +
        "quis nostrum d exercitationem ullam corporis suscipit laboriosam, nisi ut " +
        "aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit, qui in " +
        "ea voluptate velit esse, quam nihil molestiae consequatur, vel illum, qui " +
        "dolorem eum fugiat, quo voluptas nulla pariatur? At vero eos et accusamus et " +
        "iusto odio dignissimos ducimus, qui blanditiis praesentium voluptatum deleniti " +
        "atque corrupti, quos dolores et quas molestias excepturi sint, obcaecati " +
        "cupiditate non-provident, similique sunt in culpa, qui officia deserunt mollitia " +
        "animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et " +
        "expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio, " +
        "cumque nihil impedit, quo minus id, quod maxime placeat, facere possimus, omnis " +
        "voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et " +
        "aut officiis debitis aut rerum necessitatibus saepe eveniet, ut et voluptates " +
        "repudiandae sint et molestiae non-recusandae. Itaque earum rerum hic tenetur a " +
        "sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut " +
        "perferendis doloribus asperiores repellat"
    ).split("[\\p{Punct}\\s]+")); // @formatter:on //

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
    public String randomChapter(final int paragraphCount) {
        final StringBuilder chapter = new StringBuilder(randomParagraph());
        for (int count = 1; count < paragraphCount; count++) {
            chapter.append("\n").append(randomParagraph());
        }

        return chapter.toString();
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
     * Generate a paragraph with the specified number of sentences.
     *
     * @param sentenceCount the number of sentences
     *
     * @return the paragraph
     */
    public String randomParagraph(final int sentenceCount) {
        final StringBuilder paragraph = new StringBuilder(randomSentence());
        for (int count = 1; count < sentenceCount; count++) {
            paragraph.append(' ').append(randomSentence());
        }

        return paragraph.toString();
    }

    /**
     * Generate a sentence with 5-10 words.
     *
     * @return the sentence
     */
    public String randomSentence() {
        return randomSentence(randomBetween(INT_05, INT_10));
    }

    /**
     * Generate a sentence with the specified number of words.
     *
     * @param wordCount the number of words
     *
     * @return the sentence
     */
    public String randomSentence(final int wordCount) {
        final StringBuilder sentence =
                new StringBuilder(capitalize(chooseOneFrom(WORDS_DE_FINIBUS)));
        for (int count = 1; count < wordCount; count++) {
            sentence.append(' ').append(chooseOneFrom(WORDS_DE_FINIBUS));
        }
        sentence.append(randomPunctuationTerminal());

        return sentence.toString();
    }
}

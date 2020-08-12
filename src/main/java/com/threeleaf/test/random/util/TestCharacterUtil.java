package com.threeleaf.test.random.util;

import com.google.common.collect.ImmutableList;
import lombok.NoArgsConstructor;

import javax.annotation.Nonnull;
import java.util.List;

import static com.threeleaf.test.random.TestString.*;
import static lombok.AccessLevel.PRIVATE;

/** Test {@link Character} utilities. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings("WeakerAccess")
public final class TestCharacterUtil
{

    /** Alphabet, upper case characters, in a list. */
    public static final List<Character> ALPHABET_CAPS_LIST = toCharacterList(ALPHABET_CAPS);

    /** Alphabet, lower case characters, in a list. */
    public static final List<Character> ALPHABET_LIST = toCharacterList(ALPHABET);

    /** Number characters in a list. */
    public static final List<Character> NUMBER_LIST = toCharacterList(NUMBERS);

    /** Punctuation characters in a list. */
    public static final List<Character> PUNCTUATION_LIST = toCharacterList(PUNCTUATION);

    /** Symbol characters in a list. */
    public static final List<Character> SYMBOL_LIST = toCharacterList(SYMBOLS);

    /**
     * Convert a {@link String} into an {@link  ImmutableList }<{@link Character}>.
     *
     * @param string the string to split
     *
     * @return the {@link List} of {@link Character Characters}
     */
    public static ImmutableList<Character> toCharacterList(@Nonnull String string)
    {
        return ImmutableList.<Character>builder()
                .add(string.chars()
                        .mapToObj(c -> (char) c)
                        .toArray(Character[]::new))
                .build();
    }
}

package com.threeleaf.test.random.generator;

import static com.google.common.base.Preconditions.checkArgument;
import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestStringUtil.randomString;
import static com.threeleaf.test.random.util.TestStringUtil.shuffle;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

import java.util.List;
import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableList;
import lombok.Getter;

/** Class used to generate randomized passwords based on specified character lists. */
@Getter
public class PasswordGenerator {

    /** Error message when requested password length is too short. */
    public static final String PASSWORD_LENGTH_ERROR =
        "Password length must be at least %s to include one character from each set.";

    /** Symbols for use in passwords. */
    public static final String SYMBOLS_PASSWORD = PUNCTUATION_URL_SAFE + "!@#*?";

    /** The list of character strings. */
    private final List<String> characterSources;

    /** The number of character lists available. */
    private final int characterSourcesSize;

    /**
     * Instantiate a PasswordGenerator with the classic lower case, upper case, number, and
     * symbol requirements.
     */
    public PasswordGenerator() {
        this(
            ALPHABET,
            ALPHABET_CAPS,
            NUMBERS,
            SYMBOLS_PASSWORD
        );
    }

    /**
     * Instantiate a PasswordGenerator.
     *
     * @param theCharacterStrings the characters to use in passwords
     */
    public PasswordGenerator(@Nonnull final String... theCharacterStrings) {
        super();
        characterSources = ImmutableList.copyOf(theCharacterStrings);
        characterSourcesSize = characterSources.size();
    }

    /**
     * Generate a password with 8-16 characters.
     *
     * @return password string
     */
    public String randomPassword() {
        return randomPassword(randomBetween(INT_08, INT_16));
    }

    /**
     * Generate a random password.
     *
     * @param length the length of the password
     *
     * @return password string
     */
    public String randomPassword(final int length) {
        return randomPassword(length, FALSE);
    }

    /**
     * Generates a randomized string of characters based on the available character lists. At least
     * one character from each available character list is selected.
     *
     * @param length                 the length of the password
     * @param groupByCharacterSource when true, group randomized characters based on the character
     *                               sources they are drawn from. For example, {@code new
     *                               PasswordGenerator(NUMBERS, ALPHABET, PUNCTUATION)
     *                               .randomPassword(3,
     *                               TRUE)}
     *                               will always return a password containing, in order, a number +
     *                               a lower case character + a punctuation mark.<p>The specific
     *                               application is for making a "friendlier" password for smart
     *                               devices, where it is more difficult to frequently switch
     *                               between lower case letters, upper case letters, numbers, and
     *                               symbols while typing a password. Grouping the characters
     *                               allows one to switch device keyboards less often.</p>
     *
     * @return password string
     */
    public String randomPassword(final int length, final boolean groupByCharacterSource) {
        checkArgument(length >= characterSourcesSize, PASSWORD_LENGTH_ERROR, characterSourcesSize);

        final StringBuilder password = new StringBuilder(length);
        final int sourcesMaxIndex = characterSourcesSize - 1;

        for (int sourceIndex = 0; sourceIndex < characterSourcesSize; sourceIndex++) {
            final int charactersRemaining = length - password.length();
            final int charLength =
                sourceIndex == sourcesMaxIndex
                    ? charactersRemaining
                    : randomBetween(INT_01, charactersRemaining - sourcesMaxIndex + sourceIndex);
            password.append(randomString(charLength, characterSources.get(sourceIndex)));
        }

        return groupByCharacterSource ? password.toString() : shuffle(password.toString());
    }

    /**
     * Generate a "friendly" password with 8-16 characters.
     *
     * @return friendly password string
     */
    public String randomPasswordFriendly() {
        return randomPasswordFriendly(randomBetween(INT_08, INT_16));
    }

    /**
     * Generates a "friendly" password based on the available character lists.
     *
     * @param length the length of the password
     *
     * @return friendly password string
     */
    public String randomPasswordFriendly(final int length) {
        return randomPassword(length, TRUE);
    }
}

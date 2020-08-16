package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestRandom.RANDOM;
import static lombok.AccessLevel.PRIVATE;

import lombok.NoArgsConstructor;

/** Test {@link Character} utilities. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings("WeakerAccess")
public final class TestCharacterUtil {

    /**
     * Choose one @{link Character} at random from the provided {@link String}.
     *
     * @param string the character source
     *
     * @return a random character
     */
    public static char chooseOneFrom(String string) {
        return string.charAt(RANDOM.nextInt(string.length()));
    }
}

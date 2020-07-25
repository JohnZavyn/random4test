package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestRandom.RANDOM;
import static lombok.AccessLevel.PRIVATE;

import javax.annotation.Nonnull;

import lombok.NoArgsConstructor;

/** Enum test utilities. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings("WeakerAccess")
public class TestEnumUtil {

    /**
     * Returns a random enum instance from the specified enum class.
     *
     * @param <E>       the enum type
     * @param enumClass the enum class
     *
     * @return the random enum
     */
    public static <E extends Enum<E>> E chooseOneFrom(@Nonnull Class<E> enumClass) {
        E[] values = enumClass.getEnumConstants();

        return values[RANDOM.nextInt(values.length)];
    }
}

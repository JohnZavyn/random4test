package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestRandom.RANDOM;

import javax.annotation.Nonnull;

import lombok.experimental.UtilityClass;

/** Enum test utilities. */
@UtilityClass
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
    public <E extends Enum<E>> E chooseOneFrom(@Nonnull final Class<E> enumClass) {
        final E[] values = enumClass.getEnumConstants();

        return values[RANDOM.nextInt(values.length)];
    }
}

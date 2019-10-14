package com.threeleaf.test.random.util;

import lombok.experimental.UtilityClass;

import javax.annotation.Nonnull;

import static com.threeleaf.test.random.TestRandom.RANDOM;

/** Enum test utilities. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestEnumUtil
{

    /**
     * Returns a random enum instance from the specified enum class.
     *
     * @param <E>       the enum type
     * @param enumClass the enum class
     *
     * @return the random enum
     */
    public <E extends Enum<E>> E chooseOneFrom(@Nonnull final Class<E> enumClass)
    {
        final E[] values = enumClass.getEnumConstants();

        return values[RANDOM.nextInt(values.length)];
    }
}

package com.threeleaf.test.random.util;

import com.threeleaf.test.random.TestRandom;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

/** Enum test utilities. */
@UtilityClass
@SuppressWarnings({"unused", "WeakerAccess"})
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
    public <E extends Enum<E>> E getRandom(@NonNull final Class<E> enumClass)
    {
        final E[] values = enumClass.getEnumConstants();

        return values[TestRandom.RANDOM.nextInt(values.length)];
    }
}

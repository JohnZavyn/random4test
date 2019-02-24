package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

/** Enum test utilities. */
@UtilityClass
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
    public <E extends Enum<E>> E getRandom(final Class<E> enumClass)
    {
        final E[] values = enumClass.getEnumConstants();

        return values[TestNumberUtil.RANDOM.nextInt(values.length)];
    }
}

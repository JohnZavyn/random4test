package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;

/** Number methods and constants for use in testing. */
@UtilityClass
@SuppressWarnings({"WeakerAccess","unused"})
public class TestNumber
{

    /** Test random {@link BigDecimal} number. */
    public final BigDecimal BIG_DECIMAL = TestNumberUtil.randomBigDecimal();

    /** Test random, positive byte. */
    public final Byte BYTE = (byte) TestNumberUtil.randomBetween(1, Byte.MAX_VALUE - 1);

    /** Test random, positive {@link Double}. */
    public final Double DOUBLE = TestNumberUtil.randomDouble();

    /** A known double. */
    public final Double DOUBLE_FIXED = 12345.67890;

    /** Test random integer number. */
    public final Integer INTEGER = TestNumberUtil.randomNumber();

    /** Test random integer between 1 and 254. */
    public final Integer INTEGER_SMALL = TestNumberUtil.randomBetween(1, Byte.MAX_VALUE * 2);

    /** The integer 1. */
    public final Integer INT_01 = 1;

    /** The integer 2. */
    public final Integer INT_02 = 2;

    /** The integer 3. */
    public final Integer INT_03 = 3;

    /** The integer 4. */
    public final Integer INT_04 = 4;

    /** The integer 5. */
    public final Integer INT_05 = 5;

    /** The integer 6. */
    public final Integer INT_06 = 6;

    /** The integer 7. */
    public final Integer INT_07 = 7;

    /** The integer 8. */
    public final Integer INT_08 = 8;

    /** The integer 9. */
    public final Integer INT_09 = 9;

    /** The integer 10. */
    public final Integer INT_10 = 10;

    /** The integer 100. */
    public final Integer INT_100 = 100;

    /** The integer 1000. */
    public final Integer INT_1000 = 1000;

    /** The integer 10000. */
    public final Integer INT_10000 = 10000;

    /** The integer 23. */
    public final Integer INT_23 = 23;

    /** The integer 24. */
    public final Integer INT_24 = 24;

    /** The integer 59. */
    public final Integer INT_59 = 59;

    /** The integer 60. */
    public final Integer INT_60 = 60;

    /** The integer 99. */
    public final Integer INT_99 = 99;

    /** The integer 999. */
    public final Integer INT_999 = 999;

    /** Test random long number. */
    public final Long LONG = (long) TestNumberUtil.randomNumber();
}

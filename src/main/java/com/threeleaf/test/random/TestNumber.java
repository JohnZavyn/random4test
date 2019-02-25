package com.threeleaf.test.random;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;

import static com.threeleaf.test.random.TestNumberUtil.*;
import static java.math.BigDecimal.ROUND_HALF_UP;
import static java.math.BigDecimal.valueOf;

/** Number methods and constants for use in testing. */
@UtilityClass
@SuppressWarnings({"WeakerAccess", "unused"})
public class TestNumber
{

    /** Test random {@link BigDecimal} between 1.00 and 254.99. */
    public static final BigDecimal BIG_DECIMAL_SMALL = valueOf((double) randomBetween(1, Byte.MAX_VALUE * 2) + randomBetween(1, 100) / 100D).setScale(2, ROUND_HALF_UP);

    /** Test random, positive byte. */
    public static final Byte BYTE = (byte) randomBetween(1, Byte.MAX_VALUE - 1);

    /** A known double. */
    public static final Double DOUBLE_FIXED = 12345.67890;

    /** Test random double between 1.00 and 254.99. */
    public static final Double DOUBLE_SMALL = (double) randomBetween(1, Byte.MAX_VALUE * 2) + randomBetween(1, 100) / 100D;

    /** Test random integer between 1 and 254. */
    public static final Integer INTEGER_SMALL = randomBetween(1, Byte.MAX_VALUE * 2);

    /** The integer 1. */
    public static final Integer INT_01 = 1;

    /** Test random integer number. */
    public static final Integer INTEGER = randomNumber();

    /** The integer 2. */
    public static final Integer INT_02 = 2;

    /** The integer 3. */
    public static final Integer INT_03 = 3;

    /** The integer 4. */
    public static final Integer INT_04 = 4;

    /** The integer 5. */
    public static final Integer INT_05 = 5;

    /** The integer 6. */
    public static final Integer INT_06 = 6;

    /** The integer 7. */
    public static final Integer INT_07 = 7;

    /** The integer 8. */
    public static final Integer INT_08 = 8;

    /** The integer 9. */
    public static final Integer INT_09 = 9;

    /** The integer 10. */
    public static final Integer INT_10 = 10;

    /** Test random, positive {@link Double}. */
    public static final Double DOUBLE = randomDouble();

    /** Test random {@link BigDecimal} number. */
    public static final BigDecimal BIG_DECIMAL = randomBigDecimal();

    /** The integer 100. */
    public static final Integer INT_100 = 100;

    /** The integer 1000. */
    public static final Integer INT_1000 = 1000;

    /** The integer 10000. */
    public static final Integer INT_10000 = 10000;

    /** The integer 23. */
    public static final Integer INT_23 = 23;

    /** The integer 24. */
    public static final Integer INT_24 = 24;

    /** The integer 59. */
    public static final Integer INT_59 = 59;

    /** The integer 60. */
    public static final Integer INT_60 = 60;

    /** The integer 99. */
    public static final Integer INT_99 = 99;

    /** The integer 999. */
    public static final Integer INT_999 = 999;

    /** Test random long number. */
    public static final Long LONG = (long) randomNumber();

    /** Test random long between 1 and 254. */
    public static final Long LONG_SMALL = (long) randomBetween(1, Byte.MAX_VALUE * 2);

    /** Maximum digit value. */
    public static final int MAX_DIGIT = 9;

    /** Minimum digit value. */
    public static final int MIN_DIGIT = 0;
}

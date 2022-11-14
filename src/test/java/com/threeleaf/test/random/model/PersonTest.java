/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.model;

import static com.threeleaf.test.random.TestFloat.F_00;
import static com.threeleaf.test.random.TestFloat.F_01;
import static com.threeleaf.test.random.TestInteger.INT_00;
import static com.threeleaf.test.random.TestInteger.INT_01;
import static com.threeleaf.test.random.TestLocalDate.*;
import static com.threeleaf.test.random.TestString.*;
import static com.threeleaf.test.random.util.TestStringUtil.randomLetter;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import com.threeleaf.test.random.TestFloat;
import com.threeleaf.test.random.util.TestDateUtil;
import com.threeleaf.test.random.util.TestNameUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Test {@link Person}. */
class PersonTest {

    /** Double float defference tester. */
    public static final double DELTA = 0.01;

    /** The test {@link Person}. */
    private Person person;

    /** Test {@link Person#getAge()}. */
    @Test
    void getAge() {
        person.setBirthday(YEAR_LAST);

        int result = person.getAge();

        assertEquals(INT_01, result);


        /* Ages in the future default to zero (0). */
        person.setBirthday(YEAR_NEXT);

        result = person.getAge();

        assertEquals(INT_00, result);
    }

    /** Test {@link Person#getAgeFraction()}. */
    @Test
    void getAgeFraction() {
        person.setBirthday(YEAR_LAST);

        double result = person.getAgeFraction();

        assertEquals(F_01, result, DELTA);


        /* Ages in the future default to zero (0). */
        person.setBirthday(YEAR_NEXT);

        result = person.getAgeFraction();

        assertEquals(F_00, result, DELTA);

        final double age = TestFloat.randomPercent();

        final LocalDate birthday = (LocalDate) TestDateUtil.addFractionalYears(TODAY, -age);
        person.setBirthday(birthday);

        result = person.getAgeFraction();

        assertEquals(age, result, DELTA);
    }

    /** Test {@link Person#getFullName()}. */
    @Test
    void getFullName() {
        assertEquals(EMPTY, person.getFullName());

        person.setTitle(STRING_01);
        person.setNameFirst(TestNameUtil.randomNameFirst());
        person.setNameMiddle(randomLetter());
        person.setNameLast(TestNameUtil.randomNameLast());
        person.setSuffix(STRING_02);

        final String result = person.getFullName();

        assertEquals(
            STRING_01 + ' '
                + person.getNameFirst() + ' '
                + person.getNameMiddle() + ". "
                + person.getNameLast() + ", "
                + person.getSuffix()
            , result);
    }

    /** Test {@link Person#getFullName()} focus on suffix. */
    @Test
    void getFullNameSuffix() {
        person.setSuffix(STRING_01);

        assertEquals(STRING_01, person.getFullName());

        person.setNameMiddle(STRING_02);

        final String result = person.getFullName();

        assertEquals(STRING_02 + ", " + STRING_01, result);
    }

    /** Set up test. */
    @BeforeEach
    void setUp() {
        person = new Person();
    }
}

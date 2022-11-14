/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.model;

import static com.threeleaf.test.random.TestLocalDate.TODAY;
import static com.threeleaf.test.random.util.TestDateUtil.yearsBetweenFractional;
import static java.lang.Math.max;
import static java.time.temporal.ChronoUnit.YEARS;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import java.time.LocalDate;
import java.util.Map;

import lombok.Data;

/** A Person. */
@Data
public class Person {

    /** Date of birth. */
    private LocalDate birthday;

    /** Gender. */
    private Gender gender;

    /** First name. */
    private String nameFirst;

    /** Last name, surname, family name. */
    private String nameLast;

    /** Middle name. */
    private String nameMiddle;

    /** Pronouns. */
    private Map<PronounType, String> pronouns;

    /** Suffix. */
    private String suffix;

    /** Title */
    private String title;

    /**
     * Get age based on the current date.
     *
     * @return the person's age
     */
    public int getAge() {
        int age = 0;
        if (birthday != null && birthday.isBefore(TODAY)) {
            age = (int) YEARS.between(birthday, TODAY);
        }

        return max(age, 0);
    }

    /**
     * Get fractional age based on the current date.
     *
     * @return the person's age
     */
    public double getAgeFraction() {
        double age = 0;
        if (birthday != null && birthday.isBefore(TODAY)) {
            age = yearsBetweenFractional(birthday, TODAY);
        }

        return age;
    }

    /**
     * Generate the full name.
     *
     * @return the person's full name
     */
    public String getFullName() {
        final StringBuilder name = new StringBuilder();

        if (isNotEmpty(title)) {
            name.append(title).append(' ');
        }
        if (isNotEmpty(nameFirst)) {
            name.append(nameFirst).append(' ');
        }
        if (isNotEmpty(nameMiddle)) {
            name.append(nameMiddle);
            if (nameMiddle.length() == 1) {
                name.append('.');
            }
            name.append(' ');
        }
        if (isNotEmpty(nameLast)) {
            name.append(nameLast).append(' ');
        }
        if (isNotEmpty(suffix)) {
            if (name.length() > 0) {
                if (name.charAt(name.length() - 1) == ' ') {
                    name.setLength(Math.max(name.length() - 1, 0));
                }
                name.append(", ");
            }
            name.append(suffix);
        }

        return name.toString().trim();
    }
}

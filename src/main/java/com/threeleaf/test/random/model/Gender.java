/*
 * Copyright 2019-2022, ThreeLeaf.com
 */
/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.model;

import static com.threeleaf.test.random.TestGender.*;

import lombok.Getter;

/** Gender. */
@Getter
public enum Gender {
    MALE(GENDER_MALE, GENDER_M),
    FEMALE(GENDER_FEMALE, GENDER_F),
    OTHER(GENDER_GENERIC, GENDER_O);

    /** The gender code. */
    final char code;

    /** The gender name. */
    final String name;

    /**
     * Instantiate a gender.
     *
     * @param genderName the gender name
     * @param genderCode the gender code
     */
    Gender(final String genderName, final char genderCode) {
        name = genderName;
        code = genderCode;
    }
}

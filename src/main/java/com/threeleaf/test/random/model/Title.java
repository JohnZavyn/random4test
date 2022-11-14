/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.model;

import static com.threeleaf.test.random.model.Gender.*;

import java.util.ArrayList;
import java.util.Collection;

import lombok.Getter;

/**
 * Titles/honorifics.
 *
 * @see <a href="https://en.wikipedia.org/wiki/English_honorifics">English Honorifics</a>
 */
@Getter
public enum Title {
    DR(OTHER, "Dr."),
    DR_F(FEMALE, "Dr."),
    DR_M(MALE, "Dr."),
    MASTER(MALE, "Master"),
    MISS(FEMALE, "Miss"),
    MR(MALE, "Mr."),
    MRS(FEMALE, "Mrs."),
    MS(FEMALE, "Ms."),
    MX(OTHER, "Mx."),
    SIR(MALE, "Sir");

    /** The gender associated with the honorific. */
    private final Gender gender;

    /** The honorific. */
    private final String honorific;

    /**
     * Instantiate a title.
     *
     * @param theGender    the associated gender
     * @param theHonorific the honorific
     */
    Title(final Gender theGender, final String theHonorific) {
        gender = theGender;
        honorific = theHonorific;
    }

    /**
     * Get titles based on the provided gender.
     *
     * @param gender the gender
     *
     * @return collection of gender appropriate titles
     */
    public static Collection<String> getTitlesFor(final Gender gender) {
        final Collection<String> titles = new ArrayList<>();

        for (final Title title : values()) {
            if (gender.equals(title.getGender())) {
                titles.add(title.getHonorific());
            }
        }

        return titles;
    }
}

/*
 * Copyright 2019-2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestBoolean.oneOutOf;
import static com.threeleaf.test.random.TestDouble.randomPercent;
import static com.threeleaf.test.random.TestGender.PRONOUNS_THIRD_PERSON;
import static com.threeleaf.test.random.TestInteger.INT_100;
import static com.threeleaf.test.random.TestLocalDate.TODAY;
import static com.threeleaf.test.random.model.Gender.FEMALE;
import static com.threeleaf.test.random.model.Gender.MALE;
import static com.threeleaf.test.random.model.Title.getTitlesFor;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestEnumUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestMapUtil.chooseOneValueFrom;
import static com.threeleaf.test.random.util.TestNameUtil.*;
import static lombok.AccessLevel.PRIVATE;

import com.threeleaf.test.random.model.Gender;
import com.threeleaf.test.random.model.Person;

import java.time.LocalDate;

import lombok.NoArgsConstructor;

/** Utilities to create random people. */
@NoArgsConstructor(access = PRIVATE)
public class TestPersonUtil {

    /**
     * Generate a randomized person.
     *
     * @return a random person
     */
    public static Person randomPerson() {
        final Person person = new Person();
        final Gender gender = chooseOneFrom(Gender.class);
        person.setGender(gender);
        if (MALE.equals(gender)) {
            person.setNameFirst(randomNameFirstMale());
            person.setNameMiddle(randomNameFirstMale());
            person.setPronouns(PRONOUNS_THIRD_PERSON.get(gender.getName()));
        } else if (FEMALE.equals(gender)) {
            person.setNameFirst(randomNameFirstFemale());
            person.setNameMiddle(randomNameFirstFemale());
            person.setPronouns(PRONOUNS_THIRD_PERSON.get(gender.getName()));
        } else {
            person.setNameFirst(randomNameFirst());
            person.setNameMiddle(randomNameFirst());
            person.setPronouns(chooseOneValueFrom(PRONOUNS_THIRD_PERSON));
        }
        person.setNameLast(randomNameLast());
        person.setBirthday((LocalDate) TestDateUtil.addFractionalYears(TODAY, -randomPercent()));
        if (oneOutOf(INT_100)) {
            person.setTitle(chooseOneFrom(getTitlesFor(gender)));
        }
        if (oneOutOf(INT_100) && MALE.equals(gender)) {
            /* TODO: Add more suffixes */
            person.setSuffix("Jr.");
        }

        return person;
    }
}

/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.model.PronounType.*;
import static lombok.AccessLevel.PRIVATE;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.threeleaf.test.random.model.PronounType;
import lombok.NoArgsConstructor;

/** Test gender/sex tools. */
@SuppressWarnings("SpellCheckingInspection")
@NoArgsConstructor(access = PRIVATE)
public class TestGender {

    /** The agender/genderless/non-gendered gender name. */
    public static final String GENDER_AGENDER = "Agender";

    /** The androgyne/man-woman gender name. */
    public static final String GENDER_ANDROGYNE = "Androgyne";

    /** The epicene/pangender name. */
    public static final String GENDER_EPICENE = "Pangender";

    /** The female gender code. */
    public static final char GENDER_F = 'F';

    /** The fairy/faerie/fae gender name. */
    public static final String GENDER_FAIRY = "Fairy";

    /** The female gender name. */
    public static final String GENDER_FEMALE = "Female";

    /** The generic/other gender name. */
    public static final String GENDER_GENERIC = "Other";

    /** The human/humanist gender name. */
    public static final String GENDER_HUMAN = "Human";

    /** The male gender code. */
    public static final char GENDER_M = 'M';

    /** The male gender name. */
    public static final String GENDER_MALE = "Male";

    /** The neuter/no gender name. */
    public static final String GENDER_NEUTER = "Neuter";

    /** The neutral/neutrois gender name. */
    public static final String GENDER_NEUTRAL = "Neutral";

    /** The generic/other gender code. */
    public static final char GENDER_O = 'O';

    /** The person gender name. */
    public static final String GENDER_PERSON = "Person";

    /** The transgender name. */
    public static final String GENDER_TRANS = "Transgender";

    /** The versatile gender name. */
    public static final String GENDER_VERSATILE = "Versatile";

    /**
     * A mapping of pronouns to genders. Note that gender-neutral and gender inclusive pronouns do
     * not necessarily map to a defined gender by design. There are also inconsistencies in spelling
     * and
     * usage throught the various communities, so while this is an attempt at a standard
     * representation, it is not definitive or comprehensive.
     *
     * @see <a href="https://en.wikipedia.org/wiki/English_personal_pronouns">English Personal
     *     Pronouns</a>
     * @see <a href="https://uwm.edu/lgbtrc/support/gender-pronouns/">Gender Pronouns</a>
     * @see <a href="https://en.wikipedia.org/wiki/Gender_neutrality_in_languages_with_gendered_third-person_pronouns">Gender
     *     Nutrality</a>
     */
    public static final Map<String, Map<PronounType, String>> PRONOUNS_THIRD_PERSON =
        ImmutableMap.<String, Map<PronounType, String>>builder()
            .put(
                GENDER_MALE,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "he")
                    .put(PERSONAL_OBJECT, "him")
                    .put(PERSONAL_REFLEXIVE, "himself")
                    .put(POSSESSIVE_INDEPENDENT, "his")
                    .put(POSSESSIVE_DEPENDENT, "his")
                    .build()
            )
            .put(
                GENDER_FEMALE,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "she")
                    .put(PERSONAL_OBJECT, "her")
                    .put(PERSONAL_REFLEXIVE, "herself")
                    .put(POSSESSIVE_INDEPENDENT, "hers")
                    .put(POSSESSIVE_DEPENDENT, "her")
                    .build()
            )
            .put(
                /* Elverson pronouns */
                GENDER_NEUTRAL,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "ey")
                    .put(PERSONAL_OBJECT, "em")
                    .put(PERSONAL_REFLEXIVE, "eirself")
                    .put(POSSESSIVE_INDEPENDENT, "eirs")
                    .put(POSSESSIVE_DEPENDENT, "eir")
                    .build()
            )
            .put(
                GENDER_FAIRY,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "fae")
                    .put(PERSONAL_OBJECT, "faer")
                    .put(PERSONAL_REFLEXIVE, "faerself")
                    .put(POSSESSIVE_INDEPENDENT, "faers")
                    .put(POSSESSIVE_DEPENDENT, "faer")
                    .build()
            )
            .put(
                /* Lindsay pronouns */
                GENDER_ANDROGYNE,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "ae")
                    .put(PERSONAL_OBJECT, "aer")
                    .put(PERSONAL_REFLEXIVE, "aerself")
                    .put(POSSESSIVE_INDEPENDENT, "aers")
                    .put(POSSESSIVE_DEPENDENT, "aer")
                    .build()
            )
            .put(
                GENDER_GENERIC,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "one")
                    .put(PERSONAL_OBJECT, "one")
                    .put(PERSONAL_REFLEXIVE, "oneself")
                    .put(POSSESSIVE_INDEPENDENT, "one's")
                    .put(POSSESSIVE_DEPENDENT, "one's")
                    .build()
            )
            .put(
                GENDER_NEUTER,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "it")
                    .put(PERSONAL_OBJECT, "it")
                    .put(PERSONAL_REFLEXIVE, "itself")
                    .put(POSSESSIVE_INDEPENDENT, "its")
                    .put(POSSESSIVE_DEPENDENT, "its")
                    .build()
            )
            .put(
                GENDER_EPICENE,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "they")
                    .put(PERSONAL_OBJECT, "them")
                    .put(PERSONAL_REFLEXIVE, "themself")
                    .put(POSSESSIVE_INDEPENDENT, "theirs")
                    .put(POSSESSIVE_DEPENDENT, "their")
                    .build()
            )
            .put(
                /* Piercy pronouns */
                GENDER_PERSON,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "per")
                    .put(PERSONAL_OBJECT, "per")
                    .put(PERSONAL_REFLEXIVE, "perself")
                    .put(POSSESSIVE_INDEPENDENT, "pers")
                    .put(POSSESSIVE_DEPENDENT, "pers")
                    .build()
            )
            .put(
                GENDER_TRANS,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "tey")
                    .put(PERSONAL_OBJECT, "ter")
                    .put(PERSONAL_REFLEXIVE, "terself")
                    .put(POSSESSIVE_INDEPENDENT, "ters")
                    .put(POSSESSIVE_DEPENDENT, "tem")
                    .build()
            )
            .put(
                /* Hulme pronouns */
                GENDER_VERSATILE,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "ve")
                    .put(PERSONAL_OBJECT, "ver")
                    .put(PERSONAL_REFLEXIVE, "verself")
                    .put(POSSESSIVE_INDEPENDENT, "vers")
                    .put(POSSESSIVE_DEPENDENT, "vis")
                    .build()
            )
            .put(
                /* Rickter pronouns */
                GENDER_AGENDER,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "xe")
                    .put(PERSONAL_OBJECT, "xem")
                    .put(PERSONAL_REFLEXIVE, "xemself")
                    .put(POSSESSIVE_INDEPENDENT, "xyrs")
                    .put(POSSESSIVE_DEPENDENT, "xyr")
                    .build()
            )
            .put(
                /* Humanist pronouns */
                GENDER_HUMAN,
                ImmutableMap.<PronounType, String>builder()
                    .put(PERSONAL_SUBJECT, "hu")
                    .put(PERSONAL_OBJECT, "hum")
                    .put(PERSONAL_REFLEXIVE, "humself")
                    .put(POSSESSIVE_INDEPENDENT, "hus")
                    .put(POSSESSIVE_DEPENDENT, "hus")
                    .build()
            )
            .build();
}

/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random;

import static com.threeleaf.test.random.util.TestPersonUtil.randomPerson;

import com.threeleaf.test.random.model.Person;

public class TestPerson extends AbstractRandom<Person> {

    /**
     * Instantiate a randomized {@link Person} objects factory.
     */
    public TestPerson() {
        super(Person.class);
    }

    /**
     * Generate a random person.
     *
     * @return a randomized Person
     */
    @Override
    public Person random() {
        return randomPerson();
    }
}

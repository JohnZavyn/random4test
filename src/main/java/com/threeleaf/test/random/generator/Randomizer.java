package com.threeleaf.test.random.generator;

public interface Randomizer<T> {

    T random();

    T random(String... fieldsExcluded);
}

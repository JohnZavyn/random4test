package com.threeleaf.test.random.generator;

public interface Randomizer<T> {

    T random(Class<T> type, String... fieldsExcluded);
}

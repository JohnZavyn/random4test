/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestInteger.random1to10;
import static com.threeleaf.test.random.TestString.LINE_FEED_CARRIAGE_RETURN;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Node to anchor at the beginning of a line. This is essentially the
 * object to match for the multiline ^.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Caret extends Node {

    public String getLineFeed() {
        return LINE_FEED_CARRIAGE_RETURN;
    }

    @Override
    public String getValue(final Integer forBackreference) {
        final List<String> lines =
            IntStream.range(0, random1to10())
                .mapToObj(i -> getNext().random(forBackreference))
                .collect(toList());

        return String.join(getLineFeed(), lines);
    }
}

/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import lombok.*;

/**
 * Node class for a case-sensitive BMP-only sequence of literal
 * characters.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class Slice extends SliceNode {

    public Slice(final int[] characters) {
        super(characters);
    }
}

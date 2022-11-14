/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

/**
 * Optimized version of CharProperty that works only for
 * properties never satisfied by Supplementary characters.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Plane_(Unicode)">Basic Multilingual Plane</a>
 */
abstract class CharBmp extends Char {

}

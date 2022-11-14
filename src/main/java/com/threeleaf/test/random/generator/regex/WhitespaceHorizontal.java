/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

/**
 * Node class that matches a Perl horizontal whitespace.
 */
public class WhitespaceHorizontal extends CharBmp {

    private static final String CHARACTERS =
        " \t\u00A0\u1680\u180e\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a"
            + "\u202f\u205f\u3000";

    @Override
    public String getCharacters() {
        return CHARACTERS;
    }
}

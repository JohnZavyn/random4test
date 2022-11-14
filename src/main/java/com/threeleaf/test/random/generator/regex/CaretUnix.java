/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestString.LINE_FEED;

/** Node to anchor at the beginning of a line when in Unix + multiline mode. */
public class CaretUnix extends Caret {

    @Override
    public String getLineFeed() {
        return LINE_FEED;
    }
}

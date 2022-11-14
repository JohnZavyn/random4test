/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import com.threeleaf.test.random.util.TestStringUtil;

class BackReferenceInsensitive extends BackReference {

    BackReferenceInsensitive(final int groupCount) {
        super(groupCount);
    }

    @Override
    public String getValue(final Integer forBackreference) {
        return TestStringUtil.randomizeCase(super.getValue(forBackreference));
    }
}

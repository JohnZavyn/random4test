package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.util.TestStringUtil.randomUuid;
import static lombok.AccessLevel.PRIVATE;

import lombok.NoArgsConstructor;

/** Test password utilities. TODO */
@NoArgsConstructor(access = PRIVATE)
public final class TestPasswordUtil {

    public static String randomPasswordHex(int length) {
        return randomUuid().substring(0, length);
    }
}

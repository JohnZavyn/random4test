package com.threeleaf.test.random.util;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestDateUtil}. */
public class TestDateUtilTest {

    /** Test {@link TestDateUtil} constructor. */
    @Test
    public void constructor() throws Exception {
        Constructor<TestDateUtil> constructor = TestDateUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }
}

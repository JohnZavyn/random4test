package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.util.TestNameUtil.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.*;

import org.junit.jupiter.api.Test;

/** Test {@link TestNameUtil}. */
class TestNameUtilTest {

    /** Test {@link TestNameUtil} constructor. */
    @Test
    void constructor() throws Exception {
        Constructor<TestNameUtil> constructor = TestNameUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestNameUtil#randomName()}. */
    @Test
    void randomName() {
        assertNotNull(TestNameUtil.randomName());
    }

    /** Test {@link TestNameUtil#randomNameFirst()}. */
    @Test
    void randomNameFirst() {
        assertNotNull(TestNameUtil.randomName());
    }

    /** Test {@link TestNameUtil#randomNameFirstFemale()}. */
    @Test
    void randomNameFirstFemale() {
        assertTrue(NAMES_FIRST_FEMALE.contains(TestNameUtil.randomNameFirstFemale()));
    }

    /** Test {@link TestNameUtil#randomNameFirstMale()}. */
    @Test
    void randomNameFirstMale() {
        assertTrue(NAMES_FIRST_MALE.contains(TestNameUtil.randomNameFirstMale()));
    }

    /** Test {@link TestNameUtil#randomNameLast()}. */
    @Test
    void randomNameLast() {
        assertTrue(NAMES_LAST.contains(TestNameUtil.randomNameLast()));
    }
}

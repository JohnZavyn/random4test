package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestIntegerTest.LOOP_COUNT_MAX;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.*;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

/** Test {@link TestEnumUtil}. */
class TestEnumUtilTest {

    /** Test {@link TestEnumUtil#chooseOneFrom(Class)}. */
    @Test
    void chooseOneFrom() {
        final Set<TestEnum> results = new HashSet<>();
        boolean allPossibilitiesFound = false;

        for (int loopNumber = 0; loopNumber < LOOP_COUNT_MAX; loopNumber++) {
            results.add(TestEnumUtil.chooseOneFrom(TestEnum.class));
            if (results.size() == TestEnum.values().length) {
                allPossibilitiesFound = true;
                break;
            }
        }
        if (!allPossibilitiesFound) {
            fail("Expected all possible results, but only found " + results);
        }
    }

    /** Test {@link TestEnumUtil} constructor. */
    @Test
    void constructor() throws Exception {
        final Constructor<TestEnumUtil> constructor = TestEnumUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (final Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** An enum for this test. */
    private enum TestEnum {
        FIRST, SECOND, THIRD
    }
}

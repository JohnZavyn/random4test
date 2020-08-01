package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestIntegerTest.LOOP_COUNT_MAX;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.*;

import com.threeleaf.test.random.TestInternet;
import org.apache.commons.validator.routines.*;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/** Test {@link TestInternetUtil}. */
class TestInternetUtilTest {

    /** Test {@link TestInternetUtil} constructor. */
    @Test
    void constructor() throws Exception {
        Constructor<TestInternetUtil> constructor = TestInternetUtil.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (Exception e) {
            assertTrue(e instanceof InvocationTargetException);
        }
    }

    /** Test {@link TestInternetUtil#randomDomain()}. */
    @Test
    void randomDomain() {
        assertTrue(DomainValidator.getInstance().isValid(TestInternetUtil.randomDomain()));
    }

    /** Test {@link TestInternetUtil#randomEmail()}. */
    @Test
    void randomEmail() {
        assertTrue(EmailValidator.getInstance().isValid(TestInternetUtil.randomEmail()));
    }

    /** Test {@link TestInternetUtil#randomIpAddress()}. */
    @RepeatedTest(LOOP_COUNT_MAX)
    void randomIpAddress() {
        assertTrue(InetAddressValidator.getInstance().isValid(TestInternetUtil.randomIpAddress()));
    }

    /** Test {@link TestInternetUtil#randomIpV4()}. */
    @Test
    void randomIpV4() {
        assertTrue(InetAddressValidator.getInstance()
            .isValidInet4Address(TestInternetUtil.randomIpV4()));
    }

    /** Test {@link TestInternetUtil#randomIpV6()}. */
    @Test
    void randomIpV6() {
        assertTrue(InetAddressValidator.getInstance()
            .isValidInet6Address(TestInternetUtil.randomIpV6()));
    }

    /** Test {@link TestInternetUtil#randomUrl()}. */
    @RepeatedTest(LOOP_COUNT_MAX)
    void randomUrl() {
        String url = TestInternetUtil.randomUrl();

        assertTrue(url.startsWith(TestInternet.HTTP_PROTOCOL));
        assertTrue(UrlValidator.getInstance().isValid(url));
    }

    /** Test {@link TestInternetUtil#randomUrlSecure()}. */
    @Test
    void randomUrlSecure() {
        String url = TestInternetUtil.randomUrlSecure();

        assertTrue(url.startsWith(TestInternet.HTTPS_PROTOCOL));
        assertTrue(UrlValidator.getInstance().isValid(url));
    }
}

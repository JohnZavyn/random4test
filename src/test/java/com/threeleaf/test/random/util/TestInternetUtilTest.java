package com.threeleaf.test.random.util;

import com.threeleaf.test.random.TestInternet;
import org.apache.commons.validator.routines.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/** Test {@link TestInternetUtil} */
public class TestInternetUtilTest
{

    /** Test {@link TestInternetUtil#randomDomain()}. */
    @Test
    public void randomDomain()
    {
        assertTrue(DomainValidator.getInstance().isValid(TestInternetUtil.randomDomain()));
    }

    /** Test {@link TestInternetUtil#randomEmail()}. */
    @Test
    public void randomEmail()
    {
        assertTrue(EmailValidator.getInstance().isValid(TestInternetUtil.randomEmail()));
    }

    /** Test {@link TestInternetUtil#randomIpAddress()}. */
    @Test
    public void randomIpAddress()
    {
        assertTrue(InetAddressValidator.getInstance().isValid(TestInternetUtil.randomIpAddress()));
    }

    /** Test {@link TestInternetUtil#randomIpV4()}. */
    @Test
    public void randomIpV4()
    {
        assertTrue(InetAddressValidator.getInstance().isValidInet4Address(TestInternetUtil.randomIpV4()));
    }

    /** Test {@link TestInternetUtil#randomIpV6()}. */
    @Test
    public void randomIpV6()
    {
        assertTrue(InetAddressValidator.getInstance().isValidInet6Address(TestInternetUtil.randomIpV6()));
    }

    /** Test {@link TestInternetUtil#randomUrl()}. */
    @Test
    public void randomUrl()
    {
        final String url = TestInternetUtil.randomUrl();

        assertTrue(url.startsWith(TestInternet.HTTP_PROTOCOL));
        assertTrue(UrlValidator.getInstance().isValid(url));
    }

    /** Test {@link TestInternetUtil#randomUrlSecure()}. */
    @Test
    public void randomUrlSecure()
    {
        final String url = TestInternetUtil.randomUrlSecure();

        assertTrue(url.startsWith(TestInternet.HTTPS_PROTOCOL));
        assertTrue(UrlValidator.getInstance().isValid(url));
    }
}

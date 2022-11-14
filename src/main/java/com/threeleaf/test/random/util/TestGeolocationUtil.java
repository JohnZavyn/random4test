/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestBoolean.oneOutOf;
import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestString.EMPTY;
import static com.threeleaf.test.random.util.TestAddressUtil.*;
import static com.threeleaf.test.random.util.TestStringUtil.randomLetter;
import static lombok.AccessLevel.PRIVATE;

import com.threeleaf.test.random.model.Geolocation;
import lombok.NoArgsConstructor;

/** Utilities for random geolocation creation. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings({"squid:S1192", "visibilitymodifier", "magicnumber"})
public final class TestGeolocationUtil {

    /**
     * Generate a random PO BOX number.
     *
     * @return a PO BOX number or null
     */
    public static String randomBox() {
        String box = null;
        if (oneOutOf(INT_10)) {
            box = Integer.toString(randomBetween(INT_01, INT_1000));
            if (oneOutOf(INT_10)) {
                box += randomLetter();
            }
        }

        return box;
    }

    /**
     * Generate a random US mailing {@link Geolocation}.
     * Obviously, these are not intended to be real geolocations,
     * but should be good approximation for many testing purposes.
     *
     * @return a geolocation
     */
    public static Geolocation randomGeolocation() {
        final Geolocation geolocation = new Geolocation();
        geolocation.setStreetNumber(EMPTY + randomBetween(INT_01, INT_10000));
        geolocation.setStreetAddress(randomStreetName() + ' ' + randomStreetSuffix());
        geolocation.setStreetSubAddress(randomSubAddress());
        geolocation.setBox(randomBox());
        geolocation.setStateAbbreviation(randomState());
        geolocation.setState(findStateName(geolocation.getStateAbbreviation()));
        geolocation.setCity(findCapital(geolocation.getStateAbbreviation()));
        geolocation.setZipCode(findCapitalZip(geolocation.getStateAbbreviation()));
        geolocation.setCountry("US");

        return geolocation;
    }

    /**
     * Generate a random US mailing {@link Geolocation}.
     * Obviously, these are not intended to be real geolocations,
     * but should be good approximation for many testing purposes.
     *
     * @return a geolocation
     */
    public static Geolocation randomShortGeolocation() {
        final Geolocation geolocation = new Geolocation();
        geolocation.setStreetNumber(EMPTY + randomBetween(INT_01, INT_10000));
        geolocation.setStreetAddress(randomStreetName() + ' ' + randomStreetShortSuffix());
        geolocation.setStreetSubAddress(randomSubAddress());
        geolocation.setBox(randomBox());
        geolocation.setStateAbbreviation(randomState());
        geolocation.setState(findStateName(geolocation.getStateAbbreviation()));
        geolocation.setCity(findCapital(geolocation.getStateAbbreviation()));
        geolocation.setZipCode(findCapitalZip(geolocation.getStateAbbreviation()));
        geolocation.setCountry("US");

        return geolocation;
    }

    /**
     * Generate a random sub-address.
     *
     * @return a PO BOX number or null
     */
    public static String randomSubAddress() {
        String subAddress = null;
        if (oneOutOf(INT_10)) {
            subAddress = EMPTY + randomBetween(INT_10, INT_100);
            if (oneOutOf(INT_10)) {
                subAddress += randomLetter();
            }
        }

        return subAddress;
    }

}

/*
 * Copyright 2019-2022, ThreeLeaf.com
 */
/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.model;

import static com.threeleaf.test.random.TestString.EMPTY;
import static com.threeleaf.test.random.util.TestStringUtil.isBlank;

import java.io.Serializable;
import java.util.List;

import com.google.common.collect.ImmutableList;
import lombok.Data;

/** A geolocation. */
@Data
public class Geolocation implements Serializable {

    /**
     * A list of street suffixes.
     * See <a href="https://en.wikipedia.org/wiki/Street_suffix">Wikipedia: Street Suffix</a>
     */
    public static final List<String> STREET_SUB_ADDRESSES = ImmutableList.of(
        "#",
        "Apt",
        "Unit",
        "Floor"
    );

    private static final long serialVersionUID = 1116323374555470093L;

    /** The PO BOX number. */
    private String box;

    /** The city. */
    private String city;

    /** The country abbreviation. */
    private String country;

    /** The state. */
    private String state;

    /** The state abbreviation. */
    private String stateAbbreviation;

    /** The street address. */
    private String streetAddress;

    /** The street number. */
    private String streetNumber;

    /** The street sub-address (for example, apartment number). */
    private String streetSubAddress;

    /** The zip code. */
    private String zipCode;

    /**
     * Return the string, or convert to empty string if blank.
     *
     * @param string the original string
     *
     * @return the original string or empty string
     */
    private String defaultToEmpty(final String string) {
        return isBlank(string) ? EMPTY : string;
    }

    /**
     * Get the formatted address.
     *
     * @return string the address
     */
    public String getFormattedAddress() {
        String address = getFormattedStreetAddress();
        address += isEitherBlank(address, city) ? defaultToEmpty(city) : ", " + city;
        address += isEitherBlank(address, state) ? defaultToEmpty(state) : ", " + state;
        address += isEitherBlank(address, zipCode) ? defaultToEmpty(zipCode) : " " + zipCode;
        address += isEitherBlank(address, country) ? defaultToEmpty(country) : ", " + country;

        return isBlank(address) ? null : address;
    }

    /**
     * Generate the street address from components.
     *
     * @return ?string street address
     */
    public String getFormattedStreetAddress() {
        String address = defaultToEmpty(streetNumber);
        address += isEitherBlank(address, streetAddress) ? defaultToEmpty(streetAddress) : " " + streetAddress;
        address += isEitherBlank(address, streetSubAddress) ? defaultToEmpty(streetSubAddress) : " #" + streetSubAddress;
        address += isEitherBlank(address, box) ? defaultToEmpty(box) : ", PO BOX " + box;

        return isBlank(address) ? null : address;
    }

    /**
     * Determine if either string is blank.
     *
     * @param string1 the first string
     * @param string2 the second string
     *
     * @return true if either is blank
     */
    private boolean isEitherBlank(final String string1, final String string2) {
        return isBlank(string1) || isBlank(string2);
    }
}

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestString.EMPTY;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static com.threeleaf.test.random.util.TestMapUtil.chooseOneKeyFrom;
import static com.threeleaf.test.random.util.TestMapUtil.chooseOneValueFrom;
import static lombok.AccessLevel.PRIVATE;

import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.threeleaf.test.random.model.Address;
import lombok.NoArgsConstructor;

/** Utilities for random address creation. */
@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings(
        {"WeakerAccess", "squid:S1192", "checkstyle:visibilitymodifier", "checkstyle:magicnumber"})
public class TestAddressUtil {

    /**
     * A Map of state information including:
     * <ul>
     * <li>State abbreviation (key)</li>
     * <li>State name</li>
     * <li>Minimum zip code</li>
     * <li>Maximum zip code</li>
     * <li>State capital</li>
     * <li>State capital primary zip code</li>
     * </ul>
     * Note that the min and max zip codes have been simplified to have a single range for each
     * state. Some states have two or three ranges.
     * <p>
     * See http://www.aip2.com/zip2.htm
     * https://www.irs.gov/pub/irs-utl/zip%20code%20and%20state%20abbreviations.pdf
     */
    public static final Map<String, Object[]> STATE_INFORMATION = ImmutableMap.<String, Object[]>builder() // @formatter:off //
          .put("AL", new Object[]{"Alabama",          35004, 36925, "Montgomery",     "36101" })
          .put("AK", new Object[]{"Alaska",           99501, 99950, "Juneau",         "99801" })
          .put("AZ", new Object[]{"Arizona",          85001, 86556, "Phoenix",        "85001" })
          .put("AR", new Object[]{"Arkansas",         71601, 72959, "Little Rock",    "72201" })
          .put("CA", new Object[]{"California",       90001, 96162, "Sacramento",     "94203" })
          .put("CO", new Object[]{"Colorado",         80001, 81658, "Denver",         "80201" })
          .put("CT", new Object[]{"Connecticut",       6001,  6928, "Hartford",       "06101" })
          .put("DE", new Object[]{"Delaware",         19701, 19980, "Dover",          "19901" })
          .put("DC", new Object[]{"Dist of Columbia", 20001, 20799, "Washington",     "20001" })
          .put("FL", new Object[]{"Florida",          32004, 34997, "Tallahassee",    "32301" })
          .put("GA", new Object[]{"Georgia",          30001, 31999, "Atlanta",        "30301" })
          .put("HI", new Object[]{"Hawaii",           96701, 96898, "Honolulu",       "96801" })
          .put("ID", new Object[]{"Idaho",            83201, 83876, "Boise",          "83701" })
          .put("IL", new Object[]{"Illinois",         60001, 62999, "Springfield",    "62701" })
          .put("IN", new Object[]{"Indiana",          46001, 47997, "Indianapolis",   "46201" })
          .put("IA", new Object[]{"Iowa",             50001, 52809, "Des Moines",     "50301" })
          .put("KS", new Object[]{"Kansas",           66002, 67954, "Topeka",         "66601" })
          .put("KY", new Object[]{"Kentucky",         40003, 42788, "Frankfort",      "40601" })
          .put("LA", new Object[]{"Louisiana",        70001, 71497, "Baton Rouge",    "70801" })
          .put("ME", new Object[]{"Maine",             3901,  4992, "Augusta",        "04330" })
          .put("MD", new Object[]{"Maryland",         20331, 21930, "Annapolis",      "21401" })
          .put("MA", new Object[]{"Massachusetts",     1001,  2791, "Boston",         "02108" })
          .put("MI", new Object[]{"Michigan",         48001, 49971, "Lansing",        "48901" })
          .put("MN", new Object[]{"Minnesota",        55001, 56763, "Saint Paul",     "55101" })
          .put("MS", new Object[]{"Mississippi",      38601, 39776, "Jackson",        "39201" })
          .put("MO", new Object[]{"Missouri",         63001, 65899, "Jefferson City", "65101" })
          .put("MT", new Object[]{"Montana",          59001, 59937, "Helena",         "59601" })
          .put("NE", new Object[]{"Nebraska",         68001, 69367, "Lincoln",        "68501" })
          .put("NV", new Object[]{"Nevada",           88901, 89883, "Carson City",    "89701" })
          .put("NH", new Object[]{"New Hampshire",     3031,  3897, "Concord",        "03301" })
          .put("NJ", new Object[]{"New Jersey",        7001,  8989, "Trenton",        "08601" })
          .put("NM", new Object[]{"New Mexico",       87001, 88441, "Santa Fe",       "87501" })
          .put("NY", new Object[]{"New York",         10001, 14975, "Albany",         "12201" })
          .put("NC", new Object[]{"North Carolina",   27006, 28909, "Raleigh",        "27601" })
          .put("ND", new Object[]{"North Dakota",     58001, 58856, "Bismarck",       "58501" })
          .put("OH", new Object[]{"Ohio",             43001, 45999, "Columbus",       "43201" })
          .put("OK", new Object[]{"Oklahoma",         73001, 74966, "Oklahoma City",  "73101" })
          .put("OR", new Object[]{"Oregon",           97001, 97920, "Salem",          "97301" })
          .put("PA", new Object[]{"Pennsylvania",     15001, 19640, "Harrisburg",     "17101" })
          .put("RI", new Object[]{"Rhode Island",      2801,  2940, "Providence",     "02901" })
          .put("SC", new Object[]{"South Carolina",   29001, 29948, "Columbia",       "29201" })
          .put("SD", new Object[]{"South Dakota",     57001, 57799, "Pierre",         "57501" })
          .put("TN", new Object[]{"Tennessee",        37010, 38589, "Nashville",      "37201" })
          .put("TX", new Object[]{"Texas",            75001, 79999, "Austin",         "73301" })
          .put("UT", new Object[]{"Utah",             84001, 84784, "Salt Lake City", "84101" })
          .put("VT", new Object[]{"Vermont",           5001,  5907, "Montpelier",     "05601" })
          .put("VA", new Object[]{"Virginia",         20040, 24658, "Richmond",       "23218" })
          .put("WA", new Object[]{"Washington",       98001, 99403, "Olympia",        "98501" })
          .put("WV", new Object[]{"West Virginia",    24701, 26886, "Charleston",     "25301" })
          .put("WI", new Object[]{"Wisconsin",        53001, 54990, "Madison",        "53701" })
          .put("WY", new Object[]{"Wyoming",          82001, 83128, "Cheyenne",       "82001" })
      .build();  // @formatter:on //

    /**
     * A list of common street names in the US.
     * See https://fivethirtyeight.com/features/whats-the-most-common-street-name-in-america/
     */
    public static final List<String> STREET_NAMES = ImmutableList.<String>builder() // @formatter:off //
          .add("Main")
          .add("First")
          .add("Second")
          .add("Third")
          .add("Fourth")
          .add("Fifth")
          .add("Sixth")
          .add("Seventh")
          .add("Eighth")
          .add("Ninth")
          .add("Tenth")
          .add("Park")
          .add("Oak")
          .add("Pine")
          .add("Maple")
          .add("Cedar")
          .add("Elm")
          .add("View")
          .add("Washington")
          .add("Lake")
          .add("Hill")
          .add("Walnut")
          .add("Spring")
          .add("North")
          .add("Ridge")
          .add("Lincoln")
          .add("Church")
          .add("Willow")
          .add("Mill")
          .add("Sunset")
          .add("Railroad")
          .add("Jackson")
          .add("Cherry")
          .add("West")
          .add("South")
          .add("Center")
          .add("Highland")
          .add("Johnson")
          .add("Forest")
          .add("Jefferson")
          .add("Hickory")
          .add("Wilson")
          .add("River")
          .add("Meadow")
          .add("Valley")
          .add("Smith")
          .add("East")
          .add("Chestnut")
          .add("Franklin")
          .add("Adams")
          .add("Spruce")
          .add("Laural")
          .add("Davis")
          .add("Birch")
          .add("Williams")
          .add("Lee")
          .add("Dogwood")
          .add("Green")
          .add("Poplar")
          .add("Locust")
          .add("Woodland")
          .add("Taylor")
          .add("Ash")
          .add("Madison")
          .add("Hillcrest")
          .add("Sycamore")
          .add("Broadway")
          .add("Miller")
          .add("Lakeview")
          .add("College")
          .add("Central")
    .build(); // @formatter:on //

    /**
     * A list of street suffixes.
     * See https://en.wikipedia.org/wiki/Street_suffix
     */
    public static final List<String> STREET_SUFFIXES = ImmutableList.<String>builder() // @formatter:off //
          .add("Avenue")
          .add("Branch")
          .add("Brook")
          .add("Circle")
          .add("Course")
          .add("Crescent")
          .add("Crossing")
          .add("Drive")
          .add("Estate")
          .add("Ferry")
          .add("Garden")
          .add("Grove")
          .add("Haven")
          .add("Heights")
          .add("Hollow")
          .add("Junction")
          .add("Landing")
          .add("Lane")
          .add("Loop")
          .add("Manor")
          .add("Meadow")
          .add("Mews")
          .add("Oval")
          .add("Pass")
          .add("Perch")
          .add("Place")
          .add("Point")
          .add("Road")
          .add("Run")
          .add("Shore")
          .add("Spur")
          .add("Square")
          .add("Station")
          .add("Street")
          .add("Terrace")
          .add("Trace")
          .add("Track")
          .add("Trail")
          .add("Vale")
          .add("Valley")
          .add("View")
          .add("Villa")
          .add("Vista")
          .add("Walk")
          .add("Way")
    .build(); // @formatter:on //

    /**
     * Find the capital of the given state
     *
     * @param stateAbbreviation the state abbreviation
     *
     * @return the state's capital
     */
    public static String findCapital(String stateAbbreviation) {
        return (String) STATE_INFORMATION.get(stateAbbreviation)[3];
    }

    /**
     * Find the capital city zip code of the given state
     *
     * @param stateAbbreviation the state abbreviation
     *
     * @return the state capital's zip code
     */
    public static String findCapitalZip(String stateAbbreviation) {
        return (String) STATE_INFORMATION.get(stateAbbreviation)[4];
    }

    /**
     * Generate a random US mailing {@link Address}.
     * Obviously, these are not intended to be real addresses,
     * but should be good approximation for many testing purposes.
     *
     * @return an address
     */
    public static Address randomAddress() {
        Address address = new Address();
        address.setNameResident(TestNameUtil.randomName());
        address.setStreetAddress(
                EMPTY + randomBetween(INT_01, INT_10000) + ' ' + randomStreetName() + ' '
                        + randomStreetSuffix());
        address.setState(randomState());
        address.setCity(findCapital(address.getState()));
        address.setZipCode(findCapitalZip(address.getState()));

        return address;
    }

    /**
     * Return a random US state abbreviation.
     *
     * @return a state abbreviation
     */
    public static String randomState() {
        return chooseOneKeyFrom(STATE_INFORMATION);
    }

    /**
     * Return a random US state name.
     *
     * @return a state name
     */
    public static String randomStateName() {
        return (String) chooseOneValueFrom(STATE_INFORMATION)[0];
    }

    /**
     * Return a random street name
     *
     * @return a street name
     */
    public static String randomStreetName() {
        return chooseOneFrom(STREET_NAMES);
    }

    /**
     * Return a random street suffix
     *
     * @return a street suffix
     */
    public static String randomStreetSuffix() {
        return chooseOneFrom(STREET_SUFFIXES);
    }

    /**
     * Return a random zip code within the specified state.
     * Specific values may not represent any real zip code,
     * but the value is within the known range of zip codes
     * for the given state.
     *
     * @param stateAbbreviation the state abbreviation
     *
     * @return a zip code
     */
    public static String randomZip(String stateAbbreviation) {
        Object[] stateInfo = STATE_INFORMATION.get(stateAbbreviation);

        return String.format("%05d", randomBetween((int) stateInfo[1], (int) stateInfo[2]));
    }

    /**
     * Return any random zip code.
     *
     * @return a zip code
     */
    public static String randomZip() {
        return randomZip(randomState());
    }
}

package com.threeleaf.test.random.util;

import com.google.common.collect.ImmutableMap;
import lombok.experimental.UtilityClass;

import java.util.Map;

import static com.threeleaf.test.random.util.TestMapUtil.chooseOneKeyFrom;
import static com.threeleaf.test.random.util.TestMapUtil.chooseOneValueFrom;
import static com.threeleaf.test.random.util.TestNumberUtil.randomBetween;

/** Utilities for random address creation. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestAddressUtil
{

    /** A Map of state information including full name, minimum zip code, and maximum zip code (excludes some exceptions). */
    public static final Map<String, Object[]> STATE_INFORMATION = ImmutableMap.<String, Object[]>builder()  // @formatter:off //
          .put("AL", new Object[]{"Alabama", 35004, 36925})
          .put("AK", new Object[]{"Alaska", 99501, 99950})
          .put("AZ", new Object[]{"Arizona", 85001, 86556})
          .put("AR", new Object[]{"Arkansas", 71601, 72959})
          .put("CA", new Object[]{"California", 90001, 96162})
          .put("CO", new Object[]{"Colorado", 80001, 81658})
          .put("CT", new Object[]{"Connecticut", 6001, 6928})
          .put("DE", new Object[]{"Delaware", 19701, 19980})
          .put("DC", new Object[]{"Dist of Columbia", 20001, 20799})
          .put("FL", new Object[]{"Florida", 32004, 34997})
          .put("GA", new Object[]{"Georgia", 30001, 31999})
          .put("HI", new Object[]{"Hawaii", 96701, 96898})
          .put("ID", new Object[]{"Idaho", 83201, 83876})
          .put("IL", new Object[]{"Illinois", 60001, 62999})
          .put("IN", new Object[]{"Indiana", 46001, 47997})
          .put("IA", new Object[]{"Iowa", 50001, 52809})
          .put("KS", new Object[]{"Kansas", 66002, 67954})
          .put("KY", new Object[]{"Kentucky", 40003, 42788})
          .put("LA", new Object[]{"Louisiana", 70001, 71497})
          .put("ME", new Object[]{"Maine", 3901, 4992})
          .put("MD", new Object[]{"Maryland", 20331, 21930})
          .put("MA", new Object[]{"Massachusetts", 1001, 2791})
          .put("MI", new Object[]{"Michigan", 48001, 49971})
          .put("MN", new Object[]{"Minnesota", 55001, 56763})
          .put("MS", new Object[]{"Mississippi", 38601, 39776})
          .put("MT", new Object[]{"Montana", 59001, 59937})
          .put("NE", new Object[]{"Nebraska", 68001, 69367})
          .put("NV", new Object[]{"Nevada", 88901, 89883})
          .put("NH", new Object[]{"New Hampshire", 3031, 3897})
          .put("NJ", new Object[]{"New Jersey", 7001, 8989})
          .put("NM", new Object[]{"New Mexico", 87001, 88441})
          .put("NY", new Object[]{"New York", 10001, 14975})
          .put("NC", new Object[]{"North Carolina", 27006, 28909})
          .put("ND", new Object[]{"North Dakota", 58001, 58856})
          .put("OH", new Object[]{"Ohio", 43001, 45999})
          .put("OK", new Object[]{"Oklahoma", 73001, 74966})
          .put("OR", new Object[]{"Oregon", 97001, 97920})
          .put("PA", new Object[]{"Pennsylvania", 15001, 19640})
          .put("RI", new Object[]{"Rhode Island", 2801, 2940})
          .put("SC", new Object[]{"South Carolina", 29001, 29948})
          .put("SD", new Object[]{"South Dakota", 57001, 57799})
          .put("TN", new Object[]{"Tennessee", 37010, 38589})
          .put("TX", new Object[]{"Texas", 75001, 79999})
          .put("UT", new Object[]{"Utah", 84001, 84784})
          .put("VT", new Object[]{"Vermont", 5001, 5907})
          .put("VA", new Object[]{"Virginia", 20040, 24658})
          .put("WA", new Object[]{"Washington", 98001, 99403})
          .put("WV", new Object[]{"West Virginia", 24701, 26886})
          .put("WI", new Object[]{"Wisconsin", 53001, 54990})
          .put("WY", new Object[]{"Wyoming", 82001, 83128})
          .build();  // @formatter:on //

    /**
     * Return a random US state abbreviation.
     *
     * @return state abbreviation
     */
    public static String randomState()
    {
        return chooseOneKeyFrom(STATE_INFORMATION);
    }

    /**
     * Return a random US state name.
     *
     * @return state name
     */
    public static String randomStateName()
    {
        return (String) chooseOneValueFrom(STATE_INFORMATION)[0];
    }

    /**
     * Return any random zip code.
     *
     * @return a zip code
     */
    public static String randomZip()
    {
        return randomZip(randomState());
    }

    /**
     * Return a random zip code within the specified state.
     *
     * @param stateAbbreviation the state abbreviation
     *
     * @return a zip code
     */
    public static String randomZip(final String stateAbbreviation)
    {
        final Object[] stateInfo = STATE_INFORMATION.get(stateAbbreviation);

        return String.format("%05d", randomBetween((int) stateInfo[1], (int) stateInfo[2]));
    }
}

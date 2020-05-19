package wh_12_2;

import java.util.Map;

public class CountrySearch {

    static String countryInfo(Map<String, Country> countriesMap, String isoCode) {
        String countryInfo = "";
        countryInfo = countriesMap.get(isoCode).toString();
        return countryInfo;
    }
}

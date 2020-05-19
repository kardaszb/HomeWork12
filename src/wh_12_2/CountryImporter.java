package wh_12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class CountryImporter {
    static Map<String, Country> readFile(String fileName) throws FileNotFoundException {
        Map<String, Country> countriesMap = new HashMap<>();
        try (Scanner fileReader = new Scanner(new File(fileName))) {
            fileReader.nextLine();
            while (fileReader.hasNextLine()) {
                String[] data = fileReader.nextLine().split(";");
                String countryCode = data[0];
                Country country = new Country(data[0], data[1], Long.parseLong(data[2]));
                countriesMap.put(countryCode, country);
            }
        }
        return countriesMap;
    }
}
package wh_12_2;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryApp {
    private static final int READ_MAP_FROM_FILE = 0;
    private static final int DISPLAY_COUNTRY_INFO = 1;
    private static final int EXIT = 2;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Country> countriesMap = new HashMap<>();

        int userOption;
        do {
            printOptions();
            System.out.println("Wybierz opcję:");
            userOption = sc.nextInt();
            sc.nextLine();
            switch (userOption) {
                case READ_MAP_FROM_FILE:
                    System.out.println("-> podaj nazwe pliku:");
                    String fileName = sc.nextLine();
                    countriesMap = CountryImporter.readFile(fileName);
                    break;
                case DISPLAY_COUNTRY_INFO:
                    System.out.println(" -> wpisz kod kraju:");
                    String isoCode = sc.nextLine();
                    System.out.println(CountrySearch.countryInfo(countriesMap,isoCode));
                    break;
                case EXIT:
                    System.out.println("Papa!");
            }
        } while (userOption != EXIT);
    }


    private static void printOptions() {
        System.out.println(READ_MAP_FROM_FILE + " - Wczytaj dane z pliku.");
        System.out.println(DISPLAY_COUNTRY_INFO + " - Wyszukaj informacje.");
        System.out.println(EXIT + " - Wyjście z programu.");
    }
}

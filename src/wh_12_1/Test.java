package wh_12_1;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        final String FILE_NAME = "TestFile.txt";
        List<Integer> numbersFromFile = new ArrayList<>();
        Map<Integer, Integer> occurrenceCounting = new HashMap();
        try {
            FileReader.readFromFile(FILE_NAME, numbersFromFile);
            OccurrenceCounter.countOccurrence(numbersFromFile, occurrenceCounting);
            for (Map.Entry<Integer, Integer> entry : occurrenceCounting.entrySet()) {
                System.out.println(entry.getKey() + " – liczba wystąpień: " + entry.getValue());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Nie znalazlme pliku");
        }
    }
}

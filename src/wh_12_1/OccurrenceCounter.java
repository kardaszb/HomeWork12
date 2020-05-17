package wh_12_1;

import java.util.List;
import java.util.Map;

public class OccurrenceCounter {
    static Map<Integer, Integer> countOccurrence(List<Integer> numbersFromFile, Map<Integer, Integer> countOccurrence) {
        int iterator = numbersFromFile.size();
        for (int i = 0; i < iterator; i++) {
            int numberToCheck = numbersFromFile.get(i);
            countOccurrence.put(numberToCheck, numberOfOccurrence(numberToCheck, numbersFromFile));
        }
        return countOccurrence;
    }

    static int numberOfOccurrence(int numberToCheck, List<Integer> numbersFromFile) {
        int numberOfOccurrence = 0;
        int iterator = numbersFromFile.size();
        for (int i = 0; i < iterator; i++) {
            if (numbersFromFile.get(i) == numberToCheck) {
                numberOfOccurrence += 1;
            }
        }
        return numberOfOccurrence;
    }
}

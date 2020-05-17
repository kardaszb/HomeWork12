package wh_12_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurrenceCounter {
    static Map<Integer, Integer> countOccurrence(List<Integer> numbersFromFile) {
        Map<Integer, Integer> countOccurrence = new HashMap<>();
        int numberListSize = numbersFromFile.size();
        for (int i = 0; i < numberListSize; i++) {
            int numberToCheck = numbersFromFile.get(i);
            countOccurrence.put(numberToCheck, getNumberOfOccurences(numberToCheck, numbersFromFile));
        }
        return countOccurrence;
    }

    static int getNumberOfOccurences(int numberToCheck, List<Integer> numbersFromFile) {
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

package wh_12_3;

import java.util.*;

public class SumOfNumbers {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillListFromUser(numbers);
        try {
            for(Double reversedNumbers: reversOrder(numbers)) {
                System.out.println(reversedNumbers);
            }
            System.out.println(sumOfNumbers(numbers));
            System.out.println(maxAndMinNumbers(numbers));
        } catch (IllegalArgumentException ex) {
            System.out.println("Na pustej liscie nie da sie wykonac operacji");
        }
    }

    static List<Double> fillListFromUser(List<Double> getNumbers) {
        boolean input = true;
        do {
            System.out.println("Podaj kolejną liczbę dodatnia (podaj ujemna liczbe aby wyjsc z programu)");
            double value = sc.nextDouble();
            if (value > 0) {
                getNumbers.add(value);
            } else {
                input = false;
            }
        }
        while (input);
        return getNumbers;
    }

    static String sumOfNumbers(List<Double> sumNumbers) {
        if (sumNumbers.isEmpty()) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (double d : sumNumbers) {
            sb.append(d);
            sb.append('+');
            sum += d;
        }
        sb.replace(sb.length() - 1, sb.length(), "=");
        sb.append(sum);
        return sb.toString();
    }

    static List<Double> reversOrder(List<Double> listOfNumbers) {
        if (listOfNumbers.isEmpty()) {
            throw new IllegalArgumentException();
        }
        List<Double> reversListOfNumbers = new ArrayList<>();
        ListIterator<Double> listIteratorList = listOfNumbers.listIterator(listOfNumbers.size());
        while (listIteratorList.hasPrevious()) {
            Double number = listIteratorList.previous();
            reversListOfNumbers.add(number);
        }
        return reversListOfNumbers;
    }

    static String maxAndMinNumbers(List<Double> listOfNumbers) {
        if (listOfNumbers.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return "Najwieksza liczba to: " + Collections.max(listOfNumbers) + "\n"
                + "Najmniejsza liczba to: " + Collections.min(listOfNumbers);
    }
}
package wh_12_3;

import java.util.*;

public class SumOfNumbers {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillListFromUser(numbers);
        try {
            reversOrder(numbers);
            sumOfNumbers(numbers);
            maxAndMinNumbers(numbers);
        } catch (IllegalArgumentException ex) {
            System.out.println("Na pustej liscie nie da sie wykonac operacji");
        }

    }

    static void fillListFromUser(List<Double> list) {
        System.out.println("Podaj kolejną liczbę dodatnia (podaj ujemna liczbe aby wyjsc z programu)");

        double input = sc.nextDouble();
        if (input < 0)
            return;

        try {
            list.add(input);
        } catch (NumberFormatException e) {
            System.err.println("Liczba w niepoprawnym formacie");
        }

        fillListFromUser(list);
    }

    static void sumOfNumbers(List<Double> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (double d : list) {
            sb.append(d);
            sb.append('+');
            sum += d;
        }
        sb.replace(sb.length() - 1, sb.length(), "=");
        sb.append(sum);
        System.out.println(sb.toString());
    }

    static void reversOrder(List<Double> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        ListIterator<Double> listIteratorList = list.listIterator(list.size());
        while (listIteratorList.hasPrevious()) {
            Double number = listIteratorList.previous();
            System.out.println(number);
        }
    }

    static void maxAndMinNumbers(List<Double> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        System.out.println("Najwieksza liczba to: " + Collections.max(list) + "\n"
                + "Najmniejsza liczba to: " + Collections.min(list));
    }
}
package hw7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtils {
    public static String getInitials(List<String> strings) {
        StringBuilder result = new StringBuilder();

        for (String s : strings) {
            result.append(s.charAt(0));
        }

        return result.toString();
    }

    // [a, b, c, d]
    // [d, b, c, a]
    // temp: a
    public static void swapFirstAndLast(List<String> list) {
        String temp = list.getFirst(); // pre-Java 21: list.get(0) instead of list.getFirst()
        list.set(0, list.getLast());   // pre-Java 21: list.get(list.size() - 1) instead of list.getLast()
        list.set(list.size() - 1, temp);
    }

    public static List<Integer> firstN(List<Integer> list, int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(list.get(i));
        }

        return result;

        // or simply: return list.subList(0, n);
    }

    public static List<Integer> lastN(List<Integer> list, int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = list.size() - n; i < list.size(); i++) {
            result.add(list.get(i));
        }

        return result;

        // or simply: return list.subList(list.size() - n, list.size());
    }

    public static boolean isSorted(List<Double> list) {
        if (list.isEmpty()) {
            return true;
        }

        double previous = list.getFirst();

        for (int i = 1; i < list.size(); i++) {
            double current = list.get(i);

            if (previous > current) {
                return false;
            }

            previous = current;
        }

        return true;
    }

    public static void printSorted(List<String> list) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy);

        for (int i = 0; i < copy.size(); i++) {
            if (i < copy.size() - 1) { // not last index
                System.out.print(copy.get(i) + " ");
            } else { // last index, i == copy.size() - 1
                System.out.println(copy.get(i));
            }
        }
    }
}

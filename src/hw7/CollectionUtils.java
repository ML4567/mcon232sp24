package hw7;

import java.util.Collection;

public class CollectionUtils {
    public static double average(Collection<Integer> integers) {
        int sum = 0;

        for (Integer integer : integers) {
            sum += integer;
        }

        return sum / (double) integers.size();
    }

    public static int maxLength(Collection<String> strings) {
        int maxLength = 0;

        for (String s : strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }

        return maxLength;
    }
}

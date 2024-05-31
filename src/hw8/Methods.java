package hw8;

import java.util.List;

public class Methods {
    public static double average(List<String> list) {
        double sum = 0;
        int numValid = 0;

        for (String s : list) {
            try {
                sum += Double.parseDouble(s);
                numValid++;
            } catch (NumberFormatException ignored) {
            }
        }

        if (numValid == 0) {
            throw new IllegalArgumentException("no parseable elements");
        } else {
            return sum / numValid;
        }
    }

    public static double max(List<String> list) {
        double maxSoFar = Double.NEGATIVE_INFINITY;
        boolean foundValid = false;

        for (String s : list) {
            try {
                double number = Double.parseDouble(s);

                if (number > maxSoFar) {
                    maxSoFar = number;
                }

                foundValid = true;
            } catch (NumberFormatException ignored) {
            }
        }

        if (!foundValid) {
            throw new IllegalArgumentException("no parseable elements");
        } else {
            return maxSoFar;
        }
    }
}

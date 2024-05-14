package I_ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// reads an arbitrary amount of numbers from
// numbers.txt and prints them in reverse order

// we don;t want to read through the file more than once, so an array won't work

public class ReversePrinter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("numbers.txt"));
        List<Double> list = new ArrayList<>();

        while (scanner.hasNext()) {
            double number = scanner.nextDouble();
            list.add(number);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}

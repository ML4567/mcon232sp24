package A_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HoursProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("hours.txt"));

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            int id = lineScanner.nextInt();
            String name = lineScanner.next();

            double totalHours = 0.0;
            int numDays = 0;

            while (lineScanner.hasNextDouble()) {
                double hours = lineScanner.nextDouble();
                totalHours += hours;
                numDays++;
            }

            double average = totalHours / numDays;

//            System.out.println(name + " (ID#" + id + ") worked " +
//                               totalHours + " hours (" + average + " hours/day)");
            System.out.printf("%s (ID#%d) worked %.2f hours (%.2f hours/day)%n",
                    name, id, totalHours, average);
        }
    }
}

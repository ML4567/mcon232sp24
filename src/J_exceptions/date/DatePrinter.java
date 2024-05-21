package J_exceptions.date;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// a client of the Date class
// reads dates from dates.txt and then print the valid dates to valid-dates.txt.
// skips invalid dates and prints them to the screen
public class DatePrinter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("src/J_exceptions/date/dates.txt"));
        PrintStream ps = new PrintStream("src/J_exceptions/date/valid-dates.txt");

        while (fileScanner.hasNext()) {
            try {
                Date date = Date.parse(fileScanner.next());
                ps.println(date);
            } catch (InvalidDateException e) {
                System.out.println("invalid date: " + e.getInvalidDate());
            }
        }

        ps.close();
    }
}

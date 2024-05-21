package J_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Try-with-resources: 
A kind of try block. It has a header inside of which we can 
create any objects that inherit from the AutoCloseable interface,
such as Scanner and PrintStream.
These resources will be closed automatically by Java at the end of the try-with-resources block, 
that is, the system will automatically call the close() method.

AutoCloseable interface documentation:
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/AutoCloseable.html
*/
public class TryWithResourcesDemo {
    public static void demo1(int numerator, int denominator, String filename) throws FileNotFoundException {
        try (PrintStream ps = new PrintStream(filename)) {
            int quotient = numerator / denominator;
            ps.println(quotient);
            // ps.close() gets called automatically
        } catch (ArithmeticException e) {
            System.out.println("denominator cannot be 0");
        }
    }

    // reads two ints from the given input file and prints their quotient to the given output file
    public static void demo2(String inputFileName, String outputFileName) throws FileNotFoundException {
        try (Scanner fileScanner = new Scanner(new File(inputFileName));
             PrintStream printStream = new PrintStream(outputFileName)) {
            int numerator = fileScanner.nextInt();
            int denominator = fileScanner.nextInt();
            int quotient = numerator / denominator;
            printStream.println(quotient);
            // fileScanner.close() and printStream.close() get called automatically
        }
    }
    // notice that:
    // 1. you may declare multiple resources in the header of a try-with-resources block
    // 2. unlike a typical try block, a try-with-resources block does not have to be followed by a catch block
}
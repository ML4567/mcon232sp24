package J_exceptions;
/*
Key terms: 
- exception: error that occurs at runtime. An exception is represented by
    an object, such as a NumberFormatException object. 
    NumberFormatException is a class that inherits from the Throwable class.
    All exception classes inherit from Throwable.
- throw: "throw an exception up into the air" so that it can be caught by a 
    catch block. If there is no catch block to catch the exception, the program crashes.
- stack trace: shows the methods calls that lead to an exception being thrown
- try block: contains code that might cause an exception
- catch block: contains code to be run if an exception occurs in the try block
- exception handling: dealing with and exceptions when they occur instead of
    letting the program crash
*/

// Computes the average of the command line arguments; 
// skips and prints all non-numeric arguments
// For example, if we run it by saying: 
//     Averager 1 a b 2.5
// the program should print: 
//     skipping a
//     skipping b
//     Average is 1.75
public class Averager {
    public static void main(String[] args) {
        double sum = 0;
        int validCount = 0;

        for (String arg : args) {
            try { // contains code that might cause an exception
                sum += Double.parseDouble(arg);
                validCount++; // if we are on this line, an exception didn't occur, that is, arg is valid
            } catch (NumberFormatException e) { // runs if a NFE occurs in the try block
                System.out.println("skipping " + arg);
            }
        }

        if (validCount > 0) {
            double average = sum / validCount;
            System.out.println("Average is " + average);
        } else {
            System.out.println("No valid numbers!");
        }
    }
}

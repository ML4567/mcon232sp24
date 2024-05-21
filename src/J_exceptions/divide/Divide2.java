package J_exceptions.divide;// Example of using one catch block to handle multiple types
// of exceptions. Note that both InputMismatchException and 
// ArithmeticException inherit (indirectly) from Exception. 
// So, using polymorphism, an Exception reference variable 
// can refer to an InputMismatchException or to an 
// ArithmeticException (or to most other kinds of exceptions). 

import java.util.Scanner;

public class Divide2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    try {
      System.out.print("Enter the dividend (numerator): ");
      int dividend = input.nextInt();

      System.out.print("Enter the divisor (denominator): ");
      int divisor = input.nextInt();

      System.out.println("Quotient: " + dividend / divisor);
      System.out.println("Remainder: " + dividend % divisor);
    } catch (Exception ex) { // catches all types of exceptions that inherit from the Exception classs
                             // ex can refer to an object of the Exception class, or to an object
                             // of any class that inherits from the Exception class, such as 
                             // ArithmeticException and InputMismatchException
      System.out.println("Error in program.");
      System.out.println(ex); // calls toString()
      System.out.println("ex.getMessage(): " + ex.getMessage());
    }

    System.out.println("Done.");
  }
}
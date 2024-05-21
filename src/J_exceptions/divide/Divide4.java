package J_exceptions.divide;// demonstrates a multi-catch block

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    try {
      System.out.print("Enter the dividend (numerator): ");
      int dividend = input.nextInt();

      System.out.print("Enter the divisor (denominator): ");
      int divisor = input.nextInt();

      System.out.println("Quotient: " + dividend / divisor);
      System.out.println("Remainder: " + dividend % divisor);
    } catch (InputMismatchException | ArithmeticException ex) {
      System.out.println("input mismatch OR division by 0");
    } catch (Exception ex) { // catches all other kinds of exceptions (those that aren't caught by the two previous catch blocks)
      System.out.println(ex);
    } 

    System.out.println("Done.");
  }
}
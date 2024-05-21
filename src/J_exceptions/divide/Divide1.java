package J_exceptions.divide;// This program can cause two different types of exceptions:
// InputMismatchException and ArithmeticException

import java.util.Scanner;

public class Divide1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the dividend (numerator): ");
    int dividend = input.nextInt();

    System.out.print("Enter the divisor (denominator): ");
    int divisor = input.nextInt();

    System.out.println("Quotient: " + dividend / divisor);
    System.out.println("Remainder: " + dividend % divisor);

    System.out.println("Done.");
  }
}
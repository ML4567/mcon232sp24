package J_exceptions.divide;

// Example of a try block with multiple catch blocks.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    try {
      System.out.print("Enter the dividend (numerator): ");
      int dividend = input.nextInt();
      
      System.out.print("Enter the divisor (denominator): ");
      int divisor = input.nextInt();

      System.out.println("Quotient: " + dividend / divisor);
      System.out.println("Remainder: " + dividend % divisor);
    } catch (InputMismatchException ex) {
      System.out.println("Error: input must be an integer");
    } catch (ArithmeticException ex) {
      System.out.println("Error: cannot divide by 0");
    } catch (Exception ex) { // catches all other kinds of exceptions (those that aren't caught by the two previous catch blocks)
      System.out.println("Error in program.");
      System.out.println(ex);
    } 
    
    System.out.println("Done.");
  }
}

/*
When an exception occurs, Java begins looking for a catch 
block. It runs the first catch block that it can. So, for 
example, in this program, if an ArithmeticException occurs, 
Java skips the rest of the try block. Java looks at the first 
catch block, which is for InputMismatchException, and skips it,
since it's not the right type. Then Java sees the catch block 
for ArithmeticException and runs it. Since the exception has 
been handled, Java does not run the third catch block.
 */

/*
When we have multiple catch blocks, they must be listed 
from more specific to more general. So if we tried to put 
the catch block for Exception as the first or second of the 
three catch blocks, the compiler would not allow it.
*/
package J_exceptions;

/*
This program demonstrates how an exception is propagated from
method to method in search of an appropriate catch block.

When an exception is thrown, normal execution of the program is paused 
until the exception is caught.
If the exception is not caught in the current method,
then the JVM immediately exits the method and returns to the caller.
If the exception is also not caught in the caller, 
then the JVM immediately exits the caller and returns to the caller's caller.
And so on. 
When the exception gets caught, the program continues from that point;
it does not automatically return to the method where the exception was thrown.
If the exception never gets caught, the program terminates.
*/

/*
Output if no exception occurs in method2: G D F A C
Output if a NumberFormatException occurs in method2: E F A C
Output if an ArithmeticException occurs in method2: B C
If an ArrayIndexOutOfBoundsException occurs in method2, the program crashes.
 */

public class ExceptionPropagationDemo {
    public static void main(String[] args) {
        try {
            method1();
            System.out.print("A ");
        } catch (ArithmeticException ex) {
            System.out.print("B ");
        }

        System.out.print("C ");
    }

    public static void method1() {
        try {
            method2();
            System.out.print("D ");
        } catch (IllegalArgumentException ex) {
            // IllegalArgumentException is a superclass of NumberFormatException,
            // so this catch block can also catch NumberFormatException
            System.out.print("E ");
        }

        System.out.print("F ");
    }

    public static void method2() {
        /* Uncomment lines to cause an exception */

        // cause NumberFormatException (caught in method 1)
        // int x = Integer.parseInt("a non-integer string");

        // Cause ArithmeticException (caught in main)
        // int result = 3 / 0;

        // Cause ArrayIndexOutOfBoundsException (never caught)
         int[] arr = {100, 101, 102};
         int x = arr[3];

        System.out.print("G ");
    }
}
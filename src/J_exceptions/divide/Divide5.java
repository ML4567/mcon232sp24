package J_exceptions.divide;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("numerator: ");

        while (scanner.hasNext()) {
            try {
                int numerator = scanner.nextInt();
                System.out.print("denominator: ");
                int denominator = scanner.nextInt();
                int quotient = numerator / denominator;
                int remainder = numerator % denominator;
                System.out.println(quotient + " R" + remainder);
            } catch (InputMismatchException e) {
                scanner.next(); // read the invalid data and disregard it
                System.out.println("only enter integers");
            } catch (ArithmeticException e) {
                System.out.println("denominator is 0; cannot divide by 0");
            }

            System.out.print("numerator: ");
        }
    }
}

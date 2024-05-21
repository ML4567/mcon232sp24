package J_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedVsUnchecked {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = method();
        unchecked(sc);
    }

    private static Scanner method() throws FileNotFoundException {
        return createFileScanner();
    }

    public static Scanner createFileScanner() throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file); //
        return sc;
    }

    public static void unchecked(Scanner sc) {
        int index = sc.nextInt(); // might cause an InputMismatchException
        int[] arr = new int[3];
        arr[index] = 10;   // might cause an ArrayIndexOutOfBoundsException
    }
}
/*
Every exception falls into one of two categories:
 - Unchecked exception: An Error object, a RuntimeException
   object, or an object of any of their subclasses (direct
   or indirect).
   Example: ArrayIndexOutOfBoundsException is a direct
   subclass of IndexOutOfBoundsException, which is a direct
   subclass of RuntimeException. So ArrayIndexOutOfBoundsException
   is an indirect subclass of RuntimeException, and is therefore
   an unchecked exception.
 - Checked exception: Any type of exception that isn't an
   unchecked exception. For example, FileNotFoundException is
   a checked exception, since it inherits neither from Error
   nor from RuntimeException.

Here's the practical difference between checked and unchecked exceptions:
If a method has the potential to cause a *checked* exception,
then the programmer must
 - surround the dangerous code with try-catch; or
 - indicate to the compiler that the method might generate an
   exception, by putting a "throws" clause in the method header.
If the programmer doesn't do at least one of these options
for a checked exception, the program will not compile.

The only difference between checked and unchecked exceptions
is regarding compilation. While the program is running, there is no
difference.
For both checked and unchecked exceptions, when an exception
occurs, Java searches for a catch block to handle the
exception; if Java cannot find an appropriate catch block,
the program prints a message and terminates.

Two types of unchecked exceptions:
    Error (and its subclasses):
     - generally rare;
     - very little we can do in our programs to recover from them
     - example: OutOfMemoryError
     - it's very rare to use try-catch with these
    RuntimeException (and its subclasses):
     - can be caused by almost any line of code;
     - most can be avoided through correct coding
     - examples: NullPointerException, IndexOutOfBoundsException
     - only use try-catch if the exception cannot be
       avoided through proper programming.

Checked exceptions:
  - usually depend on things that are out of the programmer's
   control, but from which the program might be able to recover
  - example: FileNotFoundException
*/

package J_exceptions;

// demonstrates some of the methods that all objects inheriting from Throwable have
public class ThrowableMethodsDemo {
    public static void main(String[] args) {
        try {
            Integer.parseInt("45p89");
        } catch (NumberFormatException e) {
            System.out.println("exception: " + e); // calls the toString() method

            System.out.println("exception message: " + e.getMessage());

            System.out.println("exception stack trace:");
            e.printStackTrace(System.out); // prints to the specified PrintStream

            System.out.println("exception stack trace again:");
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement level : stackTrace) {
                System.out.println(" ---- " + level);
            }
        }
    }
}

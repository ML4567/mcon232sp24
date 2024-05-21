package J_exceptions.date;

// an example of a custom exception class

// checked exception, since it doesn't inherit from Error or RuntimeException

// we could;ve easily made it unchecked, by extending RuntimeException

public class InvalidDateException extends Exception {
    private final String invalidDate;

    public InvalidDateException(String invalidDate) {
        super("invalid date " + invalidDate); // call the superclass constructor to initialize the message
        this.invalidDate = invalidDate;
    }

    public String getInvalidDate() {
        return invalidDate;
    }
}

class Demo {
    public static void main(String[] args) {
        try {
            throw new InvalidDateException("abc");
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage()); // invalid date abc
        }
    }
}
package hw8;

public class InvalidTimeException extends Exception {
    private final String invalidTime;

    public InvalidTimeException(String invalidTime) {
        super("invalid time: " + invalidTime);
        this.invalidTime = invalidTime;
    }

    public String getInvalidTime() {
        return invalidTime;
    }
}

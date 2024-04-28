package hw5;

public class PhoneNumber {
    private final int areaCode, prefix, lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    public PhoneNumber(String fullNumber) {
        if (!isValid(fullNumber)) {
            throw new IllegalArgumentException();
        }

        String[] parts = fullNumber.split("-");
        areaCode = Integer.parseInt(parts[0]);
        prefix = Integer.parseInt(parts[1]);
        lineNumber = Integer.parseInt(parts[2]);
    }

    private static boolean isValid(String s) {
        if (s.length() != 12) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if ((i == 3 || i == 7) && s.charAt(i) != '-') {
                return false;
            } else if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;

        // much more simply, if you know regex: return s.matches("\\d{3}-\\d{3}-\\d{4}");
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String toString() {
        return String.format("%3d-%3d-%4d", areaCode, prefix, lineNumber);
    }
}

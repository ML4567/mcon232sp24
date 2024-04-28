package hw6;

public class MonetaryValue {
    private final int totalCents;

    public static final MonetaryValue ZERO = ofCents(0), ONE_CENT = ofCents(1), ONE_DOLLAR = ofDollars(1);

    private MonetaryValue(int totalCents) {
        this.totalCents = totalCents;
    }

    public static MonetaryValue ofCents(int cents) {
        return new MonetaryValue(cents);
    }

    public static MonetaryValue ofDollars(int dollars) {
        return new MonetaryValue(dollars * 100);
    }

    public static MonetaryValue ofDollarsAndCents(int dollars, int cents) {
        return new MonetaryValue(dollars * 100 + cents);
    }

    public static MonetaryValue parse(String monetaryString) {
        if (monetaryString.charAt(0) == '$') {
            monetaryString = monetaryString.substring(1);
        }

        boolean isNegative = monetaryString.charAt(0) == '-';

        if (monetaryString.charAt(0) == '-') {
            monetaryString = monetaryString.substring(1);
        }

        if (monetaryString.contains(".")) {
            int indexOfDecimalPoint = monetaryString.indexOf(".");

            if (indexOfDecimalPoint == 0 || indexOfDecimalPoint != monetaryString.length() - 3) {
                throw new IllegalArgumentException();
            } else {
                String dollarsString = monetaryString.substring(0, indexOfDecimalPoint);
                int dollars = Integer.parseInt(dollarsString) * (isNegative ? -1 : 1);
                String centsString = monetaryString.substring(indexOfDecimalPoint + 1);
                int cents = Integer.parseInt(centsString) * (isNegative ? -1 : 1);
                return ofDollarsAndCents(dollars, cents);
            }
        } else {
            int dollars = Integer.parseInt(monetaryString) * (isNegative ? -1 : 1);
            return ofDollars(dollars);
        }
    }

    public int getDollarsPart() {
        return totalCents / 100;
    }

    public int getCentsPart() {
        return Math.abs(totalCents % 100);
    }

    public int getTotalCents() {
        return totalCents;
    }

    public boolean isGreaterThan(MonetaryValue other) {
        return this.totalCents > other.totalCents;
    }

    public boolean isLessThan(MonetaryValue other) {
        return this.totalCents < other.totalCents;
    }

    public boolean isEqualTo(MonetaryValue other) {
        return this.totalCents == other.totalCents;
    }

    public boolean isPositive() {
        return totalCents > 0;
    }

    public boolean isNegative() {
        return totalCents < 0;
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", getDollarsPart(), getCentsPart());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof MonetaryValue) {
            MonetaryValue other = (MonetaryValue) o;
            return this.totalCents == other.totalCents;
        } else {
            return false;
        }
    }

    public MonetaryValue plus(MonetaryValue other) {
        return new MonetaryValue(this.totalCents + other.totalCents);
    }

    public MonetaryValue minus(MonetaryValue other) {
        return new MonetaryValue(this.totalCents - other.totalCents);
    }

    public MonetaryValue plusDollars(int dollars) {
        return new MonetaryValue(totalCents + dollars * 100);
    }

    public MonetaryValue minusDollars(int dollars) {
        return new MonetaryValue(totalCents - dollars * 100);
    }

    public MonetaryValue plusCents(int cents) {
        return new MonetaryValue(totalCents + cents);
    }

    public MonetaryValue minusCents(int cents) {
        return new MonetaryValue(totalCents - cents);
    }
}
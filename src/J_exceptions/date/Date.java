package J_exceptions.date;

// A class invariant is a condition that is true for all objects of the class at all times

// The invariants of the Date class are that the month and dayOfMonth fields are within the valid range

// To enforce this invariant, we throw an InvalidDateException if the client passes an incorrect value to the constructor

// We use the Gregorian calendar system in this class.

import java.util.Objects;

public class Date implements Comparable<Date> {
    private int month, dayOfMonth, year;

    public Date(int month, int dayOfMonth, int year) throws InvalidDateException {
        if (month < 1 || month > 12) {
            throw new InvalidDateException(month + "/" + dayOfMonth + "/" + year);
        }

        // Month number: 1    2      3   4   5   6   7   8   9   10  11  12
        // Month name:   Jan Feb    Mar  Apr May Jun Jul Aug Sep Oct Nov Dec
        // Month length: 31  28/29  31   30  31  30  31  31  30  31  30  31

        if (dayOfMonth < 1) {
            throw new InvalidDateException(month + "/" + dayOfMonth + "/" + year);
        } else if (isThirtyOneDayMonth(month) && dayOfMonth > 31) {
            throw new InvalidDateException(month + "/" + dayOfMonth + "/" + year);
        } else if (isThirtyDayMonth(month) && dayOfMonth > 30) {
            throw new InvalidDateException(month + "/" + dayOfMonth + "/" + year);
        } else if (isLeapYear(year) && dayOfMonth > 29) {
            throw new InvalidDateException(month + "/" + dayOfMonth + "/" + year);
        } else if (dayOfMonth > 28) { // month is 2 and the year is not a leap year, so only 28 days
            throw new InvalidDateException(month + "/" + dayOfMonth + "/" + year);
        }

        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.year = year;
    }

    private static boolean isThirtyOneDayMonth(int month) {
        return month == 1 || month == 3 || month == 5 || month  == 7 || month == 8 || month == 10 || month == 12;
    }

    private static boolean isThirtyDayMonth(int month) {
        return month == 4 || month == 6 || month == 9 || month == 11;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    // dateString has the format of month/dayOfMonth/year, for example, "10/25/2023"
    public static Date parse(String dateString) throws InvalidDateException {
        String[] parts = dateString.split("/");
        if (parts.length != 3) {
            throw new InvalidDateException(dateString);
        }

        try {
            int month = Integer.parseInt(parts[0]);
            int dayOfMonth = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);
            return new Date(month, dayOfMonth, year);
        } catch (NumberFormatException e) { // exception translation
            throw new InvalidDateException(dateString);
        }
        // if a NumberFormatException occurs, we don't want the client to
        // know about it. We only want the client to know about InvalidDateException.
        // So, if a NumberFormatException occurs, we catch it, and we throw a
        // InvalidDateException instead.
    }

    @Override
    public String toString() {
        return month + "/" + dayOfMonth + "/" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date other = (Date) o;
            return this.month == other.month && this.dayOfMonth == other.dayOfMonth && this.year == other.year;
        } else {
            return false;
        }
    }

    // compares dates chronologically
    @Override
    public int compareTo(Date other) {
        int yearComparison = Integer.compare(this.year, other.year);
        if (yearComparison != 0) {
            return yearComparison;
        }

        // at this point, we know that the years are equal

        int monthComparison = Integer.compare(this.month, other.month);
        if (monthComparison != 0) {
            return monthComparison;
        }

        // at this point, we know that the years are equal and the months are equal

        int dayOfMonthComparison = Integer.compare(this.dayOfMonth, other.dayOfMonth);
        return dayOfMonthComparison;
    }
}

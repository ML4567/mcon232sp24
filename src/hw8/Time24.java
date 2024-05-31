package hw8;

public class Time24 implements Comparable<Time24> {
    private final int hour, minute, second;

    public Time24(int hour, int minute, int second) throws InvalidTimeException {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new InvalidTimeException(hour + ":" + minute + ":" + second);
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static Time24 parse(String timeString) throws InvalidTimeException {
        String[] parts = timeString.split(":");

        if (parts.length != 3) {
            throw new InvalidTimeException(timeString);
        }

        for (String part : parts) {
            if (part.length() != 2) {
                throw new InvalidTimeException(timeString);
            }
        }

        try {
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            int second = Integer.parseInt(parts[2]);
            return new Time24(hour, minute, second);
        } catch (NumberFormatException e) {
            throw new InvalidTimeException(timeString); // exception translation
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Time24) {
            Time24 other = (Time24) o;
            return this.hour == other.hour && this.minute == other.minute && this.second == other.second;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Time24 other) {
        if (this.hour != other.hour) {
            return Integer.compare(this.hour, other.hour);
        } else if (this.minute != other.minute) {
            return Integer.compare(this.minute, other.minute);
        } else {
            return Integer.compare(this.second, other.second);
        }
    }
}

package D_classes;

// represents a non-negative length of time, that is, a span of some hours and minutes

// TimeSpan objects are immutable -- the TimeSpan class prevents the contents of
// a TimeSpan object from being modified.
public class TimeSpan {
    private int totalMinutes;

    // pre-created objects for the client to use
    public static final TimeSpan ZERO = new TimeSpan(0);
    public static final TimeSpan ONE_MINUTE = new TimeSpan(1);
    public static final TimeSpan ONE_HOUR = new TimeSpan(60);

    private TimeSpan(int totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    // static factory method - a static method that the client can call to
    // obtain an object of the class
    public static TimeSpan ofHours(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("negative hours");
        }

        return new TimeSpan(hours * 60);
    }

    public static TimeSpan ofMinutes(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("negative minutes");
        }

        if (minutes == 0) {
            return ZERO;
        } else if (minutes == 1) {
            return ONE_MINUTE;
        } else if (minutes == 60) {
            return ONE_HOUR;
        }

        return new TimeSpan(minutes);
    }

    public static TimeSpan ofHoursAndMinutes(int hours, int minutes) {
        if (hours < 0) {
            throw new IllegalArgumentException("negative hours");
        } else if (minutes < 0) {
            throw new IllegalArgumentException("negative minutes");
        }

        return new TimeSpan(hours * 60 + minutes);
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public int getHoursPart() {
        return totalMinutes / 60;
    }

    public int getMinutesPart() {
        return totalMinutes % 60;
    }

    public String toString() {
        return getHoursPart() + "h" + getMinutesPart() + "m";
    }

    public TimeSpan plus(TimeSpan other) {
        return new TimeSpan(this.totalMinutes + other.totalMinutes);
    }

    public TimeSpan plusHours(int hours) {
        return new TimeSpan(totalMinutes + hours * 60);
    }

    public boolean isGreaterThan(TimeSpan other) {
        return totalMinutes > other.totalMinutes;
    }

    public static void main(String[] args) {
        TimeSpan[] timeSpans = new TimeSpan[1000];

        for (int i = 0; i < timeSpans.length; i++) {
            timeSpans[i] = TimeSpan.ofMinutes(1);
        }
    }
}


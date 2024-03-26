package D_classes;

public class TimeSpanClient {
    public static void main(String[] args) {
        TimeSpan fiveHours = TimeSpan.ofHours(5);
        TimeSpan fiveMinutes = TimeSpan.ofMinutes(5);
        TimeSpan threeHoursTenMinutes = TimeSpan.ofHoursAndMinutes(3, 10);

        TimeSpan fiveHoursFiveMinutes = fiveHours.plus(fiveMinutes);
        System.out.println(fiveHoursFiveMinutes.getTotalMinutes()); // 305
        System.out.println(fiveHoursFiveMinutes.getHoursPart()); // 5
        System.out.println(fiveHoursFiveMinutes.getMinutesPart()); // 5

        TimeSpan fiveHoursTenMinutes = threeHoursTenMinutes.plusHours(2);
        System.out.println(fiveHoursTenMinutes.toString()); // 5h10m

        System.out.println(fiveHoursTenMinutes.isGreaterThan(fiveHoursFiveMinutes)); // true

        TimeSpan zero = TimeSpan.ZERO;
        System.out.println(zero.toString()); // 0h0m

        TimeSpan hour = TimeSpan.ONE_HOUR;
    }
}

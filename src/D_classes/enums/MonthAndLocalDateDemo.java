package D_classes.enums;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class MonthAndLocalDateDemo {
    public static void main(String[] args) {
        Month m = Month.MAY;
        System.out.println(m.minLength()); // 31

        LocalDate date = LocalDate.of(1998, Month.AUGUST, 15);
        System.out.println(date);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}

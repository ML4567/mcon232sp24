package hw8;

import java.util.List;

public class Time24Client {
    public static void main(String[] args) {
        List<String> list = List.of(
                "12:15:45", // valid
                "02:15:45", // valid
                "2:15:45",  // invalid
                "25:15:45", // invalid
                "2a:15:45", // invalid
                "12:45"     // invalid
        );
        printTime24Validation(list);
    }
    public static void printTime24Validation(List<String> list) {
        for (String s : list) {
            System.out.print(s + ": ");

            try {
                Time24.parse(s);
                System.out.println("valid");
            } catch (InvalidTimeException e) {
                System.out.println("invalid");
            }
        }
    }
}

package C_command_line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintArgs {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        List<String> list = List.of("a", "b");
    }

    public static void m(String s, String... rest) {

    }

    public static void m(String s1, String s2, String... rest) {

    }
}
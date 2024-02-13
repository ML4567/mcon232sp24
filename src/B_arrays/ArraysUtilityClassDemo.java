package B_arrays;

import java.util.Arrays;

public class ArraysUtilityClassDemo {
    public static void main(String[] args) {
        int[] ints = {3, 1, 2};
        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(ints[0]); // 1
    }
}

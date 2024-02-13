package B_arrays;

public class EnhancedForLoopDemo {
    public static void main(String[] args) {
        String[] arr = {"Today", "is", "Monday"};

        /*
        // using old-fashioned for loop: explicit indexes
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " has length " + arr[i].length());
        }
         */

        // using an enhanced for loop (aka for-each loop)
        // here we deal with elements, not indexes
        // An enhanced for loop visits the elements of the array,
        // one at a time, from beginning to end of array
        for (String s : arr) {
            System.out.println(s + " has length " + s.length());
        }
        // In this example, there will be three iterations of the loop.
        // On the first iteration, s will be "Today".
        // On the second iteration, s will be "is".
        // On the third iteration, s will be "Monday".
        // Important note: on each iteration, s not the actual element,
        // but rather a copy of the element. So assigning a new value to s
        // won't modify the element in the array.
        // So an enhanced for loop can only read the array, not write to the array.

        // side point:
        String message = "hello";
        for (char c : message.toCharArray()) {
            System.out.println(c);
        }
    }
}

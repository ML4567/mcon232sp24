package I_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
List inherits from Collection.
A List is a type of collection that has indexes.
 */

// demonstrates some List methods.
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        // When using a List (as opposed to a general Collection),
        // the basic add method adds the element at the end of the list

        System.out.println("list = " + list); // [a, b, c]
        list.add(1, "d"); // another version of the add method
        System.out.println("now list = " + list); // [a, d, b, c]
        System.out.println("list at index 2: " + list.get(2)); // b
        System.out.println("replacing " + list.set(1, "f")); // d
        System.out.println("now list = " + list); // [a, f, b, c]
        System.out.println("removing " + list.remove(0)); // a
        System.out.println("now list = " + list); // [f, b, c]

        list.add("b");
        list.add("a");
        System.out.println("list = " + list); // [f, b, c, b, a]
        System.out.println("index of c: " + list.indexOf("c")); // 2
        System.out.println("index of b: " + list.indexOf("b")); // 1
        System.out.println("index of d: " + list.indexOf("d")); // -1
        System.out.println("last index of b: " + list.lastIndexOf("b")); // 3

        Collections.sort(list);
        System.out.println("list sorted = " + list); // [a, b, b, c, f]
    }
}

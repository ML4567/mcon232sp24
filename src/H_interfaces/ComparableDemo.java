package H_interfaces;

/*
Many unrelated types of objects have the common property of being comparable:
Strings are comparable, LocalDates are comparable, etc.
These classes all implement an interface named Comparable,
which specifies a method named compareTo.
The compareTo method gets invoked like this: a.compareTo(b). It returns:
- negative int if a is "less than"/"before" b
- positive int if a is "greater than"/"after" b
- 0 if a and b are equal
 */

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class ComparableDemo {
    public static void main(String[] args) {
        System.out.println("a".compareTo("r")); // negative int
        System.out.println("r".compareTo("a")); // positive int
        System.out.println("a".compareTo("a")); // 0
        System.out.println();

        // What do we gain from the fact that String implements Comparable?
        // After all, String could have just had a compareTo method without inheriting it
        // from the Comparable interface.
        // The benefit is that we can have methods that operate on any type of Comparable
        // object, such as Strings or LocalDates. Such methods can (for example)
        // find the maximum of an array of comparable objects, or
        // sort an array of comparable objects.

        // The Arrays class has a static method named sort that takes an array of objects and sorts them.
        // The method works only if the elements of the array come from a class
        // that implements Comparable

        String[] stringArray = {"r", "a", "y", "h"};
        Arrays.sort(stringArray); // uses String's compareTo method to compare the elements with each other
        System.out.println(Arrays.toString(stringArray)); // [a, h, r, y]
        System.out.println();

        System.out.println(LocalDate.of(2005, Month.AUGUST, 15).compareTo(LocalDate.of(2002, Month.DECEMBER, 13))); // positive int

        LocalDate[] dates = {
                LocalDate.of(2005, Month.AUGUST, 15),
                LocalDate.of(2010, Month.SEPTEMBER, 12),
                LocalDate.of(2002, Month.APRIL, 23)
        };
        Arrays.sort(dates); // sorts the dates in chronological order
        System.out.println(Arrays.toString(dates));

        System.out.println(new Student(1111, 23).compareTo(new Student(2222, 20))); // a negative int

        Student[] students = {
                new Student(56789, 19),
                new Student(12345, 21),
                new Student(11111, 20)
        };
        Arrays.sort(students); // sorts the students based on the order defined by Student's compareTo method
                                // that is, sorts the students by ids from lowest to highest
                                // this works because Student implements Comparable
        System.out.println(Arrays.toString(students));

        Product[] products = {
                new Product(666, "apple", 1.25),
                new Product(555, "apple", 1.05),
                new Product(444, "bread", 2.25),
                new Product(333, "bread", 2.25),
                new Product(222, "milk", 1.75),
                new Product(111, "almonds", 1.25)
        };

        Arrays.sort(products); // sorts the products based on the compareTo method of Product

        for (Product product : products) {
            System.out.println(product);
        }

    }
}
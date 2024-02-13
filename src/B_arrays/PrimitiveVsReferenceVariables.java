package B_arrays;

/*
Every variable has a type.
There are two categories of types: primitive types and reference types.
There are exactly eight primitive types:
    common ones: boolean, int, double, char
    less common ones: byte, short, long, float
All other types are reference types. Examples: String, int[], Point, etc.
A variable can be thought of as a named "box" in memory that can store something.
A primitive variable stores the actual value we are interested in. E.g., an int variable stores an int.
A reference variable, on the other hand, does not store the actual value we are interested in.
The thing we are interested in is an object. And the variable stores a reference to the object.
Often, we can use the variable to modify the contents of the object.
 */

import java.awt.Point;

public class PrimitiveVsReferenceVariables {
    public static void main(String[] args) {
        int x1 = 5;
        int x2 = x1; // makes a copy of x1's value and stores the copy in x2
        System.out.println("x1 = " + x1 + ", x2 = " + x2); // x1 = 5, x2 = 5
        x1 = 10;
        System.out.println("x1 = " + x1 + ", x2 = " + x2); // x1 = 10, x2 = 5
        x2 = 15;
        System.out.println("x1 = " + x1 + ", x2 = " + x2); // x1 = 10, x2 = 15

        int[] a1 = {5};
        int[] a2 = a1; // makes a copy of a1's value and stores the copy in a2.
        // What is the value of a1? It's not the array itself, but rather the array's
        // reference (which can be thought of as its address in memory).
        // So a1 and a2 both refer to (aka point to) the same array object in memory
        a1[0] = 10;
        System.out.println("a1[0] = " + a1[0] + ", a2[0] = " + a2[0]); // a1[0] = 10, a2[0] = 10
        a2[0] = 15;
        System.out.println("a1[0] = " + a1[0] + ", a2[0] = " + a2[0]); // a1[0] = 15, a2[0] = 15

        Point p1 = new Point(1, 2); // p1 refers to an object that represents the point (1, 2)
        Point p2 = p1; // now p2 and p1 refer to the same Point object
        p1.x = 10;
        p2.y = 15;
        System.out.println("(" + p1.x + ", " + p1.y + ")"); // (10, 15)
        System.out.println("(" + p2.x + ", " + p2.y + ")"); // (10, 15)
    }
}

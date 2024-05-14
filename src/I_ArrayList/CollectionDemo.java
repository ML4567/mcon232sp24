package I_ArrayList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
A collection is a container for objects (elements).
There are many kinds of collections in Java, all inheriting from the Collection interface.
The most commonly used Java collection is ArrayList.
ArrayList is like a fancy array: it grows to accommodate as many elements as you many wish to add,
and we do not have to specify the length when creating the ArrayList. Also, it has many helpful methods.
 */

// demonstrates some methods that all collections (such as ArrayList) have
public class CollectionDemo {
    public static void main(String[] args) {
        // ArrayList<String> strings = new ArrayList<>(); // works, but more conventional to use an interface as a type ("coding to the interface")
        // Iterable<String> strings = new ArrayList<>(); // this line works, but the rest of the program doesn't, since Iterable doesn't have add, remove (etc.) methods
        Collection<String> strings = new ArrayList<>(); // good
        // List<String> strings = new ArrayList<>(); // also good, gives you more methods
        // strings.add(LocalDate.now()); // doesn't compile, only Strings allowed here
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(strings.add("b")); // true (since ArrayList allows duplicates)
        strings.add("a");
        strings.add("d");
        System.out.println("strings = " + strings); // [a, b, c, b, a, d]
        System.out.println("size = " + strings.size()); // 6
        System.out.println("is empty? " + strings.isEmpty()); // false
        System.out.println("contains b? " + strings.contains("b")); // true
        System.out.println("contains f? " + strings.contains("f")); // false
        System.out.println("removing f? " + strings.remove("f")); // false
        System.out.println("removing b? " + strings.remove("b")); // true
        System.out.println("now strings = " + strings); // [a, c, b, a, d]

        // strings.get(2); // doesn't compile, since Collection doesn't have a get method

        /*
        The following items can be made the "target" of an enhanced for loop:
        1. arrays
        2. any object that inherits from the Iterable interface
         */
        for (String s : strings) {
            System.out.println(s);
        }
        // prints:
        // a
        // c
        // b
        // a
        // d

        // Collection<int> ints = new ArrayList<>(); // doesn't compile

        Collection<Integer> integers = new ArrayList<>();
        integers.add(67); // autoboxing
        integers.add(55);
        integers.add(21);
        System.out.println("integers = " + integers); // [67, 55, 21]

        Shape[] shapeArray = {
                new Circle(4),
                new Rectangle(3, 4),
                new BorderedRectangle(2, 7, "red")
        };

        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(6, 2));
        shapes.add(new BorderedRectangle(8, 2, "red"));

        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.getArea();
        }
        System.out.println("totalArea = " + totalArea);

        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        ArrayList<Double> row0 = new ArrayList<>();
        row0.add(1.5);
        row0.add(4.7);
        ArrayList<Double> row1 = new ArrayList<>();
        row1.add(9.6);
        row1.add(4.2);
        matrix.add(row0);
        matrix.add(row1);
        System.out.println(matrix); // [[1.5, 4.7], [9.6, 4.2]]

        for (ArrayList<Double> row : matrix) {
            System.out.println(row);
        }
    }
}

abstract class Shape {
    public abstract double getArea();
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class BorderedRectangle extends Rectangle {
    private String borderColor;

    public BorderedRectangle(int length, int width, String borderColor) {
        super(length, width);
        this.borderColor = borderColor;
    }
}
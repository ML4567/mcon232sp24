package B_arrays;

import java.awt.*;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        // p refers to a Point object representing (1, 2)

        Point[] points = new Point[3]; // initially all elements have value null, meaning absence of an object
        points[0] = new Point(1, 2); // the first element of the array refers to a Point object representing (1, 2)
    }
}

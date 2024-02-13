package B_arrays;

import java.awt.*;

public class PrimitiveVsReferenceVariables {
    public static void main(String[] args) {
        int x1 = 5;
        int x2 = x1;
        System.out.println();
        x1 = 10;
        x2 = 15;

        int[] a1 = {5};
        int[] a2 = a1;
        a1[0] = 10;
        System.out.println();
        a2[0] = 15;
        System.out.println();

        Point p1 = new Point(1, 2);
        Point p2 = p1;
        p1.x = 10;

    }
}

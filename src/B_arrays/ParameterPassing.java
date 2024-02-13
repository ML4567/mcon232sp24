package B_arrays;

import java.awt.*;

public class ParameterPassing {
    public static void main(String[] args) {
        int x = 5;
        int[] a = {5};
        Point p = new Point(5, 5);

        assignNewValueToPrimitiveVariable(x);
        System.out.println("Back in main, x = " + x);

        assignNewValueToReferenceVariable(a, p);
        System.out.println("Back in main, a[0] = " + a[0] +
                           " and p = (" + p.x + ", " + p.y + ")");

        useReferenceVariableToModifyContentsOfObject(a, p);
        System.out.println("Back in main after final method, " +
                           " a[0] = " + a[0] +
                           " and p = (" + p.x + ", " + p.y + ")");

    }

    public static void assignNewValueToPrimitiveVariable(int x) {
        x = 10;

        System.out.println("In method, x = " + x);
    }

    public static void assignNewValueToReferenceVariable(int[] a, Point p) {
        a = new int[1];
        a[0] = 10;
        p = new Point(10, 10);

        System.out.println("In method, a[0] = " + a[0] +
                           " and p = (" + p.x + ", " + p.y + ")");
    }

    public static void useReferenceVariableToModifyContentsOfObject(int[] a, Point p) {
        a[0] = 15;
        p.x = 15;
        p.y = 15;
    }

}

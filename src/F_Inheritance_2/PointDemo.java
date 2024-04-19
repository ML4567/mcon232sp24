package F_Inheritance_2;

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(5, 3);
        System.out.println(p1.equals(p2)); // true

        Object p3 = new Point(5, 3);
        System.out.println(p1.equals(p3));

        System.out.println(p1.equals("a string"));
        System.out.println(p1.equals(new Object()));

        System.out.println(p1); // calls toString

        Point nil = null;
        System.out.println(p1.equals(nil));
    }
}

package D_classes;

public class CircleClient {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Circle c1 = new Circle(p1, 3);

        System.out.println(c1.toString());
        // circle at (1, 2) with radius 3

        System.out.println(c1.contains(new Point(3, 3)));

        Circle c2 = new Circle(5, 6, 7);

        Circle bad = new Circle(1, 2, -4);
    }
}

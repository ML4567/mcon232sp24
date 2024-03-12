package D_classes;

public class PointClient {
    public static void main(String[] args) {
        System.out.println(Point.getNumPointsCreated()); // 0
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);

        System.out.println(p1.getX());
        System.out.println(p1.getY());

        System.out.println(p1.toString()); // (1, 2)
        System.out.println(p2.toString()); // (3, 4)

        System.out.println(Point.getNumPointsCreated()); // 2

        // this (correctly) doesn't compile:
        // Point.numPointsCreated = -100;

        double distance1 = p1.distanceTo(p2);
        System.out.println(distance1);

        double distance2 = Point.distanceBetween(p1, p2);
        System.out.println(distance2);
        System.out.println(Math.sqrt(8));

        Point p3 = new Point();
        System.out.println(p3.toString()); // (0, 0)

        //   p1 + p2
        // = (1, 2) + (3, 4)
        // = (1 + 3, 2 + 4)
        // = (4, 6)
        Point sum = p1.plus(p2);

        p1.setX(10);
        p1.setY(20);
    }
}

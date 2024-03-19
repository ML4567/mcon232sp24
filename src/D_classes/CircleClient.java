package D_classes;

public class CircleClient {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Circle c1 = new Circle(p1, 3);

        System.out.println(c1); // equivalent to: System.out.println(c1.toString());
        // circle at (1, 2) with radius 3

        System.out.println(c1.contains(new Point(3, 3)));

        Circle c2 = new Circle(5, 6, 7);
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());

        // generates IllegalArgumentException:
        // Circle bad = new Circle(1, 2, -4);
    }

    private static void constructorDefensiveCopyDemo() {
        Point myPoint = new Point(1, 2);
        Circle c = new Circle(myPoint, 3);

        myPoint.setX(10);
        System.out.println(c.getCenter().getX()); // 1
        // it would be 10 if we hadn't made a defensive copy in Circle's constructor

        // The only way to modify the state (contents)
        // of a Circle object is through the Circle
        // object itself. Modifying the state of the object
        // referred to by myPoint should not have an
        // effect on the Circle object.
    }

    private static void setCenterDemo() {
        Circle c = new Circle(new Point(1, 2), 3);
        System.out.println(c.getCenter().toString()); // (1, 2)
        c.setCenter(new Point(10, 20));
        System.out.println(c.getCenter().toString()); // (10, 20)
    }

    private static void setCenterDefensiveCopyDemo() {
        Circle c = new Circle(new Point(1, 2), 3);
        Point myPoint = new Point(1, 2);
        c.setCenter(myPoint);
        myPoint.setX(5);
        myPoint.setY(10);
        System.out.println(c.getCenter().toString());
        // if no defensive copy in setCenter, prints (5, 10).
        // with defensive copy, prints (1, 2)
    }

    private static void getCenterDefensiveCopyDemo() {
        Circle c = new Circle(new Point(1, 2), 3);
        Point myPoint = c.getCenter();
        myPoint.setX(10);
        System.out.println(c.getCenter().getX());
        // without defensive copy, prints 10
        // with defensive copy, prints 1

        // with getRadius, there's no concern, as radius is a primitive variable
        int myRadius = c.getRadius();
        myRadius = 100;
        System.out.println(c.getRadius()); // 3
    }

    private static void copyConstructorDemo() {
        Circle c1 = new Circle(new Point(1, 2), 3);
        Circle c2 = new Circle(c1);
        c1.setCenterX(10);
        System.out.println(c2.getCenter().getX());
        // if the copy constructor makes a shallow copy, this prints: 10
        // if the copy constructor makes a deep copy, this prints: 1
    }
}


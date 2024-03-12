package D_classes;

public class Point {
    private int x, y; // instance fields, aka instance variables
    // each instance (object) of the class owns its own copy of these fields.
    // so, for example, p1's x can be 1, and p2's x can be 3.
    // x exists in multiple places: it exists separately in each object.
    // a new x and y gets allocated every time a new object is created

    private static int numPointsCreated = 0; // static field, aka class variable.
    // belongs to the class, not to any object of the class.
    // a class field exists in only a single place: the class.
    // this variable gets allocated exactly once (it can be updated of course)

    public Point(int initX, int initY) {
        x = initX;
        y = initY;
        numPointsCreated++;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    // an instance method is called on an instance (object), as in p1.toString().
    // an instance method can access the instance fields of the object it was called on.
    // for example, when we say "x" in this method, we mean the x field of the object that called the method
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    // a "getter" method, aka accessor method
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void setX(int newX) {
        x = newX;
    }
    
    public void setY(int newY) {
        y = newY;
    }

    // a static method is called on the class, not on an instance
    // a static method can be called even before any objects have been created.
    // a static method cannot directly access an instance field.
    public static int getNumPointsCreated() {
        return numPointsCreated;
    }

    // returns the distance from this Point (the Point that is used to call the method)
    // to the other Point
    public double distanceTo(Point other) {
        return Math.sqrt(
                Math.pow(x - other.x, 2) +
                Math.pow(y - other.y, 2)
        );
    }

    public static double distanceBetween(Point p1, Point p2) {
        return Math.sqrt(
                Math.pow(p1.x - p2.x, 2) +
                Math.pow(p1.y - p2.y, 2)
        );
    }

    public Point plus(Point other) {
        return new Point(x + other.x, y + other.y);
    }
}

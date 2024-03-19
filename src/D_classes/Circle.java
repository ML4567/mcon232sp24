package D_classes;

/*
When a class should make a defensive copy:
1. whenever the client passes to us
   a reference to a mutable object
   which we want to assign to a field.
   E.g., in the constructor and in setCenter
2. whenever we in the class passes to the
   client a field that refers to a mutable object.
   E.g., in getCenter()
 */

public class Circle {
    private Point center;
    // an example of composition: where a class has an instance field that refers to an object of another class
    // so every Circle is composed of a Point (and some other stuff)
    // Composition is one type of relationship that two classes can have; another is inheritance (which we'll cover in a few weeks)

    private int radius;

    public Circle(Point p, int r) {
        // center = p; // bad, not making a defensive copy
        center = new Point(p); // defensive copy
        setRadius(r);
    }

    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        setRadius(r);
    }

    /*
    // this copy constructor creates a shallow copy of original
    public Circle(Circle original) {
        center = original.center;
        radius = original.radius;
    }
     */

    // makes a deep copy of original.
    // "deep copy" means that if there are any fields that
    // refer to a mutable object, we make an object copy of those fields
    // and assign that copy to fields of the new Circle object
    public Circle(Circle original) {
        center = new Point(original.center);
        radius = original.radius;
    }

    public void setCenter(Point p) {
        // center = p;
        center = new Point(p); // defensive copy
    }

    public void setRadius(int r) {
        if (r < 0) {
            throw new IllegalArgumentException("negative radius");
        }

        radius = r;
    }

    // A class invariant is a condition that must remain true for all objects of the class at all times.
    // An invariant of the Circle class is that the radius field is never negative.
    // We enforce this variant by throwing an exception if the client tries to set the radius
    // with a negative value.

    public void setCenterX(int x) {
        center.setX(x);
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public String toString() {
        return "circle at " + center.toString() + " with radius " + radius;
    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        // return center; // returns a reference copy of the field, giving the client the ability to mutate the contents of that object
        return new Point(center); // defensive copy; we return a reference to a new Point object
    }

    /**
     * Determines whether the specified point
     * is contained inside this circle or on
     * its boundary.
     * @param p the point to check
     * @return true if p is contained in this circle or on its boundary, false if p is outside the circle
     */
    public boolean contains(Point p) {
        double distanceToCenter = p.distanceTo(center);
        return distanceToCenter <= radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

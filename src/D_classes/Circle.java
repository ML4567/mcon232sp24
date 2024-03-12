package D_classes;

import java.util.Scanner;

public class Circle {
    private Point center;
    // an example of composition: where a class has an instance field that refers to an object of another class
    // so every Circle is composed of a Point (and some other stuff)
    // Composition is one type of relationship that two classes can have; another is inheritance (which we'll cover in a few weeks)

    private int radius;

    public Circle(Point p, int r) {
        center = p;
        setRadius(r);
    }

    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        setRadius(r);
    }

    private void setRadius(int r) {
        if (r < 0) {
            IllegalArgumentException e = new IllegalArgumentException("negative radius");
            throw e;
        }

        radius = r;
    }

    public String toString() {
        return "circle at " + center.toString() + " with radius " + radius;
    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
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
}

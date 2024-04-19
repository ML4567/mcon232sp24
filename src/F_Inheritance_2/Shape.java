package F_Inheritance_2;

public abstract class Shape { // an abstract class is allowed to contain
            // abstract methods, in addition to the usual fields, constructors,
            // and concrete (= non-abstract) methods.
            // An abstract class cannot be directly instantiated, i.e., we cannot say: new Shape(p)
    private Point location;

    public Shape(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    public abstract double getArea(); // method without a body,
            // compiler will force most subclasses to override this method and
            // provide a body

    public void printInfo() {
        System.out.println("The shape's area is: " + getArea());
        // works; calls the getArea() of a appropriate subclass based on the
        // type of object, e.g. Circle
    }
}

package F_Inheritance_2;

public class ShapesDemo {
    public static void main(String[] args) {
        Shape c = new Circle(new Point(1, 2), 3); // Shape can be used as a variable type, even though it's abstract
        System.out.println(c.getArea());
        c.printInfo(); //

        // Shape s = new Shape(new Point(1, 2)); // doesn't compile, since Shape is abstract
    }

    public static void demo(Shape s) {
        System.out.println(s.getArea());
    }
}

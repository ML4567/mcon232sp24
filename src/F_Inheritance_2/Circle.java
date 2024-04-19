package F_Inheritance_2;

// Circle is a concrete (non-abstract) class that extends an abstract class.
// The compiler therefore forces Circle to override the abstract getArea() method and provide it with a body.
public class Circle extends Shape {
    private int radius;

    public Circle(Point location, int radius) {
        super(location);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

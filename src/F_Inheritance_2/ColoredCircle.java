package F_Inheritance_2;

// Does ColoredCircle have to override getArea()?
// No, since it was already overridden with a body in the Circle class,
// which ColoredCircle inherits from.
public class ColoredCircle extends Circle {
    private String color;

    public ColoredCircle(Point location, int radius, String color) {
        super(location, radius);
        this.color = color;
    }
}

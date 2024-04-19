package F_Inheritance_2;


// Rectangle must override all inherited abstract methods that haven't been overriden with bodies yet:
// specifically, it must override getArea() [from Shape] and getSides() [from Polygon].
public class Rectangle extends Polygon {
    private int width, height;

    public Rectangle(Point location, int width, int height) {
        super(location, 4);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public int[] getSides() {
        int[] sides = new int[4];
        sides[0] = width;
        sides[1] = height;
        sides[2] = width;
        sides[3] = height;
        return sides;
    }
}

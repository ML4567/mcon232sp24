package F_Inheritance_2;


// Polygon does not have to override the abstract getArea() method that it inherits from Shape,
// since Polygon is itself abstract.
public abstract class Polygon extends Shape {
    private int numSides;

    public Polygon(Point location, int numSides) {
        super(location);
        this.numSides = numSides;
    }

    public abstract int[] getSides();

    public int getPerimeter() {
        int sum = 0;

        for (int side : getSides()) {
            sum += side;
        }

        return sum;
    }
}

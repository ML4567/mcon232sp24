package F_Inheritance_2;

public class Point { // implicitly extends Object
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // overrides Object's toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // overrides Object's equals method
    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return this.x == other.x && this.y == other.y;
        } else {
            return false;
        }
    }
}

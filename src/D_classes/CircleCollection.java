package D_classes;

// each object of this class represents a collection of circles

// example of working with a partially-filled array
public class CircleCollection {
    private Circle[] circles;
    private int numCircles;
    private static final int DEFAULT_CAPACITY = 5;

    public CircleCollection() { // allows client to not have to specify the capacity.
                                // here, we choose the capacity instead of the client
//        circles = new Circle[DEFAULT_CAPACITY];
//        numCircles = 0;
        this(DEFAULT_CAPACITY);
    }

    public CircleCollection(int capacity) { // capacity: how many circles can be held
        circles = new Circle[capacity];
        numCircles = 0;
    }

    public CircleCollection(Circle[] circles) { // here, the client passes in an
                                                // array, which we assume to be
                                                // full of Circle objects (no nulls)

        this.circles = new Circle[circles.length]; // create new array

        for (int i = 0; i < circles.length; i++) { // copy each element from the client's array into our array
            this.circles[i] = new Circle(circles[i]);
        }

        this.numCircles = circles.length;
    }

    public int getNumCircles() {
        return numCircles;
    }

    public boolean addCircle(Circle c) {
        if (isFull()) {
            return false;
        } else {
            circles[numCircles] = new Circle(c); // defensive copy
            numCircles++;
            return true;
        }
    }

    public boolean isFull() {
        return numCircles == circles.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numCircles; i++) {
            sb.append(circles[i].toString() + "\n");
        }

        return sb.toString();
    }

    public Circle getCircleWithLargestArea() {
        Circle circleWithLargestAreaSoFar = circles[0];

        for (int i = 1; i < numCircles; i++) {
            if (circles[i].getArea() > circleWithLargestAreaSoFar.getArea()) {
                circleWithLargestAreaSoFar = circles[i];
            }
        }

        return new Circle(circleWithLargestAreaSoFar);
    }
}

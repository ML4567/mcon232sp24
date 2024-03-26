package D_classes;

public class CircleCollectionClient {
    public static void main(String[] args) {
        CircleCollection collection = new CircleCollection(10); // can hold up to 10 circles
        System.out.println(collection.getNumCircles()); // 0
        collection.addCircle(new Circle(new Point(1, 2), 3));
        collection.addCircle(new Circle(new Point(4, 5), 6));
        collection.addCircle(new Circle(new Point(6, 7), 2));
        System.out.println(collection.getNumCircles()); // 3

        Circle c = new Circle(new Point(10, 20), 30);
        collection.addCircle(c);
        System.out.println("BEFORE MODIFYING c'S RADIUS");
        System.out.println(collection.toString());

        c.setRadius(100);
        System.out.println("AFTER MODIFYING c'S RADIUS");
        System.out.println(collection.toString());

        Circle circleWithLargestArea = collection.getCircleWithLargestArea();
    }
}

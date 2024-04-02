package D_classes;

public class InitialValuesDemo {
    public static void main(String[] args) {
        int x; // the value of x is undefined
        // Java does not give a default value to a local variable (variable declared inside a method)

        // System.out.println(x); // doesn't compile

        InitialValues iv = new InitialValues();
        iv.printValues();
    }
}

/*
If we don't initialize a field of a class, Java assigns it a 
default value:
- int: 0
- double: 0.0
- boolean: false
- every reference type (e.g., String, Point, etc.): null
*/
class InitialValues {
    private int x;
    private double y;
    private boolean z;
    private String s;
    private Point p;

    public InitialValues() {
    }

    public void printValues() {
        System.out.println("int x: " + x);
        System.out.println("double y: " + y);
        System.out.println("boolean z: " + z);
        System.out.println("String s: " + s);
        System.out.println("Point p: " + p);
    }
}
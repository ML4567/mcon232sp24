package D_classes;

/*
Kinds of variables:
- local variable - declared inside a method body or constructor body
- parameter -- declared in the header of a method or constructor
- instance variable - an instance (non-static) field, belongs to objects, each object can have its own value of it
- class variable - static field

What happens if we have a local variable or parameter with the same name as a field (instance or static)?
Answer: shadowing -- as long as we are in the scope of the local variable or parameter, the field is hidden.
 */
public class ShadowingDemo {
    private int x;
    private static int y;

    public void setX(int x) {
        // x = x; // x by itself means the parameter, not the field.
        this.x = x; // this.x is the instance field; x by itself is the parameter
    }
    // Every instance method is automatically provided with a variable named "this".
    // The variable refers to the object that was used to call the method.

    // Additionally, every constructor is automatically provided with the "this" variable.
    // In a constructor, the variable refers to the object that is currently being constructed by the constructor.

    // The "this" keyword is very useful for overcoming shadowing in a constructor or instance method.

    // What about a static method? It doesn't have "this". So to overcome shadowing, use the
    // syntax ClassName.staticFieldName

    public static void setY(int y) {
        ShadowingDemo.y = y;
        // ShadowingDemo.y is the static field; y by itself is the parameter.
    }
}

class Main {
    public static void main(String[] args) {
        ShadowingDemo demo = new ShadowingDemo();
        demo.setX(10);
    }
}

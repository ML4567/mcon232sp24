package G_generics;

// Box is a generic class.
public class Box<T> { // T is a type parameter of the Box class
    // now T can be used with any instance fields, instance methods, and constructors of Box
    // T represents a type that will be specified when a Box object is created.
    // T can only represent a reference type, not a primitive type.

    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" + item + "}";
    }
}


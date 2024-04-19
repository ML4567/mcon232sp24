package H_interfaces;

/*
Interface:
Similar to an abstract class, but no instance fields and no constructors,
and methods are abstract by default.

Significantly, a class cannot directly extend multiple classes.
For example, we CANNOT have class Customer extends Friend, Person.
But a class can directly inherit from multiple interfaces, and also from a single class.
So we can have:
class Subclass extends Superclass implements Interface1, Interface2, Interface3 {}

The purpose of an interface is to build a common trait into multiple classes without much in common.
For example, consider:
class Animal {}
class Chicken extends Animal {}
class Apple {}
It doesn't make sense for Chicken and Apple to have a common superclass, since they don't
have much in common. However, they both have the property of being edible.
So we can have both Chicken and Apple implement an Edible interface.
If Edible would be a class, then Chicken wouldn't be able to inherit from both Animal and Edible.
And it wouldn't be good to have Animal inherit from Edible, since not all animals are edible.


Interface                                             Class
- Cannot be directly instantiated                     - Can be directly instantiated
                                                        (unless class is abstract)
- Cannot contain any constructors                     - Contain constructors
- No state (instance fields)                          - Typically has state (instance fields)
- Fields are automatically public static final        - By default, fields are package-private,
                                                        non-static, and non-final.
                                                        They can be made public, private, or protected;
                                                        static; final.
- By default, instance methods are abstract           - Methods are not abstract (expect for
                                                        explicitly-marked abstract methods in abstract class)
- By default, methods are public                      - By default, methods are package-private
- A class "implements" an interface                   - A class "extends" another class
- A class can directly implement multiple interfaces  - A class cannot directly extend multiple classes
  And a class can extend another class and
  implements multiple interfaces at the same time.
- An interface can extend another interface.          - An interface cannot extend a class.

Class: data type with (typically) implemented behavior (methods) and state (instance fields).
Interface: data type with (typically) unimplemented behavior and no state.
 */

class Animal {}

interface Edible {
    String message = "tasty";

    String howToEat();

    static void staticMethod() {
        System.out.println(message);
    }

    default void nonabstractInstanceMethod() {
        System.out.println(message);
    }
}

class C {
    static int x;
    int y;

}

class Main {
    public static void main(String[] args) {
        C c = new C();
        // the state of c is defined by y, but not x.
        // x belongs to the class, not to any object.
    }
}

interface Soundable {
    void makeSound();
}

class Chicken extends Animal implements Edible, Soundable {
    @Override
    public String howToEat() {
        return "fry it";
    }

    @Override
    public void makeSound() {
        System.out.println("quack!");
    }
}

class Apple implements Edible {
    @Override
    public String howToEat() {
        return "cut it up";
    }
}

class Car implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("vroom!");
    }
}

public class Demo {
    public static void main(String[] args) {
        Edible e = new Chicken();
        Edible[] edibles = {new Apple(), new Chicken()}; // this array hold two objects that have very little on common, except that they share the property of being edible
        for (Edible edible : edibles) {
            System.out.println(edible.howToEat());
        }
    }
}

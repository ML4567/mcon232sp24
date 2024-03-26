package D_classes;

/*
We have already seen the "this" keyword, as in this.x or this.totalMinutes

The following is a different use of the "this" keyword.
Suppose a constructor wants to call another constructor of its class,
not to create an additional object, but rather to continue the
initialization of the current object.
It can do so using the following syntax:
    this(arguments to the other constructor);

Note: The "this" keyword can be used in this manner only by constructors,
not by methods.

Another note: If a constructor wants to use the "this" keyword in this
manner, it must do so as the very first statement inside the constructor.
(This requirement will very likely be loosened in a future version of Java.)
*/

class Person {
    private String name;
    private int age;

    // Parameterless constructor
    public Person() {
        // this.name = "unknown";
        // this.age = -1;

        this("unknown"); // call the constructor with name parameter
    }

    // Constructor with name parameter
    public Person(String name) {
        // this.name = name;
        // this.age = -1;

        this(name, -1); // call the constructor with name and age parameters
    }

    // Constructor with name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + " " + age);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        person1.display(); // John 25

        Person person2 = new Person("Alice");
        person2.display(); // Alice -1

        Person person3 = new Person();
        person3.display(); // unknown -1
    }
}


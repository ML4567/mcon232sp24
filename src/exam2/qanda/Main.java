package exam2.qanda;

import F_Inheritance_2.Point;

class Person {
    private String name;
    private int age;

    public Person(int age) {
        this("unknown", age);
        /*
        if (age < 0) {
            throw new IllegalArgumentException("invalid age");
        }

        this.name = "unknown";
        this.age = age;
         */
    }

    public Person(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("invalid age");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isOlderThan(Person other) {
        return this.age > other.age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person other = (Person) o;
            return this.name.equals(other.name) && this.age == other.age;
        } else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person("John", 25);
//        Person p2 = new Person("Adam", 30);
//        System.out.println(p1.isOlderThan(p2));

        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 30);
        System.out.println(person1 == person2); // false
        System.out.println(person1.equals(person2)); // compiles, since Person inherits the equals method from Object
                                                    // if we don't override the equals method, result is false
                                                    // when we override equals correctly, result is true
        System.out.println(person1.equals("a string")); // should be false
    }
}

class Demo {
    static Point p1 = new Point(1, 1);
    static Point p2 = new Point(2, 2);

    public static void main(String[] args) {

    }

    public static void swap() {
        Point temp = p1;
        p1 = p2;
        p2 = temp;
    }
}
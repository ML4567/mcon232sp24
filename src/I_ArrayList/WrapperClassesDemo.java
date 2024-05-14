package I_ArrayList;

/*
Primitive values are created and processed much more efficiently than objects are. 
However, there are situations in which we need to use objects to represent 
primitive values such as ints -- specifically, when working with generic types.
For example, we cannot say Box<int> or Collection<int>.

Corresponding to the eight primitive types, Java provides the following eight classes: 
Boolean, Byte, Short, Integer, Long, Float, Double, and Character.

These eight classes are known as "wrapper" classes, since
each object of these classes is a wrapper around a primitive value.

All eight wrapper classes are immutable.

Java performs auto-boxing and auto-unboxing when necessary (see below).
*/

import G_generics.Box;

class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }
}

public class WrapperClassesDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(365); // deprecated way to create an Integer
        i1 = Integer.valueOf(365);     // better way to create an Integer

        int x = i1.intValue();
        System.out.println(x); // 365

        Integer i2 = 365; // uses auto-boxing to create an Integer object given an int
        // Java automatically creates an Integer object.
        // equivalent to: Integer i2 = Integer.valueOf(365);
        // Auto-boxing: where Java implicitly creates an object of a
        // wrapper class from a primitive when necessary.

        int i3 = i1; // uses auto-unboxing to store a copy of an Integer as an int
        // equivalent to: int i3 = i1.intValue();

        Double[] doubles = {
            new Double(-9.8), // deprecated but still works for now
            Double.valueOf(6.7),
            5.5 // uses auto-boxing
        };
        doubles[0] = 4.8; // uses auto-boxing
        double y = doubles[1]; // uses auto-unboxing

        // don't have time for this, not responsible for it
        /*
        System.out.println(365 == 365); // true

        // false (probably) as the LHS points to a different object than the RHS
        System.out.println(Integer.valueOf(365) == Integer.valueOf(365));

        // true, compares contents of the two objects
        System.out.println(Integer.valueOf(365).equals(Integer.valueOf(365)));

        System.out.println(Integer.valueOf(65) == Integer.valueOf(65)); // true (!)
        // When we use Integer.valueOf for a "small" value, the method may
        // return a reference to an already-existing object instead of
        // creating a new object. Thus, the result here is true, since the LHS
        // refers to the same object that the RHS refers to.

        // Do NOT use == to test objects for equality (that is, to determine
        // if two objects have the same contents/state). Only use it for
        // primitives, or to test for object identity (that is, to
        // determine if two references point to the same object).
        // To compare objects for equality, use the equals method.


        // wrapper types are heavily used with generics. 
        // We cannot say Box<int>, but we can say Box<Integer>
        Box<Integer> integerBox1 = new Box<>(Integer.valueOf(34));
        int item = integerBox1.getItem(); // uses auto-unboxing. getItem returns here an Integer

        // each of the following four lines uses autoboxing
        Box<Integer> integerBox2 = new Box<>(67);
        Box<Double> doubleBox = new Box<>(12.3);
        Box<Character> characterBox = new Box<>('Y');
        Box<Boolean> booleanBox = new Box<>(true);

        // By the way, the Integer and Double classes extend the abstract Number class
        */
    }
}

package G_generics;

/*
Goal: write a class named Box.
Each Box object is like a wrapper around an object.
We want a Box to be able to hold any type of object.
So we should be able to create a Box that stores a String,
and a Box that stores a LocalDate, etc.
We don't want to have to write multiple classes.
The Box class should have a constructor, a getter, and a setter.
*/

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("hi"); // for this Box, T means String
        Box<LocalDate> dateBox = new Box<>(LocalDate.now()); // for this Box, T means LocalDate
        String s = stringBox.getItem(); // getItem() returns a T, which for this Box means String
        LocalDate d = dateBox.getItem(); // here getItem() returns a LocalDate
        stringBox.setItem("bye"); // the parameter of setItem is T, which here means String

        // we can create a Box of any type of object. But we cannot create a Box of a primitive value
        // Box<int> intBox;
    }
}

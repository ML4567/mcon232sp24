package D_classes;

/*
- If we don’t write a constructor in a class, Java provides a 
  default constructor, which can be called with no arguments. 
  The default constructor doesn't really do much, but it exists.
- If we write a constructor in a class, the default 
  constructor provided by Java goes away.
*/

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        Test1 test1 = new Test1(); // works; uses the default constructor

        // Test2 test2 = new Test2(); // doesn't compile!
    }
}

class Test1 {
    private int x;

    /*
     The compiler provides a no-arg constructor here. It looks something like this:
           public Test1() {
           }
     This compiler-provided constructor is known as a default constructor.
     The compiler provides a class with a default constructor if - and only if -
     the programmer has not written any constructors at all in the class.
     A default constructor does not really do anything, but it allows us
     to say "new Test1()".
    */
}

class Test2 {
    private int x;

    public Test2(int x) {
        this.x = x;
    }

    // Since this class has a programmer-written constructor,
    // the compiler doesn't provide a default constructor.
}
package H_interfaces;

import java.time.LocalDate;

// a generic interface. 
// When a class inherits from this interface, it can specify what T represents
interface Printer<T> {
    /**
     * Prints the specified object at least once.
     * @param t the object to be printed
     */
    void print(T t);
}

// StringPrinter is NOT a generic class. But it does inherit from a generic interface. 
// For StringPrinter, wherever Printer has T, we have String. Note that here
// the parameter type of the print method is String.
class StringPrinter implements Printer<String> {
    @Override
    public void print(String s) {
        System.out.println("Printing String " + s);
    }
}

class LocalDatePrinter implements Printer<LocalDate> {
    @Override
    public void print(LocalDate date) {
        System.out.println("Printing LocalDate " + date);
    }
}

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        // StringPrinter sp = new StringPrinter();
        // or:
        Printer<String> sp = new StringPrinter();
        sp.print("hello");

        // LocalDatePrinter dp = new LocalDatePrinter();
        // or:
        Printer<LocalDate> dp = new LocalDatePrinter();
        dp.print(LocalDate.now());


    }
}
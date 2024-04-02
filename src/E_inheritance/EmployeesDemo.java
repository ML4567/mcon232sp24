package E_inheritance;

public class EmployeesDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        printEmployeeInfo(e);

        Secretary s = new Secretary();
        printEmployeeInfo(s);
        s.takeDictation("some text");

        // A variable can refer to an object of its own type
        // or to an object of any subclass, because an object
        // of a subclass is also an object of the superclass
        // (every Secretary is an Employee)
        Employee emp = new Secretary();

        // doesn't compile
        // Secretary sec = new Employee();

        Lawyer l = new Lawyer();
        printEmployeeInfo(l);
    }

    public static void printEmployeeInfo(Employee e) {
        System.out.println(e.getHours());
        System.out.println(e.getSalary());
        System.out.println(e.getVacationDays());
        System.out.println(e.getVacationForm());
    }
}

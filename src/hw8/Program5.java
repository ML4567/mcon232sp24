package hw8;

public class Program5 {
    public static void main(String[] args) {
        try {
            method();
            System.out.print("After the method call ");
        } catch (RuntimeException ex) {
            System.out.print("RuntimeException in main ");
        } catch (Exception ex) {
            System.out.print("Exception in main ");
        }
    }

    public static void method() throws Exception {
        try {
            String s = "abc";
            System.out.print(s.charAt(3));
        } catch (RuntimeException ex) {
            System.out.print("RuntimeException in method() ");
        } catch (Exception ex) {
            System.out.print("Exception in method() ");
        }
    }
}

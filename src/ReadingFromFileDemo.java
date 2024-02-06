import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("files/integers.txt");
        Scanner input = new Scanner(file);
        int first = input.nextInt();
        System.out.println("first = " + first);
        int second = input.nextInt();
        System.out.println("second = " + second);
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TemperaturesEightDays {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("weather.txt");
        Scanner input = new Scanner(file);

        double prev = input.nextDouble();

        for (int i = 1; i <= 7; i++) {
            double current = input.nextDouble();
            double change = current - prev;
            System.out.println(prev + " to " + current +
                               ", change = " + change);
            prev = current;
        }
    }
}

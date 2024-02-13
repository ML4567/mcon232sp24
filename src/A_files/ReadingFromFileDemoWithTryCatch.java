package A_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFileDemoWithTryCatch {
    public static void main(String[] args) {
        try {
            File file = new File("files/integers.txt");
            Scanner input = new Scanner(file);
            System.out.println("all good");
        } catch (FileNotFoundException e) {
            System.out.println("the exception: " + e);
            System.out.println("Try again with a different file name");
        }
    }
}

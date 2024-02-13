package A_files;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        // File f = new File("C:\\Users\\moshe\\IdeaProjects\\mcon232sp24\\files\\testfile.txt");
        File f = new File("files/testfile.txt");
        boolean fileExists = f.exists();
        System.out.println("fileExists = " + fileExists);
    }
}

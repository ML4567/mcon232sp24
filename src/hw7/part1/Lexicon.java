package hw7.part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lexicon {
    private final List<String> words;

    public Lexicon(String filename) throws FileNotFoundException {
        words = new ArrayList<>();

        Scanner scanner = new Scanner(new File(filename));
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
    }

    public boolean containsIgnoreCase(String word) {
        for (String otherWord : words) {
            if (otherWord.equalsIgnoreCase(word)) {
                return true;
            }
        }

        return false;
    }
}

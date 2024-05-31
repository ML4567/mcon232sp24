package hw7.part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpellChecker {
    private final Lexicon lexicon;

    public SpellChecker(Lexicon lexicon) {
        this.lexicon = lexicon;
    }

    public SpellCheckerResult processDocument(String filename) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File(filename));
        SpellCheckerResult result = new SpellCheckerResult();
        int lineNumber = 1;

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            processLine(line, lineNumber, result);
            lineNumber++;
        }

        return result;
    }

    private void processLine(String line, int lineNumber, SpellCheckerResult result) {
        Scanner lineScanner = new Scanner(line);
        int wordNumber = 1;

        while (lineScanner.hasNext()) {
            String word = lineScanner.next();

            if (!lexicon.containsIgnoreCase(word)) {
                SpellingError error = new SpellingError(word, lineNumber, wordNumber);
                result.add(error);
            }

            wordNumber++;
        }
    }
}

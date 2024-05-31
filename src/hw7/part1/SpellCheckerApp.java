package hw7.part1;

import java.io.FileNotFoundException;

public class SpellCheckerApp {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.out.println("usage: java SpellCheckerApp lexicon-file document-file");
            System.exit(1);
        }

        Lexicon lexicon = new Lexicon(args[0]);
        SpellChecker spellChecker = new SpellChecker(lexicon);
        SpellCheckerResult result = spellChecker.processDocument(args[1]);

        for (SpellingError error : result.getErrors()) {
            System.out.println("line " + error.getLineNumber() + ": " + error.getWord());
        }
    }
}

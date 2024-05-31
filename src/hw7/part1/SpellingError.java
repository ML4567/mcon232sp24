package hw7.part1;

public class SpellingError implements Comparable<SpellingError> {
    private final String word;
    private final int lineNumber, wordNumber;


    public SpellingError(String word, int lineNumber, int wordNumber) {
        this.word = word;
        this.lineNumber = lineNumber;
        this.wordNumber = wordNumber;
    }

    public String getWord() {
        return word;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public int compareTo(SpellingError other) {
        if (this.lineNumber != other.lineNumber) {
            return Integer.compare(this.lineNumber, other.lineNumber);
        } else {
            return Integer.compare(this.wordNumber, other.wordNumber);
        }
    }
}

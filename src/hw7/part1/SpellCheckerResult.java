package hw7.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpellCheckerResult {
    private final List<SpellingError> errors;

    public SpellCheckerResult() {
        errors = new ArrayList<>();
    }

    public void add(SpellingError error) {
        errors.add(error);
    }

    public List<SpellingError> getErrors() {
        List<SpellingError> copy = new ArrayList<>(errors);
        Collections.sort(copy);
        return copy;
    }
}

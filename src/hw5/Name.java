package hw5;

public class Name {
    private String first, last;

    public Name(String first, String last) {
        if (first.isEmpty() || last.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.first = first;
        this.last = last;
    }

    public Name(Name original) {
        this.first = original.first;
        this.last = original.last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String toString() {
        return first + " " + last;
    }

    public String getInitials() {
        return first.charAt(0) + "." + last.charAt(0) + ".";
    }
}

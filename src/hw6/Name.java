package hw6;

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

    @Override
    public String toString() {
        return first + " " + last;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Name) {
            Name other = (Name) o;
            return this.first.equals(other.first) && this.last.equals(other.last);
        } else {
            return false;
        }
    }

    public String getInitials() {
        return first.charAt(0) + "." + last.charAt(0) + ".";
    }
}

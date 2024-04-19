package H_interfaces;

public class Student implements Comparable<Student> {
    private int id;
    private int age;

    public Student(int id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "id " + id + " with age " + age;
    }

    /**
     * Compares two students based on their IDs.
     * A student with a lower ID number is considered to be
     * less than a student with a higher ID number.
     *
     * @param other The Student to compare with this Student
     * @return a positive integer if this is "greater than" other,
     * a negative integer if this is "less than" other,
     * 0 if they are "equal"
     */
    @Override
    public int compareTo(Student other) {
        // works, but not concise:
        // if (this.id > other.id) {
        //   return 55;
        // } else if (this.id < other.id) {
        //   return -190;
        // } else {
        //   return 0;
        // }

        // another way; hackish:
        // return this.id - other.id;
        // consider this.id = -2_000_000_000 and other.id = 1_000_000_000

        // best way:
        return Integer.compare(this.id, other.id);
    }
}
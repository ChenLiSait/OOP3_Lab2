package exercise1;

/**
 * This class represents a Student with a name and age.
 * It implements Comparable to allow sorting by name.
 * It also provides a toString method for easy representation.
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + " , Age: " + age + ";";
    }
}

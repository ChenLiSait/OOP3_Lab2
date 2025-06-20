package exercise1;

import java.util.Comparator;

/**
 * This class implements a Comparator for Student objects that sorts them by
 * age. If two students have the same age, they are sorted by their names.
 */

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Sort by age
        if (s1.getAge() != s2.getAge()) {
            return Integer.compare(s1.getAge(), s2.getAge());
        }
        // If ages are equal, sort by name
        return s1.getName().compareTo(s2.getName());
    }
}

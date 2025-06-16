package exercise1;
import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        //Sort by age
        if (s1.getAge() != s2.getAge()) {
            return Integer.compare(s1.getAge(), s2.getAge());
        }
        //If ages are equal, sort by name
        return s1.getName().compareTo(s2.getName());
    }
}

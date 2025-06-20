package exercise1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class demonstrates the use of Comparable and Comparator interfaces
 * to sort a list of Student objects by name and age.
 */
public class Driver {

    public static void main(String[] args) {

        ArrayList<Student> studs = new ArrayList<>();
        studs.add(new Student("Smith", 34));
        studs.add(new Student("Johnson", 21));
        studs.add(new Student("Williams", 67));
        studs.add(new Student("Brown", 53));
        studs.add(new Student("Jones", 48));
        studs.add(new Student("Miller", 36));
        studs.add(new Student("Davis", 44));
        studs.add(new Student("Wilson", 52));
        studs.add(new Student("Anderson", 34));
        studs.add(new Student("Moore", 33));

        System.out.println("--------Original list--------");
        for (Student stud : studs) {
            System.out.println(stud.toString());
        }

        // Sort using Comparable (by name)
        Collections.sort(studs);
        System.out.println("\n------Comparable: Order by Name ------");
        for (Student stud : studs) {
            System.out.println(stud.toString());
        }

        // Sort using Comparator (by age)
        Collections.sort(studs, new StudentAgeComparator());
        System.out.println("\n------ Comparator: Order by Age ------");
        for (Student stud : studs) {
            System.out.println(stud.toString());
        }
    }
}

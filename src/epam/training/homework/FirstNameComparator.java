package epam.training.homework;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
    }
}

package epam.training.homework.service;

import epam.training.homework.AgeDescendingComparator;
import epam.training.homework.FirstNameComparator;
import epam.training.homework.Student;

import java.util.*;

public class StudentService {

    /*creating student objects*/
    public final Student student1 = new Student("Aram", "Gabrielyan", 21);
    public final Student student2 = new Student("Gayane", "Zakoyan", 19);
    public final Student student3 = new Student("Ani", "Simonyan", 15);
    public final Student student4 = new Student("Grigor", "Harutyunyan", 30);
    public final Student student5 = new Student("Elen", "Mnacakanyan", 46);

    /*create students list*/
    List<Student> studentsList = new ArrayList<>() {{
        add(student1);
        add(student2);
        add(student3);
        add(student4);
        add(student5);
    }};

    /*print the students list using iterator*/
    public void printList(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    /*get sorted list of students by first name*/
    public void sortByFirstName() {
        Collections.sort(studentsList, new FirstNameComparator());
        printList(studentsList);
    }

    /*get sorted list of students by age*/
    public void sortByAge() {
        Collections.sort(studentsList, new AgeDescendingComparator());
        printList(studentsList);
    }

    /*get sorted list of students by last name, then applied it to Linked list collection*/
    public void sortByLastName() {
        Collections.sort(studentsList);
        studentsList = new LinkedList<>(studentsList);
        printList(studentsList);
    }
}

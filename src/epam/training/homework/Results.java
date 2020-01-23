package epam.training.homework;

import epam.training.homework.dynamicarray.DynamicArrayTesting;
import epam.training.homework.linkedlist.MyLinkedListTesting;
import epam.training.homework.service.StudentsList;

public class Results {
    StudentsList studentsList = new StudentsList();
    DynamicArrayTesting dynamicArrayTesting = new DynamicArrayTesting();
    MyLinkedListTesting myLinkedListTesting = new MyLinkedListTesting();

    public void printResults() {
        System.out.println("-----Students sorted by first name-----");
        studentsList.sortByFirstName();

        System.out.println("-----Students sorted by age-----");
        studentsList.sortByAge();

        System.out.println("-----Students sorted by last name-----");
        studentsList.sortByLastName();

        System.out.println("-----Testing dynamic array-----");
        dynamicArrayTesting.createArray();

        System.out.println("-----Testing Linked list-----");
        myLinkedListTesting.createMyLinkedList();
    }
}

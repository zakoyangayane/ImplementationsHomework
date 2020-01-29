package epam.training.homework;

import epam.training.homework.dynamicarray.DynamicArrayTesting;
import epam.training.homework.linkedlist.MyLinkedListTesting;
import epam.training.homework.service.StudentService;

public class Results {
    StudentService studentService = new StudentService();
    DynamicArrayTesting dynamicArrayTesting = new DynamicArrayTesting();
    MyLinkedListTesting myLinkedListTesting = new MyLinkedListTesting();

    public void printResults() {
        System.out.println("-----Students sorted by first name-----");
        studentService.sortByFirstName();

        System.out.println("-----Students sorted by age-----");
        studentService.sortByAge();

        System.out.println("-----Students sorted by last name-----");
        studentService.sortByLastName();

        System.out.println("-----Testing dynamic array-----");
        dynamicArrayTesting.createArray();

        System.out.println("-----Testing Linked list-----");
        myLinkedListTesting.createMyLinkedList();
    }
}

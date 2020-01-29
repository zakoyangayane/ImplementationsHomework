package epam.training.homework.linkedlist;

import epam.training.homework.service.StudentService;

public class MyLinkedListTesting {
    final StudentService studentService = new StudentService();

    public void createMyLinkedList() {

        //created linked list
        MyLinkedList myLinkedList = new MyLinkedList();

        //added two elements
        myLinkedList.push(studentService.student1);
        myLinkedList.addLast(studentService.student2);
        System.out.println("size is " + myLinkedList.size());     //print size

        //added two elements
        System.out.println(myLinkedList.addLast(studentService.student3));
        myLinkedList.push(studentService.student4);
        System.out.println("size is " + myLinkedList.size());     //print size

        //print the list
        System.out.println("All students now in linked list:");
        myLinkedList.printInfo(myLinkedList);

        //remove first element
        System.out.println("first removed is " + myLinkedList.pop());
        System.out.println("size is " + myLinkedList.size());     //print size

        //add an element
        myLinkedList.addLast(studentService.student5);
        System.out.println("added one more student");
        System.out.println("size is " + myLinkedList.size());     //print size

        //print the list
        System.out.println("All students now in linked list:");
        myLinkedList.printInfo(myLinkedList);

        //remove last element
        System.out.println("last removed is " + myLinkedList.removeLast());
        System.out.println("size is " + myLinkedList.size());     //print size

        //print the list
        System.out.println("All students now in linked list:");
        myLinkedList.printInfo(myLinkedList);
    }
}


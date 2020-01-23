package epam.training.homework.linkedlist;

import epam.training.homework.service.StudentsList;

public class MyLinkedListTesting {
    final StudentsList studentsList = new StudentsList();

    public void createMyLinkedList() {

        //created linked list
        MyLinkedList myLinkedList = new MyLinkedList();

        //added two elements
        myLinkedList.push(studentsList.student1);
        myLinkedList.addLast(studentsList.student2);
        System.out.println("size is " + myLinkedList.size());     //print size

        //added two elements
        System.out.println(myLinkedList.addLast(studentsList.student3));
        myLinkedList.push(studentsList.student4);
        System.out.println("size is " + myLinkedList.size());     //print size

        //print the list
        System.out.println("All students now in linked list:");
        myLinkedList.printInfo(myLinkedList);

        //remove first element
        System.out.println("first removed is " + myLinkedList.pop());
        System.out.println("size is " + myLinkedList.size());     //print size

        //add an element
        myLinkedList.addLast(studentsList.student5);
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


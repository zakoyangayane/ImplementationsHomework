package epam.training.homework.linkedlist;

import epam.training.homework.Student;

public class MyLinkedList {
    public Node first;
    public Node last;
    static int listSize;

    static class Node {
        public Node previous;
        public Student current;
        public Node next;

        public Node(Node previous, Student current, Node next) {
            this.previous = previous;
            this.current = current;
            this.next = next;
        }
    }

    /*inserts the student at the front of the list*/
    public void push(Student student) {
        Node node = new Node(null, student, null);
        if (listSize == 0) {
            first = last = node;
        }
        node.next = first;
        first.previous = node;
        first = node;
        listSize++;
    }

    /*removes and returns the first student of the list*/
    public Student pop() {
        first.next.previous = null;
        Student theFirst = first.current;
        first = first.next;
        listSize--;
        return theFirst;
    }

    /*appends the specified student to the end of the list*/
    public boolean addLast(Student student) {
        Node node = new Node(null, student, null);
        if (listSize == 0) {
            first = last = node;
        }
        node.previous = last;
        last.next = node;
        last = node;
        listSize++;
        return last.current.equals(student);
    }

    /*removes and returns the last student*/
    public Student removeLast() {
        last.previous.next = null;
        Student theLast = last.current;
        last = null;
        listSize--;
        return theLast;
    }

    /*returns the number of students in this list*/
    public int size() {
        return listSize;
    }

    public void printInfo(MyLinkedList myList) {
        for (Node n = myList.first; n != null; n = n.next) {
            System.out.println(n.current);
        }
    }
}


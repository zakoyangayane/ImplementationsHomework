package epam.training.homework.dynamicarray;

import epam.training.homework.Student;
import epam.training.homework.service.StudentsList;

public class DynamicArrayTesting {
    final StudentsList studentsList = new StudentsList();

    public void createArray() {

        //create the array
        DynamicArray dynamicArray = new DynamicArray(new Student[]{studentsList.student1,
                studentsList.student2});

        System.out.println("size is " + dynamicArray.size());     //print size

        //add an element
        dynamicArray.add(studentsList.student3);
        System.out.println("size is " + dynamicArray.size());     //print size

        //remove an element
        dynamicArray.remove(studentsList.student2);
        System.out.println("size is " + dynamicArray.size());     //print size

        //add elements
        dynamicArray.add(studentsList.student4);
        System.out.println(dynamicArray.add(studentsList.student5));

        //get element at specified index
        System.out.println("student at index 2 is " + dynamicArray.get(2));
        System.out.println("size is " + dynamicArray.size());     //print size

        //print the array
        System.out.println("All students now in the dynamic array:");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }
        System.out.println();
    }
}

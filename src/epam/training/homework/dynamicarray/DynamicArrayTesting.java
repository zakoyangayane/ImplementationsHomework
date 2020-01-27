package epam.training.homework.dynamicarray;

import epam.training.homework.Student;
import epam.training.homework.service.StudentService;

public class DynamicArrayTesting {
    final StudentService studentService = new StudentService();

    public void createArray() {

        //create the array
        DynamicArray dynamicArray = new DynamicArray(new Student[]{studentService.student1,
                studentService.student2});

        System.out.println("size is " + dynamicArray.size());     //print size

        //add an element
        dynamicArray.add(studentService.student3);
        System.out.println("size is " + dynamicArray.size());     //print size

        //print the array
        System.out.println("All students now in the dynamic array:");
        dynamicArray.printInfo(dynamicArray);

        //remove an element
        dynamicArray.remove(studentService.student2);
        System.out.println("size is " + dynamicArray.size());     //print size

        //print the array
        System.out.println("All students now in the dynamic array:");
        dynamicArray.printInfo(dynamicArray);

        //add an element
        dynamicArray.add(studentService.student4);

        //print the array
        System.out.println("All students now in the dynamic array:");
        dynamicArray.printInfo(dynamicArray);

        //add an element
        System.out.println(dynamicArray.add(studentService.student5));

        //get element at specified index
        System.out.println("student at index 2 is " + dynamicArray.get(2));
        System.out.println("size is " + dynamicArray.size());     //print size

        //print the array
        System.out.println("All students now in the dynamic array:");
        dynamicArray.printInfo(dynamicArray);
        System.out.println();
    }
}

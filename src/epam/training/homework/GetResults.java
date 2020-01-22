package epam.training.homework;

import epam.training.homework.dynamicarray.DynamicArrayTesting;
import epam.training.homework.service.StudentsList;

public class GetResults {
    StudentsList studentsList = new StudentsList();
    DynamicArrayTesting dynamicArrayTesting = new DynamicArrayTesting();

    public void printResults() {
        System.out.println("-----Students sorted by first name-----");
        studentsList.sortByFirstName();

        System.out.println("-----Students sorted by age-----");
        studentsList.sortByAge();

        System.out.println("-----Students sorted by last name-----");
        studentsList.sortByLastName();

        System.out.println("-----Testing dynamic array-----");
        dynamicArrayTesting.createArray();

    }
}

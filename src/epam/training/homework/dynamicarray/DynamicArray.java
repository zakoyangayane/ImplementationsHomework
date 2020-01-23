package epam.training.homework.dynamicarray;

import epam.training.homework.Student;

public class DynamicArray {
    public Student[] students;

    public DynamicArray(Student[] students) {
        this.students = students;
    }

    /*appends the student to the end of the array,
    Returns true, if succeeds, and false otherwise*/
    public boolean add(Student student) {
        if (this.size() == 0) {
            this.students = new Student[1];
            this.students[0] = student;
            return true;
        }
        Student[] newArray = new Student[this.students.length + 1];
        for (int i = 0; i < this.students.length; i++) {
            newArray[i] = this.students[i];
        }
        newArray[newArray.length - 1] = student;
        this.students = new Student[newArray.length];
        for (int i = 0; i < newArray.length; i++) {
            this.students[i] = newArray[i];
        }
        return this.students[this.students.length - 1].equals(student);
    }

    /*removes the first occurrence of the specified student from
    the array if present. Returns true, if succeeds, and false otherwise*/
    public boolean remove(Student student) {
        if (student == null) {
            return false;
        }
        for (Student s : this.students) {
            if (s.equals(student)) {
                Student[] newArray = new Student[this.students.length - 1];
                boolean removed = true;
                for (int i = 0; i < this.students.length; i++) {
                    if (this.students[i].equals(student) && removed) {
                        removed = false;
                        continue;
                    }
                    if (!removed) {
                        newArray[i - 1] = this.students[i];
                    } else {
                        newArray[i] = this.students[i];
                    }
                }
                this.students = new Student[newArray.length];
                for (int i = 0; i < newArray.length; i++) {
                    this.students[i] = newArray[i];
                }
                return true;
            }
        }
        return false;
    }

    /*gives the size of the array*/
    public int size() {
        if (this.students != null) {
            return this.students.length;
        }
        return 0;
    }

    /*gives the element at a current index, and null if the student
    doesn't exist in the array*/
    public Student get(int index) {
        if (this.students != null && this.students.length > index) {
            return this.students[index];
        }
        return null;
    }
}

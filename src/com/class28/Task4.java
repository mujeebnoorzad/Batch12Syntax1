package com.class28;

import java.util.HashSet;
import java.util.Set;

//Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
// Each student object should have name and studentID. Display name of each student.
public class Task4 {
    public static void main(String[] args) {
        Set<Student1> students=new HashSet<>();
        students.add(new Student1("Maha","123"));
        students.add(new Student1("Habib","12345"));
        students.add(new Student1("Asel","123456"));
        for (Student1 s:students
        ) {
            s.printName();
        }



    }
}

class Student1{
    String name;
    String studentId;
    Student1(String name,String studentId){
        this.name=name;
        this.studentId=studentId;
    }
    void printName(){
        System.out.println(name);
    }
}
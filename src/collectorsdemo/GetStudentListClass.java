/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectorsdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class GetStudentListClass {

    public List<Student> getStudentListObj() {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));
        return studentList;
    }
    
}

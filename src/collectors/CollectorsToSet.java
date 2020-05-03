/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectors;

import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class CollectorsToSet {
    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        Set<String> set = obj.getStudentListObj().stream().map(Student::getSubject).collect(Collectors.toSet());
//        Set<Student> set = obj.getStudentListObj().stream().collect(Collectors.toSet());
        System.out.println(set);
    }
}

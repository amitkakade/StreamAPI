/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class CollectorsToMap {
    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        Map<String,Double> map = obj.getStudentListObj().stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
        System.out.println(map);
        Map<String,Student> map1 = obj.getStudentListObj().stream().collect(Collectors.toMap(Student::getName, Student::getCurrentObj));
        System.out.println(map1);
    }
}

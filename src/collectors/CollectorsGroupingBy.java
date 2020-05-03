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
public class CollectorsGroupingBy {

    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        Map<String, List<Student>> map = obj.getStudentListObj().stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(map);
    }
}

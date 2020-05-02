/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectorsdemo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class CollectorsPartitioningBy {

    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        Map<Boolean, List<Student>> map = obj.getStudentListObj().stream().collect(Collectors.partitioningBy(student -> student.getPercentage() > 80.0));
        System.out.println(map);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectors;

import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class CollectorsSummingIntLongDouble {
    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        Integer sum_int = obj.getStudentListObj().stream().collect(Collectors.summingInt(Student::getId));
        System.out.println("sum of all id's : "+sum_int);
        double sum_double = obj.getStudentListObj().stream().collect(Collectors.summingDouble(Student::getPercentage));
        System.out.println("sum of all percentage : "+sum_double);
        Long sum_long = obj.getStudentListObj().stream().collect(Collectors.summingLong(Student::getId));
        System.out.println("sum of all id's : "+sum_long);
    }
}

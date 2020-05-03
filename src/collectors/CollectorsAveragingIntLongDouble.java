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
public class CollectorsAveragingIntLongDouble {

    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        double average_percentage = obj.getStudentListObj().stream().collect(Collectors.averagingDouble(Student::getPercentage));
        System.out.println("average of percentages " + average_percentage);
        double average_id = obj.getStudentListObj().stream().collect(Collectors.averagingInt(Student::getId));
        System.out.println("average of id's " + average_id);
        average_id = obj.getStudentListObj().stream().collect(Collectors.averagingLong(Student::getId));
        System.out.println("average of id's " + average_id);
    }
}

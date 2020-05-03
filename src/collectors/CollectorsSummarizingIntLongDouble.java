/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectors;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class CollectorsSummarizingIntLongDouble {

    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        IntSummaryStatistics statics_int = obj.getStudentListObj().stream().collect(Collectors.summarizingInt(Student::getId));
        System.out.println(statics_int.getMax());
        System.out.println(statics_int.getMin());
        System.out.println(statics_int.getAverage());
        LongSummaryStatistics statics_long = obj.getStudentListObj().stream().collect(Collectors.summarizingLong(Student::getId));
        System.out.println(statics_long.getMax());
        System.out.println(statics_long.getMin());
        System.out.println(statics_long.getAverage());
        DoubleSummaryStatistics statics_double = obj.getStudentListObj().stream().collect(Collectors.summarizingDouble(Student::getPercentage));
        System.out.println(statics_double.getMax());
        System.out.println(statics_double.getMin());
        System.out.println(statics_double.getAverage());
    }
}

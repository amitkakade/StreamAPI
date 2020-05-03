/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class CollectorsMaxBy {
    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        Optional<Double> max_percentage = obj.getStudentListObj().stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(max_percentage);
    }
}

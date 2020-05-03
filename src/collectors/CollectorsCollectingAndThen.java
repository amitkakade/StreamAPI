/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectors;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class CollectorsCollectingAndThen {

    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        List<Student> first3Student = obj.getStudentListObj().stream().limit(3).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        System.out.println(first3Student);
    }

}

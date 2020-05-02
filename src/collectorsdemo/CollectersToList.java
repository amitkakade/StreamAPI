/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectorsdemo;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class CollectersToList {
    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        List<String> list = obj.getStudentListObj().stream().map((student) -> student.getName()).collect(Collectors.toList());
        System.out.println(list);
    }
}

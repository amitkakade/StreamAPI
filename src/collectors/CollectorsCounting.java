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
public class CollectorsCounting {
    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        Long count =  obj.getStudentListObj().stream().collect(Collectors.counting());
        System.out.println(count);
    }
}

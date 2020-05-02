package collectorsdemo;


import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class CollectorsJoining {
    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        String concatinated_string = obj.getStudentListObj().stream().map(Student::getName).collect(Collectors.joining(",","| "," |"));
        System.out.println(concatinated_string);
    }
}

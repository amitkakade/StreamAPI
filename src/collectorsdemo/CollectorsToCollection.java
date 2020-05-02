/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectorsdemo;

import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class CollectorsToCollection {
    public static void main(String[] args) {
        GetStudentListClass obj = new GetStudentListClass();
        LinkedList<Student> ll = obj.getStudentListObj().stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(ll);
    }
}

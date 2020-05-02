/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorted_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class NaturalOrder {

    public static List<Integer> returnList() {
        return Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
    }

    public static void main(String[] args) {
        List<Integer> list = NaturalOrder.returnList();
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}

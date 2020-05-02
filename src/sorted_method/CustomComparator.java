/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorted_method;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class CustomComparator {

    public static void main(String[] args) {
        List<Integer> list = NaturalOrder.returnList();
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        List<Integer> sortedList = list.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println(sortedList);
    }
    
}

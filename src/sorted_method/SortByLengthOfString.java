/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorted_method;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class SortByLengthOfString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("amit", "sumit", "sudam", "sangeeta", "Jigyasa", "bhagyashree");
        Comparator<String> comparator = (o1, o2) -> {
            int l1 = o1.length();
            int l2 = o2.length();
            if (l1 > l2) {
                return -1;
            } else if (l1 < l2) {
                return 1;
            } else {
                return 0;
            }
        };
        list = list.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println(list);

    }
}

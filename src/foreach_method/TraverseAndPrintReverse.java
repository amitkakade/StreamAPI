/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach_method;

import java.util.Comparator;
import java.util.List;
import sorted_method.NaturalOrder;

/**
 *
 * @author admin
 */
public class TraverseAndPrintReverse {
    public static void main(String[] args) {
        List<Integer> list = NaturalOrder.returnList();
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorted_method;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class LambdaExpression {

    public static void main(String[] args) {
        List<Integer> list = NaturalOrder.returnList();
        List<Integer> sortedList = list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList);
    }

}

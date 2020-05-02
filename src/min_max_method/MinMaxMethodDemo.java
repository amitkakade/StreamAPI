/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package min_max_method;

import java.util.Comparator;
import java.util.List;
import sorted_method.NaturalOrder;

/**
 * Please First execute following program. According to the provided comparator
 * data will be displayed. above point (Comparator point) is important you can
 * see after you run this program.
 *
 * @author admin
 */
public class MinMaxMethodDemo {

    public static void main(String[] args) {
        List<Integer> list = NaturalOrder.returnList();
        System.out.println(list);

        Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);
        System.out.println();
        System.out.println("I am using natural order comparator this time min element will be 1 and max element will abe 9");
        System.out.println("Min Element: " + list.stream().min(comp).get());
        System.out.println("Max Element: " + list.stream().max(comp).get());

        comp = (i1, i2) -> i2.compareTo(i1);
        System.out.println();
        System.out.println("Now I am using reverse comparator this time min element will be 9 and max element will abe 1");
        System.out.println("Min Element: " + list.stream().min(comp).get());
        System.out.println("Max Element: " + list.stream().max(comp).get());
    }

}

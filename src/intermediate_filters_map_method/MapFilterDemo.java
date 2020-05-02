/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate_filters_map_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class MapFilterDemo {

    public static void main(String[] args) {
        
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0");
        List<Integer> even_numbers = numbers.stream().map((String s) -> Integer.valueOf(s)).filter((Integer num) -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(even_numbers);
        
    }

}

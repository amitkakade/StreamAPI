/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate_filters_map_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class FilterWithForEach {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Melisandre","Daenerys","Amit","Sumit","sarangdhar","Jon","mangesh","shirpya");
        Stream<String> allNames = list.stream();
        Stream<String> longNames = allNames.filter(s-> s.length()>6);
        
        longNames.forEach(System.out::println);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate_filters_map_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class MapDemo {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("London", "HongKong", "Paris", "NewYork");
        System.out.println("Original List: " + cities);
        System.out.println("List transformed before java 1.8: " + transformUsingBeforeJava8(cities));
        System.out.println("List transformed using java 1.8: " + transformUsingJava8(cities));
    }

    public static List<String> transformUsingJava8(List<String> list) {
        return list.stream().map(str -> str.toUpperCase(Locale.ITALY)).collect(Collectors.toList());
    }

    public static List<String> transformUsingBeforeJava8(List<String> list) {
        List<String> newList = new ArrayList<>();
        list.forEach((str) -> newList.add(str.toUpperCase()));
        return newList;
    }

}

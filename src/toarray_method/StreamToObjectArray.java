/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toarray_method;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Program to convert stream to an array of Object.
 *
 * @author admin
 */
public class StreamToObjectArray {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Amit", "Sarang", "Siddiq", "Bhakti", "Bhagyshree");
        Object[] obj_array = stream.toArray();
        System.out.println(Arrays.toString(obj_array));
    }
}

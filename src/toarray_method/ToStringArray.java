/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toarray_method;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class ToStringArray {

    public static void main(String[] args) {
        String line = "This is cool example to learn toArray() method.";
        String[] str_array = Arrays.stream(line.split(" ")).map(String::toUpperCase).toArray(String[]::new);
        for (String str : str_array) {
            System.out.println(str);
        }
    }
    
}

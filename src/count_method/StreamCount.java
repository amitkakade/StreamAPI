/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count_method;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class StreamCount {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 4, 3, 5, 6, 7, 8, 9);
        long count = l.stream().count();
        System.out.println(count);
    }
}

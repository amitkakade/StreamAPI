/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toarray_method;

import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class ToIntegerArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] result = IntStream.of(nums).boxed().toArray(Integer[]::new);
        for (Integer i : result) {
            System.out.println(i);
        }
    }

}

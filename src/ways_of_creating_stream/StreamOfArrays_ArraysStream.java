/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ways_of_creating_stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class StreamOfArrays_ArraysStream {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,5,6,74,3,4};
        Stream<Integer> stream = Arrays.stream(nums);
        System.out.println(Arrays.toString(stream.toArray()));
        
        int start = 0; //inclusive
        int end = 2; //exclusive
        stream = Arrays.stream(nums,start,end);
        System.out.println(Arrays.toString(stream.toArray()));
        
    }
}

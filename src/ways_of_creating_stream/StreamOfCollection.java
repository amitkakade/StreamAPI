/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ways_of_creating_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * Collection framework provides two methods, stream() and parallelStream(), to
 * create a sequential and parallel stream from any collection respectively.
 *
 * @author admin
 */
public class StreamOfCollection {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("Java", "8", "Stream", "API");
        
        /**
         * Creatting sequential stream.
         */
        Stream<String> sequential_stream = collection.stream();
        System.out.println(Arrays.toString(sequential_stream.toArray()));
        
        /**
         * Creating parallel stream.
         */
        Stream<String> parallel_stream = collection.parallelStream();
        System.out.println(Arrays.toString(parallel_stream.toArray()));
    }
}

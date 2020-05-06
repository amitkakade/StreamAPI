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
 * We can use Stream.empty() and Stream.of() methods to create empty stream.
 *
 * @author admin
 */
public class EmptyStream {

    public static void main(String[] args) {

        /**
         * Create empty stream with Stream.empty() method.
         */
        Stream<String> stream = Stream.empty();
        System.out.println("Empty stream using Stream.empty(): " + Arrays.toString(stream.toArray()));

        /**
         * Create empty stream with Stream.of() method.
         */
        stream = Stream.of();
        System.out.println("Empty stream using Stream.of(): " + Arrays.toString(stream.toArray()));

    }

}

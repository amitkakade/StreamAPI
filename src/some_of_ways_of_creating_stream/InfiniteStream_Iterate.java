/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package some_of_ways_of_creating_stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * We can use iterate() method to create an infinite stream which accepts two
 * parameters. 1-> seed which is first parameter in stream. 2-> and a function
 * to be applied on previous term of stream to produce next term in the stream.
 * we can limit stream using limit() method.
 *
 * @author admin
 */
public class InfiniteStream_Iterate {

    public static void main(String[] args) {

        /**
         * Creating infinite stream of an Integers.
         */
        Stream<Integer> stream = Stream.iterate(0, x -> x + 1).limit(10);
        System.out.println("Created infinite streams of Integers with limit of 10: " + Arrays.toString(stream.toArray()));

        /**
         * Creating infinite stream of Strings.
         */
        Stream<String> string_stream = Stream.iterate("A", x -> x + "A").limit(10);
        System.out.println("Created infinite streams of String with limit of 10: " + Arrays.toString(string_stream.toArray()));

    }
}

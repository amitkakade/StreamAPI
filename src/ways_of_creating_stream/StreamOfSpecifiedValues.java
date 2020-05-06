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
 * We can create sequential stream from specified vaules using Stream.of()
 * method.
 *
 * @author admin
 */
public class StreamOfSpecifiedValues {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 5, 6, 9, 7, 3, 6, 8);
        System.out.println(Arrays.toString(stream.toArray()));
    }
    
}

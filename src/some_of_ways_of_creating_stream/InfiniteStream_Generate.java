/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package some_of_ways_of_creating_stream;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class InfiniteStream_Generate {
    public static void main(String[] args) {
        
        /**
         * Generating ramdom uuid.
         */
        Stream<UUID> uuid_stream = Stream.generate(UUID::randomUUID).limit(2);
        System.out.println("Generating ramdom uuid.: "+Arrays.toString(uuid_stream.toArray()));
        
        /**
         * Generating random double values between 0-1.
         */
        Stream<Double> double_stream = Stream.generate(Math::random).limit(4);
        System.out.println("Generating random double values between 0-1.: "+Arrays.toString(double_stream.toArray()));
        
        /**
         * Generating random integers.
         */
        Stream<Integer> integer_stream = Stream.generate(new Random()::nextInt).limit(10);
        System.out.println("Generating random integers. : "+Arrays.toString(integer_stream.toArray()));
        
    }
}

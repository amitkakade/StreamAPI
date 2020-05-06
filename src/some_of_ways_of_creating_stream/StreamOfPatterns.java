/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package some_of_ways_of_creating_stream;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class StreamOfPatterns {
    
    public static void main(String[] args) {
        String line ="Amit Sumit Sangeeta Sudam rajesh dinesh shila sarangdhar balu sambhaji ganesh";
        Stream<String> stream = Pattern.compile(" ").splitAsStream(line);
        System.out.println(Arrays.toString(stream.toArray()));
    }
    
}

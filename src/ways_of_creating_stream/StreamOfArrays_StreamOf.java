
import java.util.Arrays;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class StreamOfArrays_StreamOf {
    
    public static void main(String[] args) {
        String[] array = {"Easy", "Way", "To", "Learn"};
        Stream<String> stream = Stream.of(array);
        System.out.println(Arrays.toString(stream.map(x->x.toUpperCase()).toArray(String[]::new)));
    }
    
}

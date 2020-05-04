/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxed_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class StreamOfints {
    public static void main(String[] args) {
        List<Integer> l = IntStream.of(1,2,3,4,5,6,7,8,9).boxed().collect(Collectors.toList());
        System.out.println(l);
    }
}

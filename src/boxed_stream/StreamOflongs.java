/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxed_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 *
 * @author admin
 */
public class StreamOflongs {
    public static void main(String[] args) {
        List<Long> l = LongStream.of(1l,2l,3l,4l,5l,6l,7l,8l,9l).boxed().collect(Collectors.toList());
        System.out.println(l);
    }
}

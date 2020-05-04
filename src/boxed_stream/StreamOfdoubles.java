/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxed_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author admin
 */
public class StreamOfdoubles {
    public static void main(String[] args) {
        List<Double> l = DoubleStream.of(1d,2d,3d,4d,5d,6d,7d,8d,9d).boxed().collect(Collectors.toList());
        System.out.println(l);
    }
}

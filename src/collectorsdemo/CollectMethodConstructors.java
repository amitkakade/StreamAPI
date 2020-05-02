/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectorsdemo;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class CollectMethodConstructors {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "e", "i", "o", "u");
        StringBuilder sb = list.stream().collect(StringBuilder::new, (x, y) -> x.append(y), (x, y) -> x.append(y));
        System.out.println(sb);
        sb = list.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y), (x, y) -> x.append(",").append(y));
        System.out.println(sb);
    }
}

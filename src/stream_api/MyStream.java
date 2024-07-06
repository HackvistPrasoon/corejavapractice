package stream_api;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45,63,23,24,56,90,20,60,63); // 9 elements
        int sum = list.stream().filter(x -> x%2 == 0)
                .map(x -> x/2)
                .reduce(0,(a,b) -> a +b);
        System.out.println(sum);

         // reduce function
        List<Integer> reduceAdd = Arrays.asList(2,4,1,5,6);
        int a = reduceAdd.stream().reduce(0,(x,y) -> x+y);
        System.out.println("sum of list "+a);

        // sort function
        reduceAdd.stream().sorted().peek(System.out::println).collect(Collectors.toList());

    }
}

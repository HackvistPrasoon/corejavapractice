package compractice;

import java.util.*;

public class SecondLargestNumberStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34,600,245,22,43,532,64,745,22);
        Optional<Integer> op =  list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

         op.ifPresent( s -> System.out.println("Second lowest Number "+s));
    }

}

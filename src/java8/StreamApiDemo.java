package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Stream api=> stream is a sequence of objects and that have many method and we combine and produce desired result.
 * Type of stream = sequential and parallel stream (multithreading env)
 * Operation -> terminal and intermediate operation
 * terminal => forEach(),reduce(),collect()
 * intermediate=> map(function),filter(predicate),sorted()
 */

public class StreamApiDemo {

    public static void main(String[] args) {
;//predicate take input and return boolean
        Predicate<Integer>predicate = x->x>5;
        Predicate<Integer>lessThan8 = x->x<8;
        List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<String> strings = Arrays.asList("Java","is","programming","language");
        Predicate<String>neg = x->x.startsWith("J");

        List<Integer> lst =list.stream().filter(predicate.or(lessThan8)).collect(Collectors.toList());
        System.out.println(lst);

        List<String> ls1 =strings.stream().filter(neg.negate()).collect(Collectors.toList());
        System.out.println(ls1);



    }
}

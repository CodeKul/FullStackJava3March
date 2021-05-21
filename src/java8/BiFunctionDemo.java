package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        BiFunction<List<Integer>, Predicate<Integer>,List<Integer>> filter
                = (lst,predicate)->{
            List<Integer> res = new ArrayList<>();
            for (Integer i:lst) {
                if(predicate.test(i)){
                    res.add(i);
                }
            }
            return res;
        };

        System.out.println(filter.apply(list,x->x%2!=0));

    }
}

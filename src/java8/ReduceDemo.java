package java8;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * reduce take a sequence of object and produce a single result
 *
 */
public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum=0;
        for (Integer i:list) {
            sum = sum+i;
        }

        System.out.println(sum);

        Optional<Integer> i = list.stream().reduce((r1, r2)-> r1+r2);
        System.out.println(i.get());

        List<String> strings = Arrays.asList("java","programming","is","best");

        Optional<String> str = strings.stream().reduce((r1,r2)->r1.length()>r2.length() ? r1:r2);
        System.out.println(str.get());


    }
}

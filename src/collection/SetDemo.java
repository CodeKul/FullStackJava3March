package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

    //Set doesnt maintain insertion order
    // set doesnt store duplicate values

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(20);
        set.add(30);
        set.add(40);

//        System.out.println(set);
//        set.forEach(s->{
//            System.out.println(s);
//        });

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        set1.forEach(s->{
            System.out.println(s);
        });
    }
}

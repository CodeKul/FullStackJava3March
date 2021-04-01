package collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) throws Exception {

        //Linkedlist uses doubly linked list to store element
        //it maintains the insertion order
        //it store duplicate values

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        list.forEach(s -> {
//            System.out.println(s);
//        });

//        list.get(1);


        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(5,6,7,8);

        List<Integer>combinelist = new ArrayList<>();

        combinelist.addAll(list1);
        combinelist.addAll(list2);

        combinelist.forEach(s->{
            System.out.println(s);
        });

    }
}

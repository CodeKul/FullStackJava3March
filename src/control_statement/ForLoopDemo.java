package control_statement;

import java.util.ArrayList;
import java.util.List;

public class ForLoopDemo {

    public static void main(String[] args) {

        int[] arr = new int[4];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for (int i:arr) {
            System.out.println(i);
        }
//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//
//        list.forEach(s->{
//            System.out.println(s);
//        });

//        list.forEach(System.out::println);

    }
}

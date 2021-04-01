package collection;

import java.util.*;

public class ArraylistDemo {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 11;

        //Arraylist store duplicate element
        //Arraylist maintains insertion order
        //Arraylist uses dynamic array to store the element

        List<Integer> list = new ArrayList<>();//default size is 10 -> it grow by 50 %
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);


//        list.remove(1);
        System.out.println(list.size());
        System.out.println(list.contains(Integer.valueOf(3)));
        System.out.println(list.isEmpty());
        System.out.println(list.get(1));

//        list.forEach(s->{
//            System.out.println(s);
//        });

//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


//      public static void main(String[] args) {
//
//        List<Integer> list = new ArrayList<>();
//
//        list.add(223);
//        list.add(2234);
//        list.add(22433);
//        list.add(23);
//
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println(list);
//
//    }


        List<Integer> list1 = new ArrayList<>();
        list.add(10);
        list.add(20);

        List<Integer> list2 = Arrays.asList(1,2,34);

        List<Integer> list3 = new ArrayList<>(List.of(1,24,4));

        List<Integer> list4 = new ArrayList<>(){{
            add(1);
            add(1);
        }};
    }
}

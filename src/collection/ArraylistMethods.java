package collection;

import java.util.*;

public class ArraylistMethods {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);


        List<Integer> list2 =  new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(6);
        list2.add(7);

//        list1.retainAll(list2);
//        list1.removeAll(list2);
//        list1.addAll(list2);
//        System.out.println(list1);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("BigData");
        treeSet.add("DotNet");

        System.out.println(treeSet);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"DotNet");
        map.put(4,"BigData");

        Set<Map.Entry<Integer,String>> map1 = map.entrySet();
        System.out.println(map1);

        List<Map.Entry<Integer,String>> list = new ArrayList<>(map1);

        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> t1, Map.Entry<Integer, String> t2) {
                return t1.getValue().compareTo(t2.getValue());
            }
        });

        System.out.println(list);


    }
}

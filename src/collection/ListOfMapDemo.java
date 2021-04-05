package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapDemo {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"String-1");
        map.put(2,"String-2");


        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"String -3");
        map1.put(2,"String -4");

        List<Map<Integer,String>> list = new ArrayList<>();

        list.add(map);
        list.add(map1);

        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println(k+" "+v);
            });
        });
    }
}

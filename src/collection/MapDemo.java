package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"String -1");
        map.put(2,"String -2");
        map.put(3,"String -3");

        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getValue()+ " "+m.getKey());
        }
    }

}
